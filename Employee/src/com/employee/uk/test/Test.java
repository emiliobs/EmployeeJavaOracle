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
      
       employee.setName("Delete me");
     employee.setLast_Name("delete me");
     employee.setDocument_Number("00000");
     employee.setMarital_Status('M');
     employee.setGender('F');
     employee.setAge(00);
     
     message = employeeBO.AddEmployee(employee);
      System.out.println(message);    
     
  }
  
  public  void  Edit()
  {
      employee.setEmployee_Id(2);
      employee.setName("Deal Antonio");
     employee.setLast_Name("Pool Barrera");
     employee.setDocument_Number("123457");
     employee.setMarital_Status('M');
     employee.setGender('F');
     employee.setAge(55);
     
     message = employeeBO.EditEmployee(employee);
      System.out.println(message);    
  }
  
  public  void Delete()
  {
                 
     message = employeeBO.DeleteEmployee(4);
      System.out.println(message);    
  }
  
    public static void main(String[] args)
    {
        Test test = new Test();
       //test.Insert();
       //test.Edit();
       test.Delete();
    }
 
   
   
}
