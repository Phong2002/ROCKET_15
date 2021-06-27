DROP DATABASE IF EXISTS fresher_management;
CREATE DATABASE IF NOT EXISTS Fresher_management;
USE Fresher_management;
-- Exercise 1:Design a table 
DROP TABLE IF EXISTS Trainee;
CREATE TABLE IF NOT EXISTS Trainee(
	TraineeID 			TINYINT UNSIGNED AUTO_INCREMENT,
    Full_Name			VARCHAR(50) NOT NULL,
    Birth_Date			DATE NOT NULL,
    Gender				ENUM('male','female','unknown') NOT NULL,
    ET_IQ				TINYINT UNSIGNED NOT NULL,CHECK(ET_IQ<=20) ,
    ET_Gmath			TINYINT UNSIGNED NOT NULL,CHECK(ET_Gmath<=20) ,
    ET_English			TINYINT UNSIGNED NOT NULL,CHECK(ET_English<=20) ,
    Trainning_Class		CHAR(20) NOT NULL,
    Evaluation_Notes	VARCHAR(255) NOT NULL,
PRIMARY KEY (TraineeID)
);

-- Exercise 2: Data Types
DROP TABLE IF EXISTS Data_Types;
CREATE TABLE Data_Types 
(
    ID 					INT UNSIGNED AUTO_INCREMENT,
    `Name` 				VARCHAR(100) NOT NULL,
    `Code` 				CHAR(5) NOT NULL UNIQUE,
    ModifiedDate 		DATETIME NOT NULL,
PRIMARY KEY (ID)
);
 
 -- Exercise 3: Data Types (2)
 DROP TABLE IF EXISTS Data_types2;
CREATE TABLE IF NOT EXISTS Data_types2 (
    ID 					INT UNSIGNED AUTO_INCREMENT,
    `Name` 				VARCHAR(100) NOT NULL,
    BirthDate 			DATETIME NOT NULL,
    gender 				ENUM('0', '1') default null, -- 0 : Male , 1: Female , Null : Unknown
    IsDeleteFlag 		ENUM('0', '1') NOT NULL, -- 0: Active , 1: Deleted
PRIMARY KEY (ID)
);
 
 
 
