CREATE TABLE animals.pet (
  petid INT NOT NULL AUTO_INCREMENT,
  type_pet VARCHAR(30) NOT NULL,
  name VARCHAR(50) NOT NULL,
  owner VARCHAR(50) DEFAULT ZooLand,
  gender VARCHAR(7) NOT NULL,
  description VARCHAR(255),
  PRIMARY KEY (petid));
