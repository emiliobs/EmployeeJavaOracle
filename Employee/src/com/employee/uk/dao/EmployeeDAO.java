package com.employee.uk.dao;

import com.employee.uk.entity.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author Emilio
 */
public class EmployeeDAO
{

    private String message = null;

    public String AddEmployee(Connection connection, Employee employee)
    {
        PreparedStatement preparedStatement = null;
        String sql = "INSERT INTO  Employee (Employee_Id, name,last_name, document_number, marital_status, gender, age) "
                + "VALUES(Employee_SEQ.NEXTVAL,?,?,?,?,?,?)";

        try
        {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getLast_Name());
            preparedStatement.setString(3, employee.getDocument_Number());
            preparedStatement.setString(4, employee.getMarital_Status() +"");
            preparedStatement.setString(5, employee.getGender() + "");
            preparedStatement.setInt(6, employee.getAge());
            
            message = "Saved Successfully.";
            
            preparedStatement.execute();
            preparedStatement.close();
        }
        catch (SQLException e)
        {
              message = "Error: Could Not Be Saved Correctly \n " + e.getMessage();
        }

        return message;
    }

    public String EditEmployee(Connection connection, Employee employee)
    {

        PreparedStatement preparedStatement = null;
        String sql = "Update Employee Set name = ?,last_name = ?, document_number = ?, marital_status = ?, gender = ?, age = ?"
                         + "Where Employee_Id = ?";

        try
        {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getLast_Name());
            preparedStatement.setString(3, employee.getDocument_Number());
            preparedStatement.setString(4, employee.getMarital_Status() +"");
            preparedStatement.setString(5, employee.getGender() + "");
            preparedStatement.setInt(6, employee.getAge());
            preparedStatement.setInt(7, employee.getEmployee_Id());
            
            message = "Edited Successfully.";
            
            preparedStatement.execute();
            preparedStatement.close();
        }
        catch (SQLException e)
        {
              message = "Error: Could Not Be Edited Correctly \n " + e.getMessage();
        }

        return message;
    }

    public String DeleteEmployee(Connection connection, int id)
    {
        PreparedStatement preparedStatement = null;
        String sql = "Delete From Employee Where Employee_Id = ? ";

        try
        {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
                        
            message = "Deleted Successfully.";
            
            preparedStatement.execute();
            preparedStatement.close();
        }
        catch (SQLException e)
        {
              message = "Error: Could Not Be Deleted Correctly \n " + e.getMessage();
        }

        return message;
    }

    public void EmployeeList(Connection connection, JTable table)
    {
            
    }

}
