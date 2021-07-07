-- Testing_System_Assignment_6

USE testingsystem;
-- Question 1:
DROP PROCEDURE store_1;
DELIMITER $$
CREATE PROCEDURE  store_1 (IN chucvu VARCHAR(255))
	BEGIN
		SELECT a.*
        FROM `account` a JOIN department d
        ON a.DepartmentID = d.DepartmentID 
        WHERE d.departmentName=chucvu;
	END$$
DELIMITER ;
CALL store_1('Bao ve');

-- Question 2:
DROP PROCEDURE store_2;
DELIMITER $$
CREATE PROCEDURE store_2 (IN Dept_ID INT ,IN Dept_Name VARCHAR(255))
	BEGIN	 
		SELECT d.DepartmentID,d.DepartmentName, COUNT(a.accountID)
        FROM `account` a join department d
        on a.DepartmentID = d.DepartmentID 
        where dept_id = d.DepartmentID OR d.DepartmentName
        group by a.DepartmentID;
	END$$
DELIMITER ;
call store_2('5','');

-- Question 3:

DELIMITER $$
drop procedure store_3;
CREATE PROCEDURE  store_3 ()
	BEGIN 
		SELECT t.typeID,t.typeName,count(q.questionID)
        FROM typequestion t JOIN question q
        ON t.typeID = q.typeID
        WHERE MONTH(q.createdate)=MONTH(NOW())
        GROUP BY t.typeID;
	END $$
 DELIMITER ;
	
CALL store_3();

-- Question 4
drop procedure store_4;
DELIMITER $$
CREATE PROCEDURE store_4 ()
	BEGIN
		SELECT t.typeID , count(q.QuestionID)
        FROM typequestion t JOIN question q 
        ON t.typeID = q.typeID
        GROUP BY t.typeID
        HAVING count(q.QuestionID) = (SELECT max(listType)
										FROM(
											SELECT count(q.QuestionID) AS listType
                                            FROM typequestion t JOIN question q 
											ON t.typeID = q.typeID
											GROUP BY t.typeID) AS listtypeQs) ;
	END $$
    DELIMITER ;
    CALL store_4;
    
   -- Question 5
drop procedure store_5;
DELIMITER $$
CREATE PROCEDURE store_5 ()
	BEGIN
		SELECT t.typeName , count(q.QuestionID)
        FROM typequestion t JOIN question q 
        ON t.typeID = q.typeID
        GROUP BY t.typeID
        HAVING count(q.QuestionID) = (SELECT max(listType)
										FROM(
											SELECT count(q.QuestionID) AS listType
                                            FROM typequestion t JOIN question q 
											ON t.typeID = q.typeID
											GROUP BY t.typeID) AS listtypeQs) ;
	END $$
    DELIMITER ;
    CALL store_5;
    
    
     