BEGIN TRANSACTION;
DROP TABLE IF EXISTS "groups";
CREATE TABLE IF NOT EXISTS "groups" (
	"group_id"	INTEGER NOT NULL,
	"group_name"	INTEGER,
	PRIMARY KEY("group_id")
);
DROP TABLE IF EXISTS "users";
CREATE TABLE IF NOT EXISTS "users" (
	"user_id"	INTEGER NOT NULL UNIQUE,
	"user_name"	INTEGER NOT NULL,
	"user_email"	INTEGER NOT NULL,
	"user_group"	INTEGER,
	PRIMARY KEY("user_id" AUTOINCREMENT),
	FOREIGN KEY("user_group") REFERENCES "groups"("group_id")
);
DROP TABLE IF EXISTS "chores";
CREATE TABLE IF NOT EXISTS "chores" (
	"chore_id"	INTEGER NOT NULL,
	"chore_name"	INTEGER NOT NULL,
	"chore_desc"	INTEGER,
	"chore_assigned_to_user"	INTEGER,
	"chore_date_created"	INTEGER,
	"chore_date_expiry"	INTEGER,
	"chore_assigned_to_group"	INTEGER,
	PRIMARY KEY("chore_id"),
	FOREIGN KEY("chore_assigned_to_group") REFERENCES "groups"("group_id"),
	FOREIGN KEY("chore_assigned_to_user") REFERENCES "users"("user_id")
);
COMMIT;
