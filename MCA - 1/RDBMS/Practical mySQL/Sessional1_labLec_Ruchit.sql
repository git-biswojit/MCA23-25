create database sessional;

use sessional;

create table employee(
	emp_id int primary key,
    emp_name varchar(10),
    emp_salary numeric,
    emp_address varchar(20),
    emp_dob date
);

select * from employee;

-- comments in workbench
# comments in workbench
/*
comments in workbench
*/
-- Insert data in table
insert into employee values(14,"abc",125000,'Ahmedabad',"1995/05/01");
insert into employee values(12,"pqr",110000,"Delhi","1996/08/15"),
(13,"xyz",200000,"Mumbai","1990/01/12");

insert into employee values(11,"mno",120000,'Baroda',"1995/05/01");

select * from employee;		#return whole table
select emp_name from employee; #return only specified column
select emp_id,emp_name from employee;	#return 2 column
select * from employee where emp_name='abc'; #return specified value all column

/*
safe mode off steps
edit -> prefrences -> sql editor -> last checkbox(safe update) 
-> uncheck -> ok.
query -> reconnect to server -> done....
*/
-- update data 
update employee set emp_name="hii" where emp_id=11;
update employee set emp_name="abc",emp_salary=100000,emp_address="Chennai" where emp_id=12;

-- delete specfic rows
delete from employee where emp_id=11;
delete from employee where emp_salary=125000;

truncate table employee; -- delete all data in a table

alter table employee rename column emp_dob to dob; -- update column name
alter table employee modify column emp_id numeric; -- update data type of columns
alter taBLE employee drop column dob; -- will delete sepcific column
-- mysql is not case sensitive

select avg(emp_salary) from employee;
select min(emp_salary) from employee;
select max(emp_salary) from employee;
select sum(emp_salary) as sal from employee ;