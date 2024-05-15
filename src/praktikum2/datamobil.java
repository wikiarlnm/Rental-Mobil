
package praktikum2;

public class datamobil extends javax.swing.JFrame {

    public datamobil() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelMerkMobil = new javax.swing.JLabel();
        LabelTypeMobil = new javax.swing.JLabel();
        LabelTahunProduksi = new javax.swing.JLabel();
        LabelNoPolisi = new javax.swing.JLabel();
        LabelHargaSewa = new javax.swing.JLabel();
        textTahunProduksi = new javax.swing.JTextField();
        textNoPolisi = new javax.swing.JTextField();
        textHargaSewa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        DropDown = new javax.swing.JComboBox<>();
        textMerkMobil = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOutput = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("DATA MOBIL");

        labelMerkMobil.setText("Merek Mobil");

        LabelTypeMobil.setText("Type Mobil");

        LabelTahunProduksi.setText("Tahun Produksi");

        LabelNoPolisi.setText("No. Polisi");

        LabelHargaSewa.setText("Harga Sewa");

        jButton1.setBackground(new java.awt.Color(66, 120, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Tambah");

        jButton2.setBackground(new java.awt.Color(66, 120, 204));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Edit");

        jButton3.setBackground(new java.awt.Color(66, 120, 204));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Simpan");

        btnKembali.setBackground(new java.awt.Color(66, 120, 204));
        btnKembali.setForeground(new java.awt.Color(255, 255, 255));
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Hapus");

        DropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Porsche", "Lamborghini", "Bugatti", "Corvette", "Mazda" }));
        DropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropDownActionPerformed(evt);
            }
        });

        tableOutput.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableOutput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LabelTypeMobil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelMerkMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(41, 41, 41)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textMerkMobil)
                                .addComponent(DropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LabelNoPolisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelHargaSewa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelTahunProduksi))
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textNoPolisi)
                                .addComponent(textTahunProduksi)
                                .addComponent(textHargaSewa)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2)
                            .addGap(18, 18, 18)
                            .addComponent(jButton3)
                            .addGap(18, 18, 18)
                            .addComponent(jButton5)
                            .addGap(18, 18, 18)
                            .addComponent(btnKembali)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addGap(161, 161, 161)))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(labelMerkMobil))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(48, 48, 48)
                        .addComponent(textMerkMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelTypeMobil)
                    .addComponent(DropDown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelTahunProduksi)
                    .addComponent(textTahunProduksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNoPolisi)
                    .addComponent(textNoPolisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelHargaSewa)
                    .addComponent(textHargaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5)
                    .addComponent(btnKembali))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DropDownActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
    menu pagemenu = new menu();
    pagemenu.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new datamobil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DropDown;
    private javax.swing.JLabel LabelHargaSewa;
    private javax.swing.JLabel LabelNoPolisi;
    private javax.swing.JLabel LabelTahunProduksi;
    private javax.swing.JLabel LabelTypeMobil;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMerkMobil;
    private javax.swing.JTable tableOutput;
    private javax.swing.JTextField textHargaSewa;
    private javax.swing.JTextField textMerkMobil;
    private javax.swing.JTextField textNoPolisi;
    private javax.swing.JTextField textTahunProduksi;
    // End of variables declaration//GEN-END:variables
}
