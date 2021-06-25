CREATE DATABASE IF NOT EXISTS Fresher_management;
USE Fresher_management;
-- Exercise 1:Design a table 
DROP TABLE Trainee;
CREATE TABLE Trainee(
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
ALTER TABLE Trainee 
ADD COLUMN VTI_Account VARCHAR(30) NOT NULL UNIQUE;