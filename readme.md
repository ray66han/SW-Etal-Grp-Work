# Chores Application
## ❓ About

This project is based on a scenario in which a developer team is charged with developing a chore tracking system. The system's goal is to assist families or groups of people in keeping track of household duties and ensuring that they are finished on time.

There are various actors in the system, including the administrator, the user, and the family. The administrator is in charge of running the system, while the user is in charge of entering and tracking their chores. A family actor is a group of users who live in the same house and can see one other's tasks.

A UML use case diagram was produced to help visualise the system. Several use scenarios for the actors are depicted in this graphic, including logging in, viewing tasks, and assigning tasks to specific people.

The development team also considered several methods for encouraging users to keep using the system and finishing their duties. Gamification, such as incentives and leaderboards, and the use of charts and data to show users their progress were among the ideas.

Overall, the goal of this project is to develop an useful and user-friendly task tracking system that can assist families or groups of individuals in staying organised and on top of home chores.
## 🗄️ Database Deployment
SQL-Lite is our primary database software, downloaded [here](https://www.sqlite.org/index.html)


A database generation file has been included in the git reposority, please use it to create your own instance of the database. 
Once you have downloaded both SQL-Lite and the current DB Creation script from the repo, open terminal, and navigate to the same folder as sqlite3 is in and then run the following command;
```batch
cat sqlite3 GenerateDatabase.sql | Database.db
```

Please make sure to check back often to make sure you have the most recent database file.

If you need any help or questions please reach out to Liam.
