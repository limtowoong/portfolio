CREATE TABLE TBL_JUMIN_202108(
	JUMIN VARCHAR2(20) NOT NULL PRIMARY KEY,
	NAME VARCHAR2(15),
	PHONE VARCHAR2(15),
	ADDRESS VARCHAR2(50)
);

INSERT INTO TBL_JUMIN_202108 VALUES('710101-1000001', '김주민', '010-1111-1111', '경기도 성남시 수정구 태평1동');
INSERT INTO TBL_JUMIN_202108 VALUES('720101-2000001', '이주민', '010-1111-2222', '경기도 성남시 수정구 태평2동');
INSERT INTO TBL_JUMIN_202108 VALUES('730101-1000001', '박주민', '010-1111-3333', '경기도 성남시 수정구 복정동');
INSERT INTO TBL_JUMIN_202108 VALUES('740101-2000001', '홍주민', '010-1111-4444', '경기도 성남시 수정구 산성동');
INSERT INTO TBL_JUMIN_202108 VALUES('750101-1000001', '조주민', '010-1111-5555', '경기도 성남시 중원구 성남동');
INSERT INTO TBL_JUMIN_202108 VALUES('760101-2000001', '최주민', '010-1111-6666', '경기도 성남시 중원구 중앙동');
INSERT INTO TBL_JUMIN_202108 VALUES('770101-1000001', '장주민', '010-1111-7777', '경기도 성남시 중원구 상대원동');
INSERT INTO TBL_JUMIN_202108 VALUES('780101-2000001', '정주민', '010-1111-8888', '경기도 성남시 중원구 하대원동');
INSERT INTO TBL_JUMIN_202108 VALUES('790101-1000001', '강주민', '010-1111-9999', '경기도 성남시 분당구 야탑1동');
INSERT INTO TBL_JUMIN_202108 VALUES('800101-2000001', '신주민', '010-2222-1111', '경기도 성남시 분당구 야탑2동');

CREATE TABLE TBL_HOSP_202108(
	HOSPCODE CHAR(4) NOT NULL PRIMARY KEY,
	HOSPNAME VARCHAR2(40),
	HOSPTEL VARCHAR2(15),
	HOSPADDR VARCHAR2(50)
);

INSERT INTO TBL_HOSP_202108 VALUES('H001', '가_병원', '031-1111-2222', '10');
INSERT INTO TBL_HOSP_202108 VALUES('H002', '나_병원', '031-1111-3333', '20');
INSERT INTO TBL_HOSP_202108 VALUES('H003', '다_병원', '031-1111-4444', '30');
INSERT INTO TBL_HOSP_202108 VALUES('H004', '라_병원', '031-1111-5555', '40');

CREATE TABLE TBL_VACCRESV_202108(
	RESVNO NUMBER(8) NOT NULL PRIMARY KEY,
	JUMIN VARCHAR2(20),
	HOSPCODE CHAR(4),
	RESVDATE DATE,
	RESVTIME NUMBER(4),
	VCODE CHAR(4)
);

INSERT INTO TBL_VACCRESV_202108 VALUES(20210001, '710101-1000001', 'H001', '2021-08-01', 0930, 'V001');
INSERT INTO TBL_VACCRESV_202108 VALUES(20210002, '720101-2000001', 'H002', '2021-08-01', 1030, 'V002');
INSERT INTO TBL_VACCRESV_202108 VALUES(20210003, '730101-1000001', 'H003', '2021-08-01', 1130, 'V003');
INSERT INTO TBL_VACCRESV_202108 VALUES(20210004, '740101-2000001', 'H001', '2021-08-01', 1230, 'V001');
INSERT INTO TBL_VACCRESV_202108 VALUES(20210005, '750101-1000001', 'H001', '2021-08-01', 1330, 'V002');
INSERT INTO TBL_VACCRESV_202108 VALUES(20210006, '760101-2000001', 'H002', '2021-08-01', 1430, 'V003');
INSERT INTO TBL_VACCRESV_202108 VALUES(20210007, '770101-1000001', 'H003', '2021-08-01', 1530, 'V001');
INSERT INTO TBL_VACCRESV_202108 VALUES(20210008, '780101-2000001', 'H001', '2021-08-01', 1630, 'V002');
INSERT INTO TBL_VACCRESV_202108 VALUES(20210009, '790101-1000001', 'H001', '2021-08-01', 1730, 'V003');
INSERT INTO TBL_VACCRESV_202108 VALUES(20210010, '800101-2000001', 'H002', '2021-08-01', 1830, 'V001');