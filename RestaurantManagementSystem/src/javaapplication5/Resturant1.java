package javaapplication5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.util.Date;

/**
 *
 * @author Khalifa
 */
public class Resturant1 extends javax.swing.JFrame {

    Date currentDate = new Date();
    double chicken1price, meete1price, kabab1price, kofta1price, chicken2price, meete2price, kabab2price, kofta2price, chicken3price, meete3price, kabab3price, kofta3price;

    double vat3, total3;
    int billnum3;
    PrintWriter output;

    Connection con;

    public Resturant1() {
        initComponents();
        this.setLocationRelativeTo(null);

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/resturant", "root", "Kb.181276");
        } catch (SQLException ex) {
            Logger.getLogger(Resturant1.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Conection Failed");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        kabab = new javax.swing.JLabel();
        kofta = new javax.swing.JLabel();
        chicken = new javax.swing.JLabel();
        meete = new javax.swing.JLabel();
        kabab2 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        kabab3 = new javax.swing.JCheckBox();
        kofta2 = new javax.swing.JCheckBox();
        kofta1 = new javax.swing.JCheckBox();
        chicken1 = new javax.swing.JCheckBox();
        kabab1 = new javax.swing.JCheckBox();
        kofta3 = new javax.swing.JCheckBox();
        chicken2 = new javax.swing.JCheckBox();
        chicken3 = new javax.swing.JCheckBox();
        meete1 = new javax.swing.JCheckBox();
        meete2 = new javax.swing.JCheckBox();
        meete3 = new javax.swing.JCheckBox();
        koftapricelab = new javax.swing.JLabel();
        kababpricelab = new javax.swing.JLabel();
        chickenpricelab = new javax.swing.JLabel();
        meetepricelab = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        vatlab2 = new javax.swing.JLabel();
        totallab3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        calclab3 = new javax.swing.JButton();
        newbill3 = new javax.swing.JButton();
        savebill3 = new javax.swing.JButton();
        billnum4 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RESTURANT");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("المشويات");

        kabab.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kabab.setText("كباب");

        kofta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        kofta.setText("كفته");

        chicken.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chicken.setText("فراخ");

        meete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        meete.setText("لحم");

        kabab2.setText("jCheckBox1");
        kabab2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kabab2ActionPerformed(evt);
            }
        });

        jLabel9.setText("1/4 k");

        jLabel10.setText("1/2 k");

        jLabel11.setText("1k");

        kabab3.setText("jCheckBox2");
        kabab3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kabab3ActionPerformed(evt);
            }
        });

        kofta2.setText("jCheckBox3");
        kofta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kofta2ActionPerformed(evt);
            }
        });

        kofta1.setText("jCheckBox4");
        kofta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kofta1ActionPerformed(evt);
            }
        });

        chicken1.setText("jCheckBox5");
        chicken1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chicken1ActionPerformed(evt);
            }
        });

        kabab1.setText("jCheckBox6");
        kabab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kabab1ActionPerformed(evt);
            }
        });

        kofta3.setText("jCheckBox7");
        kofta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kofta3ActionPerformed(evt);
            }
        });

        chicken2.setText("jCheckBox8");
        chicken2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chicken2ActionPerformed(evt);
            }
        });

        chicken3.setText("jCheckBox9");
        chicken3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chicken3ActionPerformed(evt);
            }
        });

        meete1.setText("jCheckBox10");
        meete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meete1ActionPerformed(evt);
            }
        });

        meete2.setText("jCheckBox11");
        meete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meete2ActionPerformed(evt);
            }
        });

        meete3.setText("jCheckBox12");
        meete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meete3ActionPerformed(evt);
            }
        });

        koftapricelab.setText("0.0 جنيه ");

        kababpricelab.setText("0.0 جنيه ");

        chickenpricelab.setText("0.0 جنيه ");

        meetepricelab.setText("0.0 جنيه ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(koftapricelab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chickenpricelab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meetepricelab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kababpricelab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(meete3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(meete2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kabab3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kofta3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chicken3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chicken2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(kofta2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(kabab2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(38, 38, 38)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kabab1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chicken1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kofta1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(1, 1, 1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(meete1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kofta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chicken, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kabab, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meete, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kabab)
                    .addComponent(kabab2)
                    .addComponent(kabab3)
                    .addComponent(kabab1)
                    .addComponent(kababpricelab))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kofta)
                    .addComponent(kofta1)
                    .addComponent(kofta3)
                    .addComponent(kofta2)
                    .addComponent(koftapricelab))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chicken)
                    .addComponent(chicken1)
                    .addComponent(chicken2)
                    .addComponent(chicken3)
                    .addComponent(chickenpricelab))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meete)
                    .addComponent(meete1)
                    .addComponent(meete2)
                    .addComponent(meete3)
                    .addComponent(meetepricelab))
                .addGap(57, 57, 57))
        );

        vatlab2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vatlab2.setText("الضريبة : 0.0 جنيه");

        totallab3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totallab3.setText("المجموع : 0.0 جنيه ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totallab3)
                    .addComponent(vatlab2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vatlab2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(totallab3)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        calclab3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        calclab3.setText("حساب");
        calclab3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calclab3ActionPerformed(evt);
            }
        });

        newbill3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        newbill3.setText("فاتوره جديده");
        newbill3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newbill3ActionPerformed(evt);
            }
        });

        savebill3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        savebill3.setText("حفظ الفاتورة");
        savebill3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebill3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(newbill3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(savebill3)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calclab3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(calclab3)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savebill3)
                    .addComponent(newbill3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        billnum4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        billnum4.setText("رقم الفاتورة : 0 ");

        exit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(billnum4)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(billnum4)))
                    .addComponent(exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed

        System.exit(0);
// TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void kabab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kabab1ActionPerformed

        if (kabab1.isSelected()) {

            kabab1price += 80;

        } else {
            kabab1price -= 80;

        }
        kababpricelab.setText(kabab1price + "جنيه");

        // TODO add your handling code here:
    }//GEN-LAST:event_kabab1ActionPerformed

    private void kabab2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kabab2ActionPerformed

        if (kabab2.isSelected()) {

            kabab2price = 130;
        } else {
            kabab2price -= 130;
        }
        kababpricelab.setText(kabab2price + "جنيه");

