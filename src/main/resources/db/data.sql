INSERT INTO Patron_Type_Table ( Patron_Type_Code, Patron_Type) VALUES ( '01','Student');
INSERT INTO Patron_Type_Table ( Patron_Type_Code, Patron_Type) VALUES ( '02','Alumni');
INSERT INTO Patron_Type_Table (Patron_Type_Code, Patron_Type) VALUES ( '03','Community');
/********************/

INSERT INTO User_Role ( User_Role_Code, User_Role_Authentication) VALUES ( '01','Admin');
INSERT INTO User_Role ( User_Role_Code, User_Role_Authentication) VALUES ( '02','User');
/*********************/

--INSERT INTO Book (Id, Title, author_First_Name, author_Last_Name) VALUES (1, 'Jacobs Ladder', 'Stephen', 'King');
--INSERT INTO Book (Id, Title, author_First_Name, author_Last_Name) VALUES (2, 'Scary Book', 'John', 'Oliver');
--INSERT INTO Book (Id, Title, author_First_Name, author_Last_Name) VALUES (3, 'Jacobs Ladder', 'Stephen', 'King');
INSERT INTO Book (Id, Title, author_First_Name, author_Last_Name) VALUES
  (1,'risus. Nunc ac sem ut','Nathan','Zimmerman'),
  (2,'lorem eu metus. In lorem.','Bernard','Sharp'),
  (3,'metus. Vivamus euismod urna. Nullam','Bell','Harrington'),
  (4,'vel pede blandit congue. In','Hilel','Rich'),
  (5,'condimentum eget, volutpat ornare, facilisis','Boris','Wilkins'),
  (6,'nec ante blandit viverra. Donec','Nell','Hurst'),
  (7,'eu metus. In lorem. Donec','Jana','Mendoza'),
  (8,'posuere, enim nisl elementum purus,','Dominique','Newman'),
  (9,'egestas hendrerit neque. In ornare','Isabella','Mcknight'),
  (10,'amet, consectetuer adipiscing elit. Etiam','Lana','Barlow'),
  (11,'nec ante. Maecenas mi felis,','Tanek','Montgomery'),
  (12,'porttitor interdum. Sed auctor odio','Channing','Beard'),
  (13,'amet diam eu dolor egestas','Lareina','Fernandez'),
  (14,'morbi tristique senectus et netus','Autumn','Stark'),
  (15,'aliquet molestie tellus. Aenean egestas','Rudyard','Gilmore'),
  (16,'facilisis facilisis, magna tellus faucibus','Julian','Cook'),
  (17,'eget magna. Suspendisse tristique neque','Justina','Mullins'),
  (18,'id sapien. Cras dolor dolor,','Asher','Robbins'),
  (19,'eu erat semper rutrum. Fusce','Cameran','Cleveland'),
  (20,'Praesent luctus. Curabitur egestas nunc','Cameran','Peters'),
  (21,'tempus risus. Donec egestas. Duis','Yoshio','Chandler'),
  (22,'ipsum. Suspendisse sagittis. Nullam vitae','Lysandra','Dorsey'),
  (23,'lacus vestibulum lorem, sit amet','Michael','Powers'),
  (24,'torquent per conubia nostra, per','Jackson','Tucker'),
  (25,'massa. Mauris vestibulum, neque sed','Barbara','Fitzgerald'),
  (26,'In scelerisque scelerisque dui. Suspendisse','Mari','Sharpe'),
  (27,'vel pede blandit congue. In','Abdul','Jacobs'),
  (28,'velit. Quisque varius. Nam porttitor','Price','Wolf'),
  (29,'consequat nec, mollis vitae, posuere','Madaline','Benjamin'),
  (30,'vitae, sodales at, velit. Pellentesque','Rhoda','Hurst');
/********************/

--INSERT INTO Patrons (Id, First_Name, Last_Name, Address, Student_Id) VALUES (1, 'Deyonta', 'Robinson', '3313 New Genisis Dr', '045789653');
--INSERT INTO Patrons (Id, First_Name, Last_Name, Address, Student_Id) VALUES (2, 'Adam', 'Collins', '123 Main Street', '012345655');
--INSERT INTO Patrons (Id, First_Name, Last_Name, Address, Student_Id) VALUES (3, 'Luke', 'Skywalker', '7865 Boulevard Ave', '0224785326');
INSERT INTO Patrons (Id, First_Name, Last_Name, Address, Student_Id)
    VALUES
      (1,'Amelia','Harris','303-6750 Sed, Av.','474462'),
      (2,'Remedios','Castro','P.O. Box 662, 4305 Odio Ave','445444'),
      (3,'Castor','Watkins','287-5484 Ultricies Rd.','844564'),
      (4,'Jack','Warren','P.O. Box 787, 6459 Etiam Road','433169'),
      (5,'Lars','Boyd','Ap #545-5476 Suspendisse Street','668839'),
      (6,'Hillary','Bowman','Ap #447-9613 Dolor St.','634417'),
      (7,'Robert','Davis','Ap #994-1161 A St.','852148'),
      (8,'Cruz','Dean','4753 Non Ave','916086'),
      (9,'Justina','Spencer','Ap #489-559 Arcu. Avenue','844176'),
      (10,'Kyla','Hicks','277-6524 Fermentum St.','368703'),
      (11,'Ivor','Romero','P.O. Box 745, 9133 Viverra. Rd.','884484'),
      (12,'Ahmed','Morris','Ap #798-9982 Eros. St.','622469'),
      (13,'Rhonda','Espinoza','9157 Mauris Rd.','359175'),
      (14,'Sade','Porter','1448 Euismod Ave','223753'),
      (15,'Doris','Obrien','Ap #138-7110 Sed Road','583542'),
      (16,'Audrey','King','9127 Tincidunt Rd.','422475'),
      (17,'Remedios','Perry','Ap #974-328 Suspendisse Ave','583461'),
      (18,'Aladdin','Maldonado','Ap #929-3301 Elementum Road','184041'),
      (19,'Claudia','Black','4067 Enim. Avenue','281325'),
      (20,'May','Gardner','7179 Tincidunt St.','658485'),
      (21,'Adria','Pierce','Ap #488-632 Libero. St.','657828'),
      (22,'Kaye','Black','Ap #503-3135 Eu St.','821611'),
      (23,'Kelsie','Collins','4206 Gravida. Street','346846'),
      (24,'Caldwell','Woods','873 Ultricies Ave','727128'),
      (25,'Cora','Ortiz','P.O. Box 231, 8585 Diam Ave','107320'),
      (26,'Jasper','Soto','Ap #181-6605 Dignissim Av.','863292'),
      (27,'India','Little','P.O. Box 348, 4186 Cursus. Road','166615'),
      (28,'Talon','Carter','Ap #341-3660 Amet Rd.','484213'),
      (29,'Finn','Vazquez','Ap #800-5450 Nunc Rd.','188139'),
      (30,'Shafira','Richardson','P.O. Box 429, 3782 Et, St.','226133');

