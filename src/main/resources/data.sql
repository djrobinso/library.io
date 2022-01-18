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



-- Creating Patrons table
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

  
  
  