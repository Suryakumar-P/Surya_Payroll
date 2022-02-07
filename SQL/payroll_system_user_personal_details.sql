-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: payroll_system
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `user_personal_details`
--

DROP TABLE IF EXISTS `user_personal_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_personal_details` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `email_address` varchar(45) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `address` varchar(60) DEFAULT NULL,
  `position` varchar(45) DEFAULT NULL,
  `doj` date DEFAULT NULL,
  `employee_grade` varchar(4) DEFAULT NULL,
  `team` varchar(45) DEFAULT NULL,
  `company_name` varchar(45) DEFAULT NULL,
  `location_of_work` varchar(45) DEFAULT NULL,
  `shift` varchar(45) DEFAULT NULL,
  `Supervisor` varchar(45) DEFAULT NULL,
  `login_id` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `fk_user_professional_details_employee_pay1` (`employee_grade`),
  KEY `fk_user_personal_details_login_details_idx` (`login_id`),
  CONSTRAINT `fk_user_personal_details_login_details` FOREIGN KEY (`login_id`) REFERENCES `login_details` (`id`) ON DELETE CASCADE,
  CONSTRAINT `fk_user_professional_details_employee_pay1` FOREIGN KEY (`employee_grade`) REFERENCES `employee_pay` (`employee_grade`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_personal_details`
--

LOCK TABLES `user_personal_details` WRITE;
/*!40000 ALTER TABLE `user_personal_details` DISABLE KEYS */;
INSERT INTO `user_personal_details` VALUES (1,'Suryakumar','Patturaja','9786335797','suryakumarpatturaja@gmail.com','1999-02-01','Choolaimedu,Chennai','Manager','2021-12-17','M4','HR','FSS','Chennai','Regular','Vijay','E001');
/*!40000 ALTER TABLE `user_personal_details` ENABLE KEYS */;
UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed
