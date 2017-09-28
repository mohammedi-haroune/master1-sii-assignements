drop table EMPLOYE CASCADE CONSTRAINTS;
drop table CLIENT cascade CONSTRAINTS;
drop table MARQUE cascade CONSTRAINTS;
drop table MODELE cascade CONSTRAINTS;
drop table VEHICULE cascade CONSTRAINTS;
drop table INTERVENTIONS cascade CONSTRAINTS;
drop table INTERVENANT cascade CONSTRAINTS;
drop TABLESPACE INTERVENTION_TBS;
drop TABLESPACE INTERVENTION_tempTBS;


/** partie 1 **/
/** 1 **/
CREATE TABLESPACE INTERVENTION_TBS
DATAFILE 'INTERVENTION_TBS.DAT'
SIZE 100M
AUTOEXTEND ON
ONLINE;

CREATE TEMPORARY TABLESPACE INTERVENTION_tempTBS
TEMPFILE 'INTERVENTION_tempTBS.DAT'
SIZE 100M
AUTOEXTEND ON;

/** 2 **/
CREATE USER DBAINTERVENTION
IDENTIFIED BY DBAINTERVENTION
DEFAULT TABLESPACE INTERVENTION_TBS
TEMPORARY TABLESPACE INTERVENTION_tempTBS;

/** 3 **/
GRANT ALL PRIVILEGES TO DBAINTERVENTION;


/** partie 2 **/

/** 4 **/
/** call to CREATION.sql**/

/**CREATE TABLES**/

CREATE TABLE CLIENT
(
NUMCLIENT INTEGER,
CIV VARCHAR2(40),
PRENOMCLIENT VARCHAR2(40),
NOMCLIENT VARCHAR2(40),
DATENAISSANCE DATE,
ADRESSE VARCHAR2(60),
TELPROF VARCHAR2(40),
TELPRIV VARCHAR2(40),
FAX VARCHAR2(40),
CONSTRAINT PK_CLIENT PRIMARY KEY (NUMCLIENT)
);

CREATE TABLE EMPLOYE
(
NUMEMPLOYE INTEGER,
PRENOMEMP VARCHAR2(40),
NOMEMP VARCHAR2(40),
CATEGORIE VARCHAR2(40),
SALAIRE REAL,
CONSTRAINT PK_EMPLOYE PRIMARY KEY (NUMEMPLOYE),
CONSTRAINT CH_EMPLOYE CHECK (CATEGORIE IN ('MECANICIEN' , 'ASSISTANT'))
);

CREATE TABLE MARQUE (
NUMMARQUE INTEGER,
MARQUE VARCHAR2(40),
PAYS VARCHAR2(40),
CONSTRAINT PK_MARQUE PRIMARY KEY (NUMMARQUE)
);

CREATE TABLE MODELE (
NUMMODELE INTEGER,
NUMMARQUE INTEGER,
MODELE VARCHAR2(40),
CONSTRAINT PK_MODELE PRIMARY KEY (NUMMODELE),
CONSTRAINT FK_MODELE_MARQUE FOREIGN KEY (NUMMARQUE) REFERENCES MARQUE(NUMMARQUE)
);

CREATE TABLE VEHICULE (
NUMVEHICULE INTEGER,
NUMCLIENT INTEGER,
NUMMODELE INTEGER,
NUMIMMAT INTEGER,
ANNEE VARCHAR2(4),
CONSTRAINT PK_VEHICULE PRIMARY KEY (NUMVEHICULE),
CONSTRAINT FK_VEHICULE_CLIENT FOREIGN KEY (NUMCLIENT) REFERENCES CLIENT(NUMCLIENT),
CONSTRAINT FK_VEHICULE_MODELE FOREIGN KEY (NUMMODELE) REFERENCES MODELE(NUMMODELE)
);


