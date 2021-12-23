package com.example;

import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    DD1 Dc1;
    DD1 Dc2;

    public Main() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("Queue Project");
    }

    public static double getPercesoin(double d) {
        return Double.parseDouble(String.format("%.2f", d));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        getResultsMM1K = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jText_λ2 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jText_n2 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jText_u2 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jText_c = new javax.swing.JTextField();
        panel = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jText_L = new javax.swing.JLabel();
        jText_W = new javax.swing.JLabel();
        jText_Pci1 = new javax.swing.JLabel();
        jText_LQ = new javax.swing.JLabel();
        jText_WQ = new javax.swing.JLabel();
        jText_Pn = new javax.swing.JLabel();
        jText_P0 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        getResultsMMC = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jText_λ3 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jText_n3 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jText_u3 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jText_c2 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jText_K2 = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        getResultsMMCK = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jText_L1 = new javax.swing.JLabel();
        jText_W1 = new javax.swing.JLabel();
        jText_Pci2 = new javax.swing.JLabel();
        jText_LQ1 = new javax.swing.JLabel();
        jText_WQ1 = new javax.swing.JLabel();
        jText_Pn1 = new javax.swing.JLabel();
        jText_P01 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        λmm1 = new javax.swing.JTextField();
        umm1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        getResultMM1 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        WQMM2 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        LMM2 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        LQMM2 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        P0MM2 = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jtext_t = new javax.swing.JTextField();
        jtext_n = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        check_ti2 = new javax.swing.JCheckBox();
        check_n2 = new javax.swing.JCheckBox();
        check_w2 = new javax.swing.JCheckBox();
        jPanel28 = new javax.swing.JPanel();
        getResultsDeter = new javax.swing.JButton();
        getGraph = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jText_λ4 = new javax.swing.JTextField();
        jText_u4 = new javax.swing.JTextField();
        jText_K3 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jtext_M2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextField_nt = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextField_ti = new javax.swing.JTextPane();
        jLabel_ti = new javax.swing.JLabel();
        jLabel_wqn = new javax.swing.JLabel();
        jLabel_nt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextField_wqn = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 0));

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 0));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 0, 51));

        jPanel19.setBackground(new java.awt.Color(0, 0, 102));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel8.setBackground(new java.awt.Color(0, 153, 153));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel12.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel12.setText("L");

        jLabel13.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel13.setText("Lq");

        jLabel14.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel14.setText("W");

        jLabel15.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel15.setText("Wq");

        jLabel16.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel16.setText("Pk");

        jLabel17.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel17.setText("Pn");

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField9.setText("0.0");

        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField11.setText("0.0");

        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField13.setText("0.0");

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField10.setText("0.0");

        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField12.setText("0.0");

        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField14.setText("0.0");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField11)
                    .addComponent(jTextField9)
                    .addComponent(jTextField13))
                .addGap(130, 130, 130)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13))
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField12)
                    .addComponent(jTextField10)
                    .addComponent(jTextField14))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jTextField9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jTextField10)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(jTextField12))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jTextField11)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(jTextField14))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jTextField13)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(51, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel8.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel8.setText("λ");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel9.setText("n");

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel10.setText("u");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel11.setText("k");

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(24, 24, 24))
        );

        jPanel6.setBackground(new java.awt.Color(0, 51, 153));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        getResultsMM1K.setBackground(new java.awt.Color(0, 102, 153));
        getResultsMM1K.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        getResultsMM1K.setText("Check");
        getResultsMM1K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getResultsMM1KActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(getResultsMM1K)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(getResultsMM1K)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(415, Short.MAX_VALUE)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("M/M/1/k", jPanel5);

        jPanel12.setBackground(new java.awt.Color(153, 0, 51));

        jPanel20.setBackground(new java.awt.Color(255, 102, 102));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel18.setBackground(new java.awt.Color(204, 0, 153));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel47.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel47.setText("λ");

        jText_λ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_λ2ActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel48.setText("n");

        jText_n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_n2ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel49.setText("u");

        jText_u2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_u2ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel50.setText("c");

        jText_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_cActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText_λ2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel48)
                        .addGap(12, 12, 12)
                        .addComponent(jText_n2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jText_u2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jText_c, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jText_λ2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jText_n2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel49)
                        .addComponent(jText_u2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jText_c, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        panel.setBackground(new java.awt.Color(102, 0, 153));
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel26.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel26.setText("L");

        jLabel27.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel27.setText("Lq");

        jLabel28.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel28.setText("W");

        jLabel43.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel43.setText("Wq");

        jLabel44.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel44.setText("Pci");

        jLabel45.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel45.setText("Pn");

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel51.setText("1/P0");

        jText_L.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jText_L.setText("0.0");

        jText_W.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jText_W.setText("0.0");

        jText_Pci1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jText_Pci1.setText("0.0");

        jText_LQ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jText_LQ.setText("0.0");

        jText_WQ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jText_WQ.setText("0.0");

        jText_Pn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jText_Pn.setText("0.0");

        jText_P0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jText_P0.setText("0.0");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jText_Pci1))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel28)
                        .addGap(48, 48, 48)
                        .addComponent(jText_W))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jText_L)))
                .addGap(133, 133, 133)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel43)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(39, 39, 39)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jText_WQ)
                    .addComponent(jText_LQ)
                    .addComponent(jText_Pn))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel51)
                .addGap(34, 34, 34)
                .addComponent(jText_P0)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jText_L)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jText_LQ))))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel28)
                                .addComponent(jText_W))
                            .addComponent(jLabel43))
                        .addGap(16, 16, 16))
                    .addComponent(jText_WQ, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(8, 8, 8)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel44)
                        .addComponent(jText_Pci1))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jText_Pn)))
                .addGap(26, 26, 26)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jText_P0)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(255, 102, 102));
        jPanel21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        getResultsMMC.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        getResultsMMC.setText("Check");
        getResultsMMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getResultsMMCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(getResultsMMC)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(getResultsMMC)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(214, Short.MAX_VALUE)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );

        jTabbedPane1.addTab("M/M/C", jPanel12);

        jPanel22.setBackground(new java.awt.Color(0, 153, 153));

        jPanel26.setBackground(new java.awt.Color(0, 255, 204));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel23.setBackground(new java.awt.Color(153, 255, 153));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel53.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel53.setText("λ");

        jText_λ3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jText_λ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_λ3ActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel54.setText("n");

        jText_n3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jText_n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_n3ActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel55.setText("u");

        jText_u3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jText_u3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_u3ActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel56.setText("c");

        jText_c2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jText_c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_c2ActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel64.setText("K");

        jText_K2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jText_K2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_K2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText_λ3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jText_u3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jText_n3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jText_K2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jText_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(119, 119, 119))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53)
                            .addComponent(jText_λ3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel55)
                                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_u3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jText_c2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jText_K2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64)
                    .addComponent(jText_n3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addGap(56, 56, 56))
        );

        jPanel24.setBackground(new java.awt.Color(0, 204, 153));
        jPanel24.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        getResultsMMCK.setBackground(new java.awt.Color(0, 255, 153));
        getResultsMMCK.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        getResultsMMCK.setText("Check");
        getResultsMMCK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getResultsMMCKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(getResultsMMCK)
                .addGap(10, 10, 10))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(getResultsMMCK)
                .addGap(11, 11, 11))
        );

        jPanel25.setBackground(new java.awt.Color(153, 255, 204));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel57.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel57.setText("L");

        jLabel58.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel58.setText("Lq");

        jLabel59.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel59.setText("W");

        jLabel60.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel60.setText("Wq");

        jLabel61.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel61.setText("Pci");

        jLabel62.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel62.setText("Pn");

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel63.setText("1/P0");

        jText_L1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jText_L1.setText("0.0");

        jText_W1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jText_W1.setText("0.0");

        jText_Pci2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jText_Pci2.setText("0.0");

        jText_LQ1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jText_LQ1.setText("0.0");

        jText_WQ1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jText_WQ1.setText("0.0");

        jText_Pn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jText_Pn1.setText("0.0");

        jText_P01.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jText_P01.setText("0.0");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel59)))
                            .addComponent(jLabel61))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_Pci2)
                            .addComponent(jText_L1)
                            .addComponent(jText_W1))
                        .addGap(143, 143, 143)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_WQ1)
                            .addComponent(jText_LQ1)
                            .addComponent(jText_Pn1)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel63)
                        .addGap(18, 18, 18)
                        .addComponent(jText_P01)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(jLabel57))
                        .addGap(8, 8, 8))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_LQ1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jText_L1)))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jText_WQ1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel62)
                            .addComponent(jText_Pn1)))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jText_W1)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                                .addComponent(jText_Pci2)
                                .addGap(18, 18, 18)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addComponent(jText_P01)
                        .addGap(15, 15, 15)))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(261, Short.MAX_VALUE)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(317, 317, 317))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("M/M/C/K", jPanel22);

        jPanel4.setBackground(new java.awt.Color(51, 51, 0));

        jPanel15.setBackground(new java.awt.Color(51, 0, 51));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel16.setBackground(new java.awt.Color(255, 204, 204));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel31.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel31.setText("λ");

        λmm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                λmm1ActionPerformed(evt);
            }
        });

        umm1.setAutoscrolls(false);
        umm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umm1ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel32.setText("u");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(201, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addGap(15, 15, 15)
                .addComponent(λmm1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jLabel32)
                .addGap(15, 15, 15)
                .addComponent(umm1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(λmm1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(umm1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        getResultMM1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        getResultMM1.setText("Check");
        getResultMM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getResultMM1ActionPerformed(evt);
            }
        });

        jPanel27.setBackground(new java.awt.Color(51, 51, 0));
        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel73.setFont(new java.awt.Font("Noto Mono", 0, 36)); // NOI18N
        jLabel73.setText("hr");

        WQMM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WQMM2ActionPerformed(evt);
            }
        });

        jLabel74.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel74.setText("wq");

        jLabel75.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel75.setText("L");

        LMM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LMM2ActionPerformed(evt);
            }
        });

        jLabel76.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel76.setText("Lq");

        LQMM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LQMM2ActionPerformed(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Noto Mono", 0, 36)); // NOI18N
        jLabel77.setText("C");

        jLabel78.setFont(new java.awt.Font("Noto Mono", 0, 36)); // NOI18N
        jLabel78.setText("C");

        P0MM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P0MM2ActionPerformed(evt);
            }
        });

        jLabel80.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel80.setText("P0");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addGap(25, 25, 25)
                        .addComponent(LMM2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel78))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addGap(18, 18, 18)
                        .addComponent(WQMM2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel73)))
                .addGap(89, 89, 89)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel80)
                        .addGap(18, 18, 18)
                        .addComponent(P0MM2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addGap(22, 22, 22)
                        .addComponent(LQMM2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel77)))
                .addGap(46, 46, 46))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel27Layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(P0MM2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LQMM2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(LMM2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel74)
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(WQMM2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addComponent(getResultMM1)
                .addGap(350, 350, 350))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(getResultMM1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel24.setFont(new java.awt.Font("Courier 10 Pitch", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(866, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(316, 316, 316))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("M/M/1", jPanel4);

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));

        jPanel10.setBackground(new java.awt.Color(255, 255, 102));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jtext_t.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jtext_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext_tActionPerformed(evt);
            }
        });

        jtext_n.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jtext_n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext_nActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel18.setText("n");

        jLabel7.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel7.setText("t");

        jPanel17.setBackground(new java.awt.Color(153, 153, 0));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        check_ti2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        check_ti2.setText("ti");
        check_ti2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_ti2ActionPerformed(evt);
            }
        });

        check_n2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        check_n2.setText("n(t)");
        check_n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_n2ActionPerformed(evt);
            }
        });

        check_w2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        check_w2.setText("Wq(n)");
        check_w2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_w2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(check_ti2)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(check_n2)
                .addGap(18, 18, 18)
                .addComponent(check_w2)
                .addGap(14, 14, 14))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(check_w2)
                    .addComponent(check_n2)
                    .addComponent(check_ti2))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtext_n, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7)
                        .addGap(10, 10, 10)
                        .addComponent(jtext_t, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtext_n, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jtext_t, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(255, 255, 153));
        jPanel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        getResultsDeter.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        getResultsDeter.setText("Check");
        getResultsDeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getResultsDeterActionPerformed(evt);
            }
        });

        getGraph.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        getGraph.setText("Draw ");
        getGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getGraphActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(getResultsDeter)
                .addGap(18, 18, 18)
                .addComponent(getGraph)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getResultsDeter)
                    .addComponent(getGraph))
                .addGap(9, 9, 9))
        );

        jPanel30.setBackground(new java.awt.Color(255, 204, 0));
        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel30.setToolTipText("");

        jLabel69.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel69.setText("u");

        jText_λ4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jText_λ4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_λActionPerformed(evt);
            }
        });

        jText_u4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jText_u4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_uActionPerformed(evt);
            }
        });

        jText_K3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jText_K3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_KActionPerformed(evt);
            }
        });

        jLabel70.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel70.setText("k");

        jLabel71.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel71.setText("M");

        jLabel72.setFont(new java.awt.Font("Noto Mono", 1, 36)); // NOI18N
        jLabel72.setText("λ");

        jtext_M2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtext_M2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtext_MActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel72)
                        .addGap(18, 18, 18)
                        .addComponent(jText_λ4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel30Layout.createSequentialGroup()
                            .addComponent(jLabel69)
                            .addGap(18, 18, 18)
                            .addComponent(jText_u4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel30Layout.createSequentialGroup()
                            .addComponent(jLabel70)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jText_K3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel30Layout.createSequentialGroup()
                            .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtext_M2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jText_λ4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72))
                .addGap(18, 18, 18)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_u4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtext_M2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_K3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70))
                .addGap(27, 27, 27))
        );

        jTextField_nt.setEditable(false);
        jTextField_nt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_nt.setMinimumSize(new java.awt.Dimension(6, 37));
        jScrollPane2.setViewportView(jTextField_nt);

        jTextField_ti.setEditable(false);
        jTextField_ti.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane3.setViewportView(jTextField_ti);

        jLabel_ti.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_ti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ti.setText("ti");

        jLabel_wqn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_wqn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_wqn.setText("Wq(n)");

        jLabel_nt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_nt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_nt.setText("n(t)");

        jTextField_wqn.setEditable(false);
        jTextField_wqn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(jTextField_wqn);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(492, 492, 492)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_wqn)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_nt)
                                    .addComponent(jLabel_ti, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(58, Short.MAX_VALUE)
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel_ti)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel_nt)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel_wqn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("D/D/1", null, jPanel2, "");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 604, Short.MAX_VALUE)
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

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void getResultsMM1KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getResultsMM1KActionPerformed

        try {
            int k = 0, n = 0;
            double λ = 0.0, u = 0.0;
            if (!jTextField5.getText().equals("")) {
                String s = jTextField5.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    λ = first / second;
                } else {
                    λ = Double.parseDouble(jTextField5.getText());
                }
            }
            if (!jTextField7.getText().equals("")) {
                String s = jTextField7.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    u = first / second;
                } else {
                    u = Double.parseDouble(jTextField7.getText());
                }
            }

            if (!jTextField8.getText().equals("")) {
                k = Integer.parseInt(jTextField8.getText());
            }
            if (!jTextField6.getText().equals("")) {
                n = Integer.parseInt(jTextField6.getText());
            }

            if ((k > 0) && (λ > 0) && (u > 0)) {
                MM1K MK = new MM1K(k, λ, u);
                double L = MK.L();
                jTextField9.setText(Double.toString(getPercesoin(L)));
                double Lq = MK.Lq();
                jTextField10.setText(Double.toString(getPercesoin(Lq)));
                double W = MK.W();
                jTextField11.setText(Double.toString(getPercesoin(W)));
                double Wq = MK.Wq();
                jTextField12.setText(Double.toString(getPercesoin(Wq)));
                double PK = MK.PK();
                jTextField13.setText(Double.toString(getPercesoin(PK)));
                if (n >= 0) {
                    double Pn = MK.Pn(n);
                    jTextField14.setText(Double.toString(getPercesoin(Pn)));
                } else {
                    JOptionPane.showMessageDialog(null, "n should be a positive number");
                }
            } else {
                JOptionPane.showMessageDialog(null, "( λ & u & k ) Are required as a positive Numbers");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }
    }//GEN-LAST:event_getResultsMM1KActionPerformed

    private void jText_λ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_λ2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_λ2ActionPerformed

    private void jText_n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_n2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_n2ActionPerformed

    private void jText_u2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_u2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_u2ActionPerformed

    private void jText_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_cActionPerformed

    private void getResultsMMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getResultsMMCActionPerformed
        try {
            double λ2 = 0.0, u2 = 0.0;
            int n2 = 0, c = 0;
            MMC mmc;
            if (!jText_λ2.getText().equals("")) {
                String s = jText_λ2.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    λ2 = first / second;
                } else {
                    λ2 = Double.parseDouble(jText_λ2.getText());
                }
            }
            if (!jText_u2.getText().equals("")) {
                String s = jText_u2.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    u2 = first / second;
                } else {
                    u2 = Double.parseDouble(jText_u2.getText());
                }
            }
            if (!jText_c.getText().equals("")) {
                c = Integer.parseInt(jText_c.getText());
            }
            if (!jText_n2.getText().equals("")) {
                n2 = Integer.parseInt(jText_n2.getText());
            }

            if ((λ2 > 0) && (u2 > 0) && (c > 0)) {
                mmc = new MMC(λ2, u2, c);
                double L = mmc.L();
                jText_L.setText(Double.toString(getPercesoin(L)));
                double Lq = mmc.Lq();
                jText_LQ.setText(Double.toString(getPercesoin(Lq)));
                double W = mmc.W();
                jText_W.setText(Double.toString(getPercesoin(W)));
                double Wq = mmc.Wq();
                jText_WQ.setText(Double.toString(getPercesoin(Wq)));
                double Pci = mmc.Pci();
                jText_Pci1.setText(Double.toString(getPercesoin(Pci)));
                double Pn;
                if (n2 >= 0) {
                    Pn = mmc.Pn(n2);
                    jText_Pn.setText(Double.toString(getPercesoin(Pn)));
                } else {
                    JOptionPane.showMessageDialog(null, "n Should be positive");
                }
                double P0 = mmc.reverseP0();
                jText_P0.setText(Double.toString(getPercesoin(P0)));
            } else {
                JOptionPane.showMessageDialog(null, "( λ, u, c ) Are Required as Positive Numbers .. !");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }
    }//GEN-LAST:event_getResultsMMCActionPerformed

    private void jText_λ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_λ3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_λ3ActionPerformed

    private void jText_n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_n3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_n3ActionPerformed

    private void jText_u3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_u3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_u3ActionPerformed

    private void jText_c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_c2ActionPerformed

    private void jText_K2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_K2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_K2ActionPerformed

    private void jtext_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtext_tActionPerformed

    private void jtext_nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtext_nActionPerformed

    private void check_ti2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_ti2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_ti2ActionPerformed

    private void check_n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_n2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_n2ActionPerformed

    private void check_w2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_w2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_w2ActionPerformed

    private void getResultsDeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getResultsDeterActionPerformed
        try {
            double λd = 0, ud = 0;
            double wqn = -1, ti = -1, nt = -1;
            int n = 0, m = 0, kd = 0, T = 0, n_of_checked_results = 0;
            String errors = "";

            if (!jText_λ4.getText().equals("")) {
                String s = jText_λ4.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    λd = first / second;
                } else {
                    λd = Double.parseDouble(jText_λ4.getText());
                }
            }
            if (!jText_u4.getText().equals("")) {
                String s = jText_u4.getText();
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    ud = first / second;
                } else {
                    ud = Double.parseDouble(jText_u4.getText());
                }
            }
            if (!jtext_t.getText().equals("")) {
                T = Integer.parseInt(jtext_t.getText());
            }
            if (!jtext_n.getText().equals("")) {
                n = Integer.parseInt(jtext_n.getText());
            }
            if (!jText_K3.getText().equals("")) {
                kd = Integer.parseInt(jText_K3.getText());
            }
            if (!jtext_M2.getText().equals("")) {
                m = Integer.parseInt(jtext_M2.getText());
            }

            // Case 1
            if (m == 0 && (λd > 0) && (ud > 0) && (kd > 0) && λd > ud) {

                Dc1 = new DD1((double) ud, λd, kd);

                ti = Dc1.getTi();

                if (check_ti2.isSelected()) {
                    n_of_checked_results++;
                } else {
                    ti = -1;
                }

                if (check_n2.isSelected()) {
                    n_of_checked_results++;
                    if (T == 0) {
                        errors = "Please Enter positive Integer in (t) field";
                    } else {
                        nt = Dc1.getNt(T);
                        //                        System.out.println("nt = " + nt + " T = " + T + " λd = " + λd + " U = " + ud);

                    }
                }
                if (check_w2.isSelected()) {
                    n_of_checked_results++;
                    if (n == 0) {
                        if (errors.equals("")) {
                            errors = "Please Enter positive Integer in (n) Field";
                        } else {
                            errors += " & n field";
                        }
                    } else {
                        wqn = Dc1.getWqn((double) n);
                    }
                }

                if (n_of_checked_results == 0) {
                    errors = "Please check any result you want";
                }

                if (errors.equals("")) {
                    if (ti != -1) {
                        jTextField_ti.setText(String.valueOf(ti));
                    } else {
                        jTextField_ti.setText("Unchecked");
                    }
                    if (wqn != -1) {
                        jTextField_nt.setText(String.valueOf(wqn));
                    } else {
                        jTextField_nt.setText("Unchecked");
                    }
                    if (nt != -1) {
                        jTextField_wqn.setText(String.valueOf(nt));
                    } else {
                        jTextField_wqn.setText("Unchecked");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, errors);
                }

                // Case Number 2
            } else if ((m > 0) && (λd > 0) && (ud > 0) && (kd > 0) && (ud >= λd)) {
                Dc2 = new DD1((double) ud, λd, kd, m);
                double nt2 = -1, wqn2 = -1, ti2 = -1;

                ti2 = Dc2.getTi2();

                if (check_ti2.isSelected()) {
                    n_of_checked_results++;
                }

                if (check_n2.isSelected()) {
                    n_of_checked_results++;
                    if (T == 0) {
                        errors = "Please Enter positive Integer in (t) field";
                    } else {
                        nt2 = Dc2.getNt2(T);
                        //System.out.println("nt = " + nt + " T = " + T + " λd = " + λd + " U = " + ud);
                    }
                }
                if (check_w2.isSelected()) {
                    n_of_checked_results++;
                    System.out.println("one");
                    if (n == 0) {
                        if (errors.equals("")) {
                            errors = "Please Enter positive Integer in (n) Field";
                        } else {
                            errors += " & n field";
                        }
                    } else {

                        wqn2 = Dc2.getWqn2((double) n);

                    }
                }
                if (n_of_checked_results == 0) {
                    errors = "Please check any result you want";
                }

                if (errors.equals("")) {
                    if (ti2 != -1) {
                        jTextField_ti.setText(String.valueOf(ti2));
                    } else {
                        jTextField_ti.setText("Unchecked");
                    }
                    if (wqn2 != -1) {
                        jTextField_nt.setText(String.valueOf(wqn2));
                    } else {
                        jTextField_nt.setText("Unchecked");
                    }
                    if (nt2 != -1) {
                        jTextField_wqn.setText(String.valueOf(nt2));
                    } else {
                        jTextField_wqn.setText("Unchecked");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, errors);
                }

            } else if ((m > 0) && (λd > 0) && (ud > 0) && (kd > 0)) {
                JOptionPane.showMessageDialog(null, "Can\'t have M with ( λ > u )");

            } else if (m == 0 && (λd > 0) && (ud > 0) && (kd > 0) && (λd <= ud)) {
                JOptionPane.showMessageDialog(null, "M is required when ( λ <= u )");
            } else {
                JOptionPane.showMessageDialog(null, "No Sufficient Positive Valid Data");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }
    }//GEN-LAST:event_getResultsDeterActionPerformed

    private void getGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getGraphActionPerformed

        try {
            double λ = 0.0, u = 0.0;
            int M = 0, K = 0, length = 0;
            DD1 dq;
            if (!jText_λ4.getText().equals("")) {
                String s = jText_λ4.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    λ = first / second;
                } else {
                    λ = Double.parseDouble(jText_λ4.getText());
                }
            }
            if (!jText_u4.getText().equals("")) {
                String s = jText_u4.getText();
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    u = first / second;
                } else {
                    u = Double.parseDouble(jText_u4.getText());
                }
            }
            if (!jText_K3.getText().equals("")) {
                K = Integer.parseInt(jText_K3.getText());
            }
            if (!jtext_M2.getText().equals("")) {
                M = Integer.parseInt(jtext_M2.getText());
            }

            if ((λ > 0) && (u > 0) && (K > 0) && (M == 0) && (u < λ)) {
                Draw demo = new Draw(u, λ, K);
                demo.displayChart();
            } else if ((λ > 0) && (u > 0) && (K > 0) && (M > 0) && (u >= λ)) {
                Draw demo = new Draw(u, λ, K, M);
                demo.displayChart();
            } else if (M == 0 && (λ > 0) && (u > 0) && (K > 0) && (λ <= u)) {
                JOptionPane.showMessageDialog(null, "M is required when ( λ <= u )");
            } else {
                JOptionPane.showMessageDialog(null, "You Should write a possitive λ & u & K ...!!!");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }
    }//GEN-LAST:event_getGraphActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked

    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void getResultsMMCKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getResultsMMCKActionPerformed
        try {
            double λ3 = 0.0, u3 = 0.0;
            int k2 = 0, c2 = 0, n3 = 0;
            MMCK lck6;
            if (!jText_λ3.getText().equals("")) {
                String s = jText_λ3.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    λ3 = first / second;
                } else {
                    λ3 = Double.parseDouble(jText_λ3.getText());
                }
            }
            if (!jText_u3.getText().equals("")) {
                String s = jText_u3.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    u3 = first / second;
                } else {
                    u3 = Double.parseDouble(jText_u3.getText());
                }
            }
            if (!jText_c2.getText().equals("")) {
                c2 = Integer.parseInt(jText_c2.getText());
            }
            if (!jText_n3.getText().equals("")) {
                n3 = Integer.parseInt(jText_n3.getText());
            }
            if (!jText_K2.getText().equals("")) {
                k2 = Integer.parseInt(jText_K2.getText());
            }

            if ((λ3 > 0) && (u3 > 0) && (c2 > 0) && (k2 > 0)) {
                System.out.println("c = " + c2);
                lck6 = new MMCK(λ3, u3, c2, k2);
                double L = lck6.L();
                jText_L1.setText(Double.toString(getPercesoin(L)));
                double Lq = lck6.Lq();
                jText_LQ1.setText(Double.toString(getPercesoin(Lq)));
                double W = lck6.W();
                jText_W1.setText(Double.toString(getPercesoin(W)));
                double Wq = lck6.Wq();
                jText_WQ1.setText(Double.toString(getPercesoin(Wq)));
                double Pci = lck6.Pci();
                jText_Pci2.setText(Double.toString(getPercesoin(Pci)));
                if (n3 == 0) {
                    double Pn = lck6.reverseP0();
                    Pn = 1 / Pn;
                    jText_Pn1.setText(Double.toString(getPercesoin(Pn)));
                } else if (n3 >= 0) {
                    double Pn = lck6.Pn(n3);
                    jText_Pn1.setText(Double.toString(getPercesoin(Pn)));
                } else {
                    JOptionPane.showMessageDialog(null, "N should be a Positive Number");
                }
                double P0 = lck6.reverseP0();
                jText_P01.setText(Double.toString(getPercesoin(P0)));
            } else {
                JOptionPane.showMessageDialog(null, "( λ, u, c, k ) Are Required as Positive Numbers .. !");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }
    }//GEN-LAST:event_getResultsMMCKActionPerformed

    private void getResultMM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getResultMM1ActionPerformed
        try {
            double λ = 0.0, u = 0.0, w = 0.0;
            MM1 mm1;
            if (!λmm1.getText().equals("")) {
                String s = λmm1.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    λ = first / second;
                } else {
                    λ = Double.parseDouble(λmm1.getText());
                }
            }
            if (!umm1.getText().equals("")) {
                String s = umm1.getText();
                // Handle Number / Number
                if (s.contains("/")) {
                    int index = 0;
                    index = s.indexOf("/");
                    double first = Double.parseDouble(s.substring(0, index));
                    double second = Double.parseDouble(s.substring(index + 1, s.length()));
                    u = first / second;
                } else {
                    u = Double.parseDouble(umm1.getText());
                }
            }

            if ((λ > 0) && (u > 0)) {
                mm1 = new MM1(λ, u);

                LMM2.setText("" + mm1.getL()); // L
                LQMM2.setText("" + mm1.getLq()); // Lq
                WQMM2.setText("" + mm1.getWq()); // Wq
                P0MM2.setText("" + mm1.getP0());

            } else {
                JOptionPane.showMessageDialog(null, "No suffiecent Positive Data");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter a valid positive Numbers");
        }

    }//GEN-LAST:event_getResultMM1ActionPerformed

    private void umm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_umm1ActionPerformed

    private void λmm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_λmm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_λmm1ActionPerformed

    private void jtext_MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtext_MActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtext_MActionPerformed

    private void jText_KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_KActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_KActionPerformed

    private void jText_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_uActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_uActionPerformed

    private void jText_λActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_λActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_λActionPerformed

    private void WQMM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WQMM2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WQMM2ActionPerformed

    private void LMM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LMM2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LMM2ActionPerformed

    private void LQMM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LQMM2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LQMM2ActionPerformed

    private void P0MM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P0MM2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P0MM2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LMM2;
    private javax.swing.JTextField LQMM2;
    private javax.swing.JTextField P0MM2;
    private javax.swing.JTextField WQMM2;
    private javax.swing.JCheckBox check_n2;
    private javax.swing.JCheckBox check_ti2;
    private javax.swing.JCheckBox check_w2;
    private javax.swing.JButton getGraph;
    private javax.swing.JButton getResultMM1;
    private javax.swing.JButton getResultsDeter;
    private javax.swing.JButton getResultsMM1K;
    private javax.swing.JButton getResultsMMC;
    private javax.swing.JButton getResultsMMCK;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_nt;
    private javax.swing.JLabel jLabel_ti;
    private javax.swing.JLabel jLabel_wqn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jTextField10;
    private javax.swing.JLabel jTextField11;
    private javax.swing.JLabel jTextField12;
    private javax.swing.JLabel jTextField13;
    private javax.swing.JLabel jTextField14;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel jTextField9;
    private javax.swing.JTextPane jTextField_nt;
    private javax.swing.JTextPane jTextField_ti;
    private javax.swing.JTextPane jTextField_wqn;
    private javax.swing.JTextField jText_K2;
    private javax.swing.JTextField jText_K3;
    private javax.swing.JLabel jText_L;
    private javax.swing.JLabel jText_L1;
    private javax.swing.JLabel jText_LQ;
    private javax.swing.JLabel jText_LQ1;
    private javax.swing.JLabel jText_P0;
    private javax.swing.JLabel jText_P01;
    private javax.swing.JLabel jText_Pci1;
    private javax.swing.JLabel jText_Pci2;
    private javax.swing.JLabel jText_Pn;
    private javax.swing.JLabel jText_Pn1;
    private javax.swing.JLabel jText_W;
    private javax.swing.JLabel jText_W1;
    private javax.swing.JLabel jText_WQ;
    private javax.swing.JLabel jText_WQ1;
    private javax.swing.JTextField jText_c;
    private javax.swing.JTextField jText_c2;
    private javax.swing.JTextField jText_n2;
    private javax.swing.JTextField jText_n3;
    private javax.swing.JTextField jText_u2;
    private javax.swing.JTextField jText_u3;
    private javax.swing.JTextField jText_u4;
    private javax.swing.JTextField jText_λ2;
    private javax.swing.JTextField jText_λ3;
    private javax.swing.JTextField jText_λ4;
    private javax.swing.JTextField jtext_M2;
    private javax.swing.JTextField jtext_n;
    private javax.swing.JTextField jtext_t;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField umm1;
    private javax.swing.JTextField λmm1;
    // End of variables declaration//GEN-END:variables
}
