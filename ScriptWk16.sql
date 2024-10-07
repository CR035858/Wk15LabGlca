/* SpringBoot CRUD Week 16 Day 03 JPA
	String firstName;
	String lastName;
	String address;
	String department;
	String designation;

*/
use studentsdb1;
create table CCRepDetails
(
id int primary key auto_increment,
firstName varchar(50),
lastName varchar(50),
address varchar(150),
department varchar(50),
designation varchar(50)
);