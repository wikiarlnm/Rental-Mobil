
package praktikum;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;


public class datamotor extends javax.swing.JFrame {


    public datamotor() {
        initComponents();
        updateTableData();
    }


    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableOutput = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        LabelNama = new javax.swing.JLabel();
        LabelTypeMotor = new javax.swing.JLabel();
        textTahunProduksi = new javax.swing.JLabel();
        LabelNoPolisi = new javax.swing.JLabel();
        LabelHargaSewa = new javax.swing.JLabel();
        textNamaMotor = new javax.swing.JTextField();
        jDateProduksi = new com.toedter.calendar.JDateChooser();
        textNoPolisi = new javax.swing.JTextField();
        textHargaSewa = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        DropdownTypeMotor = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel1.setText("DATA MOTOR");

        LabelNama.setText("Nama Motor");

        LabelTypeMotor.setText("Type Motor");

        textTahunProduksi.setText("Tahun Produksi");

        LabelNoPolisi.setText("No Polisi");

        LabelHargaSewa.setText("Harga Sewa");

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

        btnEdit.setBackground(new java.awt.Color(66, 120, 204));
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");

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

        DropdownTypeMotor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ducati", "Mv Agusta", "Kawasaki", "Honda", "Yamaha" }));
        DropdownTypeMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DropdownTypeMotorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(66, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelTypeMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textTahunProduksi, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelNoPolisi, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelHargaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDateProduksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textNoPolisi)
                                    .addComponent(textHargaSewa, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                                    .addComponent(DropdownTypeMotor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textNamaMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit)
                                .addGap(18, 18, 18)
                                .addComponent(btnSimpan)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapus)
                                .addGap(18, 18, 18)
                                .addComponent(btnKembali)))
                        .addGap(59, 59, 59)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelNama)
                            .addComponent(textNamaMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelTypeMotor)
                            .addComponent(DropdownTypeMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textTahunProduksi)
                            .addComponent(jDateProduksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelNoPolisi)
                            .addComponent(textNoPolisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelHargaSewa)
                            .addComponent(textHargaSewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah)
                            .addComponent(btnEdit)
                            .addComponent(btnSimpan)
                            .addComponent(btnHapus)
                            .addComponent(btnKembali)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        String merek = textNamaMotor.getText();
        String type = DropdownTypeMotor.getSelectedItem().toString();
        java.util.Date tanggalProduksi = jDateProduksi.getDate();
        String tahunProduksi = new SimpleDateFormat("yyyy-MM-dd").format(tanggalProduksi);
        String noPolisi = textNoPolisi.getText();
        String hargaSewa = textHargaSewa.getText();

        // Menyimpan data ke database MySQL
        try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rentalmobil", "root", "")) {
            String query = "INSERT INTO datamotor (merek_motor, type, tahun_produksi, no_polisi, harga_sewa) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(query)) {
                preparedStatement.setString(1, merek);
                preparedStatement.setString(2, type);
                preparedStatement.setString(3, tahunProduksi);
                preparedStatement.setString(4, noPolisi);
                preparedStatement.setString(5, hargaSewa);

                int rowsInserted = preparedStatement.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Data berhasil Disimpan!");
                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");

                    // Clear input fields
                    textNamaMotor.setText("");
                    jDateProduksi.setDate(null);
                    textNoPolisi.setText("");
                    LabelHargaSewa.setText("");

                    // Memperbarui tampilan tabel dengan data terbaru
                    updateTableData();
                }
            }
        } catch (SQLException e) {
            System.out.println("Data gagal Disimpan!");
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat menyimpan data ke database: " + e.getMessage());
        }
    }

    private void updateTableData() {
        try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/rentalmobil", "root", "")) {
            String query = "SELECT * FROM datamotor";
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

    private void DropdownTypeMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DropdownTypeMotorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DropdownTypeMotorActionPerformed

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
            String sql = "DELETE FROM datamotor WHERE merek_motor = ? AND type = ?";
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
                new datamotor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DropdownTypeMotor;
    private javax.swing.JLabel LabelHargaSewa;
    private javax.swing.JLabel LabelNama;
    private javax.swing.JLabel LabelNoPolisi;
    private javax.swing.JLabel LabelTypeMotor;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private com.toedter.calendar.JDateChooser jDateProduksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableOutput;
    private javax.swing.JTextField textHargaSewa;
    private javax.swing.JTextField textNamaMotor;
    private javax.swing.JTextField textNoPolisi;
    private javax.swing.JLabel textTahunProduksi;
    // End of variables declaration//GEN-END:variables
}