CREATE TABLE INTERVENTIONS (
NUMINTERVENTION INTEGER,
NUMVEHICULE INTEGER,
TYPEINTERVENTION VARCHAR2(40),
DATEDEBINTERV DATE,
DATEFININTERV DATE,
COUTINTERV REAL,
CONSTRAINT PK_INTERVENTIONS PRIMARY KEY (NUMINTERVENTION),
CONSTRAINT FK_INTERVENTIONS_VEHICULE FOREIGN KEY (NUMVEHICULE) REFERENCES VEHICULE(NUMVEHICULE)
);



CREATE TABLE INTERVENANT
(
NUMINTERVENTION INTEGER,
NUMEMPLOYE INTEGER,
DATEDEBUT DATE,
DATEFIN DATE,
CONSTRAINT PK_INTERVENANT PRIMARY KEY (NUMINTERVENTION, NUMEMPLOYE),
CONSTRAINT FK_INTERVENANT_EMPLOYE FOREIGN KEY (NUMEMPLOYE)REFERENCES EMPLOYE,
CONSTRAINT FK_INTERVENANT_INTERVENTIONS FOREIGN KEY (NUMINTERVENTION) REFERENCES INTERVENTIONS
);


/** 5 **/
ALTER TABLE EMPLOYE ADD DATEINSTALLATION DATE NULL;

/** 6 **/
AlTER TABLE EMPLOYE MODIFY CATEGORIE NOT NULL ;
AlTER TABLE EMPLOYE MODIFY SALAIRE NOT NULL ;

/** 7 **/
ALTER TABLE EMPLOYE MODIFY PRENOMEMP VARCHAR2(50);
ALTER TABLE EMPLOYE MODIFY PRENOMEMP VARCHAR2(20);

/** 8 **/
ALTER TABLE EMPLOYE DROP COLUMN DATEINSTALLATION;
/*DESC EMPLOYE; */
/** 9 **/
ALTER TABLE CLIENT RENAME COLUMN ADRESSE TO ADRESSECLIENT  ;

SELECT column_name FROM user_tab_columns WHERE table_name = 'CLIENT';

/** 10 **/
ALTER TABLE INTERVENTIONS ADD CHECK (DATEDEBINTERV < DATEFININTERV);


/** PARTIE 3 **/
/** 11 **/

/** INSERTIONS **/

