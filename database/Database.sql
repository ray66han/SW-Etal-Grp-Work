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
    chore_id          integer               not null,
    chore_name        text,
    chore_status      integer,
    chore_reoccuring  boolean default false not null,
    chore_assigned_to integer
        constraint AssignedTo
            references users
            on update set null on delete set null,
    chore_weight      integer
);

create table chore_dates
(
    chore_date_id      integer
        constraint chore_id_fk
            references chores (chore_id),
    chore_date_created integer,
    chore_date_expired integer
);
