CREATE DATABASE IF NOT EXISTS Fresher_management;
USE Fresher_management;
-- Exercise 1:Design a table 
DROP TABLE Trainee;
CREATE TABLE Trainee(
	TraineeID 			TINYINT UNSIGNED AUTO_INCREMENT,
    Full_Name			VARCHAR(50) NOT NULL,
    Birth_Date			DATE NOT NULL,
    Gender				ENUM('male','female','unknown') NOT NULL,
    ET_IQ				TINYINT UNSIGNED CHECK(ET_IQ<=20) NOT NULL,
    ET_Gmath			TINYINT UNSIGNED CHECK(ET_Gmath<=20) NOT NULL,
    ET_English			TINYINT UNSIGNED CHECK(ET_English<=20) NOT NULL,
    Trainning_Class		CHAR(20) NOT NULL,
    Evaluation_Notes	VARCHAR(255) NOT NULL,
    PRIMARY KEY (TraineeID)
);
ALTER TABLE Trainee 
ADD COLUMN VTI_Account VARCHAR(30) NOT NULL UNIQUE;