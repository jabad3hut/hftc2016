-- MySQL dump 10.13  Distrib 5.7.16, for osx10.11 (x86_64)
--
-- Host: localhost    Database: pcat
-- ------------------------------------------------------
-- Server version	5.7.16
create schema pcat;
use pcat;
/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `inventory`
--

DROP TABLE IF EXISTS `inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `inventory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `total_inventory` int(11) NOT NULL DEFAULT '0',
  `reserved_inventory` int(11) NOT NULL DEFAULT '0',
  `product_name` varchar(45) DEFAULT NULL,
  `product_desc` varchar(45) DEFAULT NULL,
  `location` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1520 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory`
--

LOCK TABLES `inventory` WRITE;
/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;
INSERT INTO `inventory` VALUES (34,12,0,'High Chair','High Chair','Chattanooga'),(35,12,0,'High Chair','High Chair','Oak Ridge'),(36,12,0,'High Chair','High Chair','Nashville'),(37,1,0,'Disinfectant','Disinfectant','Chattanooga'),(38,0,0,'Disinfectant','Disinfectant','Oak Ridge'),(39,12,0,'Disinfectant','Disinfectant','Nashville'),(40,120,0,'Sleep Sack','Sleep Sack','Chattanooga'),(41,10,0,'Sleep Sack','Sleep Sack','Oak Ridge'),(42,12,0,'Floor Gym','Floor Gym','Chattanooga'),(43,7,0,'Floor Gym','Floor Gym','Oak Ridge'),(44,12,0,'Floor Gym','Floor Gym','Nashville'),(45,12,0,'Premie Car Seat','Premie Car Seat','Nashville'),(46,1000002,0,'Infant Car Seat','Infant Car Seat','Chattanooga'),(47,12,0,'Infant Car Seat','Infant Car Seat','Oak Ridge'),(48,12,0,'Infant Car Seat','Infant Car Seat','Nashville'),(49,12,0,'Convertible Car Seat','Convertible Car Seat','Chattanooga'),(50,12,0,'Convertible Car Seat','Convertible Car Seat','Oak Ridge'),(51,12,0,'Convertible Car Seat','Convertible Car Seat','Nashville'),(52,12,4,'Booster Seat','Booster Seat','Chattanooga'),(53,12,0,'Booster Seat','Booster Seat','Oak Ridge'),(54,12,0,'Booster Seat','Booster Seat','Nashville'),(55,12,0,'Pack & Play','Pack & Play','Chattanooga'),(56,12,0,'Pack & Play','Pack & Play','Oak Ridge'),(57,12,0,'Pack & Play','Pack & Play','Nashville'),(58,12,1,'Box Fan','Box Fan','Chattanooga'),(59,12,0,'Box Fan','Box Fan','Oak Ridge'),(60,12,0,'Box Fan','Box Fan','Nashville'),(61,12,0,'Breast Pump','Breast Pump','Chattanooga'),(62,12,0,'Breast Pump','Breast Pump','Oak Ridge'),(63,12,0,'Breast Pump','Breast Pump','Nashville'),(64,12,2,'Item 1','Item 1','Nashville'),(65,12,2,'Item 0','Item 0','Nashville'),(66,12,2,'Item 1','Item 1','Nashville'),(67,12,2,'Item 2','Item 2','Nashville'),(68,12,2,'Item 3','Item 3','Nashville'),(69,12,2,'Item 4','Item 4','Nashville'),(70,12,2,'Item 5','Item 5','Nashville'),(71,12,2,'Item 6','Item 6','Nashville'),(72,12,2,'Item 7','Item 7','Nashville'),(73,12,2,'Item 8','Item 8','Nashville'),(74,12,2,'Item 9','Item 9','Nashville'),(75,12,2,'Item 10','Item 10','Nashville'),(76,12,2,'Item 11','Item 11','Nashville'),(77,12,2,'Item 12','Item 12','Nashville'),(78,12,2,'Item 13','Item 13','Nashville'),(79,12,2,'Item 14','Item 14','Nashville'),(80,12,2,'Item 15','Item 15','Nashville'),(81,12,2,'Item 16','Item 16','Nashville'),(82,12,2,'Item 17','Item 17','Nashville'),(83,12,2,'Item 18','Item 18','Nashville'),(84,12,2,'Item 19','Item 19','Nashville'),(85,12,2,'Item 20','Item 20','Nashville'),(86,12,2,'Item 21','Item 21','Nashville'),(87,12,2,'Item 22','Item 22','Nashville'),(88,12,2,'Item 23','Item 23','Nashville'),(89,12,2,'Item 24','Item 24','Nashville'),(90,12,2,'Item 25','Item 25','Nashville'),(91,12,2,'Item 1','Item 1','Nashville'),(92,12,2,'Item 0','Item 0','Nashville'),(93,12,2,'Item 1','Item 1','Nashville'),(94,12,2,'Item 2','Item 2','Nashville'),(95,12,2,'Item 3','Item 3','Nashville'),(96,12,2,'Item 4','Item 4','Nashville'),(97,12,2,'Item 5','Item 5','Nashville'),(98,12,2,'Item 6','Item 6','Nashville'),(99,12,2,'Item 7','Item 7','Nashville'),(100,12,2,'Item 8','Item 8','Nashville'),(101,12,2,'Item 9','Item 9','Nashville'),(102,12,2,'Item 10','Item 10','Nashville'),(103,12,2,'Item 11','Item 11','Nashville'),(104,12,2,'Item 12','Item 12','Nashville'),(105,12,2,'Item 13','Item 13','Nashville'),(106,12,2,'Item 14','Item 14','Nashville'),(107,12,2,'Item 15','Item 15','Nashville'),(108,12,2,'Item 16','Item 16','Nashville'),(109,12,2,'Item 17','Item 17','Nashville'),(110,12,2,'Item 18','Item 18','Nashville'),(111,12,2,'Item 19','Item 19','Nashville'),(112,12,2,'Item 20','Item 20','Nashville'),(113,12,2,'Item 21','Item 21','Nashville'),(114,12,2,'Item 22','Item 22','Nashville'),(115,12,2,'Item 23','Item 23','Nashville'),(116,12,2,'Item 24','Item 24','Nashville'),(117,12,2,'Item 25','Item 25','Nashville'),(118,12,2,'Item 1','Item 1','Nashville'),(119,12,2,'Item 0','Item 0','Nashville'),(120,12,2,'Item 1','Item 1','Nashville'),(121,12,2,'Item 2','Item 2','Nashville'),(122,12,2,'Item 3','Item 3','Nashville'),(123,12,2,'Item 4','Item 4','Nashville'),(124,12,2,'Item 5','Item 5','Nashville'),(125,12,2,'Item 6','Item 6','Nashville'),(126,12,2,'Item 7','Item 7','Nashville'),(127,12,2,'Item 8','Item 8','Nashville'),(128,12,2,'Item 9','Item 9','Nashville'),(129,12,2,'Item 10','Item 10','Nashville'),(130,12,2,'Item 11','Item 11','Nashville'),(131,12,2,'Item 12','Item 12','Nashville'),(132,12,2,'Item 13','Item 13','Nashville'),(133,12,2,'Item 14','Item 14','Nashville'),(134,12,2,'Item 15','Item 15','Nashville'),(135,12,2,'Item 16','Item 16','Nashville'),(136,12,2,'Item 17','Item 17','Nashville'),(137,12,2,'Item 18','Item 18','Nashville'),(138,12,2,'Item 19','Item 19','Nashville'),(139,12,2,'Item 20','Item 20','Nashville'),(140,12,2,'Item 21','Item 21','Nashville'),(141,12,2,'Item 22','Item 22','Nashville'),(142,12,2,'Item 23','Item 23','Nashville'),(143,12,2,'Item 24','Item 24','Nashville'),(144,12,2,'Item 25','Item 25','Nashville'),(145,12,2,'Item 1','Item 1','Nashville'),(146,12,2,'Item 0','Item 0','Nashville'),(147,12,2,'Item 1','Item 1','Nashville'),(148,12,2,'Item 2','Item 2','Nashville'),(149,12,2,'Item 3','Item 3','Nashville'),(150,12,2,'Item 4','Item 4','Nashville'),(151,12,2,'Item 5','Item 5','Nashville'),(152,12,2,'Item 6','Item 6','Nashville'),(153,12,2,'Item 7','Item 7','Nashville'),(154,12,2,'Item 8','Item 8','Nashville'),(155,12,2,'Item 9','Item 9','Nashville'),(156,12,2,'Item 10','Item 10','Nashville'),(157,12,2,'Item 11','Item 11','Nashville'),(158,12,2,'Item 12','Item 12','Nashville'),(159,12,2,'Item 13','Item 13','Nashville'),(160,12,2,'Item 14','Item 14','Nashville'),(161,12,2,'Item 15','Item 15','Nashville'),(162,12,2,'Item 16','Item 16','Nashville'),(163,12,2,'Item 17','Item 17','Nashville'),(164,12,2,'Item 18','Item 18','Nashville'),(165,12,2,'Item 19','Item 19','Nashville'),(166,12,2,'Item 20','Item 20','Nashville'),(167,12,2,'Item 21','Item 21','Nashville'),(168,12,2,'Item 22','Item 22','Nashville'),(169,12,2,'Item 23','Item 23','Nashville'),(170,12,2,'Item 24','Item 24','Nashville'),(171,12,2,'Item 25','Item 25','Nashville'),(172,12,2,'Item 1','Item 1','Nashville'),(173,12,2,'Item 0','Item 0','Nashville'),(174,12,2,'Item 1','Item 1','Nashville'),(175,12,2,'Item 2','Item 2','Nashville'),(176,12,2,'Item 3','Item 3','Nashville'),(177,12,2,'Item 4','Item 4','Nashville'),(178,12,2,'Item 5','Item 5','Nashville'),(179,12,2,'Item 6','Item 6','Nashville'),(180,12,2,'Item 7','Item 7','Nashville'),(181,12,2,'Item 8','Item 8','Nashville'),(182,12,2,'Item 9','Item 9','Nashville'),(183,12,2,'Item 10','Item 10','Nashville'),(184,12,2,'Item 11','Item 11','Nashville'),(185,12,2,'Item 12','Item 12','Nashville'),(186,12,2,'Item 13','Item 13','Nashville'),(187,12,2,'Item 14','Item 14','Nashville'),(188,12,2,'Item 15','Item 15','Nashville'),(189,12,2,'Item 16','Item 16','Nashville'),(190,12,2,'Item 17','Item 17','Nashville'),(191,12,2,'Item 18','Item 18','Nashville'),(192,12,2,'Item 19','Item 19','Nashville'),(193,12,2,'Item 20','Item 20','Nashville'),(194,12,2,'Item 21','Item 21','Nashville'),(195,12,2,'Item 22','Item 22','Nashville'),(196,12,2,'Item 23','Item 23','Nashville'),(197,12,2,'Item 24','Item 24','Nashville'),(198,12,2,'Item 25','Item 25','Nashville'),(199,12,2,'Item 1','Item 1','Nashville'),(200,12,2,'Item 0','Item 0','Nashville'),(201,12,2,'Item 1','Item 1','Nashville'),(202,12,2,'Item 2','Item 2','Nashville'),(203,12,2,'Item 3','Item 3','Nashville'),(204,12,2,'Item 4','Item 4','Nashville'),(205,12,2,'Item 5','Item 5','Nashville'),(206,12,2,'Item 6','Item 6','Nashville'),(207,12,2,'Item 7','Item 7','Nashville'),(208,12,2,'Item 8','Item 8','Nashville'),(209,12,2,'Item 9','Item 9','Nashville'),(210,12,2,'Item 10','Item 10','Nashville'),(211,12,2,'Item 11','Item 11','Nashville'),(212,12,2,'Item 12','Item 12','Nashville'),(213,12,2,'Item 13','Item 13','Nashville'),(214,12,2,'Item 14','Item 14','Nashville'),(215,12,2,'Item 15','Item 15','Nashville'),(216,12,2,'Item 16','Item 16','Nashville'),(217,12,2,'Item 17','Item 17','Nashville'),(218,12,2,'Item 18','Item 18','Nashville'),(219,12,2,'Item 19','Item 19','Nashville'),(220,12,2,'Item 20','Item 20','Nashville'),(221,12,2,'Item 21','Item 21','Nashville'),(222,12,2,'Item 22','Item 22','Nashville'),(223,12,2,'Item 23','Item 23','Nashville'),(224,12,2,'Item 24','Item 24','Nashville'),(225,12,2,'Item 25','Item 25','Nashville'),(226,12,2,'Item 1','Item 1','Nashville'),(227,12,2,'Item 0','Item 0','Nashville'),(228,12,2,'Item 1','Item 1','Nashville'),(229,12,2,'Item 2','Item 2','Nashville'),(230,12,2,'Item 3','Item 3','Nashville'),(231,12,2,'Item 4','Item 4','Nashville'),(232,12,2,'Item 5','Item 5','Nashville'),(233,12,2,'Item 6','Item 6','Nashville'),(234,12,2,'Item 7','Item 7','Nashville'),(235,12,2,'Item 8','Item 8','Nashville'),(236,12,2,'Item 9','Item 9','Nashville'),(237,12,2,'Item 10','Item 10','Nashville'),(238,12,2,'Item 11','Item 11','Nashville'),(239,12,2,'Item 12','Item 12','Nashville'),(240,12,2,'Item 13','Item 13','Nashville'),(241,12,2,'Item 14','Item 14','Nashville'),(242,12,2,'Item 15','Item 15','Nashville'),(243,12,2,'Item 16','Item 16','Nashville'),(244,12,2,'Item 17','Item 17','Nashville'),(245,12,2,'Item 18','Item 18','Nashville'),(246,12,2,'Item 19','Item 19','Nashville'),(247,12,2,'Item 20','Item 20','Nashville'),(248,12,2,'Item 21','Item 21','Nashville'),(249,12,2,'Item 22','Item 22','Nashville'),(250,12,2,'Item 23','Item 23','Nashville'),(251,12,2,'Item 24','Item 24','Nashville'),(252,12,2,'Item 25','Item 25','Nashville'),(253,12,2,'Item 1','Item 1','Nashville'),(254,12,2,'Item 0','Item 0','Nashville'),(255,12,2,'Item 1','Item 1','Nashville'),(256,12,2,'Item 2','Item 2','Nashville'),(257,12,2,'Item 3','Item 3','Nashville'),(258,12,2,'Item 4','Item 4','Nashville'),(259,12,2,'Item 5','Item 5','Nashville'),(260,12,2,'Item 6','Item 6','Nashville'),(261,12,2,'Item 7','Item 7','Nashville'),(262,12,2,'Item 8','Item 8','Nashville'),(263,12,2,'Item 9','Item 9','Nashville'),(264,12,2,'Item 10','Item 10','Nashville'),(265,12,2,'Item 11','Item 11','Nashville'),(266,12,2,'Item 12','Item 12','Nashville'),(267,12,2,'Item 13','Item 13','Nashville'),(268,12,2,'Item 14','Item 14','Nashville'),(269,12,2,'Item 15','Item 15','Nashville'),(270,12,2,'Item 16','Item 16','Nashville'),(271,12,2,'Item 17','Item 17','Nashville'),(272,12,2,'Item 18','Item 18','Nashville'),(273,12,2,'Item 19','Item 19','Nashville'),(274,12,2,'Item 20','Item 20','Nashville'),(275,12,2,'Item 21','Item 21','Nashville'),(276,12,2,'Item 22','Item 22','Nashville'),(277,12,2,'Item 23','Item 23','Nashville'),(278,12,2,'Item 24','Item 24','Nashville'),(279,12,2,'Item 25','Item 25','Nashville'),(280,12,2,'Item 1','Item 1','Nashville'),(281,12,2,'Item 0','Item 0','Nashville'),(282,12,2,'Item 1','Item 1','Nashville'),(283,12,2,'Item 2','Item 2','Nashville'),(284,12,2,'Item 3','Item 3','Nashville'),(285,12,2,'Item 4','Item 4','Nashville'),(286,12,2,'Item 5','Item 5','Nashville'),(287,12,2,'Item 6','Item 6','Nashville'),(288,12,2,'Item 7','Item 7','Nashville'),(289,12,2,'Item 8','Item 8','Nashville'),(290,12,2,'Item 9','Item 9','Nashville'),(291,12,2,'Item 10','Item 10','Nashville'),(292,12,2,'Item 11','Item 11','Nashville'),(293,12,2,'Item 12','Item 12','Nashville'),(294,12,2,'Item 13','Item 13','Nashville'),(295,12,2,'Item 14','Item 14','Nashville'),(296,12,2,'Item 15','Item 15','Nashville'),(297,12,2,'Item 16','Item 16','Nashville'),(298,12,2,'Item 17','Item 17','Nashville'),(299,12,2,'Item 18','Item 18','Nashville'),(300,12,2,'Item 19','Item 19','Nashville'),(301,12,2,'Item 20','Item 20','Nashville'),(302,12,2,'Item 21','Item 21','Nashville'),(303,12,2,'Item 22','Item 22','Nashville'),(304,12,2,'Item 23','Item 23','Nashville'),(305,12,2,'Item 24','Item 24','Nashville'),(306,12,2,'Item 25','Item 25','Nashville'),(307,12,2,'Item 1','Item 1','Nashville'),(308,12,2,'Item 0','Item 0','Nashville'),(309,12,2,'Item 1','Item 1','Nashville'),(310,12,2,'Item 2','Item 2','Nashville'),(311,12,2,'Item 3','Item 3','Nashville'),(312,12,2,'Item 4','Item 4','Nashville'),(313,12,2,'Item 5','Item 5','Nashville'),(314,12,2,'Item 6','Item 6','Nashville'),(315,12,2,'Item 7','Item 7','Nashville'),(316,12,2,'Item 8','Item 8','Nashville'),(317,12,2,'Item 9','Item 9','Nashville'),(318,12,2,'Item 10','Item 10','Nashville'),(319,12,2,'Item 11','Item 11','Nashville'),(320,12,2,'Item 12','Item 12','Nashville'),(321,12,2,'Item 13','Item 13','Nashville'),(322,12,2,'Item 14','Item 14','Nashville'),(323,12,2,'Item 15','Item 15','Nashville'),(324,12,2,'Item 16','Item 16','Nashville'),(325,12,2,'Item 17','Item 17','Nashville'),(326,12,2,'Item 18','Item 18','Nashville'),(327,12,2,'Item 19','Item 19','Nashville'),(328,12,2,'Item 20','Item 20','Nashville'),(329,12,2,'Item 21','Item 21','Nashville'),(330,12,2,'Item 22','Item 22','Nashville'),(331,12,2,'Item 23','Item 23','Nashville'),(332,12,2,'Item 24','Item 24','Nashville'),(333,12,2,'Item 25','Item 25','Nashville'),(334,12,2,'Item 1','Item 1','Nashville'),(335,12,2,'Item 0','Item 0','Nashville'),(336,12,2,'Item 1','Item 1','Nashville'),(337,12,2,'Item 2','Item 2','Nashville'),(338,12,2,'Item 3','Item 3','Nashville'),(339,12,2,'Item 4','Item 4','Nashville'),(340,12,2,'Item 5','Item 5','Nashville'),(341,12,2,'Item 6','Item 6','Nashville'),(342,12,2,'Item 7','Item 7','Nashville'),(343,12,2,'Item 8','Item 8','Nashville'),(344,12,2,'Item 9','Item 9','Nashville'),(345,12,2,'Item 10','Item 10','Nashville'),(346,12,2,'Item 11','Item 11','Nashville'),(347,12,2,'Item 12','Item 12','Nashville'),(348,12,2,'Item 13','Item 13','Nashville'),(349,12,2,'Item 14','Item 14','Nashville'),(350,12,2,'Item 15','Item 15','Nashville'),(351,12,2,'Item 16','Item 16','Nashville'),(352,12,2,'Item 17','Item 17','Nashville'),(353,12,2,'Item 18','Item 18','Nashville'),(354,12,2,'Item 19','Item 19','Nashville'),(355,12,2,'Item 20','Item 20','Nashville'),(356,12,2,'Item 21','Item 21','Nashville'),(357,12,2,'Item 22','Item 22','Nashville'),(358,12,2,'Item 23','Item 23','Nashville'),(359,12,2,'Item 24','Item 24','Nashville'),(360,12,2,'Item 25','Item 25','Nashville'),(361,12,2,'Item 1','Item 1','Nashville'),(362,12,2,'Item 0','Item 0','Nashville'),(363,12,2,'Item 1','Item 1','Nashville'),(364,12,2,'Item 2','Item 2','Nashville'),(365,12,2,'Item 3','Item 3','Nashville'),(366,12,2,'Item 4','Item 4','Nashville'),(367,12,2,'Item 5','Item 5','Nashville'),(368,12,2,'Item 6','Item 6','Nashville'),(369,12,2,'Item 7','Item 7','Nashville'),(370,12,2,'Item 8','Item 8','Nashville'),(371,12,2,'Item 9','Item 9','Nashville'),(372,12,2,'Item 10','Item 10','Nashville'),(373,12,2,'Item 11','Item 11','Nashville'),(374,12,2,'Item 12','Item 12','Nashville'),(375,12,2,'Item 13','Item 13','Nashville'),(376,12,2,'Item 14','Item 14','Nashville'),(377,12,2,'Item 15','Item 15','Nashville'),(378,12,2,'Item 16','Item 16','Nashville'),(379,12,2,'Item 17','Item 17','Nashville'),(380,12,2,'Item 18','Item 18','Nashville'),(381,12,2,'Item 19','Item 19','Nashville'),(382,12,2,'Item 20','Item 20','Nashville'),(383,12,2,'Item 21','Item 21','Nashville'),(384,12,2,'Item 22','Item 22','Nashville'),(385,12,2,'Item 23','Item 23','Nashville'),(386,12,2,'Item 24','Item 24','Nashville'),(387,12,2,'Item 25','Item 25','Nashville'),(388,12,2,'Item 1','Item 1','Nashville'),(389,12,2,'Item 0','Item 0','Nashville'),(390,12,2,'Item 1','Item 1','Nashville'),(391,12,2,'Item 2','Item 2','Nashville'),(392,12,2,'Item 3','Item 3','Nashville'),(393,12,2,'Item 4','Item 4','Nashville'),(394,12,2,'Item 5','Item 5','Nashville'),(395,12,2,'Item 6','Item 6','Nashville'),(396,12,2,'Item 7','Item 7','Nashville'),(397,12,2,'Item 8','Item 8','Nashville'),(398,12,2,'Item 9','Item 9','Nashville'),(399,12,2,'Item 10','Item 10','Nashville'),(400,12,2,'Item 11','Item 11','Nashville'),(401,12,2,'Item 12','Item 12','Nashville'),(402,12,2,'Item 13','Item 13','Nashville'),(403,12,2,'Item 14','Item 14','Nashville'),(404,12,2,'Item 15','Item 15','Nashville'),(405,12,2,'Item 16','Item 16','Nashville'),(406,12,2,'Item 17','Item 17','Nashville'),(407,12,2,'Item 18','Item 18','Nashville'),(408,12,2,'Item 19','Item 19','Nashville'),(409,12,2,'Item 20','Item 20','Nashville'),(410,12,2,'Item 21','Item 21','Nashville'),(411,12,2,'Item 22','Item 22','Nashville'),(412,12,2,'Item 23','Item 23','Nashville'),(413,12,2,'Item 24','Item 24','Nashville'),(414,12,2,'Item 25','Item 25','Nashville'),(415,12,2,'Item 1','Item 1','Nashville'),(416,12,2,'Item 0','Item 0','Nashville'),(417,12,2,'Item 1','Item 1','Nashville'),(418,12,2,'Item 2','Item 2','Nashville'),(419,12,2,'Item 3','Item 3','Nashville'),(420,12,2,'Item 4','Item 4','Nashville'),(421,12,2,'Item 5','Item 5','Nashville'),(422,12,2,'Item 6','Item 6','Nashville'),(423,12,2,'Item 7','Item 7','Nashville'),(424,12,2,'Item 8','Item 8','Nashville'),(425,12,2,'Item 9','Item 9','Nashville'),(426,12,2,'Item 10','Item 10','Nashville'),(427,12,2,'Item 11','Item 11','Nashville'),(428,12,2,'Item 12','Item 12','Nashville'),(429,12,2,'Item 13','Item 13','Nashville'),(430,12,2,'Item 14','Item 14','Nashville'),(431,12,2,'Item 15','Item 15','Nashville'),(432,12,2,'Item 16','Item 16','Nashville'),(433,12,2,'Item 17','Item 17','Nashville'),(434,12,2,'Item 18','Item 18','Nashville'),(435,12,2,'Item 19','Item 19','Nashville'),(436,12,2,'Item 20','Item 20','Nashville'),(437,12,2,'Item 21','Item 21','Nashville'),(438,12,2,'Item 22','Item 22','Nashville'),(439,12,2,'Item 23','Item 23','Nashville'),(440,12,2,'Item 24','Item 24','Nashville'),(441,12,2,'Item 25','Item 25','Nashville'),(442,12,2,'Item 1','Item 1','Nashville'),(443,12,2,'Item 0','Item 0','Nashville'),(444,12,2,'Item 1','Item 1','Nashville'),(445,12,2,'Item 2','Item 2','Nashville'),(446,12,2,'Item 3','Item 3','Nashville'),(447,12,2,'Item 4','Item 4','Nashville'),(448,12,2,'Item 5','Item 5','Nashville'),(449,12,2,'Item 6','Item 6','Nashville'),(450,12,2,'Item 7','Item 7','Nashville'),(451,12,2,'Item 8','Item 8','Nashville'),(452,12,2,'Item 9','Item 9','Nashville'),(453,12,2,'Item 10','Item 10','Nashville'),(454,12,2,'Item 11','Item 11','Nashville'),(455,12,2,'Item 12','Item 12','Nashville'),(456,12,2,'Item 13','Item 13','Nashville'),(457,12,2,'Item 14','Item 14','Nashville'),(458,12,2,'Item 15','Item 15','Nashville'),(459,12,2,'Item 16','Item 16','Nashville'),(460,12,2,'Item 17','Item 17','Nashville'),(461,12,2,'Item 18','Item 18','Nashville'),(462,12,2,'Item 19','Item 19','Nashville'),(463,12,2,'Item 20','Item 20','Nashville'),(464,12,2,'Item 21','Item 21','Nashville'),(465,12,2,'Item 22','Item 22','Nashville'),(466,12,2,'Item 23','Item 23','Nashville'),(467,12,2,'Item 24','Item 24','Nashville'),(468,12,2,'Item 25','Item 25','Nashville'),(469,12,2,'Item 1','Item 1','Nashville'),(470,12,2,'Item 0','Item 0','Nashville'),(471,12,2,'Item 1','Item 1','Nashville'),(472,12,2,'Item 2','Item 2','Nashville'),(473,12,2,'Item 3','Item 3','Nashville'),(474,12,2,'Item 4','Item 4','Nashville'),(475,12,2,'Item 5','Item 5','Nashville'),(476,12,2,'Item 6','Item 6','Nashville'),(477,12,2,'Item 7','Item 7','Nashville'),(478,12,2,'Item 8','Item 8','Nashville'),(479,12,2,'Item 9','Item 9','Nashville'),(480,12,2,'Item 10','Item 10','Nashville'),(481,12,2,'Item 11','Item 11','Nashville'),(482,12,2,'Item 12','Item 12','Nashville'),(483,12,2,'Item 13','Item 13','Nashville'),(484,12,2,'Item 14','Item 14','Nashville'),(485,12,2,'Item 15','Item 15','Nashville'),(486,12,2,'Item 16','Item 16','Nashville'),(487,12,2,'Item 17','Item 17','Nashville'),(488,12,2,'Item 18','Item 18','Nashville'),(489,12,2,'Item 19','Item 19','Nashville'),(490,12,2,'Item 20','Item 20','Nashville'),(491,12,2,'Item 21','Item 21','Nashville'),(492,12,2,'Item 22','Item 22','Nashville'),(493,12,2,'Item 23','Item 23','Nashville'),(494,12,2,'Item 24','Item 24','Nashville'),(495,12,2,'Item 25','Item 25','Nashville'),(496,12,2,'Item 1','Item 1','Nashville'),(497,12,2,'Item 0','Item 0','Nashville'),(498,12,2,'Item 1','Item 1','Nashville'),(499,12,2,'Item 2','Item 2','Nashville'),(500,12,2,'Item 3','Item 3','Nashville'),(501,12,2,'Item 4','Item 4','Nashville'),(502,12,2,'Item 5','Item 5','Nashville'),(503,12,2,'Item 6','Item 6','Nashville'),(504,12,2,'Item 7','Item 7','Nashville'),(505,12,2,'Item 8','Item 8','Nashville'),(506,12,2,'Item 9','Item 9','Nashville'),(507,12,2,'Item 10','Item 10','Nashville'),(508,12,2,'Item 11','Item 11','Nashville'),(509,12,2,'Item 12','Item 12','Nashville'),(510,12,2,'Item 13','Item 13','Nashville'),(511,12,2,'Item 14','Item 14','Nashville'),(512,12,2,'Item 15','Item 15','Nashville'),(513,12,2,'Item 16','Item 16','Nashville'),(514,12,2,'Item 17','Item 17','Nashville'),(515,12,2,'Item 18','Item 18','Nashville'),(516,12,2,'Item 19','Item 19','Nashville'),(517,12,2,'Item 20','Item 20','Nashville'),(518,12,2,'Item 21','Item 21','Nashville'),(519,12,2,'Item 22','Item 22','Nashville'),(520,12,2,'Item 23','Item 23','Nashville'),(521,12,2,'Item 24','Item 24','Nashville'),(522,12,2,'Item 25','Item 25','Nashville'),(523,12,2,'Item 1','Item 1','Nashville'),(524,12,2,'Item 0','Item 0','Nashville'),(525,12,2,'Item 1','Item 1','Nashville'),(526,12,2,'Item 2','Item 2','Nashville'),(527,12,2,'Item 3','Item 3','Nashville'),(528,12,2,'Item 4','Item 4','Nashville'),(529,12,2,'Item 5','Item 5','Nashville'),(530,12,2,'Item 6','Item 6','Nashville'),(531,12,2,'Item 7','Item 7','Nashville'),(532,12,2,'Item 8','Item 8','Nashville'),(533,12,2,'Item 9','Item 9','Nashville'),(534,12,2,'Item 10','Item 10','Nashville'),(535,12,2,'Item 11','Item 11','Nashville'),(536,12,2,'Item 12','Item 12','Nashville'),(537,12,2,'Item 13','Item 13','Nashville'),(538,12,2,'Item 14','Item 14','Nashville'),(539,12,2,'Item 15','Item 15','Nashville'),(540,12,2,'Item 16','Item 16','Nashville'),(541,12,2,'Item 17','Item 17','Nashville'),(542,12,2,'Item 18','Item 18','Nashville'),(543,12,2,'Item 19','Item 19','Nashville'),(544,12,2,'Item 20','Item 20','Nashville'),(545,12,2,'Item 21','Item 21','Nashville'),(546,12,2,'Item 22','Item 22','Nashville'),(547,12,2,'Item 23','Item 23','Nashville'),(548,12,2,'Item 24','Item 24','Nashville'),(549,12,2,'Item 25','Item 25','Nashville');
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(255) DEFAULT NULL,
  `supervisor` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `role` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `supervisor_email` varchar(255) DEFAULT NULL,
  `isactive` tinyint(1) NOT NULL DEFAULT '0',
  `supervisorEmail` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `email_2` (`email`),
  UNIQUE KEY `email_3` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (38,'Mary Beth','Bonnie Fernandez','mbprice.pcat@mailinator.com','Home Visitor','Price','MaryBeth.Price.pcat@mailinator.com',1,NULL),(39,'Mary','Bonnie Fernandez','mbird.pcat@mailinator.com','Home Visitor','Bird','Mary.Bird.pcat@mailinator.com',1,NULL),(40,'Beth','Cindy Lou Hoo','bpricess.pcat@mailinator.com','Home Visitor','Prices','Beth.Prices.pcat@mailinator.com',1,NULL),(41,'Bonnie','Jennifer Caudle','bfernandez.pcat@mailinator.com','Supervisor','Fernandez','Bonnie.Fernandez.pcat@mailinator.com',1,NULL),(42,'Bobby','Jennifer Caudle','bbrown.pcat@mailinator.com','Supervisor','Brown','Bobby.Brown.pcat@mailinator.com',1,NULL),(43,'Angie','','ataylor.pcat@mailinator.com','user Admin','Taylor','Angie.Taylor.pcat@mailinator.com',1,NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `family_inventory`
--

DROP TABLE IF EXISTS `family_inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `family_inventory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `family_id` varchar(255) NOT NULL,
  `inventory_id` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `requested_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `status` varchar(45) DEFAULT NULL,
  `requestor_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_fi_inv` (`inventory_id`),
  CONSTRAINT `family_inventory_ibfk_1` FOREIGN KEY (`inventory_id`) REFERENCES `inventory` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `family_inventory`
