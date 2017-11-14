

/***********************************************************************************************************************************/
/** 1 **/
/** Création d'un trigger qui affiche « un nouveau client est ajouté» après chaque insertion d’un client. 
Répétez la même chose pour la modification ou la suppression.**/

CREATE OR REPLACE TRIGGER INSERT_CLIENT 
AFTER INSERT ON CLIENT 
FOR EACH ROW
BEGIN
	dbms_output.put_line('un nouveau client est ajouté');
END;
/

/**
Trigger created.
**/

CREATE OR REPLACE TRIGGER UPDATE_CLIENT 
AFTER UPDATE ON CLIENT 
FOR EACH ROW
BEGIN
	dbms_output.put_line('Les informations d un client sont mises a jours');
END;
/

/**
Trigger created.
**/

CREATE OR REPLACE TRIGGER DELETE_CLIENT 
AFTER DELETE ON CLIENT 
FOR EACH ROW
BEGIN
	dbms_output.put_line('un client est supprimé');
END;
/

/**
Trigger created.
**/


/** tester les trigger **/
/** d'abord activer les affichages avec la commande : SET SERVEROUTPUT ON **/

SET SERVEROUTPUT ON

/** l'insertion **/
INSERT INTO CLIENT 
VALUES(40,'MME','Adjaout','feriel',to_date('21/01/1995', 'DD/MM/YYYY'),'cite 2110 logts bt 5 alger','0561381877','0565568716','');

/**
un nouveau client est ajouté

1 row created.
**/

/** la modification **/
UPDATE CLIENT 
SET PRENOMCLIENT = 'ADJAOUTE' 
WHERE NUMCLIENT = 40 ;

/**
Les informations d un client sont mises a jours

1 row updated.
**/

/** la suppression **/
DELETE FROM CLIENT 
WHERE NUMCLIENT = 40 ;

/**
un client est supprimé

1 row deleted.
**/

/***********************************************************************************************************************************/
/** 2 **/
/* 
Création du trigger qui afficher <<un nouveau modèle est ajouté à la marque [Nom de la marque]>>
après chaque insertion d'un modèle 

la clause INTO dans la requête SELECT nous permet de recupérer la 
valeur de l'attribut en question dans une variable

le tuple spécial :NEW générer par le SGBD dans le corps les triggers des insertions 
sauvgarde le tuple qui viens d'être inserer dans la base

en utilisant les concepts INTO et :NEW, on écrit la requete qui récupère la marque du modèle en question
*/

CREATE OR REPLACE TRIGGER NOUVEAU_MODELE
AFTER INSERT ON MODELE
FOR EACH ROW
DECLARE 
NOM_MARQUE MARQUE.MARQUE%TYPE;
NUM MARQUE.NUMMARQUE%TYPE;

BEGIN
    NUM := :NEW.NUMMARQUE ;

	SELECT MARQUE INTO NOM_MARQUE
	FROM MARQUE WHERE NUMMARQUE = NUM;

	DBMS_OUTPUT.PUT_LINE('un nouveau modèle est ajouté à la marque [ '||NOM_MARQUE||' ]');
END;
/

/* tests */



/***********************************************************************************************************************************/
/** 3 **/
/**3. Création d'un trigger qui vérifie que lors de la modification du salaire d’un employé, 
la nouvelle valeur ne peut jamais être inférieure à la précédente.**/

/** Le before permet de remettre en cause la mise a jours contenu dans le trigger **/

/** pour cela l'on doit arreter la modification avant son exécution , donc utiliser le BEFORE 
puis l'on compare la nouvelle valeur du SALAIRE  que l'on souhaite mettre (NEW) avec l'ancienne existante (OLD)
et l'on génére une interruption (erreur) avec la fonction "raise_application_error" pour empecher la modification dans le cas ou
NEW < OLD**/

