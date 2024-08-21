CREATE TABLE `bloodbank`.`signuptable` (
  `userid` INT NOT NULL,
  `username` VARCHAR(50) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `email` VARCHAR(70) NOT NULL,
  `contact` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`userid`));
ALTER TABLE `bloodbank`.`signuptable` 
CHANGE COLUMN `userid` `userid` INT NOT NULL AUTO_INCREMENT ;
use bloodbank;
select * from signuptable;
delete from signuptable where userid = 1;

