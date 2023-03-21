drop table if exists achievements;
drop table if exists chore_dates;
drop table if exists chores;
drop table if exists users;

create table achievements
(
    achv_id              integer not null,
    achv_name            text,
    achv_points_required integer
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
    chore_time        integer
);

create table chore_dates
(
    chore_date_id      integer
        constraint chore_id_fk
            references chores,
    chore_date_created integer,
    chore_date_expired integer
);

INSERT INTO chores (chore_id, chore_name, chore_status, chore_reoccuring, chore_assigned_to, chore_Time)
VALUES (1, 'Wash clothes, bed sheets and towels', 0, 1, null, 0);
INSERT INTO chores (chore_id, chore_name, chore_status, chore_reoccuring, chore_assigned_to, chore_Time)
VALUES (2, 'Vaccum & Sweep all floors.', 0, 1, null, 0);
INSERT INTO chores (chore_id, chore_name, chore_status, chore_reoccuring, chore_assigned_to, chore_Time)
VALUES (3, 'Dust surfaces.', 0, 1, 1, 0);
INSERT INTO chores (chore_id, chore_name, chore_status, chore_reoccuring, chore_assigned_to, chore_Time)
VALUES (4, 'Thoroughly clean bathrooms.', 0, 1, null, 0);
INSERT INTO chores (chore_id, chore_name, chore_status, chore_reoccuring, chore_assigned_to, chore_Time)
VALUES (6, 'Water plants.', 0, 0, null, 0);
