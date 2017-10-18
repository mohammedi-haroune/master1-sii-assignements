 
 
 /** 1**/
 
 SELECT COUNT(*) FROM DICT;
 
 /** il contient n instance 
 
 2551 rows selected.
**/
 
 /* le structure du cataloge DICT est : */
 
DESC DICT;
/**
 Name                                      Null?    Type
 ----------------------------------------- -------- ------------------

 TABLE_NAME                                         VARCHAR2(30)
 COMMENTS                                           VARCHAR2(4000)

 **/
 /** 2 **/
SELECT * FROM DICT 
WHERE TABLE_NAME IN ('ALL_TAB_COLUMNS','USER_USERS', 'ALL_CONSTRAINTS', 'USER_TAB_PRIVS');

DESC ALL_TAB_COLUMNS;
DESC USER_USERS;
DESC ALL_CONSTRAINTS;
DESC USER_TAB_PRIVS;
 /** 3 **/
 
DESC USER_USERS;
 
/**
 Name                                      Null?    Type
 ----------------------------------------- -------- -----------------

 USERNAME                                  NOT NULL VARCHAR2(30)
 USER_ID                                   NOT NULL NUMBER
 ACCOUNT_STATUS                            NOT NULL VARCHAR2(32)
 LOCK_DATE                                          DATE
 EXPIRY_DATE                                        DATE
 DEFAULT_TABLESPACE                        NOT NULL VARCHAR2(30)
 TEMPORARY_TABLESPACE                      NOT NULL VARCHAR2(30)
 CREATED                                   NOT NULL DATE
 INITIAL_RSRC_CONSUMER_GROUP                        VARCHAR2(30)
 EXTERNAL_NAME                                      VARCHAR2(4000)
 **/
 
 
 SELECT USERNAME FROM USER_USERS ; 
 
 /**
USERNAME
------------------------------
SYSTEM

 **/
 /** 4 **/
DESC ALL_TAB_COLUMNS;
DESC USER_TAB_COLUMNS;
/*la structure des tables est presque le meme la suele difference c'est l'attribut OWNER dans la table ALL_TAB_COLUMNS*/
SELECT COUNT(*) FROM ALL_TAB_COLUMNS;
SELECT COUNT(*) FROM USER_TAB_COLUMNS;
/*
La table \texttt{ALL_TAB_COLUMNS} contient beaucoup de lignes par rapport à la table \texttt{USER_TAB_COLUMNS}
ceci est justifier par le fait que cette denière contient que les information concernant les tables de l'utilisateur actualle 
tandis que la première contient  les information de toutes tables que l'utlisateur a un acces
*/

 /** 5 **/
 
 DESC ALL_TABLES;
 /**
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------

 OWNER                                     NOT NULL VARCHAR2(30)
 TABLE_NAME                                NOT NULL VARCHAR2(30)
 TABLESPACE_NAME                                    VARCHAR2(30)
 CLUSTER_NAME                                       VARCHAR2(30)
 IOT_NAME                                           VARCHAR2(30)
 STATUS                                             VARCHAR2(8)
 PCT_FREE                                           NUMBER
 PCT_USED                                           NUMBER
 INI_TRANS                                          NUMBER
 MAX_TRANS                                          NUMBER
 INITIAL_EXTENT                                     NUMBER
 NEXT_EXTENT                                        NUMBER
 MIN_EXTENTS                                        NUMBER
 MAX_EXTENTS                                        NUMBER
 PCT_INCREASE                                       NUMBER
 FREELISTS                                          NUMBER
 FREELIST_GROUPS                                    NUMBER
 LOGGING                                            VARCHAR2(3)
 BACKED_UP                                          VARCHAR2(1)
 NUM_ROWS                                           NUMBER
 BLOCKS                                             NUMBER
 EMPTY_BLOCKS                                       NUMBER
 AVG_SPACE                                          NUMBER
 CHAIN_CNT                                          NUMBER
 AVG_ROW_LEN                                        NUMBER
 AVG_SPACE_FREELIST_BLOCKS                          NUMBER
 NUM_FREELIST_BLOCKS                                NUMBER
 DEGREE                                             VARCHAR2(40)
 INSTANCES                                          VARCHAR2(40)
 CACHE                                              VARCHAR2(20)
 TABLE_LOCK                                         VARCHAR2(8)
 SAMPLE_SIZE                                        NUMBER
 LAST_ANALYZED                                      DATE
 PARTITIONED                                        VARCHAR2(3)
 IOT_TYPE                                           VARCHAR2(12)
 TEMPORARY                                          VARCHAR2(1)
 SECONDARY                                          VARCHAR2(1)
 NESTED                                             VARCHAR2(3)
 BUFFER_POOL                                        VARCHAR2(7)
 FLASH_CACHE                                        VARCHAR2(7)
 CELL_FLASH_CACHE                                   VARCHAR2(7)
 ROW_MOVEMENT                                       VARCHAR2(8)
 GLOBAL_STATS                                       VARCHAR2(3)
 USER_STATS                                         VARCHAR2(3)
 DURATION                                           VARCHAR2(15)
 SKIP_CORRUPT                                       VARCHAR2(8)
 MONITORING                                         VARCHAR2(3)
 CLUSTER_OWNER                                      VARCHAR2(30)
 DEPENDENCIES                                       VARCHAR2(8)
 COMPRESSION                                        VARCHAR2(8)
 COMPRESS_FOR                                       VARCHAR2(12)
 DROPPED                                            VARCHAR2(3)
 READ_ONLY                                          VARCHAR2(3)
 SEGMENT_CREATED                                    VARCHAR2(3)
 RESULT_CACHE                                       VARCHAR2(7)

 **/
 
