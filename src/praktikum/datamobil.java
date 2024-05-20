
package praktikum;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.sql.ResultSetMetaData;
import java.text.ParseException;
import java.util.Date;



public class datamobil extends javax.swing.JFrame {

    public datamobil() {
        initComponents();
        updateTableData();
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
        textNoPolisi = new javax.swing.JTextField();
        textHargaSewa = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        DropDown = new javax.swing.JComboBox<>();
        textMerkMobil = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOutput = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("DATA MOBIL");

        labelMerkMobil.setText("Merek Mobil");

        LabelTypeMobil.setText("Type Mobil");

        LabelTahunProduksi.setText("Tahun Produksi");

        LabelNoPolisi.setText("No. Polisi");

        LabelHargaSewa.setText("Harga Sewa");

        btnTambah.setBackground(new java.awt.Color(66, 120, 204));
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah");

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

        DropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Porsche", "Lamborghini", "Bugatti", "Corvette", "Mazda" }));
        DropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropDownActionPerformed(evt);
            }
        });

        tableOutput.setBackground(new java.awt.Color(204, 204, 204));
        tableOutput.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LabelTypeMobil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelMerkMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(53, 53, 53)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(DropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textMerkMobil)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LabelNoPolisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelHargaSewa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LabelTahunProduksi))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textNoPolisi, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                                .addComponent(textHargaSewa)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnTambah)
                            .addGap(18, 18, 18)
                            .addComponent(btnEdit)
                            .addGap(18, 18, 18)
                            .addComponent(btnSimpan)
                            .addGap(18, 18, 18)
                            .addComponent(btnHapus)
                            .addGap(18, 18, 18)
                            .addComponent(btnKembali))))
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
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(btnTambah)
                    .addComponent(btnEdit)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus)
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

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
    String merek = textMerkMobil.getText();
    String type = DropDown.getSelectedItem().toString();
    java.util.Date tanggalProduksi = jDateChooser1.getDate();
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
            jDateChooser1.setDate(null);
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
        jDateChooser1.setDate(date);
        } catch (ParseException e) {
        e.printStackTrace();
        jDateChooser1.setDate(null); // Resetting date if parsing fails
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
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelMerkMobil;
    private javax.swing.JTable tableOutput;
    private javax.swing.JTextField textHargaSewa;
    private javax.swing.JTextField textMerkMobil;
    private javax.swing.JTextField textNoPolisi;
    // End of variables declaration//GEN-END:variables
}
