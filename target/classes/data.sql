use skeleton;

insert into user(id,email,password,first_name,last_name) values (3,'rob@example.com','password','Rob','Winch');
insert into user(id,email,password,first_name,last_name) values (1,'luke@example.com','password','Luke','Taylor');
insert into user(id,email,password,first_name,last_name) values (2,'eve@example.com','password','Eve','sdropper');

insert into message(id,created,to_id,from_id,summary,text) values (103,'2014-07-10 10:00:00',3,1,'Hello Rob','This message is for Rob');
insert into message(id,created,to_id,from_id,summary,text) values (101,'2014-07-10 14:00:00',3,1,'How are you Rob?','This message is for Rob');
insert into message(id,created,to_id,from_id,summary,text) values (102,'2014-07-11 22:00:00',3,1,'Is this secure?','This message is for Rob');

insert into message(id,created,to_id,from_id,summary,text) values (113,'2014-07-12 10:00:00',1,3,'Hello Luke','This message is for Luke');
insert into message(id,created,to_id,from_id,summary,text) values (111,'2014-07-12 10:00:00',1,3,'Greetings Luke','This message is for Luke');
insert into message(id,created,to_id,from_id,summary,text) values (112,'2014-07-12 10:00:00',1,3,'Is this secure?','This message is for Luke');

insert into message(id,created,to_id,from_id,summary,text) values (123,'2014-07-12 10:00:00',2,2,'Hello Self','Ready to Hack!');