SELECT TABLE_NAME  FROM ALL_TABLES WHERE OWNER = 'DBAINTERVENTION' ;

/**
TABLE_NAME
------------------------------
CLIENT
EMPLOYE
MARQUE
MODELE
VEHICULE
INTERVENTIONS
INTERVENANT

 
7 rows selected.
**/


 SELECT * FROM ALL_TABLES WHERE OWNER = 'DBAINTERVENTION';
 
 /*vu que le nbr d'infos est très important nous allons afficher que 3 colonnes qui sont:
 le nom de la table , le nom de la table space dans la quelle les tables ont été crées
 et le nom du proporiétaire de la table*/ 

 SELECT TABLE_NAME, TABLESPACE_NAME, OWNER FROM ALL_TABLES WHERE OWNER = 'DBAINTERVENTION';

 /**
TABLE_NAME                     TABLESPACE_NAME				OWNER 
-------------------------------------------------------------------

CLIENT                         INTERVENTION_TBS				DBAINTERVENTION

EMPLOYE                        INTERVENTION_TBS				DBAINTERVENTION

MARQUE                         INTERVENTION_TBS				DBAINTERVENTION

MODELE                         INTERVENTION_TBS				DBAINTERVENTION

VEHICULE                       INTERVENTION_TBS				DBAINTERVENTION

INTERVENTIONS                  INTERVENTION_TBS				DBAINTERVENTION

INTERVENANT                    INTERVENTION_TBS				DBAINTERVENTION


7 rows selected.
**/
 
 /** 6 **/ 
