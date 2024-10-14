package com.employee.uk.view;

import com.employee.uk.bo.EmployeeBO;
import com.employee.uk.dao.EmployeeDAO;
import com.employee.uk.entity.Employee;
import javax.swing.JOptionPane;

/**
 *
 * @author Emilio
 */
public class FrmEmployee extends javax.swing.JFrame
{
    
    private EmployeeBO employeeBO;
    private Employee employee;
    
    public FrmEmployee()
    {
        initComponents();
        employeeBO = new EmployeeBO();
        employee = new Employee();
        
        ListEmployee();
        idMax();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        groupMaritalStatus = new javax.swing.ButtonGroup();
        groupGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        Name1 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        Name2 = new javax.swing.JLabel();
        txtDocumentNumber = new javax.swing.JTextField();
        Name3 = new javax.swing.JLabel();
        Name4 = new javax.swing.JLabel();
        Name5 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        RbMarried = new javax.swing.JRadioButton();
        RBSingle = new javax.swing.JRadioButton();
        RbMale = new javax.swing.JRadioButton();
        RbFemale = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 51, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 280, -1));

        jLabel2.setBackground(new java.awt.Color(204, 51, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("EMPLOYEE FORM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, -1, -1));

        Name.setBackground(new java.awt.Color(204, 51, 0));
        Name.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 51, 0));
        Name.setText("Name:");
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        txtName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 280, -1));

        Name1.setBackground(new java.awt.Color(204, 51, 0));
        Name1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Name1.setForeground(new java.awt.Color(255, 51, 0));
        Name1.setText("Last Name:");
        jPanel1.add(Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        txtLastName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 280, -1));

        Name2.setBackground(new java.awt.Color(204, 51, 0));
        Name2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Name2.setForeground(new java.awt.Color(255, 51, 0));
        Name2.setText("Document Number:");
        jPanel1.add(Name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        txtDocumentNumber.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txtDocumentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 280, -1));

        Name3.setBackground(new java.awt.Color(204, 51, 0));
        Name3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Name3.setForeground(new java.awt.Color(255, 51, 0));
        Name3.setText("Marital Status:");
        jPanel1.add(Name3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        Name4.setBackground(new java.awt.Color(204, 51, 0));
        Name4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Name4.setForeground(new java.awt.Color(255, 51, 0));
        Name4.setText("Gender:");
        jPanel1.add(Name4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        Name5.setBackground(new java.awt.Color(204, 51, 0));
        Name5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Name5.setForeground(new java.awt.Color(255, 51, 0));
        Name5.setText("Age:");
        jPanel1.add(Name5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        txtAge.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jPanel1.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 280, -1));

        groupMaritalStatus.add(RbMarried);
        RbMarried.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RbMarried.setForeground(new java.awt.Color(255, 51, 0));
        RbMarried.setText("Married");
        jPanel1.add(RbMarried, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        groupMaritalStatus.add(RBSingle);
        RBSingle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RBSingle.setForeground(new java.awt.Color(255, 51, 0));
        RBSingle.setText("Single");
        jPanel1.add(RBSingle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        groupGender.add(RbMale);
        RbMale.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RbMale.setForeground(new java.awt.Color(255, 51, 0));
        RbMale.setText("Male");
        jPanel1.add(RbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        groupGender.add(RbFemale);
        RbFemale.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RbFemale.setForeground(new java.awt.Color(255, 51, 0));
        RbFemale.setText("Female");
        jPanel1.add(RbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {},
                {},
                {},
                {}
            },
            new String []
            {

            }
        ));
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tblEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployee);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 560, 360));

        btnExit.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 51, 0));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, 180, -1));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 51, 0));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 180, -1));

        btnEdit.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 51, 0));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 180, -1));

        btnDelete.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 51, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 180, -1));

        btnClean.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnClean.setForeground(new java.awt.Color(255, 51, 0));
        btnClean.setText("Clean");
        btnClean.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCleanActionPerformed(evt);
            }
        });
        jPanel1.add(btnClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, 180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void ListEmployee()
    {
        employeeBO.EmployeeList(tblEmployee);
    }
    
    public void idMax()
    {
        txtId.setText(employeeBO.getMaxID() + "");
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnExitActionPerformed
    {//GEN-HEADEREND:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAddActionPerformed
    {//GEN-HEADEREND:event_btnAddActionPerformed
        
        if (txtName.getText().isBlank())
        {
            JOptionPane.showMessageDialog(null, "Please Enter the Name.");
            return;
        }
        
        if (txtLastName.getText().isBlank())
        {
            JOptionPane.showMessageDialog(null, "Please Enter the Last Name.");
            return;
        }
        
        if (txtDocumentNumber.getText().isBlank())
        {
            JOptionPane.showMessageDialog(null, "Please Enter the Document Number.");
            return;
        }
        if (txtAge.getText().isBlank())
        {
            JOptionPane.showMessageDialog(null, "Please Enter the Age.");
            return;
        }
        
        char maritalStatus;
        char gender;
        
        if (RbMarried.isSelected())
        {
            maritalStatus = 'M';
        }
        else
        {
            maritalStatus = 'S';
        }
        
        if (RbMale.isSelected())
        {
            gender = 'M';
        }
        else
        {
            gender = 'F';
        }
        
        employee.setEmployee_Id(Integer.parseInt(txtId.getText()));
        employee.setName(txtName.getText());
        employee.setLast_Name(txtLastName.getText());
        employee.setDocument_Number(txtDocumentNumber.getText());
        employee.setMarital_Status(maritalStatus);
        employee.setGender(gender);
        employee.setAge(Integer.parseInt(txtAge.getText()));
        
        String message = employeeBO.AddEmployee(employee);
        JOptionPane.showMessageDialog(null, message);
        
        Clean();
        ListEmployee();

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEditActionPerformed
    {//GEN-HEADEREND:event_btnEditActionPerformed
        if (txtId.getText().isBlank())
        {
            JOptionPane.showMessageDialog(null, "Please Enter the Employee Id.");
            return;
        }
        
        if (txtName.getText().isBlank())
        {
            JOptionPane.showMessageDialog(null, "Please Enter the Name.");
            return;
        }
        
        if (txtLastName.getText().isBlank())
        {
            JOptionPane.showMessageDialog(null, "Please Enter the Last Name.");
            return;
        }
        
        if (txtDocumentNumber.getText().isBlank())
        {
            JOptionPane.showMessageDialog(null, "Please Enter the Document Number.");
            return;
        }
        if (txtAge.getText().isBlank())
        {
            JOptionPane.showMessageDialog(null, "Please Enter the Age.");
            return;
        }
        
        char maritalStatus;
        char gender;
        
        if (RbMarried.isSelected())
        {
            maritalStatus = 'M';
        }
        else
        {
            maritalStatus = 'S';
        }
        
        if (RbMale.isSelected())
        {
            gender = 'M';
        }
        else
        {
            gender = 'F';
        }
        
        employee.setEmployee_Id(Integer.parseInt(txtId.getText()));
        employee.setName(txtName.getText());
        employee.setLast_Name(txtLastName.getText());
        employee.setDocument_Number(txtDocumentNumber.getText());
        employee.setMarital_Status(maritalStatus);
        employee.setGender(gender);
        employee.setAge(Integer.parseInt(txtAge.getText()));
        
        String message = employeeBO.EditEmployee(employee);
        JOptionPane.showMessageDialog(null, message);
        
        Clean();
        ListEmployee();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeleteActionPerformed
    {//GEN-HEADEREND:event_btnDeleteActionPerformed
        if (txtId.getText().isBlank())
        {
            JOptionPane.showMessageDialog(null, "Please Enter the Employee Id.");
            return;
        }
        
         if (txtName.getText().isBlank())
        {
            JOptionPane.showMessageDialog(null, "Please Enter the Name.");
            return;
        }
        
        if (txtLastName.getText().isBlank())
        {
            JOptionPane.showMessageDialog(null, "Please Enter the Last Name.");
            return;
        }
        
        if (txtDocumentNumber.getText().isBlank())
        {
            JOptionPane.showMessageDialog(null, "Please Enter the Document Number.");
            return;
        }
        if (txtAge.getText().isBlank())
        {
            JOptionPane.showMessageDialog(null, "Please Enter the Age.");
            return;
        }
        
        char maritalStatus;
        char gender;
        
        if (RbMarried.isSelected())
        {
            maritalStatus = 'M';
        }
        else
        {
            maritalStatus = 'S';
        }
        
        if (RbMale.isSelected())
        {
            gender = 'M';
        }
        else
        {
            gender = 'F';
        }
        
        String message = employeeBO.DeleteEmployee(Integer.parseInt(txtId.getText()));
        JOptionPane.showMessageDialog(null, message);
        
        Clean();
        ListEmployee();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCleanActionPerformed
    {//GEN-HEADEREND:event_btnCleanActionPerformed
        
        Clean();
    }//GEN-LAST:event_btnCleanActionPerformed

    private void tblEmployeeMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblEmployeeMouseClicked
    {//GEN-HEADEREND:event_tblEmployeeMouseClicked
        int select = tblEmployee.rowAtPoint(evt.getPoint());
        
        txtId.setText(tblEmployee.getValueAt(select, 0) + "");
        txtName.setText(tblEmployee.getValueAt(select, 1) + "");
        txtLastName.setText(tblEmployee.getValueAt(select, 2) + "");
        txtDocumentNumber.setText(tblEmployee.getValueAt(select, 3) + "");
        String maritalStatus = tblEmployee.getValueAt(select, 4) + "";
        if (maritalStatus.equals("S"))
        {
            RBSingle.setSelected(true);
        }
        else
        {
            RbMarried.setSelected(true);
        }
        
        String gender = tblEmployee.getValueAt(select, 5) + "";
        if (gender.equals("M"))
        {
            RbMale.setSelected(true);
        }
        else
        {
            RbFemale.setSelected(true);
        }
        txtAge.setText(tblEmployee.getValueAt(select, 6) + "");
    }//GEN-LAST:event_tblEmployeeMouseClicked
    
    private void Clean()
    {
        txtId.setText("");
        txtName.setText("");
        txtLastName.setText("");
        txtDocumentNumber.setText("");
        txtAge.setText("");
        RbMarried.setSelected(false);
        RBSingle.setSelected(false);
        RbMale.setSelected(false);
        RbFemale.setSelected(false);
        groupGender.clearSelection();
        groupMaritalStatus.clearSelection();
        idMax();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Windows".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(FrmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FrmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FrmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FrmEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                
                new FrmEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel Name2;
    private javax.swing.JLabel Name3;
    private javax.swing.JLabel Name4;
    private javax.swing.JLabel Name5;
    private javax.swing.JRadioButton RBSingle;
    private javax.swing.JRadioButton RbFemale;
    private javax.swing.JRadioButton RbMale;
    private javax.swing.JRadioButton RbMarried;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup groupGender;
    private javax.swing.ButtonGroup groupMaritalStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDocumentNumber;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

}
