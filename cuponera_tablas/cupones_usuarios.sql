-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: cupones
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `paterno` varchar(45) NOT NULL,
  `materno` varchar(45) DEFAULT NULL,
  `correo` varchar(45) NOT NULL,
  `contrasenia` varchar(100) NOT NULL,
  `referenciado` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `correo_UNIQUE` (`correo`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'OSCAR','HERNANDEZ','BELLO','correo_1@correo.com','1234',NULL),(2,'JUAN','PEREZ','PEREZ','correo_0@correo.com','aaaa',1),(3,'PEDRO','LOPEZ','LOPEZ','correo_2@correo.com','kjkjl',2),(4,'JUAN','LOPEZ','PEREZ','correo_3@correo.com','ffff',1),(5,'PEDRO','LOPEZ','PEREZ','correo_4@correo.com','sd',1),(6,'KARLA','GONZALEZ','GONZALEZ','correo_5@correo.com','adasfsad',1),(7,'JOSE','GONZALEZ','PEREZ','correo_6@correo.com','dafas',4),(8,'MIA','LOPEZ','GONZALEZ','correo_7@correo.com','kjggkjg',1),(11,'JESUS','PEREZ','LOPEZ','correo_8@correo.com','shsdhgfhdf',3),(12,'LIA','JUAREZ','PEREZ','correo_9@correo.com','fasdsgsdf',7),(13,'OSCAR','PEREZ','SANCHEZ','correo_10@correo.com','xbdgfhdf',3),(14,'JUAN','PEREZ','LOPEZ','correo_11@correo.com','fasfasg',NULL),(20,'JUAN JOSE','LUNA','MENDEZ','correo_12@correo.com','gggjg',NULL),(21,'TOMAS','JUAREZ','SANCHEZ','correo_13@correo.com','ffgsdfgds',3),(22,'MONICA','PEREZ','ROMAN','correo_14@correo','ghjhgjhgjh',5);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-04 11:46:08
