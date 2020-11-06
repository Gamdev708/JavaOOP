create table repairjobs(

rj_ID int NOT NULL,
rj_job_name varchar(30),
customer_name varchar(30),
employee_name varchar (30),
cost float,
sales float NOT NULL,
status varchar(20),
s_date date,
e_date date NOT NULL,
primary key (rj_ID),
);

insert into repairjobs (rj_ID,rj_job_name,customer_name,employee_name,cost,sales,status,s_date,e_date) values (100,'full services','josh','peter',15000,20000,'pending','2020-09-11','2020-11-11');
insert into repairjobs (rj_ID,rj_job_name,customer_name,employee_name,cost,sales,status,s_date,e_date) values (101,'painting','matte','kamal',20000,25000,'completed','2020-10-11','2020-10-15');