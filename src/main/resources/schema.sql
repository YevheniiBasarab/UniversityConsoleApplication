create table degree
(
degree_id int AUTO_INCREMENT PRIMARY KEY,
degree_name varchar (100) not null unique
);

create table lector
(
lector_id int AUTO_INCREMENT PRIMARY KEY,
lector_name varchar (100) not null unique,
lector_degree_id int not null REFERENCES degree (degree_id),
lector_salary int
);

create table department
(
department_id int AUTO_INCREMENT PRIMARY KEY,
department_name VARCHAR (100) NOT NULL UNIQUE,
department_head_id int not null REFERENCES lector (lector_id)
);

create table department_lector
(
department_id int REFERENCES department (department_id),
lector_id int REFERENCES lector (lector_id),
PRIMARY KEY (department_id, lector_id)
);
