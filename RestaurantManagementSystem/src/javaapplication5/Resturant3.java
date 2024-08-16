package javaapplication5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Khalifa
 */
public class Resturant3 extends javax.swing.JFrame {
        Date currentDate = new Date();
    int teaNum, waterNum, coffNum, colaNum, spiroNum;
    double teaprice, waterprice, coffprice, colaprice, spiroprice;
    final double tea_COST = 7.0, coff_COST = 10.0, water_COST = 5.0, cola_COST = 15.0, spiro_COST = 10.0;
    double total1;
    int billnum1;
    PrintWriter output;
    Connection con;
    public Resturant3() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resturant", "root", "Kb.181276");
        } catch (SQLException ex) {
            Logger.getLogger(Resturant3.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Conection Failed");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tea = new javax.swing.JSpinner();
        coff = new javax.swing.JSpinner();
        water = new javax.swing.JSpinner();
        cola = new javax.swing.JSpinner();
        spiro = new javax.swing.JSpinner();
        teapricelab = new javax.swing.JLabel();
        coffpricelab = new javax.swing.JLabel();
        waterpricelab = new javax.swing.JLabel();
        colapricelab = new javax.swing.JLabel();
        spiropricelab = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        totallab2 = new javax.swing.JLabel();
        billnumlab2 = new javax.swing.JLabel();
        exit1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        calclabel2 = new javax.swing.JButton();
        newlabel1 = new javax.swing.JButton();
        savelabel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RESTURANT");
        setLocation(new java.awt.Point(600, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("المشروبات");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("شاى");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("قهوه");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("مياه");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("كولا توب");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("سبيرو سباتس");

        tea.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        tea.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                teaStateChanged(evt);
            }
        });

        coff.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        coff.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                coffStateChanged(evt);
            }
        });

        water.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        water.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                waterStateChanged(evt);
            }
        });

        cola.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        cola.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                colaStateChanged(evt);
            }
        });

        spiro.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        spiro.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spiroStateChanged(evt);
            }
        });

        teapricelab.setText("0.0 جنيه");

        coffpricelab.setText("0.0 جنيه");

        waterpricelab.setText("0.0 جنيه");

        colapricelab.setText("0.0 جنيه");

        spiropricelab.setText("0.0 جنيه");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(colapricelab, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spiropricelab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(waterpricelab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(coffpricelab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teapricelab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(spiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(water, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(coff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(tea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teapricelab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(coff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coffpricelab))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(water, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(waterpricelab))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colapricelab))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(spiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spiropricelab))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        totallab2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totallab2.setText("المجموع : 0.0 جنيه");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(totallab2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totallab2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        billnumlab2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        billnumlab2.setText("رقم الفاتوره : 0");

        exit1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        exit1.setText("Exit");
        exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit1ActionPerformed(evt);
            }
        });

        calclabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        calclabel2.setText("الحساب");
        calclabel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calclabel2ActionPerformed(evt);
            }
        });

        newlabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        newlabel1.setText("فاتوره جديده");
        newlabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newlabel1ActionPerformed(evt);
            }
        });

        savelabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        savelabel.setText("حفظ الفاتورة");
        savelabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savelabelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(newlabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(savelabel)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calclabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(calclabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newlabel1)
                    .addComponent(savelabel))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(exit1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(billnumlab2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(exit1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(billnumlab2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calclabel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calclabel2ActionPerformed

        total1 = waterprice + coffprice + colaprice + teaprice + spiroprice;

        total1 = total1;
        totallab2.setText("المجموع " + total1 + "جنيه");

// TODO add your handling code here:
    }//GEN-LAST:event_calclabel2ActionPerformed

    private void exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit1ActionPerformed
        System.exit(1);

        // TODO add your handling code here:
    }//GEN-LAST:event_exit1ActionPerformed

    private void teaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_teaStateChanged

        teaNum = (Integer) tea.getValue();

        teaprice = tea_COST * teaNum;
        teapricelab.setText(teaprice + "جنيه");

// TODO add your handling code here:
    }//GEN-LAST:event_teaStateChanged

    private void coffStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_coffStateChanged

        coffNum = (Integer) coff.getValue();

        coffprice = coff_COST * coffNum;
        coffpricelab.setText(coffprice + "جنيه");

        // TODO add your handling code here:
    }//GEN-LAST:event_coffStateChanged

    private void waterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_waterStateChanged
        waterNum = (Integer) water.getValue();

        waterprice = water_COST * waterNum;
        waterpricelab.setText(waterprice + "جنيه");

        // TODO add your handling code here:
    }//GEN-LAST:event_waterStateChanged

    private void colaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_colaStateChanged
        colaNum = (Integer) cola.getValue();

        colaprice = cola_COST * colaNum;
        colapricelab.setText(colaprice + "جنيه");

        // TODO add your handling code here:
    }//GEN-LAST:event_colaStateChanged

    private void spiroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spiroStateChanged
        spiroNum = (Integer) spiro.getValue();

        spiroprice = spiro_COST * spiroNum;
        spiropricelab.setText(spiroprice + "جنيه");

        // TODO add your handling code here:
    }//GEN-LAST:event_spiroStateChanged

    private void newlabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newlabel1ActionPerformed
        if (total1 != 0) {
            tea.setValue(0);
            water.setValue(0);
            coff.setValue(0);
            spiro.setValue(0);
            cola.setValue(0);

            totallab2.setText("المجموع : 0.0 جنيه");

            total1 = 0;

            billnum1++;
            billnumlab2.setText("رقم الفاتورة :" + billnum1);

        }

