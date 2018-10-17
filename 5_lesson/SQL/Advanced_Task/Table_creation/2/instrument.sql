CREATE TABLE `instrument` (
  `InstrumentID` int(11) NOT NULL AUTO_INCREMENT,
  `InstrumentCode` int(11) NOT NULL,
  `RatingID` int(11) NOT NULL,
  PRIMARY KEY (`InstrumentID`),
  KEY `r_fk_idx` (`RatingID`),
  CONSTRAINT `r_fk` FOREIGN KEY (`RatingID`) REFERENCES `rating` (`RatingID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8