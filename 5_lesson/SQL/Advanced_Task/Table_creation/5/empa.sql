CREATE TABLE `empa` (
  `EmpID` int(10) NOT NULL AUTO_INCREMENT,
  `EmpName` varchar(45) NOT NULL,
  `MgrID` int(11) DEFAULT NULL,
  `DeptID` int(11) NOT NULL,
  `Salary` int(11) NOT NULL,
  `DOB` datetime NOT NULL,
  UNIQUE KEY `EmpID_UNIQUE` (`EmpID`),
  KEY `e_fk_idx` (`DeptID`),
  KEY `em_fk_idx` (`MgrID`),
  CONSTRAINT `em_fk` FOREIGN KEY (`MgrID`) REFERENCES `empa` (`EmpID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8