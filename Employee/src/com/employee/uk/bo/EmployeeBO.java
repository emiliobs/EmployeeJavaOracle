package com.employee.uk.bo;

import com.employee.uk.dao.EmployeeDAO;
import com.employee.uk.db.ConnectionDB;
import com.employee.uk.entity.Employee;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author Emilio
 */
public class EmployeeBO
{
    private String message =  "";
   private EmployeeDAO employeeDAO;
   Connection connection;    
   

    public EmployeeBO()
    {
        employeeDAO = new EmployeeDAO();
        
    }
    
      
    public  String AddEmployee( Employee employee)
    {
        connection = ConnectionDB.getConnection();
        
        try
        {
            message = employeeDAO.AddEmployee(connection, employee);
            //connection.rollback();
        }
        catch (Exception e)
        {
            message = message + " " + e.getMessage();
        }
        finally
        {
             try
            {
                if (connection != null)
                {
                    connection.close();
                }
            }
            catch (Exception e)
            {
                message = message + "  " + e.getMessage();
            }
        }
               
        return message;
    }
    
     public  String EditEmployee( Employee employee)
    {
        connection = ConnectionDB.getConnection();
        
        try
        {
            message = employeeDAO.EditEmployee(connection, employee);
            //connection.rollback();
        }
        catch (Exception e)
        {
            message = message + " " + e.getMessage();
        }
        finally
        {
             try
            {
                if (connection != null)
                {
                    connection.close();
                }
            }
            catch (Exception e)
            {
                message = message + "  " + e.getMessage();
            }
        }
               
        return message;
    }
     
      public  String DeleteEmployee( int id)
    {
        connection = ConnectionDB.getConnection();
        
        try
        {
            message = employeeDAO.DeleteEmployee(connection, id);
            //connection.rollback();
        }
        catch (Exception e)
        {
            message = message + " " + e.getMessage();
        }
        finally
        {
             try
            {
                if (connection != null)
                {
                    connection.close();
                }
            }
            catch (Exception e)
            {
                message = message + "  " + e.getMessage();
            }
        }
               
        return message;
    }
      
       public  void EmployeeList(JTable table)
    {
        connection = ConnectionDB.getConnection();
        employeeDAO.EmployeeList(connection, table);
               
       try
      {
            
        connection.close();
       }
       catch (SQLException ex)
       {
           System.out.println("Error: " + ex.getMessage());
       }
    }
    
}