// TODO add your handling code here:
    }//GEN-LAST:event_kabab2ActionPerformed

    private void kabab3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kabab3ActionPerformed
        // TODO add your handling code here:

        if (kabab3.isSelected()) {
            kabab3price = 200;
        } else {
            kabab3price -= 200;
        }
        kababpricelab.setText(kabab3price + "جنيه");

    }//GEN-LAST:event_kabab3ActionPerformed

    private void kofta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kofta1ActionPerformed
        if (kofta1.isSelected()) {
            kofta1price = 60;
        } else {
            kofta1price -= 60;
        }
        koftapricelab.setText(kofta1price + "جنيه");

// TODO add your handling code here:
    }//GEN-LAST:event_kofta1ActionPerformed

    private void kofta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kofta2ActionPerformed

        if (kofta2.isSelected()) {
            kofta2price = 100;
        } else {
            kofta2price -= 100;
        }
        koftapricelab.setText(kofta2price + "جنيه");
// TODO add your handling code here:
    }//GEN-LAST:event_kofta2ActionPerformed

    private void kofta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kofta3ActionPerformed
        // TODO add your handling code here:

        if (kofta3.isSelected()) {
            kofta3price = 150;
        } else {
            kofta3price -= 150;
        }
        koftapricelab.setText(kofta3price + "جنيه");
    }//GEN-LAST:event_kofta3ActionPerformed

    private void chicken1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chicken1ActionPerformed
        // TODO add your handling code here:

        if (chicken1.isSelected()) {
            chicken1price = 60;
        } else {
            chicken1price -= 60;
        }
        chickenpricelab.setText(chicken1price + "جنيه");
    }//GEN-LAST:event_chicken1ActionPerformed

    private void chicken2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chicken2ActionPerformed
        if (chicken2.isSelected()) {
            chicken2price = 100;
        } else {
            chicken2price -= 100;
        }
        chickenpricelab.setText(chicken2price + "جنيه");

// TODO add your handling code here:
    }//GEN-LAST:event_chicken2ActionPerformed

    private void chicken3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chicken3ActionPerformed
        if (chicken3.isSelected()) {
            chicken3price = 150;
        } else {
            chicken3price -= 150;
        }
        chickenpricelab.setText(chicken3price + "جنيه");

// TODO add your handling code here:
    }//GEN-LAST:event_chicken3ActionPerformed

    private void meete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meete1ActionPerformed
        if (meete1.isSelected()) {
            meete1price = 70;
        } else {
            meete1price -= 70;
        }
        meetepricelab.setText(meete1price + "جنيه");

// TODO add your handling code here:
    }//GEN-LAST:event_meete1ActionPerformed

    private void meete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meete2ActionPerformed
        if (meete2.isSelected()) {
            meete2price = 120;
        } else {
            meete2price -= 120;
        }
        meetepricelab.setText(meete2price + "جنيه");

// TODO add your handling code here:
    }//GEN-LAST:event_meete2ActionPerformed

    private void meete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meete3ActionPerformed
        if (meete3.isSelected()) {
            meete3price = 170;
        } else {
            meete3price -= 170;
        }
        meetepricelab.setText(meete3price + "جنيه");

// TODO add your handling code here:
    }//GEN-LAST:event_meete3ActionPerformed

    private void calclab3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calclab3ActionPerformed

        total3 = meete1price + chicken2price + meete2price
                + chicken3price + meete3price + kofta1price + kofta2price
                + kofta3price + kabab1price + kabab2price + kabab3price + chicken1price;

        vat3 = total3 * .05;
        vat3 = vat3 * 100;
        vat3 = vat3 / 100;
        vat3 = (double) ((int) vat3);

        vatlab2.setText("الضريبه :" + vat3 + " جنيه");
        total3 = total3 + vat3;
        totallab3.setText("المجموع " + totallab3 + "جنيه");

