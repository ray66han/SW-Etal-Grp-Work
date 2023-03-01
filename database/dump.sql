BEGIN TRANSACTION;
DROP TABLE IF EXISTS "users";
CREATE TABLE IF NOT EXISTS "users" (
                                       "user_id"	INTEGER NOT NULL,
                                       "user_name"	TEXT NOT NULL,
                                       "user_email"	INTEGER NOT NULL UNIQUE,
                                       "user_group"	INTEGER,
                                       PRIMARY KEY("user_id" AUTOINCREMENT)
);
COMMIT;
