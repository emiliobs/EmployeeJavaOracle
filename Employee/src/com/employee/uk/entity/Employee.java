package com.employee.uk.entity;

/**
 *
 * @author Emilio
 */
public class Employee
{
    private int Employee_Id;
    private String Name;
    private String Last_Name;
    private String Document_Number;
    private char Marital_Status;
    private char Gender;
    private int Age;

    public Employee()
    {
    }

    public Employee(int Employee_Id, String Name, String Last_Name, String Document_Number, char Marital_Status, char Gender, int Age)
    {
        this.Employee_Id = Employee_Id;
        this.Name = Name;
        this.Last_Name = Last_Name;
        this.Document_Number = Document_Number;
        this.Marital_Status = Marital_Status;
        this.Gender = Gender;
        this.Age = Age;
    }

    public int getAge()
    {
        return Age;
    }

    public void setAge(int Age)
    {
        this.Age = Age;
    }

    public int getEmployee_Id()
    {
        return Employee_Id;
    }

    public void setEmployee_Id(int Employee_Id)
    {
        this.Employee_Id = Employee_Id;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public String getLast_Name()
    {
        return Last_Name;
    }

    public void setLast_Name(String Last_Name)
    {
        this.Last_Name = Last_Name;
    }

    public String getDocument_Number()
    {
        return Document_Number;
    }

    public void setDocument_Number(String Document_Number)
    {
        this.Document_Number = Document_Number;
    }

    public char getMarital_Status()
    {
        return Marital_Status;
    }

    public void setMarital_Status(char Marital_Status)
    {
        this.Marital_Status = Marital_Status;
    }

    public char getGender()
    {
        return Gender;
    }

    public void setGender(char Gender)
    {
        this.Gender = Gender;
    }

    @Override
    public String toString()
    {
        return "Employee{" + "Employee_Id=" + Employee_Id + ", Name=" + Name + ", Last_Name=" + Last_Name + ", Document_Number=" + Document_Number + ", Marital_Status=" + Marital_Status + ", Gender=" + Gender + ", Age=" + Age + '}';
    }
    
    
    
}
