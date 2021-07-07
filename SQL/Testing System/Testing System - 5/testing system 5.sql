USE  testingsystem;


-- Question 1:
CREATE VIEW view_Question1 AS
    SELECT a.FullName
    FROM `account` a JOIN department d 
    ON a.DepartmentID = d.DepartmentID
    WHERE
        a.DepartmentID = (SELECT DepartmentID
							FROM department
							WHERE
							DepartmentName = 'sale');
SELECT * FROM view_Question1;

-- Question 2:
CREATE VIEW view_Question2 AS
    SELECT a.*, COUNT(g.GroupID)
    FROM `account` a JOIN groupaccount g ON a.AccountID = g.AccountID
    GROUP BY a.AccountID
    HAVING COUNT(g.GroupID) = (SELECT MAX(solan_thamgia)
									FROM
									(SELECT COUNT(g.GroupID) AS solan_thamgia
									FROM `account` a JOIN groupaccount g 
                                    ON a.AccountID = g.AccountID
									GROUP BY a.AccountID) AS solan);
SELECT * FROM view_Question2;

-- Question 3:
create view view_Question3 as
select content,length(content)
from question
where length(content)>30;

SELECT * FROM view_Question3;

-- Question 4:
CREATE VIEW view_Question4 AS
    SELECT g.GroupName, COUNT(a.AccountID) AS total_employees
    FROM `group` g JOIN groupaccount ga 
    ON g.groupID = ga.groupID
	JOIN `account` a 
    ON a.AccountID = ga.AccountID
    GROUP BY ga.groupID
    HAVING COUNT(a.AccountID) = (SELECT MAX(so_nv)
								FROM
								(SELECT COUNT(a.AccountID) AS so_nv
								FROM groupaccount ga
								JOIN `account` a ON a.AccountID = ga.AccountID
								GROUP BY ga.GroupID) AS so_nhan_vien);
SELECT * FROM view_Question4;
			
-- Question 5;
CREATE VIEW view_Question5 AS SELECT q.content, a.FullName
	FROM question q JOIN `account` a
    ON q.CreatorID = a.AccountID
    WHERE FullName LIKE ('Nguyễn%');

SELECT * FROM view_Question5;

    