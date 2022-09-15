 insert into degree (degree_name) values ('assistant');
 insert into degree (degree_name) values ('associate professor');
 insert into degree (degree_name) values ('professor');

 insert into lector (lector_id, lector_name, lector_degree_id, lector_salary) values (1, 'Anna Toych', 3, 6400);
 insert into lector (lector_id, lector_name, lector_degree_id, lector_salary) values (2, 'Yosif Bermondksy', 3, 5700);
 insert into lector (lector_id, lector_name, lector_degree_id, lector_salary) values (3, 'Maria Khomytska', 3, 5100);
 insert into lector (lector_id, lector_name, lector_degree_id, lector_salary) values (4, 'Jaklyn Tomorrow', 3, 7500);
 insert into lector (lector_id, lector_name, lector_degree_id, lector_salary) values (5, 'Bob Data', 3, 5200);
 insert into lector (lector_id, lector_name, lector_degree_id, lector_salary) values (6, 'Jhon Refer', 2, 3500);
 insert into lector (lector_id, lector_name, lector_degree_id, lector_salary) values (7, 'Alan Trent', 2, 2400);
 insert into lector (lector_id, lector_name, lector_degree_id, lector_salary) values (8, 'Kotlif Toronto', 1, 1500);
 insert into lector (lector_id, lector_name, lector_degree_id, lector_salary) values (9, 'Daniel Rotcklif', 1, 1000);

 insert into department (department_name, department_head_id) values ('Computer science', 1);
 insert into department (department_name, department_head_id) values ('Computer engineering', 2);
 insert into department (department_name, department_head_id) values ('Informatics', 3);
 insert into department (department_name, department_head_id) values ('System analysis', 4);
 insert into department (department_name, department_head_id) values ('Vector graphics', 5);

 insert into department_lector (department_id, lector_id) values (1, 1);
 insert into department_lector (department_id, lector_id) values (2, 2);
 insert into department_lector (department_id, lector_id) values (3, 3);
 insert into department_lector (department_id, lector_id) values (4, 4);
 insert into department_lector (department_id, lector_id) values (5, 5);
 insert into department_lector (department_id, lector_id) values (1, 6);
 insert into department_lector (department_id, lector_id) values (2, 6);
 insert into department_lector (department_id, lector_id) values (3, 6);
 insert into department_lector (department_id, lector_id) values (4, 7);
 insert into department_lector (department_id, lector_id) values (5, 7);
 insert into department_lector (department_id, lector_id) values (1, 8);
 insert into department_lector (department_id, lector_id) values (2, 8);
 insert into department_lector (department_id, lector_id) values (3, 9);
 insert into department_lector (department_id, lector_id) values (4, 9);
 insert into department_lector (department_id, lector_id) values (5, 9);