CREATE OR REPLACE TRIGGER UPDATE_SALAIRE
BEFORE UPDATE OF SALAIRE ON EMPLOYE 
FOR EACH ROW
BEGIN
	IF :NEW.SALAIRE < :OLD.SALAIRE
	THEN raise_application_error(-20001, 'Le nouveau salaire ne doit pas etre inférieure a l`ancien!') ;
	END IF;
END;
/ 

/**
Trigger created.
**/

/** tester la modification du salaire d'un employé **/
UPDATE EMPLOYE SET SALAIRE = SALAIRE - 100 WHERE NUMEMPLOYE = 53 ;

/**
ERROR at line 1:
ORA-20001: Le nouveau salaire ne doit pas etre inférieure a l`ancien!
ORA-06512: at "SYSTEM.UPDATE_SALAIRE", line 3
ORA-04088: error during execution of trigger 'SYSTEM.UPDATE_SALAIRE'
**/

/**  Le trigger a arreté le programme et invalidé la mise a jours, Il a ainsi protégé l'integrité de la base de données */

/***********************************************************************************************************************************/
/** 4 **/

Pour pouvoir assurer que les période sont correct il faut déclaré un tirgger qui va être exécuté a chaque insertion ou mise à jour des dates
Ce trigger a pour but de comparer les valeur de dates en question avec les valeurs de l'intervention correspondante 
et dans le cas où la période de l'intervention de l'employé n'est comprise entre la période de l'intervention correspondante une exception est levé
a l'aide de la fonction \texttt{RAISE\_APPLICATION\_ERROR}

CREATE OR REPLACE TRIGGER CHECK_PERIODE_INTER 
BEFORE INSERT OR UPDATE OF DATEDEBUT,DATEFIN ON INTERVENANT
FOR EACH ROW

DECLARE
INTER_ROW INTERVENTIONS%ROWTYPE;

BEGIN

  SELECT * INTO INTER_ROW FROM INTERVENTIONS WHERE NUMINTERVENTION = :NEW.NUMINTERVENTION;
  IF((INTER_ROW.DATEDEBINTERV <= :NEW.DATEDEBUT AND INTER_ROW.DATEFININTERV >= :NEW.DATEFIN ))
 THEN
	DBMS_OUTPUT.PUT_LINE('PERIODE VALIDE POUR L EMPLOYE :'||:NEW.NUMEMPLOYE ||'  POUR L INTERVENTION :'|| INTER_ROW.NUMINTERVENTION);
	
 ELSE RAISE_APPLICATION_ERROR(-20002,'PERIODE INVALIDE POUR L EMPLOYE INTERVENANT :'||:NEW.NUMEMPLOYE ||'  POUR L INTERVENTION :'|| INTER_ROW.NUMINTERVENTION);
END IF;

END;
/

/* Test */
INSERT INTO INTERVENTIONS VALUES (13,8,'réparation systeme',to_date('2006-05-12 14:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-05-12 18:00:00','YYYY-MM-DD HH24:MI:SS' ),17846);
INSERT INTO INTERVENANT VALUES (13,54,to_date('2006-02-26 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-02-26 12:00:00','YYYY-MM-DD HH24:MI:SS' ));


/***********************************************************************************************************************************/
/** 5 **/

/**5. Afin que l’administrateur puisse connaitre le nombre total des interventions pour chaque employé. 
Pour cela, nous ajoutons l'attribut TOTAL_INTERVENTIONS dans la table employé.
Puis nous créons le trigger TOTAL_INTERVENTIONS_TRIGGER qui met à jour l’attribut TOTAL_ INTERVENTIONS.**/



ALTER TABLE EMPLOYE ADD (TOTAL_INTERVENTIONS INTEGER DEFAULT 0);

/**
Table altered.
**/

/** le trigger suivant incrémente la valeur de l'attribut TOTAL_INTERVENTIONS lorsqu'un employé participe a une nouvelle intervention,
c'est à dire lorsque un element (tuple) est inséré dans la table INTERVENANT **/

