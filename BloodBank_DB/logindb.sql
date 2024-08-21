use bloodbank;
ALTER TABLE `bloodbank`.`logintable` 
DROP COLUMN `contactno`,
DROP COLUMN `email`,
CHANGE COLUMN `userid` `userid` INT NOT NULL FIRST;

select * from logintable;
drop table logintable;
create table logintable(userid int,username varchar(45),password varchar(45));
show tables;
