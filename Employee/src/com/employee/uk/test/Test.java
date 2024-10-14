package com.employee.uk.test;

import com.employee.uk.bo.EmployeeBO;
import com.employee.uk.entity.Employee;

/**
 *
 * @author Emilio
 */

public class Test
{
   
    EmployeeBO employeeBO = new EmployeeBO();
   Employee employee = new Employee();
   String message = "";
    
  public  void Insert()
  {
//      employee.setName("Emilio");
//     employee.setLast_Name("Barrera");
//     employee.setDocument_Number("55555");
//     employee.setMarital_Status('S');
//     employee.setGender('M');
//     employee.setAge(50);
      
       employee.setName("Deal");
     employee.setLast_Name("Pool");
     employee.setDocument_Number("1234578");
     employee.setMarital_Status('M');
     employee.setGender('F');
     employee.setAge(55);
     
     message = employeeBO.AddEmployee(employee);
      System.out.println(message);
     
     
  }
  
    public static void main(String[] args)
    {
        Test test = new Test();
        test.Insert();
    }
 
   
   
}