CREATE OR REPLACE TRIGGER TOTAL_INTERVENTIONS_TRIGGER
AFTER INSERT ON INTERVENANT
FOR EACH ROW
BEGIN
	UPDATE EMPLOYE E
	SET TOTAL_INTERVENTIONS = TOTAL_INTERVENTIONS + 1 
	WHERE E.NUMEMPLOYE = :NEW.NUMEMPLOYE ;
END;
/

/**
Trigger created.
**/


/** tester le trigger **/
/** affichage du nombre d'intervention avant l'insertion **/
SELECT TOTAL_INTERVENTIONS FROM EMPLOYE WHERE NUMEMPLOYE = 53;
/**
TOTAL_INTERVENTIONS
-------------------
                  0
**/

/** insertion dans la table INTERVENANT **/
INSERT INTO INTERVENANT VALUES (1,53,to_date('2017-01-27 08:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2017-02-09 14:00:00','YYYY-MM-DD HH24:MI:SS' ));
/**
1 row created.
**/

/** affichage du nombre d'intervention après l'insertion **/
SELECT TOTAL_INTERVENTIONS FROM EMPLOYE WHERE NUMEMPLOYE = 53;
/**
TOTAL_INTERVENTIONS
-------------------
                  1
**/

/** effectivement après l'insertion le nombre totale d'intervention à été incrémenté **/




/***********************************************************************************************************************************/
/** 6 **/
/* La suite de reqûete qui permet de répondre au besoin posé dans la question est */
/*
\begin{itemize}
\item Création de la table \texttt{CHIFRE AFFAIRE} avec une reqûete \texttt{CREATE TABLE} 
\item Compter le nombre de tuple pour la date (le moi et l'année) en question avec une reqûte \texttt{SELECT}
\item Si le nombre est nulle créer un nouveau tuple avec la requête \texttt{INSERT}
\item Sinon mise à jour du nombre de gain actuelle avec la reqûete \texttt{UPDATE}
*/
CREATE TABLE CHIFFRE_AFFAIRE (
MOIS INTEGER,
ANNEE INTEGER,
TOTAL_GAINS REAL
);

CREATE OR REPLACE TRIGGER TRIGGER_GAINS 
AFTER INSERT ON INTERVENTIONS 
FOR EACH ROW
DECLARE 
CURR_GAIN CHIFFRE_AFFAIRE%ROWTYPE;
I INTEGER;
BEGIN

SELECT COUNT(*) INTO I
FROM CHIFFRE_AFFAIRE 
WHERE MOIS = EXTRACT(MONTH FROM :NEW.DATEDEBINTERV)
AND ANNEE = EXTRACT(YEAR FROM :NEW.DATEDEBINTERV);

SELECT * INTO CURR_GAIN
FROM CHIFFRE_AFFAIRE 
WHERE MOIS = EXTRACT(MONTH FROM :NEW.DATEDEBINTERV)
AND ANNEE = EXTRACT(YEAR FROM :NEW.DATEDEBINTERV);

IF I = 0 THEN
UPDATE CHIFFRE_AFFAIRE 
SET TOTAL_GAINS=(TOTAL_GAINS +:NEW.COUTINTERV)  
WHERE MOIS = CURR_GAIN.MOIS;
AND ANNEE = CURR_GAIN.ANNEE;
DBMS_OUTPUT.PUT_LINE('TOTAL_GAINS DU MOIS DE : '|| CURR_GAIN.MOIS ||' A ETE INCREMENTÉ DE :'|| :NEW.COUTINTERV );
ELSE
INSERT INTO CHIFFRE_AFFAIRE VALUES(MOIS,TO_CHAR(:NEW.DATEDEBINTERV ,'YYYY'),:NEW.COUTINTERV);
DBMS_OUTPUT.PUT_LINE('NOUVEAU CHIFFRE_AFFAIRE AJOUTÉ');
DBMS_OUTPUT.PUT_LINE('MOIS  : '|| MOIS ||' ANNEE:' || TO_CHAR(:NEW.DATEDEBINTERV ,'YYYY')||' TOTAL_GAIN :'|| :NEW.COUTINTERV );
END IF;
END;














