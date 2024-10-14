package com.employee.uk.bo;

import com.employee.uk.dao.EmployeeDAO;
import com.employee.uk.entity.Employee;
import java.sql.Connection;

/**
 *
 * @author Emilio
 */
public class EmployeeBO
{
    private String message =  "";
    
    private EmployeeDAO employeeDAO;

    public EmployeeBO()
    {
        employeeDAO = new EmployeeDAO();
    }
    
    
    
    public  String AddEmployee( Employee employee)
    {
        try
        {
            
        }
        catch (Exception e)
        {
            message = message + " " + e.getMessage();
        }
               
        return message;
    }
    
     public  String EditEmployee( Employee employee)
    {
        
        
        return message;
    }
     
      public  String DeleteEmployee( int id)
    {
        
        
        return message;
    }
      
       public  void EmployeeList()
    {
        
        
        
    }
    
}
