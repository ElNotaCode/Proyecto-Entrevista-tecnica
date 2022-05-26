DROP TABLE IF EXISTS candidate;

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