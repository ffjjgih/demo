create database assignmentsof203
go
use	assignmentsof203
go

create table loginfpt(
	accountfpt nchar(100) not null,
	passwordfpt nchar(100) not null,
	rolefpt nvarchar (10) not null,
	constraint PK_LOGINFPT PRIMARY KEY(ACCOUNTFPT)
)

CREATE TABLE QLSV(
	MASV NCHAR(10) NOT NULL,
	HOTEN NVARCHAR(50) NOT NULL,
	EMAIL NCHAR(100) NOT NULL,
	SDT NCHAR(15) NOT NULL,
	GENDER NVARCHAR(5) NOT NULL,
	DIACHI NVARCHAR(60) NOT NULL,
	IMG NCHAR(200) NOT NULL,
	CONSTRAINT PK_QLSV PRIMARY KEY (MASV)
)
CREATE TABLE QLDIEM(
	ID INT NOT NULL,
	MASV NCHAR(10) NOT NULL,
	ENGLISH FLOAT NOT NULL,
	TINHOC FLOAT NOT NULL,
	GDTC FLOAT NOT NULL,
	CONSTRAINT PK_QLDIEM PRIMARY KEY(ID),
	CONSTRAINT FK_QLDIEM_QLSV FOREIGN KEY (MASV) REFERENCES QLSV
)

insert into loginfpt values('abc123','a123456','teacher'),
							('admin','admin1','admin')
							select *from QLSV
							update qldiem set masv='ph16810' where masv='ph169810';
							Update QLSV set masv='ph16810',hoten='nguyễn văn abc',email='123abc@gmail.com',sdt='03729312312',Gender='Nữ',diachi='Hà Nam',img='abc' where masv ='ph169810'