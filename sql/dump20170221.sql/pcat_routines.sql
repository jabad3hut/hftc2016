-- MySQL dump 10.13  Distrib 5.7.12, for osx10.9 (x86_64)
--
-- Host: localhost    Database: pcat
-- ------------------------------------------------------
-- Server version	5.7.16

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
 1 AS `product_name`,
 1 AS `location`*/;
SET character_set_client = @saved_cs_client;

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
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `family_inventory_requestor_view` AS select `fi`.`id` AS `id`,`fi`.`family_id` AS `family_id`,`fi`.`inventory_id` AS `inventory_id`,`fi`.`quantity` AS `quantity`,`fi`.`requested_date` AS `requested_date`,`fi`.`status` AS `status`,`fi`.`requestor_id` AS `requestor_id`,concat(`us`.`firstname`,' ',`us`.`lastname`) AS `requestor`,`inv`.`product_name` AS `product_name`,`inv`.`location` AS `location` from ((`family_inventory` `fi` join `user` `us` on((`fi`.`requestor_id` = `us`.`id`))) join `inventory` `inv` on((`fi`.`inventory_id` = `inv`.`id`))) where (lower(`fi`.`status`) = 'pending') */;
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

-- Dump completed on 2017-02-21 11:16:28
