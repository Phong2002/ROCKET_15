CREATE DATABASE IF NOT EXISTS TestingSystem;
USE TestingSystem;

CREATE TABLE Department(
	DepartmentID 	INT,
    DepartmentName 	VARCHAR(50)
);

DROP TABLE IF EXISTS `Position`;
CREATE TABLE `Position`(
	PositionID		INT,
    PositionName	VARCHAR(50)
);

CREATE TABLE `Account`(
	AccountID		INT,
    Email			VARCHAR(50),
    Username		VARCHAR(50),
    FullName		CHAR(50),
    DepartmentID 	INT,
    PositionID		INT,
    CreateDATE		DATE
);

CREATE TABLE `Group`(
	GroupID			INT,
    GroupName		VARCHAR(50),
    CreatorID		INT,
    CreateDATE		DATE
);

CREATE TABLE GroupAccount(
	GroupID			INT,
    AccountID		VARCHAR(50),
    JoinDATE		DATE
);

CREATE TABLE TypeQuestion (
    TypeID 		    INT,
    TypeName 	    VARCHAR(50)
);

CREATE TABLE CategoryQuestion(
    CategoryID		INT,
    CategoryName	VARCHAR(50) 
);

CREATE TABLE Question(
    QuestionID		INT,
    Content			VARCHAR(50) ,
    CategoryID		INT,
    TypeID			INT,
    CreatorID		INT,
    CreateDATE		DATE
);

CREATE TABLE Answer(
    Answers			INT,
    Content			VARCHAR(50),
    QuestionID		INT,
    isCorrect		BIT 
);

CREATE TABLE Exam(
    ExamID			INT,
    Code			VARCHAR(10),
    Title			VARCHAR(50),
    CategoryID		INT,
    Duration		INT,
    CreatorID		INT,
    CreateDATE		DATE
);

CREATE TABLE ExamQuestion(
    ExamID			INT,
	QuestionID		INT
);