--

LOCK TABLES `family_inventory` WRITE;
/*!40000 ALTER TABLE `family_inventory` DISABLE KEYS */;
INSERT INTO `family_inventory` VALUES (1,'davi-001',52,1,'2016-12-05 22:26:51','pending',42),(2,'fami1234',52,1,'2016-12-05 22:25:54','pending',38),(3,'fami0009',52,1,'2016-12-05 22:25:54','Pending',38),(4,'davi0010',52,1,'2016-12-05 22:26:51','Pending',42),(5,'davi0010',52,1,'2016-12-05 22:26:51','Pending',42),(6,'davi0010',58,1,'2016-12-05 22:26:51','Pending',42),(7,'fami0001',52,1,'2016-12-05 22:25:54','Pending',38);
/*!40000 ALTER TABLE `family_inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `family_inventory_requestor_view`
--

DROP TABLE IF EXISTS `family_inventory_requestor_view`;
/*!50001 DROP VIEW IF EXISTS `family_inventory_requestor_view`*/;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
/*!50001 CREATE VIEW `family_inventory_requestor_view` AS SELECT 
 1 AS `id`,
 1 AS `family_id`,
 1 AS `inventory_id`,
 1 AS `quantity`,
 1 AS `requested_date`,
 1 AS `status`,
 1 AS `requestor_id`,
 1 AS `requestor`,
 1 AS `product_name`*/;
