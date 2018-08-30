CREATE TABLE countryinfo (
  city_id INT NOT NULL,
  countryName VARCHAR(50) NOT NULL,
  cityName VARCHAR(50) NOT NULL,
  Population INT NOT NULL,
  isCapital BIT(1) NOT NULL,
  PRIMARY KEY (city_id));