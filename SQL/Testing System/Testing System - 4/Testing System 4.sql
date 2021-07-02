Use testingsystem;
-- Question 1:
SELECT 
    Email,
    Username,
    FullName,
    PositionID,
    CreateDate,
    A.DepartmentID,
    B.DepartmentName
FROM
    `account` A
        INNER JOIN
    department B ON A.DepartmentID = B.DepartmentID;

-- Question 2:
SELECT 
    Email,
    Username,
    FullName,
    PositionID,
    CreateDate,
    B.DepartmentName
FROM
    `account` A
        INNER JOIN
    department B ON A.DepartmentID = B.DepartmentID
WHERE
    CreateDate > '2010-12-20';

-- Question 3:
SELECT 
    Email, Username, FullName, B.PositionName
FROM
    `Account` A
        INNER JOIN
    Position B ON A.PositionID = B.PositionID
WHERE
    PositionName = 'Dev';

-- Question 4:
SELECT 
    COUNT(ac.departmentID) AS 'soluong', d.DepartmentName
FROM
    department d
        JOIN
    `account` ac ON d.departmentID = ac.departmentID
GROUP BY ac.DepartmentID
HAVING soluong > 3;

-- Question 5:
SELECT 
    q.content, (COUNT(e.questionID)) AS 'so luong'
FROM
    question q
        JOIN
    examquestion e ON q.QuestionID = e.QuestionID
GROUP BY e.QuestionID
HAVING COUNT(e.questionID) = (SELECT 
        (MAX(soluong))
    FROM
        (SELECT 
            COUNT(e.questionID) AS 'soluong'
        FROM
            question q
        JOIN examquestion e ON q.questionID = e.questionID
        GROUP BY e.questionID) AS conca);



                                        
-- Question 6:
SELECT 
    c.categoryName, COUNT(q.categoryID)
FROM
    categoryquestion c
        JOIN
    question q ON c.CategoryID = q.CategoryID
GROUP BY q.CategoryID
ORDER BY q.CategoryID;

-- Question 7:
SELECT 
    q.content, COUNT(e.questionID) AS 'so lan SD'
FROM
    question q
        LEFT JOIN
    examquestion e ON q.QuestionID = e.QuestionID
GROUP BY q.QuestionID;

-- Question 8:
SELECT 
    q.content, COUNT(a.questionID) AS 'so lan tl'
FROM
    question q
        JOIN
    answer a ON q.QuestionID = a.QuestionID
GROUP BY a.questionID
HAVING COUNT(a.questionID) = (SELECT 
        MAX(solantl)
    FROM
        (SELECT 
            q.content, COUNT(a.questionID) AS 'solantl'
        FROM
            question q
        JOIN answer a ON q.QuestionID = a.QuestionID
        GROUP BY a.questionID) AS max_answer);

-- question 9:
SELECT 
    g.groupID, g.GroupName, COUNT(ga.accountID)
FROM
    `group` g
        LEFT JOIN
    groupaccount ga ON g.groupID = ga.groupID
GROUP BY g.GroupID;


-- Question 10:
SELECT 
    p.PositionID, p.PositionName, COUNT(a.positionID) AS soluong
FROM
    `position` p
        JOIN
    `account` a ON p.positionID = a.positionID
GROUP BY a.positionID
HAVING soluong = (SELECT 
        (MIN(soluong))
    FROM
        (SELECT 
            COUNT(a.positionID) AS soluong
        FROM
            `position` p
        JOIN `account` a ON p.positionID = a.positionID
        GROUP BY a.positionID) AS minAcc);
                    
-- Question 11:
SELECT 
    D.DepartmentID,
    D.DepartmentName,
    COUNT(P.PositionID) AS 'SO LUONG'
FROM
    Position P
        INNER JOIN
    `Account` A ON P.PositionID = A.PositionID
        INNER JOIN
    Department D ON A.DepartmentID = D.DepartmentID
GROUP BY A.DepartmentID
ORDER BY A.DepartmentID ASC;

-- Question 12: 
SELECT 
    T.TypeName AS 'LOAI CAU HOI',
    Q.CreatorID AS 'ID NGUOI TAO',
    Q.Content AS 'CAU HOI',
    A.Content AS 'CAU TRA LOI',
    Q.CreateDate AS 'NGAY TAO'
FROM
    Question Q
        INNER JOIN
    Answer A ON Q.QuestionID = A.QuestionID
        INNER JOIN
    TypeQuestion T ON Q.TypeID = T.TypeID;
-- Question 13: 
SELECT 
    T.TypeName AS 'LOAI CAU HOI', COUNT(Q.TypeID) AS 'SO LUONG'
FROM
    Question Q
        INNER JOIN
    TypeQuestion T ON Q.TypeID = T.TypeID
GROUP BY Q.TypeID;
-- Question 14: 
SELECT 
    *
FROM
    `Group`
WHERE
    GroupID NOT IN (SELECT 
            GroupID
        FROM
            GroupAccount);

-- Question 14: 
SELECT 
    *
FROM
    `Group`
WHERE
    GroupID NOT IN (SELECT 
            GroupID
        FROM
            GroupAccount);

-- Question 15: 
SELECT 
    *
FROM
    `Group`
WHERE
    GroupID NOT IN (SELECT 
            GroupID
        FROM
            GroupAccount);
-- Question 16: 
SELECT 
    *
FROM
    Question
WHERE
    QuestionID NOT IN (SELECT 
            QuestionID
        FROM
            Answer);
                        
-- Question 17:
-- a)
SELECT 
    A.FullName
FROM
    `Account` A
        JOIN
    GroupAccount GA ON A.AccountID = GA.AccountID
WHERE
    GA.GroupID = 1;
-- b) 
SELECT 
    A.FullName
FROM
    `Account` A
        JOIN
    GroupAccount GA ON A.AccountID = GA.AccountID
WHERE
    GA.GroupID = 2;
-- c) 
SELECT 
    A.FullName
FROM
    `Account` A
        JOIN
    GroupAccount GA ON A.AccountID = GA.AccountID
WHERE
    GA.GroupID = 1 
UNION SELECT 
    A.FullName
FROM
    `Account` A
        JOIN
    GroupAccount GA ON A.AccountID = GA.AccountID
WHERE
    GA.GroupID = 2;

-- Question 18: 
-- a) 
SELECT 
    G.GroupName, COUNT(1) AS so_luong
FROM
    `Group` G
        JOIN
    GroupAccount GA ON G.GroupID = GA.GroupID
GROUP BY (GA.GroupID)
HAVING so_luong >= 3;
-- b) 
SELECT 
    G.GroupName, COUNT(1) AS so_luong
FROM
    `Group` G
        JOIN
    GroupAccount GA ON G.GroupID = GA.GroupID
GROUP BY (GA.GroupID)
HAVING so_luong <= 7;
-- ) Ghép 2 kết quả từ câu a) và câu b) 
SELECT 
    G.GroupName, COUNT(1) AS so_luong
FROM
    `Group` G
        JOIN
    GroupAccount GA ON G.GroupID = GA.GroupID
GROUP BY (GA.GroupID)
HAVING so_luong >= 3 
UNION SELECT 
    G.GroupName, COUNT(1) AS so_luong
FROM
    `Group` G
        JOIN
    GroupAccount GA ON G.GroupID = GA.GroupID
GROUP BY (GA.GroupID)
HAVING so_luong <= 7


