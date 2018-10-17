CREATE TABLE peopleinfo (
  id INT NOT NULL,
  Name VARCHAR(50) NOT NULL,
  Surname VARCHAR(50) NOT NULL,
  city_id INT NOT NULL,
  isOccuped BIT(1) NOT NULL,
  PRIMARY KEY (id));