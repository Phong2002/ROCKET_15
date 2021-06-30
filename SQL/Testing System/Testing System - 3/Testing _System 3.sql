USE testingsystem;

-- Question 2: 
SELECT 		* 
FROM 		Department;

-- Question 3: 
SELECT 		DepartmentID 
FROM 		Department 
WHERE 		DepartmentName = N'Sale';

-- Question 4: 
SELECT 		* 
FROM 		`Account` 
WHERE 		LENGTH(Fullname) = (SELECT MAX(LENGTH(Fullname)) FROM `Account`)
ORDER BY 	Fullname ;

-- Question 5: 
SELECT 		* 
FROM 		`Account` 
WHERE 		LENGTH(Fullname) = (SELECT MAX(LENGTH(Fullname)) FROM `Account`) AND DepartmentID = 3
ORDER BY 	Fullname DESC;

-- Question 6:
SELECT 		GroupName 
FROM 		`Group` 
WHERE 		CreateDate < '2019-12-20';

-- Question 7: 
SELECT 		QuestionID
FROM 		Answer
GROUP BY 	QuestionID
HAVING 		COUNT(QuestionID) >= 4;

-- Question 8: 
SELECT 		`Code` 
FROM 		Exam
WHERE 		Duration >= 60 AND CreateDate < '2019-12-20';

-- Question 9: 
SELECT 		* 
FROM 		`Group`
ORDER BY 	CreateDate DESC 
LIMIT 5;

-- Question 10: 
SELECT 	COUNT(AccountID) AS 'SO NHAN VIEN' 
FROM 		`Account`
WHERE 		DepartmentID = 2;

-- Question 11: 
SELECT 		Fullname 
FROM 		`Account`
WHERE 		(SUBSTRING_INDEX(FullName, ' ', -1)) LIKE 'D%o' ;

-- Question 12: 
DELETE 
FROM 		Exam 
WHERE 		CreateDate < '2019-12-20';

-- Question 13: 
DELETE 
FROM 		Question
WHERE 		(SUBSTRING_INDEX(Content,' ',2)) = 'Câu hỏi';

-- Question 14: 
UPDATE 		`Account` 
SET 		Fullname 	= 	N'Nguyễn Bá Lộc', 
			Email 		= 	'loc.nguyenba@vti.com.vn'
WHERE 		AccountID = 5;

-- Question 15:
UPDATE 		`GroupAccount` 
SET 		AccountID = 5 
WHERE 		GroupID = 4;