/*CLIENT */
INSERT INTO CLIENT VALUES(1,'MME','cherifa','mahbouba','08/08/1957','cite 1013 logts bt 61 alger','0561381813','0562458714','');
COMMIT;
INSERT INTO CLIENT VALUES(2,'MME','lamia','tahmi','31/12/1955','cite bachedjarah batiment 38-bach djerrah-alger','05622467849','0561392487','');
COMMIT;
INSERT INTO CLIENT VALUES(3,'MLE','ghania','diaf amrouni','31/12/1955','43,rue abderrahmane sbaa belle vue-el harrach-alger','0523894562','0619430945','0562784254');
COMMIT;
INSERT INTO CLIENT VALUES(4,'MLE','chahinaz','melek','27/06/1955','hlm aissat idir cage 9 3eme etage-el harrache alger','0634613493','0562529463','');
COMMIT;
INSERT INTO CLIENT VALUES(5,'MME','noura','techtache','22/03/1949','16,route el djamila-ain benian-alger','0562757834','','0562757843');
COMMIT;
INSERT INTO CLIENT VALUES(6,'MME','widad','touati','14/08/1965','14 rue des freres aoudia-el mouradia-alger','0561243967','0561401836','');
COMMIT;
INSERT INTO CLIENT VALUES(7,'MLE','faiza','abloul','28/10/1967','cite diplomatique bt bleu 148 n 3 dergana-alger','0562935427','0561486203','');
COMMIT;
INSERT INTO CLIENT VALUES(8,'MME','assia','horra','08/12/1963','32 rue ahmed ouaked-dely brahim-alger','0561038500','','0562466733');
COMMIT;
INSERT INTO CLIENT VALUES(9,'MLE','souad','mesbah','30/08/1972','residence chabani-hydra-alger','0561024358','','');
COMMIT;
INSERT INTO CLIENT VALUES(10,'MME','houda','grouda','20/02/1950','epsp thniet elabed batna','0562939495','0561218456','');
COMMIT;
INSERT INTO CLIENT VALUES(11,'MLE','saida','fenniche','','cite de lindependance larbaa blida','0645983165','0562014784','');
COMMIT;
INSERT INTO CLIENT VALUES(12,'MME','samia','ouali','17/11/1966','cite 200 logements bt1 n1-jijel','0561374812','0561277013','');
COMMIT;
INSERT INTO CLIENT VALUES(13,'MME','fatiha','haddad','20/09/1980','rue boufada lakhdarat-ain oulmane-setif','0647092453','0562442700','');
COMMIT;
INSERT INTO CLIENT VALUES(14,'M','djamel','mati','','draa kebila hammam ghergour setif','0561390288','','0562375849');
COMMIT;
INSERT INTO CLIENT VALUES(15,'M','mohammed','ghrair','24/06/1950','cite jeanne darc ecran b5-gambetta-oran','0561390288','','0562375849');
COMMIT;
INSERT INTO CLIENT VALUES(16,'M','ali','laaour','','cite 1er mai ex 137 logements-adrar','0639939410','0561255412','');
COMMIT;
INSERT INTO CLIENT VALUES(17,'M','messoud','aouiz','24/11/1958','rue saidani abdesslam-ain bessem-bouira','0561439256','0561294268','');
COMMIT;
INSERT INTO CLIENT VALUES(18,'M','farid','akil','06/05/1961','3 rue larbi ben mhidi-draa el mizan-tizi ouzou','0562349254','0561294268','');
COMMIT;
INSERT INTO CLIENT VALUES(19,'MME','dalila','mouhtadi','','6,bd tripoli oran','0506271459','0506294186','');
COMMIT;
INSERT INTO CLIENT VALUES(20,'M','younes','chalah','','cite des 60 logts bt d n 48-nacira-boumerdes','','0561358279','');
COMMIT;
INSERT INTO CLIENT VALUES(21,'M','boubeker','barkat','08/11/1935','cite mentouri n 71 bt ab smik constantine','0561824538','0561326179','');
COMMIT;
INSERT INTO CLIENT VALUES(22,'M','seddik','hmia','','25 rue ben yahiya-jijel','0562379513','','0562493627');
COMMIT;
INSERT INTO CLIENT VALUES(23,'M','lamine','merabat','09/13/1965','cite jeanne d arc ecran b2-gambetta-oran','0561724538','0561724538','');
COMMIT;
/*..............................*/
/*EMPLOYE*/
INSERT INTO EMPLOYE VALUES(53,'lachemi','bouzid','MECANICIEN',25000);
COMMIT;
INSERT INTO EMPLOYE VALUES(54,'bouchemla','elias','ASSISTANT',10000);
COMMIT;
INSERT INTO EMPLOYE VALUES(55,'hadj','zouhir','ASSISTANT',12000);
COMMIT;
INSERT INTO EMPLOYE VALUES(56,'oussedik','hakim','MECANICIEN',20000);
COMMIT;
INSERT INTO EMPLOYE VALUES(57,'abad','abdelhamid','ASSISTANT',13000);
COMMIT;
INSERT INTO EMPLOYE VALUES(58,'babaci','tayeb','MECANICIEN',21300);
COMMIT;
INSERT INTO EMPLOYE VALUES(59,'belhamidi','mourad','MECANICIEN',19500);
COMMIT;
INSERT INTO EMPLOYE VALUES(60,'igoudjil','redouane','ASSISTANT',15000);
COMMIT;
INSERT INTO EMPLOYE VALUES(61,'koula','bahim','MECANICIEN',23100);
COMMIT;
INSERT INTO EMPLOYE VALUES(62,'rahali','ahcene','MECANICIEN',24000);
COMMIT;
INSERT INTO EMPLOYE VALUES(63,'chaoui','ismail','ASSISTANT',13000);
COMMIT;
INSERT INTO EMPLOYE VALUES(64,'badi','hatem','ASSISTANT',14000);
COMMIT;
INSERT INTO EMPLOYE VALUES(65,'mohammedi','mustapha','MECANICIEN',24000);
COMMIT;
INSERT INTO EMPLOYE VALUES(66,'fekar','abdelaziz','ASSISTANT',13500);
COMMIT;
INSERT INTO EMPLOYE VALUES(67,'saidouni','wahid','MECANICIEN',25000);
COMMIT;
INSERT INTO EMPLOYE VALUES(68,'boularas','farid','ASSISTANT',14000);
COMMIT;
INSERT INTO EMPLOYE VALUES(69,'chaker','nassim','MECANICIEN',26000);
COMMIT;
INSERT INTO EMPLOYE VALUES(71,'terki','yacine','MECANICIEN',23000);
COMMIT;
INSERT INTO EMPLOYE VALUES(72,'tebibel','ahmed','ASSISTANT',17000);
COMMIT;
INSERT INTO EMPLOYE VALUES(80,'lardjoune','karim','',25000);
COMMIT;
/*.............................*/
/*MARQUE*/
INSERT INTO MARQUE VALUES (1,'lamborghini','italie');
COMMIT;
INSERT INTO MARQUE VALUES (2,'audi','allemagne');
COMMIT;
INSERT INTO MARQUE VALUES (3,'rolls-royce','grand-bretagne');
COMMIT;
INSERT INTO MARQUE VALUES (4,'bmw','allemagne');
COMMIT;
INSERT INTO MARQUE VALUES (5,'cadilac','etats-unis');
COMMIT;
INSERT INTO MARQUE VALUES (6,'chrysler','etats-unis');
COMMIT;
INSERT INTO MARQUE VALUES (7,'ferrari','italie');
COMMIT;
INSERT INTO MARQUE VALUES (8,'honda','japon');
COMMIT;
INSERT INTO MARQUE VALUES (9,'jaguar','grande-bretagne');
COMMIT;
INSERT INTO MARQUE VALUES (10,'alfa-romeo','italie');
COMMIT;
INSERT INTO MARQUE VALUES (11,'lexus','japon');
COMMIT;
INSERT INTO MARQUE VALUES (12,'lotus','grande-bretagne');
COMMIT;
INSERT INTO MARQUE VALUES (13,'maserati','italie');
COMMIT;
INSERT INTO MARQUE VALUES (14,'mercedes','allemagne');
COMMIT;
INSERT INTO MARQUE VALUES (15,'peugeot','france');
COMMIT;
INSERT INTO MARQUE VALUES (16,'porsche','allemagne');
COMMIT;
INSERT INTO MARQUE VALUES (17,'renault','france');
COMMIT;
INSERT INTO MARQUE VALUES (18,'saab','suede');
COMMIT;
INSERT INTO MARQUE VALUES (19,'toyota','japon');
COMMIT;
INSERT INTO MARQUE VALUES (20,'venturi','france');
COMMIT;
INSERT INTO MARQUE VALUES (21,'volvo','suede');
COMMIT;
/*......................................*/
/* MODELE*/
INSERT INTO MODELE VALUES (2,1,'diablo');
COMMIT;
INSERT INTO MODELE VALUES (3,2,'série 5');
COMMIT;
INSERT INTO MODELE VALUES (4,10,'nsx');
COMMIT;
INSERT INTO MODELE VALUES (5,14,'classe c');
COMMIT;
INSERT INTO MODELE VALUES (6,17,'safrane');
COMMIT;
INSERT INTO MODELE VALUES (7,20,'400 gt');
COMMIT;
INSERT INTO MODELE VALUES (8,12,'esprit');
COMMIT;
INSERT INTO MODELE VALUES (9,15,'605');
COMMIT;
INSERT INTO MODELE VALUES (10,19,'prévia');
COMMIT;
INSERT INTO MODELE VALUES (11,7,'550 maranello');
COMMIT;
INSERT INTO MODELE VALUES (12,3,'bentley-continental');
COMMIT;
INSERT INTO MODELE VALUES (13,10,'spider');
COMMIT;
INSERT INTO MODELE VALUES (14,13,'evoluzione');
COMMIT;
INSERT INTO MODELE VALUES (15,16,'carrera');
COMMIT;
INSERT INTO MODELE VALUES (16,16,'boxter');
COMMIT;
INSERT INTO MODELE VALUES (17,21,'s 80');
COMMIT;
INSERT INTO MODELE VALUES (18,6,'300 m');
COMMIT;
INSERT INTO MODELE VALUES (19,4,'m 3');
COMMIT;
INSERT INTO MODELE VALUES (20,9,'xj 8');
COMMIT;
INSERT INTO MODELE VALUES (21,15,'406 coupé');
COMMIT;
INSERT INTO MODELE VALUES (22,20,'300 atlantic');
COMMIT;
INSERT INTO MODELE VALUES (23,14,'classe e');
COMMIT;
INSERT INTO MODELE VALUES (24,11,'gs 300');
COMMIT;
INSERT INTO MODELE VALUES (25,5,'séville');
COMMIT;
INSERT INTO MODELE VALUES (26,18,'95 cabriolet');
COMMIT;
INSERT INTO MODELE VALUES (27,2,'tt coupé');
COMMIT;
INSERT INTO MODELE VALUES (28,7,'f 355');
COMMIT;
/*INSERT INTO MODELE VALUES (29,45,'polo');
COMMIT;*/
/*...................................*/
/*VEHICULE*/
INSERT INTO VEHICULE VALUES (1,2,6,0012519216,'1992');
COMMIT;
INSERT INTO VEHICULE VALUES (2,9,20,0124219316,'1993');
COMMIT;
INSERT INTO VEHICULE VALUES (3,17,8,1452318716,'1987');
COMMIT;
INSERT INTO VEHICULE VALUES (4,6,12,3145219816,'1998');
COMMIT;
INSERT INTO VEHICULE VALUES (5,16,23,1278919816,'1998');
COMMIT;
INSERT INTO VEHICULE VALUES (6,20,6,3853319735,'1997');
COMMIT;
INSERT INTO VEHICULE VALUES (7,7,8,1453119816,'1998');
COMMIT;
INSERT INTO VEHICULE VALUES (8,16,14,8365318601,'1986');
COMMIT;
INSERT INTO VEHICULE VALUES (9,13,15,3087319233,'1992');
COMMIT;
INSERT INTO VEHICULE VALUES (10,20,22,9413119935,'1999');
COMMIT;
INSERT INTO VEHICULE VALUES (11,9,16,1572319801,'1998');
COMMIT;
INSERT INTO VEHICULE VALUES (12,14,20,6025319733,'1997');
COMMIT;
INSERT INTO VEHICULE VALUES (13,19,17,5205319736,'1997');
COMMIT;
INSERT INTO VEHICULE VALUES (14,22,21,7543119207,'1992');
COMMIT;
INSERT INTO VEHICULE VALUES (15,4,19,6254319916,'1999');
COMMIT;
INSERT INTO VEHICULE VALUES (16,16,21,9831419701,'1997');
COMMIT;
INSERT INTO VEHICULE VALUES (17,12,11,4563117607,'1976');
COMMIT;
INSERT INTO VEHICULE VALUES (18,1,2,7973318216,'1982');
COMMIT;
INSERT INTO VEHICULE VALUES (19,18,77,3904318515,'1985');
COMMIT;
INSERT INTO VEHICULE VALUES (20,22,2,1234319707,'1997');
COMMIT;
INSERT INTO VEHICULE VALUES (21,3,19,8429318516,'1985');
COMMIT;
INSERT INTO VEHICULE VALUES (22,8,19,1245619816,'1998');
COMMIT;
INSERT INTO VEHICULE VALUES (23,7,25,1678918516,'1985');
COMMIT;
INSERT INTO VEHICULE VALUES (24,80,9,1789519816,'1998');
COMMIT;
INSERT INTO VEHICULE VALUES (25,13,5,1278919833,'1998');
COMMIT;
INSERT INTO VEHICULE VALUES (26,3,10,1458919316,'1993');
COMMIT;
INSERT INTO VEHICULE VALUES (27,10,7,1256019804,'1998');
COMMIT;
INSERT INTO VEHICULE VALUES (28,10,3,1986219904,'1999');
COMMIT;
/*...................................*/
/*INTERVENTIONS*/
INSERT INTO INTERVENTIONS VALUES (1,3,'réparation',to_date('2006/02/25 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006/02/26 12:00:00','YYYY-MM-DD HH24:MI:SS'),30000);
COMMIT;
INSERT INTO INTERVENTIONS VALUES (2,21,'réparation',to_date('2006-02-23 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-02-24 18:00:00','YYYY-MM-DD HH24:MI:SS' ),10000);
COMMIT;
INSERT INTO INTERVENTIONS VALUES (3,25,'réparation',to_date('2006-04-06 14:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-04-09 12:00:00','YYYY-MM-DD HH24:MI:SS' ),42000);
COMMIT;
INSERT INTO INTERVENTIONS VALUES (4,10,'entretien', to_date('2006-05-14 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-05-14 18:00:00','YYYY-MM-DD HH24:MI:SS' ),10000);
COMMIT;
INSERT INTO INTERVENTIONS VALUES (5,6,'réparation',to_date('2006-02-22 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-02-25 18:00:00','YYYY-MM-DD HH24:MI:SS' ),40000);
COMMIT;
INSERT INTO INTERVENTIONS VALUES (6,14,'entretien',to_date('2006-03-03 14:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-03-04 18:00:00','YYYY-MM-DD HH24:MI:SS' ),7500);
COMMIT;
INSERT INTO INTERVENTIONS VALUES (7,1,'entretien',to_date('2006-04-09 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-04-09 18:00:00','YYYY-MM-DD HH24:MI:SS' ),8000);
COMMIT;
INSERT INTO INTERVENTIONS VALUES (8,17,'entretien',to_date('2006-05-11 14:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-05-12 18:00:00','YYYY-MM-DD HH24:MI:SS' ),9000);
COMMIT;
INSERT INTO INTERVENTIONS VALUES (9,22,'entretien',to_date('2006-02-22 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-02-22 18:00:00','YYYY-MM-DD HH24:MI:SS' ),7960);
COMMIT;
INSERT INTO INTERVENTIONS VALUES (10,2,'entretien et réparation',to_date('2006-04-08 14:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-04-09 18:00:00','YYYY-MM-DD HH24:MI:SS' ),45000);
COMMIT;
INSERT INTO INTERVENTIONS VALUES (11,28,'réparation',to_date('2006-03-08 14:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-03-17 12:00:00','YYYY-MM-DD HH24:MI:SS' ),36000);
COMMIT;
INSERT INTO INTERVENTIONS VALUES (12,20,'entretien et réparation',to_date('2006-05-03 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-05-05 18:00:00','YYYY-MM-DD HH24:MI:SS' ),27000);
COMMIT;
INSERT INTO INTERVENTIONS VALUES (13,8,'réparation systeme',to_date('2006-05-12 14:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-05-12 18:00:00','YYYY-MM-DD HH24:MI:SS' ),17846);
COMMIT;
INSERT INTO INTERVENTIONS VALUES (14,1,'réparation',to_date('2006-05-10 14:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-05-12 12:00:00','YYYY-MM-DD HH24:MI:SS' ),39000);
COMMIT;
INSERT INTO INTERVENTIONS VALUES (15,20,'réparation systeme',to_date('2006-06-25 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-06-25 12:00:00','YYYY-MM-DD HH24:MI:SS' ),27000);
COMMIT;
INSERT INTO INTERVENTIONS VALUES (16,77,'réparation',to_date('2006-06-27 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-06-30 12:00:00','YYYY-MM-DD HH24:MI:SS' ),25000);
COMMIT;
/*.......................................*/
/*INTERVENANTS*/
INSERT INTO INTERVENANT VALUES (1,54,to_date('2006-02-26 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-02-26 12:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (1,59,to_date('2006-02-25 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-02-25 18:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (2,57,to_date('2006:02:24 14:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-02-24 18:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (2,59,to_date('2006-02-23 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-02-24 12:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (3,60,to_date('2006-04-09 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-04-09 12:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (3,65,to_date('2006-04-06 14:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-04-08 18:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (4,62,to_date('2006-05-14 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-05-14 12:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (4,66,to_date('2006-02-14 14:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-05-14 18:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (5,56,to_date('2006-02-22 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-02-25 12:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (5,60,to_date('2006-02-23 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-02-25 18:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (6,53,to_date('2006-03-03 14:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-03-04 12:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (6,57,to_date('2006-03-04 14:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-03-04 18:00;00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (7,55,to_date('2006-04-09 14:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-04-09 18:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (7,65,to_date('2006-04-09 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-04-09 12:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (8,54,to_date('2006-05-12 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-05-12 18:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (8,62,to_date('2006-05-11 14:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-05-12 12:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (9,59,to_date('2006-02-22 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-02-22 12:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (9,60,to_date('2006-02-22 14:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-04-09 18:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (10,63,to_date('2006-04-09 14:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-04-09 18:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (10,67,to_date('2006-04-08 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-04-09 12:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (11,59,to_date('2006-03-09 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-03-11 18:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (11,64,to_date('2006-03-09 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-03-17 12:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (11,53,to_date('2006-03-08 14:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-03-16 18:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (12,55,to_date('2006-05-05 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-05-05 18:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (12,56,to_date('2006-05-03 09:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-05-05 12:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (13,64,to_date('2006-05-12 14:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-05-12 18:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;
INSERT INTO INTERVENANT VALUES (14,88,to_date('2006-05-07 14:00:00','YYYY-MM-DD HH24:MI:SS' ),to_date('2006-05-10 18:00:00','YYYY-MM-DD HH24:MI:SS' ));
COMMIT;

/* LES PROBLEMES */
/* VU L'AJOUT D'UNE COLONNE PUIS LA SUPPRESSION D'UNE AUTRE COLONNE DANS LA TABLE
EMPLOYE IL Y'A UN PROBLEME DE CORRESPONDENCE ENTRE LES ATTRIBUTS ET VALEURES

LE CLIENT N 23 NE PEUT PAS ETRE NEE LI MOIS : 13 CAR INEXISTANT

LE VEHICULE 77 N'EXISTE PAS D'OU LA VIOLATION D'INTEGRITEE FK_INTERVENTIONS_VEHICULE

cannot insert NULL into ("DBAINTERVENTION"."EMPLOYE"."CATEGORIE")

L'EMPLOYE 88 N'EXISTE PAS D'OU LA VIOLATION D'INTEGRITEE FK_INTERVENANT_EMPLOYE
*/

/** 13 **/
/*desactiver la contrainte*/
ALTER TABLE INTERVENTIONS DISABLE CONSTRAINT  SYS_C007119 ;

/*modification*/
UPDATE INTERVENTIONS SET DATEDEBINTERV =  DATEDEBINTERV + 5
WHERE EXTRACT(MONTH FROM DATEDEBINTERV) = 2 OR  EXTRACT(MONTH FROM DATEFININTERV) = 2 ;

/*réactivation de la contrainte*/
CREATE TABLE TableErreurs (adresse ROWID, utilisateur VARCHAR2(30), nomTable VARCHAR2(30), nomContrainte
VARCHAR2(30));
ALTER TABLE INTERVENTIONS ENABLE CONSTRAINT SYS_C007119 EXCEPTIONS INTO TableErreurs;

SELECT * FROM TableErreurs;


/** 15 **/

SELECT MARQUE , MODELE FROM MARQUE , MODELE;

/** 17 **/
SELECT AVG(DATEFININTERV - DATEDEBINTERV) AS DUREE_MOYENNE FROM INTERVENTIONS;