// TODO add your handling code here:
    }//GEN-LAST:event_calclab3ActionPerformed

    private void savebill3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebill3ActionPerformed

        if (total3 != 0) {

            try {
                PreparedStatement stmt = con.prepareStatement("insert into money(money.data,money.money) values(?,?)");
                stmt.setString(1, String.valueOf(currentDate));
                stmt.setDouble(2, total3);
                stmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Resturant1.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                output = new PrintWriter("billno.500" + billnum3 + ".txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Resturant1.class.getName()).log(Level.SEVERE, null, ex);

            }
            output.println(billnum3 + " رقم الفاتورة");
            output.println("================");

            if (chicken1.isSelected()) {
                output.println(" ربع كيلو");

                output.println(chicken1price + "جنيه");

                if (chicken2.isSelected()) {
                    output.println(" نصف كيلو");

                    output.println(chicken2price + "جنيه");

                    if (chicken3.isSelected()) {
                        output.println(" كيلو");

                        output.println(chicken3price + "جنيه");

                        if (meete1.isSelected()) {
                            output.println(" ربع كيلو");

                        }

                        output.println(meete1price + "جنيه");

                        if (meete2.isSelected()) {
                            output.println(" نصف كيلو");

                        }

                        output.println(meete2price + "جنيه");

                        if (meete3.isSelected()) {
                            output.println(" كيلو");

                        }

                        output.println(meete3price + "جنيه");
                    }

                    if (kofta1.isSelected()) {
                        output.println(" ربع كيلو");

                    }

                    output.println(kofta1price + "جنيه");
                }
                if (kofta2.isSelected()) {
                    output.println(" نصف كيلو");

                }

                output.println(kofta2price + "جنيه");

                if (kofta3.isSelected()) {
                    output.println("كيلو");

                }

                output.println(kofta3price + "جنيه");

                if (kabab1.isSelected()) {
                    output.println("ربع كيلو ");

                }

                output.println(kabab1price + "جنيه");

                if (kabab2.isSelected()) {
                    output.println("نصف كيلو ");

                }

                output.println(kabab2price + "جنيه");
                if (kabab3.isSelected()) {
                    output.println(" كيلو");

                }

                output.println(kabab3price + "جنيه");

            }
            output.println("--------");
            output.println("المجموع :" + total3 + "جنيه");
            output.println("الضريبه :" + vat3 + "جنيه");
            output.println();
            output.println("شكرا لطلبك");

            output.close();

        }

// TODO add your handling code here:
    }//GEN-LAST:event_savebill3ActionPerformed

    private void newbill3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newbill3ActionPerformed

        if (total3 != 0) {
            chicken1.setSelected(false);
            kofta1.setSelected(false);
            kabab1.setSelected(false);
            meete1.setSelected(false);
            chicken2.setSelected(false);
            kofta2.setSelected(false);
            kabab2.setSelected(false);
            meete2.setSelected(false);
            chicken3.setSelected(false);
            kofta3.setSelected(false);
            kabab3.setSelected(false);
            meete3.setSelected(false);

            totallab3.setText("المجموع : 0.0 جنيه");
            vatlab2.setText("المجموع : 0.0 جنيه");

            total3 = 0;
            vat3 = 0;

            billnum3++;
            billnum4.setText("رقم الفاتورة :" + billnum3);

// TODO add your handling code here:
    }//GEN-LAST:event_newbill3ActionPerformed
    }

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
            java.util.logging.Logger.getLogger(Resturant1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resturant1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resturant1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            // java.util.logging.Logger.getLogger(Resturant1.ckabab1me()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resturant1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel billnum4;
    private javax.swing.JButton calclab3;
    private javax.swing.JLabel chicken;
    private javax.swing.JCheckBox chicken1;
    private javax.swing.JCheckBox chicken2;
    private javax.swing.JCheckBox chicken3;
    private javax.swing.JLabel chickenpricelab;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel kabab;
    private javax.swing.JCheckBox kabab1;
    private javax.swing.JCheckBox kabab2;
    private javax.swing.JCheckBox kabab3;
    private javax.swing.JLabel kababpricelab;
    private javax.swing.JLabel kofta;
    private javax.swing.JCheckBox kofta1;
    private javax.swing.JCheckBox kofta2;
    private javax.swing.JCheckBox kofta3;
    private javax.swing.JLabel koftapricelab;
    private javax.swing.JLabel meete;
    private javax.swing.JCheckBox meete1;
    private javax.swing.JCheckBox meete2;
    private javax.swing.JCheckBox meete3;
    private javax.swing.JLabel meetepricelab;
    private javax.swing.JButton newbill3;
    private javax.swing.JButton savebill3;
    private javax.swing.JLabel totallab3;
    private javax.swing.JLabel vatlab2;
    // End of variables declaration//GEN-END:variables
}
