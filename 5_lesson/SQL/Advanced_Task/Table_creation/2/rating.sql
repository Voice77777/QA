CREATE TABLE `rating` (
  `RatingID` int(11) NOT NULL AUTO_INCREMENT,
  `RatingValue` varchar(45) NOT NULL,
  `RatingAgencyID` int(11) NOT NULL,
  `RatingTypeID` int(11) NOT NULL,
  PRIMARY KEY (`RatingID`),
  KEY `ra_fk_idx` (`RatingAgencyID`),
  KEY `rt_fk_idx` (`RatingTypeID`),
  CONSTRAINT `ra_fk` FOREIGN KEY (`RatingAgencyID`) REFERENCES `ratingagency` (`RatingAgencyID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `rt_fk` FOREIGN KEY (`RatingTypeID`) REFERENCES `ratingtype` (`RatingTypeID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8