SELECT TABLE_NAME  FROM ALL_TABLES WHERE OWNER = 'SYSTEM' ;
SELECT TABLE_NAME  FROM ALL_TABLES WHERE OWNER = 'DBAINTERVENTION' ;
//PAS DE RESULTATS
 /** 7 **/
 
 DESC USER_TAB_COLUMNS;
 
 /**
 Name                                      Null?    Type
 ----------------------------------------- -------- -----------------------

 TABLE_NAME                                NOT NULL VARCHAR2(30)
 COLUMN_NAME                               NOT NULL VARCHAR2(30)
 DATA_TYPE                                          VARCHAR2(106)
 DATA_TYPE_MOD                                      VARCHAR2(3)
 DATA_TYPE_OWNER                                    VARCHAR2(120)
 DATA_LENGTH                               NOT NULL NUMBER
 DATA_PRECISION                                     NUMBER
 DATA_SCALE                                         NUMBER
 NULLABLE                                           VARCHAR2(1)
 COLUMN_ID                                          NUMBER
 DEFAULT_LENGTH                                     NUMBER
 DATA_DEFAULT                                       LONG
 NUM_DISTINCT                                       NUMBER
 LOW_VALUE                                          RAW(32)
 HIGH_VALUE                                         RAW(32)
 DENSITY                                            NUMBER
 NUM_NULLS                                          NUMBER
 NUM_BUCKETS                                        NUMBER
 LAST_ANALYZED                                      DATE
 SAMPLE_SIZE                                        NUMBER
 CHARACTER_SET_NAME                                 VARCHAR2(44)
 CHAR_COL_DECL_LENGTH                               NUMBER
 GLOBAL_STATS                                       VARCHAR2(3)
 USER_STATS                                         VARCHAR2(3)
 AVG_COL_LEN                                        NUMBER
 CHAR_LENGTH                                        NUMBER
 CHAR_USED                                          VARCHAR2(1)
 V80_FMT_IMAGE                                      VARCHAR2(3)
 DATA_UPGRADED                                      VARCHAR2(3)
 HISTOGRAM                                          VARCHAR2(15)
 **/
 
  SELECT * FROM USER_TAB_COLUMNS WHERE (TABLE_NAME = 'VEHICULE' OR TABLE_NAME = 'INTERVENTIONS');
  
  /* vu que la quantité d'infos est grande nous nous contenterons d'afficher uniquement 5 infos qui sont : */
 
 
 SELECT TABLE_NAME, COLUMN_NAME, NULLABLE, DATA_TYPE, DATA_LENGTH FROM USER_TAB_COLUMNS WHERE (TABLE_NAME = 'VEHICULE' OR TABLE_NAME = 'INTERVENTIONS');
 
 /**
 TABLE_NAME                     COLUMN_NAME                    N		DATA_TYPE		DATA_LENGTH
---------------------------------------------------------------------------------------------------

INTERVENTIONS                   NUMINTERVENTION                N		NUMBER	         22

INTERVENTIONS                   NUMVEHICULE                    Y		NUMBER	         22

INTERVENTIONS                   TYPEINTERVENTION               Y		VARCHAR2         40

INTERVENTIONS                   DATEDEBINTERV                  Y		DATE	          7

INTERVENTIONS                   DATEFININTERV                  Y		DATE	          7

INTERVENTIONS                   COUTINTERV                     Y		FLOAT	         22

VEHICULE                        NUMVEHICULE                    N		NUMBER	         22

VEHICULE                        NUMCLIENT                      Y		NUMBER	         22

VEHICULE                        NUMMODELE                      Y		NUMBER	         22

VEHICULE                        NUMIMMAT                       Y		NUMBER	         22

VEHICULE                        ANNEE                          Y		VARCHAR2	      4


11 rows selected.
**/
 
 
 /** 8 **/ 
 /*1. chercher dans le dictionaire touts les tables qui contient le mot CONSTRAINTS*/
 SELECT * FROM DICT WHERE TABLE_NAME LIKE '%CONSTRAINTS%'
 /*
 2. à partir de la description des tables on extrait les noms des tables qui peuvent contenir l'information concerntant la containte demandé
 dans ce cas : USER_CONSTRAINTS
 */
 /*
 3. afficher le chema de la table
 */
 DESC USER_CONSTRAINTS;
 /*
 4. écriture de la reqûte qui vérifie l'existense du contrainte
 */
 SELECT *
 FROM USER_CONSTRAINTS
 WHERE CONSTRAINT_TYPE = 'R' AND TABLE_NAME = 'VEHICULE' OR TABLE_NAME = 'INTERVENTIONS';
 /*

 */
 
 /** 9 **/
 
 DESC USER_CONSTRAINTS;
 
 /**
  Name                                      Null?    Type
 ----------------------------------------- -------- --------------------

 OWNER                                              VARCHAR2(120)
 CONSTRAINT_NAME                           NOT NULL VARCHAR2(30)
 CONSTRAINT_TYPE                                    VARCHAR2(1)
 TABLE_NAME                                NOT NULL VARCHAR2(30)
 SEARCH_CONDITION                                   LONG
 R_OWNER                                            VARCHAR2(120)
 R_CONSTRAINT_NAME                                  VARCHAR2(30)
 DELETE_RULE                                        VARCHAR2(9)
 STATUS                                             VARCHAR2(8)
 DEFERRABLE                                         VARCHAR2(14)
 DEFERRED                                           VARCHAR2(9)
 VALIDATED                                          VARCHAR2(13)
 GENERATED                                          VARCHAR2(14)
 BAD                                                VARCHAR2(3)
 RELY                                               VARCHAR2(4)
 LAST_CHANGE                                        DATE
 INDEX_OWNER                                        VARCHAR2(30)
 INDEX_NAME                                         VARCHAR2(30)
 INVALID                                            VARCHAR2(7)
 VIEW_RELATED                                       VARCHAR2(14)
**/
 
 
 
 SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME IN ('EMPLOYE','VEHICULE','MARQUE','MODELE','INTERVENTIONS','INTERVENANT','CLIENT');
 
