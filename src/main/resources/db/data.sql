--Creating Book table
/**
DROP TABLE IF EXISTS Book;
CREATE TABLE Book (
  Id INT AUTO_INCREMENT  PRIMARY KEY,
  title VARCHAR(250) NULL,
  authorFirstName VARCHAR(250)  NULL,
  authorLastName VARCHAR(250) NULL,
  ISB_Number VARCHAR(250) NULL,
  publicationDate VARCHAR(250) NULL,
  IsCheckedOut NUMBER(1) NULL,
  checkedOutDate DATETIME NULL,
  checkedInDate  DATETIME NULL,
  checkInDate DATETIME NULL,
  IsCheckedIn NUMBER(1) NULL,
  IsOverdue NUMBER(1)   NULL,
  checkInByDate  DATETIME NULL,
  IsLate NUMBER(1) NULL
);
INSERT INTO book(title, authorFirstName, authorLastName, ISB_Number,
  publicationDate,
  IsCheckedOut,
  checkedOutDate,
  checkedInDate,
  checkInDate,
  IsCheckedIn,
  IsOverdue,
  checkInByDate,
  IsLate) VALUES
  ('Aliko', 'Jake', 'Billard', '02458ISBN', NULL, TRUE, NULL,NULL,NULL,FALSE,FALSE, NULL, NULL);
**/
  

  --Creating Users table 
/**
DROP TABLE IF EXISTS Users;
CREATE TABLE Users (
    Id INT AUTO_INCREMENT  PRIMARY KEY,
    Username Varchar(250) NULL,
    Password Varchar(250) NULL,
    UserRole Varchar(250) NULL,
    Email Varchar(250) NULL,
    Address Varchar(250) NULL
);
INSERT INTO Users (Username, Password, UserRole, Email, Address) VALUES
('djrobinso','zaf56874','Librarian','deyonta@coast.edu','4578  Kelly Drive, Columbia SC, 29584');
**/



-- Creating Patrons table
/**
DROP TABLE IF EXISTS Patrons;
CREATE TABLE Patrons (
    Id INT AUTO_INCREMENT  PRIMARY KEY,
    FirstName VarChar(250) NULL,
    LastName Varchar(250) NULL,
    Address Varchar(250) NULL,
    StudentId Varchar(250) NULL,
    DriverLiscenceNum Varchar(250) NULL,
    PatronType Varchar(250) NULL
);
INSERT INTO Patrons (FirstName, LastName, Address, StudentId, DriverLiscenceNum, PatronType) VALUES
                    ('Jason', 'Jackson', '3313 New William Drive', '08436214260', NULL, 'Community Patron');
INSERT INTO Patrons (FirstName, LastName, Address, StudentId, DriverLiscenceNum, PatronType) VALUES
                    ('Miley', 'Cyrus', '843 James Ave', '08954785', '10652345', 'Student');
INSERT INTO Patrons (FirstName, LastName, Address, StudentId, DriverLiscenceNum, PatronType) VALUES
                    ('Donovan', 'Plummer', '245 Sunset Boulevard', '08456824', '54785968', 'Student');
***/
/***

DROP TABLE IF EXISTS Patron_Type_Table;
CREATE TABLE Patron_Type_Table (
    Id INT AUTO_INCREMENT  PRIMARY KEY,
    Patron_Type_Code VarChar(250) NULL,
    Patron_Type Varchar(250) NULL
);
**/
INSERT INTO Patron_Type_Table ( Patron_Type_Code, Patron_Type) VALUES ( '01','Student');
INSERT INTO Patron_Type_Table ( Patron_Type_Code, Patron_Type) VALUES ( '02','Alumni');
INSERT INTO Patron_Type_Table (Patron_Type_Code, Patron_Type) VALUES ( '03','Community');

INSERT INTO User_Role ( User_Role_Code, User_Role_Authentication) VALUES ( '01','Admin');
INSERT INTO User_Role ( User_Role_Code, User_Role_Authentication) VALUES ( '02','User');

INSERT INTO Book (Id, Title, author_First_Name, author_Last_Name) VALUES (1, 'Jacobs Ladder', 'Stephen', 'King');
INSERT INTO Book (Id, Title, author_First_Name, author_Last_Name) VALUES (2, 'Scary Book', 'John', 'Oliver');
INSERT INTO Book (Id, Title, author_First_Name, author_Last_Name) VALUES (3, 'Jacobs Ladder', 'Stephen', 'King');

INSERT INTO Patrons (Id, First_Name, Last_Name, Address, Student_Id) VALUES (1, 'Deyonta', 'Robinson', '3313 New Genisis Dr', '045789653');
INSERT INTO Patrons (Id, First_Name, Last_Name, Address, Student_Id) VALUES (2, 'Adam', 'Collins', '123 Main Street', '012345655');
INSERT INTO Patrons (Id, First_Name, Last_Name, Address, Student_Id) VALUES (3, 'Luke', 'Skywalker', '7865 Boulevard Ave', '0224785326');

INSERT INTO Users (Id, Username, Email, Address) VALUES (1, 'djrobinso', 'djrobinso@gmail.com', '123 Main St' );
INSERT INTO Users (Id, Username, Email, Address) VALUES (2, 'mKelly', 'mKelly@hotmail.com', '234 Lakeview Dr' );
INSERT INTO Users (Id, Username, Email, Address) VALUES (3, 'lSkywlkr', 'lSkywlkr2@gmail.com', '646 Ocen Blvd' );
INSERT INTO Users (Id, Username, Email, Address) VALUES (4, 'gTomlin', 'gTomlin@hotmail.com', '1547 Madison Ave' );
INSERT INTO Users (Id, Username, Email, Address) VALUES (5, 'tStark', 'tStark@starkindustries.net', '154 Street' );
INSERT INTO Users (Id, Username, Email, Address) VALUES (6, 'sRodgers', 'sRodgers@aol.net', '154 Street' );
/****/





                

  
  