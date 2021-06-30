USE fresher_management;

-- Question 1:
INSERT 
INTO Trainee(Full_Name,			Birth_Date,		Gender,		ET_IQ,		ET_Gmath,		ET_English,		Trainning_Class,		Evaluation_Notes,		VTI_Account)
VALUES		('Nguyen Van A',	'2000-5-3',		'male',		19,			20,				19,				'A1',					'good',					'NguyenA'	),
			('Nguyen Van B',	'2000-9-8',		'female', 	20,			15,				17,				'A1',					'good',					'NguyenB'	),
            ('Lò Vi Sóng',		'2000-5-8', 	'female',	15,			14,				17,				'A1',					'normal',				'ViSong' 	),
            ('Nguyễn Thành Long','2000-7-8',	'male',		20,			20,				10,				'A1',					'good job',				'TienBipNet'),
            ('Ngô Bá Khá'	,	'2000-10-6',	'male',		10,			10,				5,				'A1',					'none'	,				'KhA bAnh'	),
			('Nguyễn Văn Dũng',	'2000-09-08',	'female',	19,			10,				19,				'A1',					'Good'		,			'dungtroc'	),
			('Nguyễn Hải Hậu',	'2000-10-11',	'male',		20,			19,				18,				'A1',					'Normal'	,			'haumon'	),
			('Tống Quang Anh',	'2000-11-12',	'female',	15,			20,				17,				'A1',					'Good'		,			'antondev'	),
			('Nguyễn Thị Chiến','2000-11-13',	'unknown',	20,			19,				20,				'A1',					'Normal'	,			'chienpanda'),
			('Nguyễn Thị Hảo',	'2000-11-13',	'female',	20,			19,				15,				'A1',					'Good'		,			'haohao'	);
      

-- Question 2:

SELECT month(Birth_Date), count(*) AS total, group_concat(Full_Name) AS list_trainee FROM trainee group by month(Birth_Date);

-- Question 3:

SELECT 
    *
FROM
    trainee
WHERE
    LENGTH(full_name) = (SELECT MAX(LENGTH(full_name))FROM trainee);
    
-- Question 4:
SELECT 
    *
FROM
    trainee
WHERE
    ((ET_IQ + ET_Gmath) >= 20)
        AND (ET_IQ > 8)
        AND (ET_Gmath > 8)
        AND (ET_English > 8);
-- Question 5: 
DELETE FROM trainee where TraineeID = 3;

-- Question 6:
    