/******************/


--INSERT INTO Users (Id, Username, Email, Address) VALUES (1, 'djrobinso', 'djrobinso@gmail.com', '123 Main St' );
--INSERT INTO Users (Id, Username, Email, Address) VALUES (2, 'mKelly', 'mKelly@hotmail.com', '234 Lakeview Dr' );
--INSERT INTO Users (Id, Username, Email, Address) VALUES (3, 'lSkywlkr', 'lSkywlkr2@gmail.com', '646 Ocen Blvd' );
--INSERT INTO Users (Id, Username, Email, Address) VALUES (4, 'gTomlin', 'gTomlin@hotmail.com', '1547 Madison Ave' );
--INSERT INTO Users (Id, Username, Email, Address) VALUES (5, 'tStark', 'tStark@starkindustries.net', '154 Street' );
--INSERT INTO Users (Id, Username, Email, Address) VALUES (6, 'sRodgers', 'sRodgers@aol.net', '154 Street' );
  INSERT INTO Users (Id, Username, Email, Address) VALUES 
  (1,'luctus.ut ','eu.enim.etiam@protonmail.ca','114-4476 Cursus Ave'),
  (2,'luctus.sit ','non.cursus@aol.couk','Ap #682-3719 Non St.'),
  (3,'vel.convallis ','interdum@outlook.ca','Ap #665-7715 Dis Rd.'),
  (4,'mollis ','amet.metus@protonmail.com','Ap #275-453 Morbi Av.'),
  (5,'duis.mi ','magna.sed@protonmail.com','189-7212 Aenean Rd.'),
  (6,'vel.turpis.aliquam ','suspendisse.aliquet@hotmail.org','Ap #413-5273 Nisi Rd.'),
  (7,'nisl.quisque.fringilla ','sapien.cras@icloud.com','564-450 Sem St.'),
  (8,'pede.ultrices.a ','varius@hotmail.couk','Ap #850-8058 Libero. St.'),
  (9,'nascetur.ridiculus.mus ','ac.turpis.egestas@icloud.org','Ap #772-5976 Consectetuer St.'),
  (10,'turpis.aliquam ','sit.amet@aol.org','Ap #282-2687 Cursus St.'),
  (11,'arcu ','lorem@yahoo.net','813-2604 Luctus. Avenue'),
  (12,'ut ','pellentesque.sed.dictum@yahoo.ca','P.O. Box 760, 763 Bibendum. St.'),
  (13,'nisl.sem.consequat ','quis.massa@icloud.edu','525-9152 Tincidunt, Street'),
  (14,'primis ','mattis.velit@icloud.ca','Ap #337-2239 Magnis Rd.'),
  (15,'laoreet ','augue@gmail.ca','P.O. Box 997, 4535 Molestie Rd.'),
  (16,'eget ','sodales.at@aol.com','Ap #876-5505 Vivamus Avenue'),
  (17,'magna.et ','curabitur.vel@yahoo.org','Ap #254-5780 Mollis. Rd.'),
  (18,'id ','duis.ac.arcu@protonmail.couk','P.O. Box 543, 6510 Dolor St.'),
  (19,'pretium ','sagittis@yahoo.couk','Ap #333-3406 Amet Avenue'),
  (20,'lobortis.risus.in ','nibh.phasellus@hotmail.ca','771-6941 Curabitur Ave'),
  (21,'elementum ','ipsum.dolor.sit@yahoo.org','4544 Et Rd.'),
  (22,'sem.ut ','suspendisse.non@outlook.edu','171-5940 Praesent St.'),
  (23,'nam ','morbi@icloud.ca','7375 Pellentesque Rd.'),
  (24,'congue.a ','eu.tellus.eu@icloud.com','Ap #990-2774 Ad Rd.'),
  (25,'venenatis.lacus.etiam ','tempus.eu@protonmail.net','428-118 Nostra, St.'),
  (26,'ac ','quam@hotmail.org','657-469 Lacus. Rd.'),
  (27,'enim ','sem.egestas.blandit@gmail.ca','349-7268 Etiam Ave'),
  (28,'faucibus.orci.luctus ','varius.ultrices@gmail.com','749-2059 Proin Avenue'),
  (29,'enim.sit ','ut.nulla.cras@yahoo.ca','Ap #435-9817 Penatibus Rd.'),
  (30,'in.aliquet ','ac@outlook.org','364-6194 Maecenas Ave');
/****/





                

  
  