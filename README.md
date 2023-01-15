Filter Operations: • filter operations for search customers by firstname: a. Ascending order http://localhost:8080/magic-api/members?sort=firstName,asc
b. Descending order http://localhost:8080/magic-api/members?sort=firstName,desc

• filter operations for search customers by lastName: a. Ascending order http://localhost:8080/magic-api/members?sort=lastName,asc b. Descending order http://localhost:8080/magic-api/members?sort=lastName,desc

• filter operations for search customers by email: a. Ascending order http://localhost:8080/magic-api/members?sort=email,asc b. Descending order http://localhost:8080/magic-api/members?sort=email,desc

• filter operations for search customers by category: a. Ascending order http://localhost:8080/magic-api/members?sort=category,asc b. Descending order http://localhost:8080/magic-api/members?sort=category,desc

• filter operations for search customers by city: a. Ascending order http://localhost:8080/magic-api/members?sort=city,asc b. Descending order http://localhost:8080/magic-api/members?sort=city,desc

•filter operations for search customers by state: a. Ascending order http://localhost:8080/magic-api/members?sort=state,asc b. Descending order http://localhost:8080/magic-api/members?sort=state,desc

•filter operations for search customers by country: a. Ascending order http://localhost:8080/magic-api/members?sort=country,asc b. Descending order http://localhost:8080/magic-api/members?sort=country,desc

•Customer list: http://localhost:8080/api/employees

•A list of customer living in the same region (city, country, state) a list of customer having a specific product id in its orders: http://localhost:8080/magic-api/members?sort=country,id

•An order list by customer id: http://localhost:8080/magic-api/members?sort=id

--
-- Table structure for table `employee`
--

CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

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



