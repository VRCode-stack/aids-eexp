
CREATE DATABASE college;

USE college;

CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    marks INT
);

INSERT INTO student VALUES
(101, 'Rahul', 85),
(102, 'Priya', 90),
(103, 'Amit', 78);

SELECT * FROM student;

UPDATE student
SET name = 'Rahul Sharma', marks = 95
WHERE id = 101;

DELETE FROM student
WHERE id = 103;

SELECT * FROM student;