/*EN RAISON DU NBR IMPORANT D'INFO NOUS N'AFFICHERONS QUE LES COLONNES SVTES / */

  SELECT  CONSTRAINT_NAME, CONSTRAINT_TYPE, TABLE_NAME, STATUS  FROM USER_CONSTRAINTS WHERE TABLE_NAME IN ('EMPLOYE','VEHICULE','MARQUE','MODELE','INTERVENTIONS','INTERVENANT','CLIENT');
 
 /**

 CONSTRAINT_NAME                C TABLE_NAME                     STATUS
------------------------------ - ------------------------------ --------
CH_EMPLOYE                     C EMPLOYE                        ENABLED
FK_VEHICULE_MODELE             R VEHICULE                       ENABLED
FK_VEHICULE_CLIENT             R VEHICULE                       ENABLED
FK_MODELE_MARQUE               R MODELE                         ENABLED
FK_INTERVENTIONS_VEHICULE      R INTERVENTIONS                  ENABLED
FK_INTERVENANT_INTERVENTIONS   R INTERVENANT                    ENABLED
FK_INTERVENANT_EMPLOYE         R INTERVENANT                    ENABLED
PK_VEHICULE                    P VEHICULE                       ENABLED
PK_MODELE                      P MODELE                         ENABLED
PK_MARQUE                      P MARQUE                         ENABLED
PK_INTERVENTIONS               P INTERVENTIONS                  ENABLED
PK_INTERVENANT                 P INTERVENANT                    ENABLED
PK_EMPLOYE                     P EMPLOYE                        ENABLED
PK_CLIENT                      P CLIENT                         ENABLED
CHK_DATEINTERV                 C INTERVENTIONS                  DISABLED

15 rows selected.
**/
 
 /** 10 **/ 
 DESC INTERVENTIONS;
 SELECT * FROM ALL_TABLES WHERE TABLE_NAME = 'INTERVENTIONS';
 SELECT * FROM ALL_TAB_COLUMNS WHERE TABLE_NAME = 'INTERVENTIONS';
 SELECT * FROM ALL_CONSTRAINTS WHERE TABLE_NAME = 'INTERVENTIONS';
 SELECT * FROM ALL_INDEXES WHERE TABLE_NAME = 'INTERVENTIONS';
 SELECT * FROM ALL_IND_COLUMNS WHERE TABLE_NAME = 'INTERVENTIONS';
 SELECT * FROM ALL_TAB_PRIVS WHERE TABLE_NAME = 'INTERVENTIONS' ;
 /** 11 **/
 
 DESC USER_TAB_PRIVS;
 
 /**
  Name                                      Null?    Type
 ----------------------------------------- -------- --------------------

 GRANTEE                                   NOT NULL VARCHAR2(30)
 OWNER                                     NOT NULL VARCHAR2(30)
 TABLE_NAME                                NOT NULL VARCHAR2(30)
 GRANTOR                                   NOT NULL VARCHAR2(30)
 PRIVILEGE                                 NOT NULL VARCHAR2(40)
 GRANTABLE                                          VARCHAR2(3)
 HIERARCHY                                          VARCHAR2(3)
**/
 
 
 SELECT PRIVILEGE, TABLE_NAME FROM USER_TAB_PRIVS WHERE GRANTEE = 'Admin';
 
 /**
no rows selected
**/

