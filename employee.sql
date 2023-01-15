CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `category` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `employee` VALUES 
	(1,'Leslie','Andrews',' leslie@gmail.com', 'Nurse', 'San Jose', 'California', 'USA'),
	(2,'Emma','Baumgarten','emma@gmail.com', 'Physical Therapist', 'San Francisco', 'California', 'USA'),
	(3,'Avani','Gupta','avani@gmail.com', 'orthopedic', 'Miami', 'Florida', 'USA'),
	(4,'Yuri','Petrov','yuri@gmail.com', 'Dental Technician', 'Nurenberg', 'Bavaria', 'Germany'),
	(5,'Juan','Vega', 'juan@gmail.com', 'Clinical Radiology', 'Frankfurt', 'Hessen', 'Germany'),
	(6, 'Alan', 'Openheimer', 'alan@gmail.com', 'Clinical Radiology', 'NEW_CUSTOMER', 'NEW_CUSTOMER', ' NEW_CUSTOMER');



