create table board(
	bno number(10),
	writer varchar(40),
	title varchar(100),
	cont varchar(4000),
	wdate date,
	primary key(bno)
)

insert into BOARD values(
	'1', '�ΰ漮', 'test', '�׽�Ʈ', sysdate);
	
insert into BOARD values(
	'2', '����ö', 'test2', '�׽�Ʈ2', sysdate);
	
insert into BOARD values(
	'3', '������', 'test3', '�׽�Ʈ3', sysdate);
	
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
	'�ΰ漮', 'GS', '1234','01012344321','tft');
	
insert into MEMBER values(
	'����ö', 'HC', '4321','01043211234','maple');
	
insert into MEMBER values(
	'������', 'JH', '4334','01012343234','pokemon');
	

select * from MEMBER