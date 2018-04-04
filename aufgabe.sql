DROP TABLE IF EXISTS `Vorlesung`;
DROP TABLE IF EXISTS `Teilnahme`;
DROP TABLE IF EXISTS `Student`;
DROP TABLE IF EXISTS `Dozent`;



CREATE TABLE `Student` (
  `StudentId` int(11) NOT NULL,
  `Vorname` varchar(45) NOT NULL,
  `Nachname` varchar(45) NOT NULL,
  PRIMARY KEY (`StudentId`)
);

CREATE TABLE `Dozent` (
  `DozentId` int(11) NOT NULL,
  `Vorname` varchar(45) NOT NULL,
  `Nachname` varchar(45) NOT NULL,
  PRIMARY KEY (`DozentId`)
);

CREATE TABLE `Vorlesung` (
`VorlesungId` int(11) NOT NULL,
  `Titel` varchar(45) NOT NULL,
  `DozentId` int(11) NOT NULL, 
  PRIMARY KEY (`VorlesungId`),
  foreign key (`DozentId`) references Dozent(`DozentId`)
);

CREATE TABLE `Teilnahme` (
`StudentId` int(11) NOT NULL,
`VorlesungId` int(11) NOT NULL,
`Note` int(2) NOT NULL,
PRIMARY KEY (`StudentId`,`VorlesungId`)

);
