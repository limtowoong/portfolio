create table board(
	bno number(10),
	writer varchar(40),
	title varchar(100),
	cont varchar(4000),
	wdate date,
	primary key(bno)
)

insert into BOARD values(
	'1', '민경석', 'test', '테스트', sysdate);
	
insert into BOARD values(
	'2', '전현철', 'test2', '테스트2', sysdate);
	
insert into BOARD values(
	'3', '위준혁', 'test3', '테스트3', sysdate);
	
drop table board;

select * from BOARD

create table member(
	name varchar(20),
	id varchar(20),
	pw varchar(20),
	tel varchar(11),
	chim varchar(100),
	primary key(id)
)

insert into MEMBER values(
	'민경석', 'GS', '1234','01012344321','tft');
	
insert into MEMBER values(
	'전현철', 'HC', '4321','01043211234','maple');
	
insert into MEMBER values(
	'위준혁', 'JH', '4334','01012343234','pokemon');
	

select * from MEMBER