
--Creating Patron Type Table
DROP TABLE IF EXISTS Patron_Type_Table;
CREATE TABLE Patron_Type_Table (
    Patron_Type_Code VarChar(250) NULL,
    Patron_Type Varchar(250) NULL
);

--Creating User Role Table
DROP TABLE IF EXISTS User_Role;
CREATE TABLE User_Role (
    User_Role_Code VarChar(250) NULL,
    User_Role_Authentication VarChar(250) NULL
);


--Creating Book Table
DROP TABLE IF EXISTS Book;
CREATE TABLE Book (
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Title VarChar(250) NULL,
    author_First_Name VarChar(250) NULL,
    author_Last_Name VarChar(250) NULL
);

--Creating Patrons Table
DROP TABLE IF EXISTS Patrons;
CREATE TABLE Patrons (
    Id INT AUTO_INCREMENT PRIMARY KEY,
    First_Name VarChar(250) NULL,
    Last_Name VarChar(250) NULL,
    Address VarChar(250) NULL,
    Student_Id VarChar(250) NULL
);

--Creating Users Table
DROP TABLE IF EXISTS Users;
Create TABLE Users (
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Username  VarChar(250) NULL,
    Email  VarChar(250) NULL,
    Address  VarChar(250) NULL
);


