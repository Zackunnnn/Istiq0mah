/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package istiq0mah;

import javax.swing.JOptionPane;

/**
 *
 * @author Ammar Dzakwan
 */
public class Frame5Habits extends javax.swing.JFrame {
    int[] TotalTlwh = new int[7];
    int[] TotalShlwt = new int[7];
    int i;
    
    
    
    
    /**
     * Creates new form Frame5Habits
     */
    public Frame5Habits() {
        initComponents();
        
    }
    
    int isi = 0;
    //String hari;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ChckTlwh1 = new javax.swing.JCheckBox();
        ChckTlwh2 = new javax.swing.JCheckBox();
        ChckTlwh3 = new javax.swing.JCheckBox();
        ChckTlwh4 = new javax.swing.JCheckBox();
        ChckTlwh5 = new javax.swing.JCheckBox();
        ChckTlwh6 = new javax.swing.JCheckBox();
        ChckTlwh7 = new javax.swing.JCheckBox();
        ChckShlwt1 = new javax.swing.JCheckBox();
        ChckShlwt2 = new javax.swing.JCheckBox();
        ChckShlwt3 = new javax.swing.JCheckBox();
        ChckShlwt4 = new javax.swing.JCheckBox();
        ChckShlwt5 = new javax.swing.JCheckBox();
        ChckShlwt6 = new javax.swing.JCheckBox();
        ChckShlwt7 = new javax.swing.JCheckBox();
        HomeBtn = new javax.swing.JButton();
        faedahbn = new javax.swing.JButton();
        faedahslwtbtn = new javax.swing.JButton();
        SudahTlwh = new javax.swing.JLabel();
        SudahShlwt = new javax.swing.JLabel();
        SudahShlwt1 = new javax.swing.JLabel();
        SudahTlwh1 = new javax.swing.JLabel();
        JmlHal7 = new javax.swing.JLabel();
        JmlHal4 = new javax.swing.JLabel();
        JmlHal1 = new javax.swing.JLabel();
        JmlHal2 = new javax.swing.JLabel();
        JmlHal3 = new javax.swing.JLabel();
        JmlHal5 = new javax.swing.JLabel();
        JmlHal6 = new javax.swing.JLabel();
        JmlShl7 = new javax.swing.JLabel();
        JmlShl1 = new javax.swing.JLabel();
        JmlShl2 = new javax.swing.JLabel();
        JmlShl3 = new javax.swing.JLabel();
        JmlShl4 = new javax.swing.JLabel();
        JmlShl5 = new javax.swing.JLabel();
        JmlShl6 = new javax.swing.JLabel();
        HalAwalTxt = new javax.swing.JTextField();
        HalAkhirTxt = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JButton();
        Check = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        PilihHari = new javax.swing.JComboBox<>();
        UpdateHari = new javax.swing.JButton();
        Harinya = new javax.swing.JLabel();
        Day1 = new javax.swing.JLabel();
        Day2 = new javax.swing.JLabel();
        Day3 = new javax.swing.JLabel();
        Day4 = new javax.swing.JLabel();
        Day5 = new javax.swing.JLabel();
        Day6 = new javax.swing.JLabel();
        Day7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JumlahSholawatTxt = new javax.swing.JTextField();
        UpdateBtn1 = new javax.swing.JButton();
        DoneSholawat = new javax.swing.JCheckBox();
        Hasil = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ChckTlwh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChckTlwh1ActionPerformed(evt);
            }
        });
        jPanel1.add(ChckTlwh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 120, 30));

        ChckTlwh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChckTlwh2ActionPerformed(evt);
            }
        });
        jPanel1.add(ChckTlwh2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 120, 20));

        ChckTlwh3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChckTlwh3ActionPerformed(evt);
            }
        });
        jPanel1.add(ChckTlwh3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 120, 30));

        ChckTlwh4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChckTlwh4ActionPerformed(evt);
            }
        });
        jPanel1.add(ChckTlwh4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 120, 20));

        ChckTlwh5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChckTlwh5ActionPerformed(evt);
            }
        });
        jPanel1.add(ChckTlwh5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 120, 30));

        ChckTlwh6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChckTlwh6ActionPerformed(evt);
            }
        });
        jPanel1.add(ChckTlwh6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 120, 20));

        ChckTlwh7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChckTlwh7ActionPerformed(evt);
            }
        });
        jPanel1.add(ChckTlwh7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 369, 120, -1));

        ChckShlwt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChckShlwt1ActionPerformed(evt);
            }
        });
        jPanel1.add(ChckShlwt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 120, 30));

        ChckShlwt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChckShlwt2ActionPerformed(evt);
            }
        });
        jPanel1.add(ChckShlwt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 120, 20));

        ChckShlwt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChckShlwt3ActionPerformed(evt);
            }
        });
        jPanel1.add(ChckShlwt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 120, 30));

        ChckShlwt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChckShlwt4ActionPerformed(evt);
            }
        });
        jPanel1.add(ChckShlwt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 120, 20));

        ChckShlwt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChckShlwt5ActionPerformed(evt);
            }
        });
        jPanel1.add(ChckShlwt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 120, 30));

        ChckShlwt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChckShlwt6ActionPerformed(evt);
            }
        });
        jPanel1.add(ChckShlwt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 120, 20));

        ChckShlwt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChckShlwt7ActionPerformed(evt);
            }
        });
        jPanel1.add(ChckShlwt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 120, 20));

        HomeBtn.setText("Home");
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(HomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        faedahbn.setBackground(new java.awt.Color(0, 204, 255));
        faedahbn.setText("Lihat Faedah Tilawah");
        faedahbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faedahbnActionPerformed(evt);
            }
        });
        jPanel1.add(faedahbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 140, 30));

        faedahslwtbtn.setBackground(new java.awt.Color(51, 204, 255));
        faedahslwtbtn.setText("Lihat Faedah Sholawat");
        faedahslwtbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faedahslwtbtnActionPerformed(evt);
            }
        });
        jPanel1.add(faedahslwtbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, -1, 30));

        SudahTlwh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SudahTlwh.setText("Jumlah Halaman.");
        jPanel1.add(SudahTlwh, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 120, -1));

        SudahShlwt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SudahShlwt.setText("Jumlah Sholawat");
        jPanel1.add(SudahShlwt, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 120, -1));

        SudahShlwt1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SudahShlwt1.setText("Sudah Sholawat?");
        jPanel1.add(SudahShlwt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 120, -1));

        SudahTlwh1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SudahTlwh1.setText("Sudah Tilawah?");
        jPanel1.add(SudahTlwh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 120, -1));
        jPanel1.add(JmlHal7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 120, 30));
        jPanel1.add(JmlHal4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 120, 20));
        jPanel1.add(JmlHal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 120, 30));
        jPanel1.add(JmlHal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 120, 20));
        jPanel1.add(JmlHal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 120, 30));
        jPanel1.add(JmlHal5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 120, 20));
        jPanel1.add(JmlHal6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 120, 30));
        jPanel1.add(JmlShl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 120, 20));
        jPanel1.add(JmlShl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 120, 20));
        jPanel1.add(JmlShl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 120, 20));
        jPanel1.add(JmlShl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 120, 20));
        jPanel1.add(JmlShl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 120, 20));
        jPanel1.add(JmlShl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 120, 20));
        jPanel1.add(JmlShl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 120, 20));

        HalAwalTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HalAwalTxtActionPerformed(evt);
            }
        });
        jPanel1.add(HalAwalTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 120, -1));
        jPanel1.add(HalAkhirTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 120, -1));

        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 480, 90, -1));

        Check.setText("Done ");
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });
        jPanel1.add(Check, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        jLabel1.setText("Hal. Awal");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, -1));

        jLabel2.setText("Hal. Akhir");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        Total.setText("Total 0 Halaman");
        jPanel1.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 180, -1));

        PilihHari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day 1", "Day 2", "Day 3", "Day 4", "Day 5", "Day 6", "Day 7" }));
        PilihHari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PilihHariActionPerformed(evt);
            }
        });
        jPanel1.add(PilihHari, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));

        UpdateHari.setText("Pilih Hari");
        UpdateHari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateHariActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateHari, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 80, -1));

        Harinya.setText("Day 1");
        jPanel1.add(Harinya, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 60, 20));

        Day1.setText("Day 1");
        jPanel1.add(Day1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 40, -1));

        Day2.setText("Day 2");
        jPanel1.add(Day2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 40, -1));

        Day3.setText("Day 3");
        jPanel1.add(Day3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 40, -1));

        Day4.setText("Day 4");
        jPanel1.add(Day4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 40, -1));

        Day5.setText("Day 5");
        jPanel1.add(Day5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 40, -1));

        Day6.setText("Day 6");
        jPanel1.add(Day6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 40, -1));

        Day7.setText("Day 7");
        jPanel1.add(Day7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, 40, -1));

        jLabel3.setText("Jumlah Sholawat :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 110, 20));

        JumlahSholawatTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahSholawatTxtActionPerformed(evt);
            }
        });
        jPanel1.add(JumlahSholawatTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 110, -1));

        UpdateBtn1.setText("Update");
        UpdateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 90, -1));

        DoneSholawat.setText("Done ");
        DoneSholawat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneSholawatActionPerformed(evt);
            }
        });
        jPanel1.add(DoneSholawat, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 70, -1));

        Hasil.setText("Jumlah Sholawat mu 0");
        jPanel1.add(Hasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, -1, -1));

        jLabel4.setText("pada Hal. Awal dan Hal. Akhir");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 170, 20));

        jLabel5.setText("Masukan halaman Al-Qur'an ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 170, -1));

        jLabel6.setText("yang telah kamu baca ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 170, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/5.png"))); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChckTlwh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChckTlwh1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChckTlwh1ActionPerformed

    private void ChckTlwh3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChckTlwh3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChckTlwh3ActionPerformed

    private void ChckTlwh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChckTlwh2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChckTlwh2ActionPerformed

    private void ChckTlwh4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChckTlwh4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChckTlwh4ActionPerformed

    private void ChckTlwh5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChckTlwh5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChckTlwh5ActionPerformed

    private void ChckTlwh6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChckTlwh6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChckTlwh6ActionPerformed

    private void ChckTlwh7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChckTlwh7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChckTlwh7ActionPerformed

    private void ChckShlwt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChckShlwt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChckShlwt1ActionPerformed

    private void ChckShlwt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChckShlwt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChckShlwt2ActionPerformed

    private void ChckShlwt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChckShlwt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChckShlwt3ActionPerformed

    private void ChckShlwt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChckShlwt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChckShlwt4ActionPerformed

    private void ChckShlwt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChckShlwt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChckShlwt5ActionPerformed

    private void ChckShlwt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChckShlwt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChckShlwt6ActionPerformed

    private void ChckShlwt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChckShlwt7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChckShlwt7ActionPerformed

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        // TODO add your handling code here:
        
        if (isi == 1) {
            
        int input = JOptionPane.showConfirmDialog(null, "Apakah kamu yakin ingin pergi\nData yang kamu isi akan hilang!", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        //0=yes, 1=no, 2=cancel

        if (input == 0) {
        Frame2Home f2 = new Frame2Home ();
        f2.setLocationRelativeTo(null);
        f2.setVisible(true);
        this.setVisible(false);
        
        } 
        
        } else if (isi == 0){
            Frame2Home f2 = new Frame2Home ();
        f2.setLocationRelativeTo(null);
        f2.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void faedahbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faedahbnActionPerformed
        // TODO add your handling code here:
        if (isi == 1) {
            
        int input = JOptionPane.showConfirmDialog(null, "Apakah kamu yakin ingin pergi\nData yang kamu isi akan hilang!", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        //0=yes, 1=no, 2=cancel

        if (input == 0) {
        Frame3Tilawah f3 = new Frame3Tilawah();
        f3.setLocationRelativeTo(null);
        f3.setVisible(true);
        this.setVisible(false);
        
        } 
        
        } else if (isi == 0){
        Frame3Tilawah f3 = new Frame3Tilawah();
        f3.setLocationRelativeTo(null);
        f3.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_faedahbnActionPerformed

    private void faedahslwtbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faedahslwtbtnActionPerformed
        // TODO add your handling code here:
        if (isi == 1) {
            
        int input = JOptionPane.showConfirmDialog(null, "Apakah kamu yakin ingin pergi\nData yang kamu isi akan hilang!", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        //0=yes, 1=no, 2=cancel

        if (input == 0) {
        Frame4Sholawat f4 = new Frame4Sholawat();
        f4.setLocationRelativeTo(null);
        f4.setVisible(true);
        this.setVisible(false);
        } 
        
        } else if (isi == 0) {
        Frame4Sholawat f4 = new Frame4Sholawat();
        f4.setLocationRelativeTo(null);
        f4.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_faedahslwtbtnActionPerformed

    private void HalAwalTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HalAwalTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HalAwalTxtActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
        String HalAwal = HalAwalTxt.getText();
        String HalAkhir = HalAkhirTxt.getText();
        
        try {
            
            int awal = Integer.parseInt(HalAwal);
            int akhir = Integer.parseInt(HalAkhir);
        
        if (awal < 1 || akhir > 604){
            JOptionPane.showMessageDialog(rootPane, "Halaman di Al-Qur'an hanya dari\nHal.1 - Hal.604");
            
        } else {  
            
        if (Check.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Sukses");
            int jumlah = akhir - awal + 1;
            
            if (jumlah < 0) {
                JOptionPane.showMessageDialog(rootPane, "Kamu baca mundur?");
            } else {
            Total.setText("Total "+ jumlah + " Halaman");
        
        switch (Harinya.getText()) {
            case "Day 1":
                JmlHal1.setText(jumlah + " Halaman");
                ChckTlwh1.setText("Done");
                ChckTlwh1.setSelected(true);
                break;
            case "Day 2":
                JmlHal2.setText(jumlah + " Halaman");
                ChckTlwh2.setText("Done");
                ChckTlwh2.setSelected(true);
                break;
            case "Day 3":
                JmlHal3.setText(jumlah + " Halaman");
                ChckTlwh3.setText("Done");
                ChckTlwh3.setSelected(true);
                break;
            case "Day 4":
                JmlHal4.setText(jumlah + " Halaman");
                ChckTlwh4.setText("Done");
                ChckTlwh4.setSelected(true);
                break;
            case "Day 5":
                JmlHal5.setText(jumlah + " Halaman");
                ChckTlwh5.setText("Done");
                ChckTlwh5.setSelected(true);
                break;
            case "Day 6":
                JmlHal6.setText(jumlah + " Halaman");
                ChckTlwh6.setText("Done");
                ChckTlwh6.setSelected(true);
                break;
            case "Day 7":
                JmlHal7.setText(jumlah + " Halaman");
                ChckTlwh7.setText("Done");
                ChckTlwh7.setSelected(true);
                break;
        }
        }
        
        isi = 1;
        }
        }
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Gak boleh masukin huruf!");
            //JOptionPane.showMessageDialog(rootPane, e, HalAwal, HEIGHT, icon);
        }
        
        
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
        // TODO add your handling code here:

        
    }//GEN-LAST:event_CheckActionPerformed

    private void JumlahSholawatTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahSholawatTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JumlahSholawatTxtActionPerformed

    private void DoneSholawatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneSholawatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DoneSholawatActionPerformed

    private void UpdateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtn1ActionPerformed
        // TODO add your handling code here:
        
        try {
            String sholawat = JumlahSholawatTxt.getText();
            int jumlah = Integer.parseInt(sholawat);
            
        if (DoneSholawat.isSelected()) {
            
            if (jumlah < 100){
            JOptionPane.showMessageDialog(rootPane, "Ayoo minimal 100");
            
        } else if (jumlah < 1000){
            JOptionPane.showMessageDialog(rootPane, "Sukses");
            Hasil.setText("Total Sholawat mu "+ jumlah);
            
            } else {
            JOptionPane.showMessageDialog(rootPane, "Wah MasyaAllah.. Kerennn");
            Hasil.setText("Total Sholawat mu "+ jumlah);
           
        }
            
            switch (Harinya.getText()) {
            case "Day 1":
                JmlShl1.setText(jumlah + "");
                ChckShlwt1.setText("Done");
                ChckShlwt1.setSelected(true);
                break;
            case "Day 2":
                JmlShl2.setText(jumlah + "");
                ChckShlwt2.setText("Done");
                ChckShlwt2.setSelected(true);
                break;
            case "Day 3":
                JmlShl3.setText(jumlah + "");
                ChckShlwt3.setText("Done");
                ChckShlwt3.setSelected(true);
                break;
            case "Day 4":
                JmlShl4.setText(jumlah + "");
                ChckShlwt4.setText("Done");
                ChckShlwt4.setSelected(true);
                break;
            case "Day 5":
                JmlShl5.setText(jumlah + "");
                ChckShlwt5.setText("Done");
                ChckShlwt5.setSelected(true);
                break;
            case "Day 6":
                JmlShl6.setText(jumlah + "");
                ChckShlwt6.setText("Done");
                ChckShlwt6.setSelected(true);
                break;
            case "Day 7":
                JmlShl7.setText(jumlah + "");
                ChckShlwt7.setText("Done");
                ChckShlwt7.setSelected(true);
                break;
        }
        }
        isi = 1;
        
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Masukan hanya angka!");
        }
        
    }//GEN-LAST:event_UpdateBtn1ActionPerformed

    private void PilihHariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PilihHariActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_PilihHariActionPerformed

    private void UpdateHariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateHariActionPerformed
        // TODO add your handling code here:
        //hari.getText()
        Harinya.setText(PilihHari.getSelectedItem().toString());
    }//GEN-LAST:event_UpdateHariActionPerformed

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
            java.util.logging.Logger.getLogger(Frame5Habits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame5Habits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame5Habits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame5Habits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame5Habits().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JCheckBox ChckShlwt1;
    private javax.swing.JCheckBox ChckShlwt2;
    private javax.swing.JCheckBox ChckShlwt3;
    private javax.swing.JCheckBox ChckShlwt4;
    private javax.swing.JCheckBox ChckShlwt5;
    private javax.swing.JCheckBox ChckShlwt6;
    private javax.swing.JCheckBox ChckShlwt7;
    private javax.swing.JCheckBox ChckTlwh1;
    private javax.swing.JCheckBox ChckTlwh2;
    private javax.swing.JCheckBox ChckTlwh3;
    private javax.swing.JCheckBox ChckTlwh4;
    private javax.swing.JCheckBox ChckTlwh5;
    private javax.swing.JCheckBox ChckTlwh6;
    private javax.swing.JCheckBox ChckTlwh7;
    private javax.swing.JCheckBox Check;
    private javax.swing.JLabel Day1;
    private javax.swing.JLabel Day2;
    private javax.swing.JLabel Day3;
    private javax.swing.JLabel Day4;
    private javax.swing.JLabel Day5;
    private javax.swing.JLabel Day6;
    private javax.swing.JLabel Day7;
    private javax.swing.JCheckBox DoneSholawat;
    private javax.swing.JTextField HalAkhirTxt;
    private javax.swing.JTextField HalAwalTxt;
    private javax.swing.JLabel Harinya;
    private javax.swing.JLabel Hasil;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JLabel JmlHal1;
    private javax.swing.JLabel JmlHal2;
    private javax.swing.JLabel JmlHal3;
    private javax.swing.JLabel JmlHal4;
    private javax.swing.JLabel JmlHal5;
    private javax.swing.JLabel JmlHal6;
    private javax.swing.JLabel JmlHal7;
    private javax.swing.JLabel JmlShl1;
    private javax.swing.JLabel JmlShl2;
    private javax.swing.JLabel JmlShl3;
    private javax.swing.JLabel JmlShl4;
    private javax.swing.JLabel JmlShl5;
    private javax.swing.JLabel JmlShl6;
    private javax.swing.JLabel JmlShl7;
    private javax.swing.JTextField JumlahSholawatTxt;
    private javax.swing.JComboBox<String> PilihHari;
    private javax.swing.JLabel SudahShlwt;
    private javax.swing.JLabel SudahShlwt1;
    private javax.swing.JLabel SudahTlwh;
    private javax.swing.JLabel SudahTlwh1;
    private javax.swing.JLabel Total;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton UpdateBtn1;
    private javax.swing.JButton UpdateHari;
    private javax.swing.JButton faedahbn;
    private javax.swing.JButton faedahslwtbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
