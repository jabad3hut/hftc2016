BEGIN transaction;
DROP TABLE IF EXISTS "user_info";
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE "user_info" (
  ID INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
 "firstname" varchar(255) DEFAULT NULL,
  "supervisor" varchar(255) DEFAULT NULL,
  "email" varchar(255) DEFAULT NULL,
  "role" varchar(45) DEFAULT NULL,
  "lastname" varchar(45) DEFAULT NULL,
  "supervisor_email" varchar(255) DEFAULT NULL,
  "isactive" bit NOT NULL DEFAULT 0,
  "supervisorEmail" varchar(255) DEFAULT NULL
) ;
COMMIT transaction;
