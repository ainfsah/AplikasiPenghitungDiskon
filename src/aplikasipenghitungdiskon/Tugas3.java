/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasipenghitungdiskon;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Tugas3 extends javax.swing.JFrame {


    /**
     * Creates new form 
     */
    public Tugas3() {
        initComponents();
        jComboBox1.setSelectedIndex(0); 
        jSlider2.setValue(0);  
        
        //action listener unutk tombol hitung
    }
    private void hitungDiskon() {
    // Daftar kupon yang valid dan diskon yang terkait
    Map<String, Double> daftarKupon = new HashMap<>();
    daftarKupon.put("DISKON10", 10.0);  // Kupon memberikan diskon 10%
    daftarKupon.put("DISKON20", 20.0);  // Kupon memberikan diskon 20%  
    daftarKupon.put("DISKON50", 50.0);  // Kupon memberikan diskon 50%
    // Ambil inputan dari JTextField kupon
    String kuponText = txtKuponDiskon.getText().trim();

    double kuponDiskon = 0;  // Default nilai diskon jika kupon tidak valid

    // Cek apakah kupon tidak kosong
    if (!kuponText.isEmpty()) {
        // Cek apakah kupon yang dimasukkan ada dalam daftar kupon yang valid
        if (daftarKupon.containsKey(kuponText)) {
            // Ambil diskon dari kupon yang valid
            kuponDiskon = daftarKupon.get(kuponText);
            JOptionPane.showMessageDialog(null, "Kupon valid! Diskon " + kuponDiskon + "% diterapkan.");
        } else {
            JOptionPane.showMessageDialog(null, "Kupon tidak valid! Tidak ada diskon yang diterapkan.");
        }
    } 

    // Variabel untuk menyimpan diskon tambahan (dari ComboBox atau Slider)
    double diskonTambahan = 0;

// Cek apakah pengguna telah memilih diskon dari JComboBox
    String selectedItem = (String) jComboBox1.getSelectedItem();
        if (selectedItem != null && !selectedItem.equals("Pilih Diskon")) {
            diskonTambahan = Double.parseDouble(selectedItem);
        } else {
    // Jika tidak memilih dari JComboBox, gunakan diskon dari JSlider
            diskonTambahan = jSlider2.getValue();
    }
    // Hitung total diskon (dari kupon dan diskon tambahan) 
    double totalDiskon = kuponDiskon + diskonTambahan;
        if (totalDiskon > 100) {
        totalDiskon = 100;  // Total diskon tidak boleh lebih dari 100%
    }
    // Ambil harga asli dari inputan pengguna
    double hargaAsli = Double.parseDouble(txtHargaAsli.getText());
    // Hitung potongan harga dan harga akhir setelah diskon
    double potonganHarga = hargaAsli * (totalDiskon / 100);
    double hargaAkhir = hargaAsli - potonganHarga;
    
    // Tampilkan hasil perhitungan di label
    lblHargaAkhir.setText(String.format("Potongan Harga            = Rp %.2f", potonganHarga));  
    lblDiskon.setText(String.format    ("Harga Akhir               = Rp %.2f", hargaAkhir));

    // Tambahkan riwayat transaksi ke JTextArea
    String riwayat = String.format("Harga Asli: Rp %.2f, Kupon Diskon: %.2f%%, Diskon Tambahan: %.2f%%, Harga Akhir: Rp %.2f\n", 
                                hargaAsli, kuponDiskon, diskonTambahan, hargaAkhir);
    jTextArea1.append(riwayat);

    
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHargaAsli = new javax.swing.JTextField();
        txtKuponDiskon = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSlider2 = new javax.swing.JSlider();
        btnHitung = new javax.swing.JButton();
        lblHargaAkhir = new javax.swing.JLabel();
        lblDiskon = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JButton();
        txtHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setText("Riwayat Diskon Anda");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Masukkan Harga Asli");

        jLabel2.setText("Masukkan Kupon Diskon");

        jLabel3.setText("Diskon");

        txtHargaAsli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaAsliActionPerformed(evt);
            }
        });

        txtKuponDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKuponDiskonActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Diskon", "0", "10", "20", "30", "40", "50", "60", "70", "80", "90", "100" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jSlider2.setForeground(new java.awt.Color(255, 51, 51));
        jSlider2.setMajorTickSpacing(10);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);

        btnHitung.setText("HITUNG");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        lblHargaAkhir.setText("Potongan Harga         =");

        lblDiskon.setText("Harga  Akhir                =");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKuponDiskon)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHargaAsli)
                            .addComponent(jSlider2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDiskon)
                            .addComponent(lblHargaAkhir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtHargaAsli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(txtKuponDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHitung)
                    .addComponent(lblHargaAkhir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDiskon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("APLIKASI PENGHITUNG DISKON");

        btnKeluar.setBackground(new java.awt.Color(255, 0, 0));
        btnKeluar.setText("KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        txtHapus.setText("HAPUS");
        txtHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHapusActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(txtHapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKeluar)
                    .addComponent(txtHapus))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHargaAsliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaAsliActionPerformed
        txtHargaAsli.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // Remove non-digit character
                    JOptionPane.showMessageDialog(null, "Masukkan hanya angka!", "Input Salah", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }//GEN-LAST:event_txtHargaAsliActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        hitungDiskon ();
    }//GEN-LAST:event_btnHitungActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
                                         
    // Mendapatkan item yang dipilih dari JComboBox
    String selectedItem = (String) jComboBox1.getSelectedItem();
    
    // Cek apakah ada item yang dipilih dan apakah bukan default ("Pilih Diskon")
    if (selectedItem != null && !selectedItem.equals("Pilih Diskon")) {
        try {
            // Ubah item yang dipilih menjadi integer (asumsi item berupa angka diskon)
            int diskon = Integer.parseInt(selectedItem);

            // Tambahkan logika jika ada proses yang diperlukan setelah pemilihan diskon
            JOptionPane.showMessageDialog(null, "Diskon " + diskon + "% telah dipilih.");
            
        } catch (NumberFormatException e) {
            // Jika item bukan angka yang valid
            JOptionPane.showMessageDialog(null, "Input tidak valid! Pastikan memilih angka.");
        }
    } else {
        // Jika item "Pilih Diskon" atau belum ada yang dipilih
        JOptionPane.showMessageDialog(null, "Silakan pilih diskon terlebih dahulu.");
    }  

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtKuponDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKuponDiskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKuponDiskonActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
         int response = JOptionPane.showConfirmDialog(this, "Yakin lah pian handak keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

    // Jika pengguna memilih "Yes"
        if (response == JOptionPane.YES_OPTION) {
        System.exit(0); // Keluar dari aplikasi
    }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void txtHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHapusActionPerformed
       txtHargaAsli.setText("");
       txtKuponDiskon.setText("");
       jTextArea1.setText("");
       lblHargaAkhir.setText(" Potongan Diskon = ");
       lblDiskon.setText    (" Harga Akhir     = ");
       
       
    
        txtHargaAsli.requestFocus();  
        txtHargaAsli.selectAll(); 
    }//GEN-LAST:event_txtHapusActionPerformed

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
            java.util.logging.Logger.getLogger(Tugas3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tugas3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tugas3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tugas3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tugas3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblDiskon;
    private javax.swing.JLabel lblHargaAkhir;
    private javax.swing.JButton txtHapus;
    private javax.swing.JTextField txtHargaAsli;
    private javax.swing.JTextField txtKuponDiskon;
    // End of variables declaration//GEN-END:variables

}
