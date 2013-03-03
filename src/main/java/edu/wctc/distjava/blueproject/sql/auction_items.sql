CREATE DATABASE  IF NOT EXISTS `auction` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `auction`;
-- MySQL dump 10.13  Distrib 5.5.24, for osx10.5 (i386)
--
-- Host: localhost    Database: auction
-- ------------------------------------------------------
-- Server version	5.5.28-log

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
-- Table structure for table `items`
--

DROP TABLE IF EXISTS `items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `items` (
  `ITEM_ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `DESCRIPTION` varchar(800) DEFAULT NULL,
  `CURRENT_BID` decimal(6,2) DEFAULT NULL,
  `DATE_DONATED` datetime DEFAULT NULL,
  `MEMBER_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ITEM_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `items`
--

LOCK TABLES `items` WRITE;
/*!40000 ALTER TABLE `items` DISABLE KEYS */;
INSERT INTO `items` VALUES (1,'Samsung Blu-Ray player with Internet capabilities',50.00,'0003-01-13 00:00:00',NULL),(2,'Apple 32GB iPod Touch',125.00,'0003-01-13 00:00:00',NULL),(3,'Western Digital 1TB USB Drive',55.00,'0003-01-13 00:00:00',NULL),(4,'Kohl\'s Department Store $100 Gift Card',50.00,'0003-01-13 00:00:00',NULL),(5,'Kitchen Aide, 4 Waffle waffle iron',65.00,'0003-01-13 00:00:00',NULL),(6,'Famous Footware $75.00 Gift Card ',30.00,'0003-01-13 00:00:00',NULL),(7,'Domino\'s Pizza $50.00 Gift Card',25.00,'0003-01-13 00:00:00',NULL),(8,'Two $25.00 Dining Cards for Harry Joe\'s Diner',15.00,'0003-01-13 00:00:00',NULL),(9,'X-Box 360 Halo 4 Edition from GameStop',105.00,'0003-01-13 00:00:00',NULL),(10,'Nintendo 3DS XL and 1 game from GameStop',150.00,'0003-01-13 00:00:00',NULL),(11,'Two $25.00 Dining Cards to the Servlet Slophouse',19.00,'0003-01-13 00:00:00',NULL),(12,'PNY 16GB USB Flash Drive',5.00,'0003-02-13 00:00:00',NULL),(13,'PNY 32GB USB Flash Drive',12.00,'0003-02-13 00:00:00',NULL),(14,'Blade cx3 copter in good used condition… Comes with everything needed to fly.',35.00,'0003-02-13 00:00:00',NULL),(15,'HP Officejet Pro 9500 Network Ink jet printer',90.00,'0003-03-13 00:00:00',NULL);
/*!40000 ALTER TABLE `items` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-03-01 14:03:44
