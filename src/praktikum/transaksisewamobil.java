
package praktikum;


public class transaksisewamobil extends javax.swing.JFrame {


    public transaksisewamobil() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DropDown = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOutput = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        DateBook = new com.toedter.calendar.JDateChooser();
        btnEdit = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("TRANSAKSI SEWA MOBIL");

        jLabel2.setText("Nama Konsumen");

        jLabel3.setText("Book Peminjaman");

        DropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Porsche", "Lamborghini", "Bugatti", "Corvette", "Mazda" }));
        DropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropDownActionPerformed(evt);
            }
        });

        jLabel4.setText("Type Mobil");

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

        btnEdit.setBackground(new java.awt.Color(66, 120, 204));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSimpan.setBackground(new java.awt.Color(66, 120, 204));
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnKembali.setBackground(new java.awt.Color(66, 120, 204));
        btnKembali.setForeground(new java.awt.Color(255, 255, 255));
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(255, 0, 0));
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnTambah.setBackground(new java.awt.Color(66, 120, 204));
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jLabel5.setText("Data Mobil");

        jButton1.setBackground(new java.awt.Color(66, 120, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cek Ready");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(421, 421, 421))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextField1))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(DateBook, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(130, 130, 130)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton1)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnTambah)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEdit)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSimpan)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnHapus)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnKembali)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(81, 81, 81))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(DateBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah)
                            .addComponent(btnEdit)
                            .addComponent(btnSimpan)
                            .addComponent(btnHapus)
                            .addComponent(btnKembali)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DropDownActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // Mendapatkan baris yang dipilih
        int selectedRow = tableOutput.getSelectedRow();

        if (selectedRow != -1) { // Pastikan baris dipilih
            // Mendapatkan nilai dari kolom yang dipilih
            String merek = tableOutput.getValueAt(selectedRow, 0).toString();
            String type = tableOutput.getValueAt(selectedRow, 1).toString();
            String tahunProduksi = tableOutput.getValueAt(selectedRow, 2).toString();
            String nopolisi = tableOutput.getValueAt(selectedRow, 3).toString();
            String hargasewa = tableOutput.getValueAt(selectedRow, 4).toString();

            try {
                // Assuming the date is in "yyyy" format, you can adjust the format if necessary
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date date = sdf.parse(tahunProduksi);
                DateBook.setDate(date);
            } catch (ParseException e) {
                e.printStackTrace();
                DateBook.setDate(null); // Resetting date if parsing fails
            }

            // Mengisi nilai ke dalam field teks
            textMerkMobil.setText(merek);
            DropDown.setSelectedItem(type);
            textNoPolisi.setText(nopolisi);
            textHargaSewa.setText(hargasewa);
            JOptionPane.showMessageDialog(null, "Data ter-edit!");
        } else {
            JOptionPane.showMessageDialog(null, "Silakan pilih baris yang ingin diedit!");
        }

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        String merek = textMerkMobil.getText();
        String type = DropDown.getSelectedItem().toString();
        java.util.Date tanggalProduksi = DateBook.getDate();
        String tahunProduksi = new SimpleDateFormat("yyyy-MM-dd").format(tanggalProduksi);
        String noPolisi = textNoPolisi.getText();
        String hargaSewa = textHargaSewa.getText();

        // Menyimpan data ke database MySQL
        try {
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rentalmobil", "root", "");

            String query = "INSERT INTO datamobil (merek_mobil, type, tahun_produksi, no_polisi, harga_sewa) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(query);
            preparedStatement.setString(1, merek);
            preparedStatement.setString(2, type);
            preparedStatement.setString(3, tahunProduksi);
            preparedStatement.setString(4, noPolisi);
            preparedStatement.setString(5, hargaSewa);

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data berhasil Disimpan!");
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");
                textMerkMobil.setText("");
                DateBook.setDate(null);
                textNoPolisi.setText("");
                textHargaSewa.setText("");

                // Memperbarui tampilan tabel dengan data terbaru
                updateTableData();
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println("Data gagal Disimpan!");
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menyimpan data ke database: " + e.getMessage());
        }
        }

        private void updateTableData() {
            try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rentalmobil", "root", "")) {
                String query = "SELECT * FROM datamobil";
                try (PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(query);
                    ResultSet resultSet = preparedStatement.executeQuery()) {

                    // Retrieve column names dynamically from the ResultSetMetaData
                    ResultSetMetaData metaData = resultSet.getMetaData();
                    int columnCount = metaData.getColumnCount();
                    String[] columnNames = new String[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        columnNames[i - 1] = metaData.getColumnName(i);
                    }

                    // Create a new table model with the column names
                    DefaultTableModel model = new DefaultTableModel(columnNames, 0);

                    // Add rows to the model
                    while (resultSet.next()) {
                        Object[] rowData = new Object[columnCount];
                        for (int i = 1; i <= columnCount; i++) {
                            rowData[i - 1] = resultSet.getObject(i);
                        }
                        model.addRow(rowData);
                    }

                    // Set the new model to the table
                    tableOutput.setModel(model);
                }
            } catch (SQLException e) {
                System.out.println("Gagal memperbarui tabel: " + e.getMessage());
            }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        menu pagemenu = new menu();
        pagemenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // Mendapatkan indeks baris yang dipilih
        int selectedRow = tableOutput.getSelectedRow();

        // Pastikan ada baris yang dipilih
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus");
            return;
        }

        // Konfirmasi penghapusan
        int option = JOptionPane.showConfirmDialog(this, "Anda yakin ingin menghapus baris ini?", "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            try {
                // Menghubungkan ke database
                Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rentalmobil", "root", "");

                // Mendapatkan nilai kolom yang digunakan sebagai kriteria untuk penghapusan
                String merekMobil = (String) tableOutput.getValueAt(selectedRow, 0);
                String type = (String) tableOutput.getValueAt(selectedRow, 1);

                // Membuat pernyataan SQL untuk menghapus baris dari tabel berdasarkan nilai kolom tertentu
                String sql = "DELETE FROM datamobil WHERE merek_mobil = ? AND type = ?";
                PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);
                statement.setString(1, merekMobil);
                statement.setString(2, type);

                // Mengeksekusi pernyataan DELETE
                int rowsDeleted = statement.executeUpdate();
                if (rowsDeleted > 0) {
                    System.out.println("Data berhasil dihapus!");
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
                    // Hapus baris dari model tabel
                    DefaultTableModel model = (DefaultTableModel) tableOutput.getModel();
                    model.removeRow(selectedRow);
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal menghapus Data");
                }

                // Tutup koneksi ke database
                conn.close();
            } catch (SQLException ex) {
                System.out.println("Data gagal dihapus!");
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksisewamobil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateBook;
    private javax.swing.JComboBox<String> DropDown;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableOutput;
    // End of variables declaration//GEN-END:variables
}
