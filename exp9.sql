
CREATE DATABASE company;

USE company;

CREATE TABLE employee (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    salary DOUBLE
);

INSERT INTO employee VALUES
(101, 'Rahul', 30000),
(102, 'Priya', 35000),
(103, 'Amit', 40000);

SELECT * FROM employee;

UPDATE employee
SET name = 'Rahul Sharma', salary = 45000
WHERE id = 101;

DELETE FROM employee
WHERE id = 103;

SELECT * FROM employee;