// TODO add your handling code here:
    }//GEN-LAST:event_newlabel1ActionPerformed

    private void savelabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savelabelActionPerformed
            
        if (total1 != 0) {         
            try {
                PreparedStatement stmt=con.prepareStatement("insert into money(money.data,money.money) values(?,?)");
                stmt.setString(1,String.valueOf(currentDate));
                stmt.setDouble(2, total1);
                stmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Resturant3.class.getName()).log(Level.SEVERE, null, ex);
            }
                                  
            
            try {
                output = new PrintWriter("billno." + billnum1 + ".txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Resturant2.class.getName()).log(Level.SEVERE, null, ex);
            }
            output.println(billnum1 + " رقم الفاتورة");
            output.println("================");

            if (teaNum != 0) {
                output.println(teaNum + " شاى");

                output.println(teaprice + "جنيه");

            }
            if (coffNum != 0) {
                output.println(coffNum + " قهوة");

                output.println(coffprice + "جنيه");

            }
            if (waterNum != 0) {
                output.println(waterNum + " مياه");

                output.println(waterprice + "جنيه");

            }
            if (colaNum != 0) {
                output.println(colaNum + " كولاتوب");

                output.println(colaprice + "جنيه");

            }
            if (spiroNum != 0) {
                output.println(spiroNum + " سبيرو سباتس");

                output.println(spiroprice + "جنيه");
            }
            output.println("--------");
            output.println("المجموع :" + total1 + "جنيه");

            output.println();
            output.println("شكرا لطلبك");

            output.close();
        }

// TODO add your handling code here:
    }//GEN-LAST:event_savelabelActionPerformed

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
            //teail.logging.Logger.getLogger(Resturant3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resturant3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resturant3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resturant3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resturant3().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel billnumlab2;
    private javax.swing.JButton calclabel2;
    private javax.swing.JSpinner coff;
    private javax.swing.JLabel coffpricelab;
    private javax.swing.JSpinner cola;
    private javax.swing.JLabel colapricelab;
    private javax.swing.JButton exit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton newlabel1;
    private javax.swing.JButton savelabel;
    private javax.swing.JSpinner spiro;
    private javax.swing.JLabel spiropricelab;
    private javax.swing.JSpinner tea;
    private javax.swing.JLabel teapricelab;
    private javax.swing.JLabel totallab2;
    private javax.swing.JSpinner water;
    private javax.swing.JLabel waterpricelab;
    // End of variables declaration//GEN-END:variables

}
