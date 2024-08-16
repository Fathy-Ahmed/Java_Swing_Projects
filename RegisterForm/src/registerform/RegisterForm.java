/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registerform;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fathy
 */
public class RegisterForm extends javax.swing.JFrame {

    DefaultTableModel dtm;

    Connection con;

    ArrayList<Integer> deptIds = new ArrayList<>();
    ArrayList<Integer> empIds = new ArrayList<>();

    public RegisterForm() {
        initComponents();
        this.setLocationRelativeTo(null);

        dtm = new DefaultTableModel();
        dtm.addColumn("Employee Name");
        dtm.addColumn("Employee Age");
        dtm.addColumn("Employee Gender");
        dtm.addColumn("Department Name");
        //       Conection DB
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "Kb.181276");
        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Conection Failed");
        }

        fillComboCox();
        fillTableModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btng1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edt_age = new javax.swing.JTextField();
        edt_name = new javax.swing.JTextField();
        rbtn_male = new javax.swing.JRadioButton();
        rbtn_female = new javax.swing.JRadioButton();
        cbx_dept_name = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_show = new javax.swing.JTable();
        btn_add = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Employee Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Employee Aga:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Employee Gender:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Department Name:");

        edt_age.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        edt_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edt_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        rbtn_male.setBackground(new java.awt.Color(255, 255, 255));
        btng1.add(rbtn_male);
        rbtn_male.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtn_male.setText("Male");

        rbtn_female.setBackground(new java.awt.Color(255, 255, 255));
        btng1.add(rbtn_female);
        rbtn_female.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtn_female.setText("Female");

        cbx_dept_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbl_show.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_show.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbl_show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_showMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_show);

        btn_add.setBackground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registerform/Untitled.jpeg"))); // NOI18N

        btn_edit.setBackground(new java.awt.Color(255, 255, 255));
        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_next.setBackground(new java.awt.Color(255, 255, 255));
        btn_next.setText("Next");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(edt_age)
                                .addComponent(edt_name)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(rbtn_male)
                                    .addGap(56, 56, 56)
                                    .addComponent(rbtn_female))
                                .addComponent(cbx_dept_name, 0, 352, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edt_age, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtn_male)
                    .addComponent(rbtn_female))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_dept_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_edit))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fillComboCox() {
        try {
            PreparedStatement stmt = con.prepareStatement("select dept_id , dept_name from department;");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                deptIds.add(rs.getInt(1));
                cbx_dept_name.addItem(rs.getString(2));
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void fillTableModel() {
        try {
            dtm.setRowCount(0);

            PreparedStatement stmt = con.prepareStatement("select employee.emp_id , employee.emp_name , employee.emp_salary , employee.gender , department.dept_name from employee,department where employee.dept_id = department.dept_id");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                empIds.add(rs.getInt(1));
                dtm.addRow(new Object[]{rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5)});

            }
            tbl_show.setModel(dtm);

        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        if (!edt_name.getText().isEmpty() && !edt_age.getText().isEmpty()) {
            try {
                String empName = edt_name.getText();
                int empAge = Integer.parseInt(edt_age.getText());
                String gender;
                if (rbtn_male.isSelected()) {
                    gender = "Male";
                } else {
                    gender = "Female";
                }

                PreparedStatement stmt = con.prepareStatement("insert into employee (emp_name,emp_salary,gender,dept_id) values (?,?,?,?)");

                stmt.setString(1, empName);
                stmt.setInt(2, empAge);
                stmt.setString(3, gender);
                stmt.setInt(4, deptIds.get(cbx_dept_name.getSelectedIndex()));
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Add successfully");
                fillTableModel();

                String deptname = cbx_dept_name.getSelectedItem().toString();
            } catch (SQLException ex) {
                Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        if (!edt_name.getText().isEmpty() && !edt_age.getText().isEmpty()) {
            try {
                String empName = edt_name.getText();
                int empAge = Integer.parseInt(edt_age.getText());
                String gender;
                if (rbtn_male.isSelected()) {
                    gender = "Male";
                } else {
                    gender = "Female";
                }

                PreparedStatement stmt = con.prepareStatement("update employee set emp_name=?,emp_salary=?,gender=?,dept_id=? where emp_id=?");

                stmt.setString(1, empName);
                stmt.setInt(2, empAge);
                stmt.setString(3, gender);
                stmt.setInt(4, deptIds.get(cbx_dept_name.getSelectedIndex()));
                stmt.setInt(5, empIds.get(tbl_show.getSelectedRow()));
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Edite successfully");
                fillTableModel();

                String deptname = cbx_dept_name.getSelectedItem().toString();
            } catch (SQLException ex) {
                Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_btn_editActionPerformed

    private void tbl_showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_showMouseClicked

        edt_name.setText(tbl_show.getValueAt(tbl_show.getSelectedRow(), 0).toString());
        edt_age.setText(tbl_show.getValueAt(tbl_show.getSelectedRow(), 1).toString());
        if (tbl_show.getValueAt(tbl_show.getSelectedRow(), 2) != null) {
            if (tbl_show.getValueAt(tbl_show.getSelectedRow(), 2).toString().equals("Female")) {
                rbtn_female.setSelected(true);
            } else {
                rbtn_male.setSelected(true);
            }
        }

        cbx_dept_name.setSelectedItem(tbl_show.getValueAt(tbl_show.getSelectedRow(), 3));
    }//GEN-LAST:event_tbl_showMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

        try {
            PreparedStatement stmt = con.prepareStatement("delete from employee where emp_id=?");

            stmt.setInt(1, empIds.get(tbl_show.getSelectedRow()));

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Deleted successfully");
            
            fillTableModel();
            edt_name.setText("");
            edt_age.setText("");
            btng1.clearSelection();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        
        this.dispose();
        new NextFrame().setVisible(true);
    }//GEN-LAST:event_btn_nextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_next;
    private javax.swing.ButtonGroup btng1;
    private javax.swing.JComboBox<String> cbx_dept_name;
    private javax.swing.JTextField edt_age;
    private javax.swing.JTextField edt_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtn_female;
    private javax.swing.JRadioButton rbtn_male;
    private javax.swing.JTable tbl_show;
    // End of variables declaration//GEN-END:variables
}
