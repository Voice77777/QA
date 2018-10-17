CREATE TABLE `voice11`.`orders` (
  `OrderID` INT NOT NULL,
  `CustomerID` INT NOT NULL,
  `Status` VARCHAR(50) NOT NULL,
  `Price` INT NOT NULL,
  PRIMARY KEY (`OrderID`));