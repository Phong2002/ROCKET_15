-- CREATE TABLE
DROP  DATABASE IF EXISTS Assignment4;
CREATE  DATABASE IF NOT EXISTS Assignment4;
USE	Assignment4;

-- Question 1:
DROP TABLE IF EXISTS Department;
CREATE TABLE Department(
	Department_Number 	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Department_Name		NVARCHAR(50) UNIQUE KEY NOT NULL
);

DROP TABLE IF EXISTS Employee_Table;
CREATE TABLE Employee_Table(
	Employee_Number 	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Employee_Name		NVARCHAR(50) NOT NULL,
    Department_Number	TINYINT UNSIGNED NOT NULL,
    FOREIGN KEY(Department_Number) REFERENCES Department(Department_Number)
);

DROP TABLE IF EXISTS Employee_Skill_Table;
CREATE TABLE Employee_Skill_Table(
	Employee_Number 	TINYINT UNSIGNED AUTO_INCREMENT,
    Skill_Code			NVARCHAR(20) NOT NULL,
    Date_Registered		DATETIME DEFAULT NOW(),
    FOREIGN KEY(Employee_Number) REFERENCES Employee_Table(Employee_Number)
);

-- Question 2:
INSERT INTO Department	(Department_Name) 
VALUE 					(N'Marketing'	),
						(N'Sale'		),
						(N'Bảo vệ'		),
						(N'Nhân sự'		),
						(N'Kỹ thuật'	),
						(N'Tài chính'	),
						(N'Phó giám đốc'),
						(N'Giám đốc'	),
						(N'Thư kí'		),
						(N'Bán hàng'	);


INSERT INTO Employee_Table 	(Employee_Name		, Department_Number	)
VALUE						(N'Nguyễn Văn A',		1			),
							(N'Nguyễn Thành Long',	1			),
                            (N'Ngô Bá Khá'	,		2			),
                            (N'Bùi Xuân Huấn'	,	5			),
                            (N'Lò Vi Sóng'	,		6			),
                            (N'Nguyễn Duy Best'	,	5			),
                            (N'Thích Đủ Thứ'	,	5			),
                            (N'Khánh Bầu Trời'	,	1			),
                            (N'Long Mõm'		,	9			),
                            (N'Phùng Thanh Lươn',	10			);


INSERT INTO Employee_Skill_Table 	(Employee_Number, Skill_Code	, Date_Registered	)
VALUE								( 	1,				'Java'		, '2020-03-15'		),
									( 	2,				'Android'	, '2020-03-16'		),
									( 	3,				'C#'		, '2020-03-17'		),
									( 	1,				'SQL'		, '2020-03-20'		),
									( 	1,				'Postman'	, '2020-03-21'		),
									( 	4,				'Ruby'		, '2020-04-22'		),
									( 	5,				'Java'		, '2020-04-24'		),
									( 	6,				'C++'		, '2020-04-27'		),
									( 	7,				'C Sharp'	, '2020-04-04'		),
									( 	10,				'PHP'		, '2020-04-10'		);

-- Question 3: 
SELECT 	ET.Employee_Number, ET.Employee_Name, ET.Department_Number, EST.Skill_Code 
FROM	Employee_Table ET RIGHT JOIN Employee_Skill_Table EST
ON		ET.Employee_Number = EST.Employee_Number
WHERE	EST.Skill_Code = 'Java';

-- Question 4: 
SELECT		D.Department_Number, D.Department_Name, COUNT(ET.Department_Number)
FROM		Department D INNER JOIN Employee_Table ET
ON			D.Department_Number = ET.Department_Number
GROUP BY 	ET.Department_Number
HAVING		COUNT(ET.Department_Number)>=3
ORDER BY	D.Department_Number ASC;
-- Question 5: 
SELECT		ET.*
FROM		Department D INNER JOIN Employee_Table ET
ON			D.Department_Number = ET.Department_Number
ORDER BY	D.Department_Number ASC;
-- Question 6: 
SELECT 		ET.*, COUNT(EST.Employee_Number)
FROM		Employee_Table ET RIGHT JOIN Employee_Skill_Table EST
ON			ET.Employee_Number = EST.Employee_Number
GROUP BY	ET.Employee_Number
HAVING 		COUNT(EST.Employee_Number)>1;