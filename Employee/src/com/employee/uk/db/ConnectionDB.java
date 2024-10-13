package com.employee.uk.db;

import  java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Emilio
 */
public class ConnectionDB
{
        private static Connection connection = null;
        private static String user  = "c##Emilio_Barrera";
        private static String password = "eabs";
        private static String url = "jdbc:oracle:thin:@localhost:1521:free";
    
         public static Connection getConnection()
         {
             try
             {
                 Class.forName("oracle.jdbc.driver.OracleDriver");
                 connection = DriverManager.getConnection(url, user, password);
                 connection.setAutoCommit(false);
                 
                 if (connection != null)
                 {
                     System.out.println("Successful Connection.");
                 }
                 else
                 {
                     System.out.println("Connection Error.");
                 }
             }
             catch (ClassNotFoundException | SQLException e)
             {
                 JOptionPane.showMessageDialog(null,  "Connection Error: "  + e.getMessage() );
             }
             
             return connection;
         }
         
         public  void  Disconnection()
         {
             try
             {
                 connection.close();
             }
             catch (Exception e)
             {
                 System.out.println("Error When Disconnecting: " + e.getMessage() );
             }
         }
         
         public static void main(String[] args)
    {
        ConnectionDB connectionDB = new ConnectionDB();
        connectionDB. getConnection();
        
    }
    
}
