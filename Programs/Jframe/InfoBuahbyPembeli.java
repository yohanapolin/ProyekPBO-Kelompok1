/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lemonshop;




public class InfoBuahbyPembeli extends javax.swing.JFrame {

    DbHandler a = new DbHandler();

    public InfoBuahbyPembeli() {
        initComponents();
        label_found.setText("");

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idsearch = new javax.swing.JTextField();
        idBuah = new javax.swing.JLabel();
        info_nama = new javax.swing.JLabel();
        info_harga = new javax.swing.JLabel();
        info_kadaluarsa = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        label_found = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Check Info Buah");

        jLabel2.setText("ID_BUAH");

        idsearch.setForeground(new java.awt.Color(102, 102, 102));
        idsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idsearchActionPerformed(evt);
            }
        });

        idBuah.setText("ID_BUAH");

        info_nama.setText("Nama :");

        info_harga.setText("Harga :");

        info_kadaluarsa.setText("Kadaluarsa :");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        label_found.setText("Not Found !");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info_kadaluarsa)
                    .addComponent(info_harga)
                    .addComponent(info_nama)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idBuah)
                        .addGap(18, 18, 18)
                        .addComponent(label_found))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(idsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchButton)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idBuah)
                    .addComponent(label_found))
                .addGap(18, 18, 18)
                .addComponent(info_nama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(info_harga)
                .addGap(18, 18, 18)
                .addComponent(info_kadaluarsa)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idsearchActionPerformed
        // TODO add your handling code here:

        idsearch.setText("");


    }//GEN-LAST:event_idsearchActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        if ("".equals(idsearch.getText())) {
            label_found.setText("");
            this.info_nama.setText("Nama Buah : ");
            this.info_harga.setText("Harga : ");
          //  this.info_stok.setText("Stok : ");
            this.info_kadaluarsa.setText("Kadaluarsa : ");
           // this.info_IDRak.setText("ID RAK : ");
        } else {
            a.connect("localhost", "db_lemonshop", "root", "yohana2809");
            //disini
           
           Buah id = a.getinfobuah(idsearch.getText());
           
       
            if (id  == null ) {
           label_found.setText("");
           this.idBuah.setText("ID Buah     :"+ idsearch.getText()+ "not found!");
           this.info_nama.setText("Nama Buah    :");
           this.info_harga.setText("Harga   :");
           // this.info_stok.setText("Stok :  ");
            this.info_kadaluarsa.setText("Kadaluarsa    :");
           // this.info_IDRak.setText("ID Rak : ");
               
            } else {
                
                
           label_found.setText("");
            this.idBuah.setText("ID Buah    : " + id.getID_buah());
            this.info_nama.setText("Nama Buah   : "+ id.getName());
            this.info_harga.setText("Harga   :"+ id.getHarga());
           // this.info_stok.setText("Stok : "+ id.getStok());
            this.info_kadaluarsa.setText("Kadaluarsa    :"+ id.getkadaluarsa());
         //   this.info_IDRak.setText("ID Rak : " + p.getID());
            idsearch.setText("");
            }
            
        

        }


    }//GEN-LAST:event_searchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(InfoBuahbyPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InfoBuahbyPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InfoBuahbyPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoBuahbyPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InfoBuahbyPembeli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel idBuah;
    private javax.swing.JTextField idsearch;
    private javax.swing.JLabel info_harga;
    private javax.swing.JLabel info_kadaluarsa;
    private javax.swing.JLabel info_nama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_found;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
