use heroku_07e20de42ac8f09;

create table hr_user (
ID_USER int auto_increment,
USERNAME varchar(100),
primary key (ID_USER)
);
insert into hr_user (USERNAME)
values ('LolaHR');

insert into hr_user (USERNAME)
values ('JoseMarin');

create table position_table (
ID_POSITION int auto_increment,
TITLE varchar(100),
DESCRIPTION varchar(250),
primary key (ID_POSITION)
);
insert into position_table (TITLE, DESCRIPTION)
values ('Orientadora Laboral', 'Asigna los roles a los candidatos');

insert into position_table (TITLE, DESCRIPTION)
values ('Programador Junior', 'Desarrollador principiante');

insert into position_table (TITLE, DESCRIPTION)
values ('Instructor Técnico', 'Forma a los candidatos en distintas competencias tecnológicas');

create table hr_position (
ID_HR_POSITION int auto_increment primary key,
FK_ID_USER int not null,
FK_ID_POSITION int not null,
foreign key (FK_ID_USER) references hr_user(ID_USER),
foreign key (FK_ID_POSITION) references position_table(ID_POSITION)
);
insert into hr_position (FK_ID_USER, FK_ID_POSITION)
values (1, 1);




create table candidate (
ID_CANDIDATE int auto_increment,
CANDIDATE_NAME varchar(100),
CANDIDATE_SURNAME varchar(150),
primary key (ID_CANDIDATE)
);
insert into candidate (CANDIDATE_NAME, CANDIDATE_SURNAME)
values ('Josep', 'Lopez');

insert into candidate (CANDIDATE_NAME, CANDIDATE_SURNAME)
values ('Pepe', 'Viyuela');

create table candidate_position (
ID_CANDIDATE_POSITION int auto_increment primary key,
REGISTRY_DATE date,
TEST_DATE date,
COMPLETION_DATE date,
RESULT float,
FK_ID_POSITION int not null,
FK_ID_CANDIDATE int not null,
foreign key (FK_ID_POSITION) references position_table(ID_POSITION),
foreign key (FK_ID_CANDIDATE) references candidate(ID_CANDIDATE)
);
insert into candidate_position (REGISTRY_DATE, TEST_DATE, COMPLETION_DATE, RESULT, FK_ID_POSITION, FK_ID_CANDIDATE)
values (20220518, 20220519, 20220519, 70, 1, 1);


create table skill(
ID_SKILL int auto_increment primary key,
SKILL_NAME varchar(100)
);
insert into skill (SKILL_NAME)
values ('Java');

insert into skill (SKILL_NAME)
values ('JavaScript');


create table candidate_skill(
ID_CANDIDATE_SKILL int auto_increment primary key,
FK_ID_CANDIDATE int not null,
FK_ID_SKILL int not null,
VALUE_NUMBER float,
NOTES varchar(150),
foreign key (FK_ID_CANDIDATE) references candidate(ID_CANDIDATE),
foreign key (FK_ID_SKILL) references skill(ID_SKILL)
);
insert into candidate_skill (FK_ID_CANDIDATE, FK_ID_SKILL, VALUE_NUMBER, NOTES)
values (1, 1, 90, 'Está aprendiendo HTML');



