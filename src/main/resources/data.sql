DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS Users;

CREATE TABLE book (
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

CREATE TABLE Users (
    Id INT AUTO_INCREMENT  PRIMARY KEY,
    Username Varchar(250) NULL,
    Password Varchar(250) NULL,
    UserRole Varchar(250) NULL,
    Email Varchar(250) NULL,
    Address Varchar(250) NULL
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
  
  /*
  ('Bill', 'Gates', 'Billionaire Tech Entrepreneur'),
  ('Folrunsho', 'Alakija', 'Billionaire Oil Magnate'); */
  
  