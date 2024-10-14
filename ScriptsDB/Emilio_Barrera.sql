CREATE TABLE Employee 
(
    Employee_Id number(10) not null,
    Name VARCHAR2(50) not null,
    Last_Name VARCHAR2(50) not null,
    Document_Number VARCHAR2(10) not null,
    Marital_Status VARCHAR2(1) not null,
    Gender VARCHAR2(1) not null,
    Age number(3) not null
        
);

ALTER TABLE Employee ADD CONSTRAINT Employee_Id_PK PRIMARY KEY(Employee_Id);

SELECT * FROM employee;
SELECT * FROM employee ORDER BY employee_id;
SELECT MAX(Employee_Id) from employee;
SELECT employee_seq.currval+1 from employee;