SET character_set_client = @saved_cs_client;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (221);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_backup`
--

DROP TABLE IF EXISTS `user_backup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_backup` (
  `id` int(11) NOT NULL DEFAULT '0',
  `firstname` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `supervisor` varchar(255) DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `role` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `lastname` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `isactive` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `supervisor_email` varchar(45) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_backup`
--

LOCK TABLES `user_backup` WRITE;
/*!40000 ALTER TABLE `user_backup` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_backup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Final view structure for view `family_inventory_requestor_view`
--

/*!50001 DROP VIEW IF EXISTS `family_inventory_requestor_view`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = latin1 */;
/*!50001 SET character_set_results     = latin1 */;
/*!50001 SET collation_connection      = latin1_swedish_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=CURRENT_user SQL SECURITY DEFINER */
/*!50001 VIEW `family_inventory_requestor_view` AS select `fi`.`id` AS `id`,`fi`.`family_id` AS `family_id`,`fi`.`inventory_id` AS `inventory_id`,`fi`.`quantity` AS `quantity`,`fi`.`requested_date` AS `requested_date`,`fi`.`status` AS `status`,`fi`.`requestor_id` AS `requestor_id`,concat(`us`.`firstname`,' ',`us`.`lastname`) AS `requestor`,`inv`.`product_name` AS `product_name`, inv.location as location from ((`family_inventory` `fi` join `user` `us` on((`fi`.`requestor_id` = `us`.`id`))) join `inventory` `inv` on((`fi`.`inventory_id` = `inv`.`id`))) where (lower(`fi`.`status`) = 'pending') */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-12 13:00:11