/* car nous avions retiré ts les privileges a l'Admin */

/** 12 **/


DESC USER_ROLE_PRIVS;

/**
 Name                                      Null?    Type
 ----------------------------------------- -------- ---------------------

 USERNAME                                           VARCHAR2(30)
 GRANTED_ROLE                                       VARCHAR2(30)
 ADMIN_OPTION                                       VARCHAR2(3)
 DEFAULT_ROLE                                       VARCHAR2(3)
 OS_GRANTED                                         VARCHAR2(3)
**/
 
connect Admin/Admin;
/**
Connected.
**/

SELECT GRANTED_ROLE FROM USER_ROLE_PRIVS;

/**
GRANTED_ROLE
------------------------------
GESTIONNAIRE_DES_INTERVENTIONS
 **/
 
 /** 13 **/
 
 DESC USER_OBJECTS;
 /**
  Name                                      Null?    Type
 ----------------------------------------- -------- -------------------

 OBJECT_NAME                                        VARCHAR2(128)
 SUBOBJECT_NAME                                     VARCHAR2(30)
 OBJECT_ID                                          NUMBER
 DATA_OBJECT_ID                                     NUMBER
 OBJECT_TYPE                                        VARCHAR2(19)
 CREATED                                            DATE
 LAST_DDL_TIME                                      DATE
 TIMESTAMP                                          VARCHAR2(19)
 STATUS                                             VARCHAR2(7)
 TEMPORARY                                          VARCHAR2(1)
 GENERATED                                          VARCHAR2(1)
 SECONDARY                                          VARCHAR2(1)
 NAMESPACE                                          NUMBER
 EDITION_NAME                                       VARCHAR2(30)
**/
 
 
 connect Admin/Admin;
 SELECT OBJECT_NAME FROM USER_OBJECTS ;

/**
OBJECT_NAME
---------------------------------------------

NOMEMP_IX
SYS_C007170
MY_TABLE
**/

/** 14 **/
SELECT OWNER FROM ALL_TABLES WHERE TABLE_NAME = 'INTERVENTIONS';

 
/** 15 **/ 

 DESC USER_EXTENTS;
 /**
  Name                                      Null?    Type
 ----------------------------------------- -------- --------------

 SEGMENT_NAME                                       VARCHAR2(81)
 PARTITION_NAME                                     VARCHAR2(30)
 SEGMENT_TYPE                                       VARCHAR2(18)
 TABLESPACE_NAME                                    VARCHAR2(30)
 EXTENT_ID                                          NUMBER
 BYTES                                              NUMBER
 BLOCKS                                             NUMBER

**/

 
SELECT BYTES/1024 AS Taille_Ko FROM USER_EXTENTS WHERE SEGMENT_NAME = 'INTERVENTIONS';
 
 /**
 
 TAILLE_KO
----------
        64
 
 **/

 /** 16 ***/
 /** A faire **/
 
 
 
 
 
 
 
