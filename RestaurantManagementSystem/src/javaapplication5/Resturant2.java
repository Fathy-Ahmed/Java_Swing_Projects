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
public class Resturant2 extends javax.swing.JFrame {
    Date currentDate = new Date();
    int chickNum, meetNum, chick1Num, meet1Num;
    double chickprice, meetprice, chick1price, meet1price;
    final double CHICK_COST = 40.0, MEET_COST = 50.0, CHICK1_COST = 50.0, MEET1_COST = 60.0;
    double vat, total;
    int billnum;
    PrintWriter output;
       Connection con;
    
    public Resturant2() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/resturant", "root", "Kb.181276");
        } catch (SQLException ex) {
            Logger.getLogger(Resturant2.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Conection Failed");
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        chick = new javax.swing.JLabel();
        meet = new javax.swing.JLabel();
        chick1 = new javax.swing.JLabel();
        meet1 = new javax.swing.JLabel();
        chickcount = new javax.swing.JSpinner();
        meetcount = new javax.swing.JSpinner();
        chickcount1 = new javax.swing.JSpinner();
        meetcount1 = new javax.swing.JSpinner();
        chesse1 = new javax.swing.JCheckBox();
        chesse2 = new javax.swing.JCheckBox();
        batata1 = new javax.swing.JCheckBox();
        batata2 = new javax.swing.JCheckBox();
        chickpricelab = new javax.swing.JLabel();
        meetpricelab = new javax.swing.JLabel();
        chickprice1lab = new javax.swing.JLabel();
        meetprice1lab = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        vatlab = new javax.swing.JLabel();
        totallab = new javax.swing.JLabel();
        billnumlab = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        calclabel = new javax.swing.JButton();
        newlabel = new javax.swing.JButton();
        savelabel = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RESTURANT");

        chick.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chick.setText("شاورما فراخ");

        meet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        meet.setText("شاورما لحم ");

        chick1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chick1.setText("برجر فراخ ");

        meet1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        meet1.setText("برجر لحم ");

        chickcount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        chickcount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chickcountStateChanged(evt);
            }
        });

        meetcount.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        meetcount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meetcountStateChanged(evt);
            }
        });

        chickcount1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        chickcount1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chickcount1StateChanged(evt);
            }
        });

        meetcount1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        meetcount1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                meetcount1StateChanged(evt);
            }
        });

        chesse1.setText("جبنه");
        chesse1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chesse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chesse1ActionPerformed(evt);
            }
        });

        chesse2.setText("جبنه");
        chesse2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        chesse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chesse2ActionPerformed(evt);
            }
        });

        batata1.setText("بطاطس");
        batata1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        batata1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batata1ActionPerformed(evt);
            }
        });

        batata2.setText("بطاطس");
        batata2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        batata2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batata2ActionPerformed(evt);
            }
        });

        chickpricelab.setText("0.0 جنيه");

        meetpricelab.setText("0.0 جنيه");

        chickprice1lab.setText("0.0 جنيه");

        meetprice1lab.setText("0.0 جنيه");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chickprice1lab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(batata1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(meetprice1lab, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(batata2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(meetpricelab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chickpricelab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chesse1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chesse2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(meetcount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(meet1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(chickcount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chick1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(meetcount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(meet)))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(chickcount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chick)
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chickcount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chesse1)
                    .addComponent(chickpricelab)
                    .addComponent(chick))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meet)
                    .addComponent(meetcount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chesse2)
                    .addComponent(meetpricelab))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chick1)
                    .addComponent(chickcount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batata1)
                    .addComponent(chickprice1lab))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meet1)
                    .addComponent(meetcount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batata2)
                    .addComponent(meetprice1lab))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("وجبات سريعه");

        vatlab.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vatlab.setText("االضريبه : 0.0 جنيه");

        totallab.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totallab.setText("المجموع : 0.0 جنيه");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vatlab)
                    .addComponent(totallab))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(vatlab)
                .addGap(26, 26, 26)
                .addComponent(totallab)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        billnumlab.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        billnumlab.setText("رقم الفاتوره : 0");

        calclabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        calclabel.setText("حساب");
        calclabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calclabelActionPerformed(evt);
            }
        });

        newlabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        newlabel.setText("فاتورة جديده");
        newlabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newlabelActionPerformed(evt);
            }
        });

        savelabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        savelabel.setText("حفظ الفاتورة ");
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
                .addContainerGap()
                .addComponent(newlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(savelabel)
                .addGap(19, 19, 19))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(calclabel, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calclabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newlabel)
                    .addComponent(savelabel))
                .addGap(18, 18, 18))
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(exit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(billnumlab)
                                .addGap(20, 20, 20)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(exit))
                        .addGap(32, 32, 32)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(billnumlab)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chickcountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chickcountStateChanged
        chickNum = (Integer) chickcount.getValue();

        chickprice = CHICK_COST * chickNum;
        chickpricelab.setText(chickprice + "جنيه");

        // TODO add your handling code here:
    }//GEN-LAST:event_chickcountStateChanged

    private void meetcountStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meetcountStateChanged
        meetNum = (Integer) meetcount.getValue();

        meetprice = MEET_COST * meetNum;
        meetpricelab.setText(meetprice + "جنيه");

        // TODO add your handling code here:
    }//GEN-LAST:event_meetcountStateChanged

    private void chickcount1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chickcount1StateChanged
        chick1Num = (Integer) chickcount1.getValue();

        chick1price = CHICK1_COST * chick1Num;
        chickprice1lab.setText(chick1price + "جنيه");

        // TODO add your handling code here:
    }//GEN-LAST:event_chickcount1StateChanged

    private void meetcount1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_meetcount1StateChanged
        meet1Num = (Integer) meetcount1.getValue();

        meet1price = MEET1_COST * meet1Num;
        meetprice1lab.setText(meet1price + "جنيه");

        // TODO add your handling code here:
    }//GEN-LAST:event_meetcount1StateChanged

    private void chesse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chesse1ActionPerformed

        if (chesse1.isSelected()) {
            chickprice += chickNum;
        } else {
            chickprice -= chickNum;
        }
        chickpricelab.setText(chickprice + "جنيه");

        // TODO add your handling code here:
    }//GEN-LAST:event_chesse1ActionPerformed

    private void chesse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chesse2ActionPerformed

        if (chesse2.isSelected()) {
            meetprice += meetNum;
        } else {
            meetprice -= meetNum;
        }
        meetpricelab.setText(meetprice + "جنيه");

        // TODO add your handling code here:
    }//GEN-LAST:event_chesse2ActionPerformed

    private void savelabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savelabelActionPerformed

        if (total != 0) {
            
            try {
                PreparedStatement stmt = con.prepareStatement("insert into money(money.data,money.money) values(?,?)");
                 stmt.setString(1, String.valueOf(currentDate));
                stmt.setDouble(2, total);
                stmt.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(Resturant2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            try {
                output = new PrintWriter("billno.100" + billnum + ".txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Resturant2.class.getName()).log(Level.SEVERE, null, ex);
            }
            output.println(billnum + " رقم الفاتورة");
            output.println("================");

            if (chickNum != 0) {
                output.println(chickNum + " شاورما فراخ");

                if (chesse1.isSelected()) {
                    output.println(" مع جبنه");
                }
                output.println(chickprice + "جنيه");

            }
            if (meetNum != 0) {
                output.println(meetNum + " شاورما لحم");

                if (chesse2.isSelected()) {
                    output.println(" مع جبنه");

                }

                output.println(meetprice + "جنيه");

            }
            if (chick1Num != 0) {
                output.println(chick1Num + " برجر فراخ");

                if (batata1.isSelected()) {
                    output.println("مع البطاطس");
                }
                output.println(chick1price + "جنيه");

            }
            if (meet1Num != 0) {
                output.println(meet1Num + " برجر لحم");

                if (batata2.isSelected()) {
                    output.println("مع البطاطس");
                }
                output.println(meet1price + "جنيه");

            }
            output.println("--------");
            output.println("المجموع :" + total + "جنيه");
            output.println("الضريبه :" + vat + "جنيه ");
            output.println();
            output.println("شكرا لطلبك");

            output.close();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_savelabelActionPerformed

    private void batata1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batata1ActionPerformed
        if (batata1.isSelected()) {
            chick1price += chick1Num;
        } else {
            chick1price -= chick1Num;
        }
        chickprice1lab.setText(chick1price + "جنيه");

        // TODO add your handling code here:
    }//GEN-LAST:event_batata1ActionPerformed

    private void batata2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batata2ActionPerformed

        if (batata2.isSelected()) {
            meet1price += meet1Num;
        } else {
            meet1price -= meet1Num;
        }
        meetprice1lab.setText(meet1price + "جنيه");

        // TODO add your handling code here:
    }//GEN-LAST:event_batata2ActionPerformed

    private void calclabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calclabelActionPerformed
        total = chickprice + meetprice + chick1price + meet1price;

        vat = total * .05;
        vat = vat * 100;
        vat = vat / 100;
        vat = (double) ((int) vat);

        vatlab.setText("الضريبه :" + vat + " جنيه");
        total = total + vat;
        totallab.setText("المجموع " + total + "جنيه");

// TODO add your handling code here:
    }//GEN-LAST:event_calclabelActionPerformed

    private void newlabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newlabelActionPerformed

        if (total != 0) {
            chickcount.setValue(0);
            meetcount.setValue(0);
            chickcount1.setValue(0);
            meetcount1.setValue(0);
            chesse1.setSelected(false);
            chesse2.setSelected(false);
            batata1.setSelected(false);
            batata2.setSelected(false);

            totallab.setText("المجموع : 0.0 جنيه");
            vatlab.setText("المجموع : 0.0 جنيه");

            total = 0;
            vat = 0;

            billnum++;
            billnumlab.setText("رقم الفاتورة :" + billnum);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_newlabelActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Resturant2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resturant2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resturant2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resturant2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resturant2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox batata1;
    private javax.swing.JCheckBox batata2;
    private javax.swing.JLabel billnumlab;
    private javax.swing.JButton calclabel;
    private javax.swing.JCheckBox chesse1;
    private javax.swing.JCheckBox chesse2;
    private javax.swing.JLabel chick;
    private javax.swing.JLabel chick1;
    private javax.swing.JSpinner chickcount;
    private javax.swing.JSpinner chickcount1;
    private javax.swing.JLabel chickprice1lab;
    private javax.swing.JLabel chickpricelab;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel meet;
    private javax.swing.JLabel meet1;
    private javax.swing.JSpinner meetcount;
    private javax.swing.JSpinner meetcount1;
    private javax.swing.JLabel meetprice1lab;
    private javax.swing.JLabel meetpricelab;
    private javax.swing.JButton newlabel;
    private javax.swing.JButton savelabel;
    private javax.swing.JLabel totallab;
    private javax.swing.JLabel vatlab;
    // End of variables declaration//GEN-END:variables
}
