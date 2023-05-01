drop table if exists achievements;
drop table if exists chore_status;
drop table if exists chores;
drop table if exists users;

create table achievements
(
    achv_id              integer not null,
    achv_name            text,
    achv_points_required integer
);

create table chore_status
(
    status_id   integer not null
        constraint status_id
            primary key autoincrement,
    status_desc text
);

create table sqlite_master
(
    type     TEXT,
    name     TEXT,
    tbl_name TEXT,
    rootpage INT,
    sql      TEXT
);

create table sqlite_sequence
(
    name,
    seq
);

create table users
(
    user_id     integer           not null
        primary key autoincrement,
    user_name   TEXT,
    user_points integer default 0 not null
);

create table chores
(
    chore_id          integer               not null
        primary key autoincrement,
    chore_name        text,
    chore_status      integer default 0,
    chore_reoccuring  boolean default false not null,
    chore_assigned_to integer
        constraint AssignedTo
            references users
            on update set null on delete set null,
    chore_time        integer,
    chore_created     String  default current_date
);



INSERT INTO chore_status (status_id, status_desc) VALUES (0, 'Not started');
INSERT INTO chore_status (status_id, status_desc) VALUES (1, 'In progress');
INSERT INTO chore_status (status_id, status_desc) VALUES (2, 'Completed');
-- Dummy Data Inserts
INSERT INTO users (user_id, user_name, user_points) VALUES (0, 'Alex', 0);
INSERT INTO users (user_id, user_name, user_points) VALUES (1, 'Garry', 1);
INSERT INTO chores (chore_id, chore_name, chore_status, chore_reoccuring, chore_assigned_to, chore_time, chore_created) VALUES (1, 'Wash clothes, bed sheets and towels', 0, 1, null, 45, date(current_timestamp));
INSERT INTO chores (chore_id, chore_name, chore_status, chore_reoccuring, chore_assigned_to, chore_time, chore_created) VALUES (2, 'Vaccum & Sweep all floors.', 0, 1, null, 20, date(current_timestamp));
INSERT INTO chores (chore_id, chore_name, chore_status, chore_reoccuring, chore_assigned_to, chore_time, chore_created) VALUES (3, 'Dust surfaces.', 0, 1, null, 10, date(current_timestamp));
INSERT INTO chores (chore_id, chore_name, chore_status, chore_reoccuring, chore_assigned_to, chore_time, chore_created) VALUES (4, 'Thoroughly clean bathrooms.', 0, 1, null, 30, date(current_timestamp));
INSERT INTO chores (chore_id, chore_name, chore_status, chore_reoccuring, chore_assigned_to, chore_time, chore_created) VALUES (5, 'Water plants.', 2, 0, 0, 10, date(current_timestamp));
INSERT INTO chores (chore_id, chore_name, chore_status, chore_reoccuring, chore_assigned_to, chore_time, chore_created) VALUES (6, 'Make the beds', 2, 0, 0, 10, date(current_timestamp));
INSERT INTO chores (chore_id, chore_name, chore_status, chore_reoccuring, chore_assigned_to, chore_time, chore_created) VALUES (7, 'Clean windows', 2, 0, 1, 20, date(current_timestamp));

