/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok_01_lemonfruitshop;

import kelompok_01_lemonfruitshop.DbHandler;

public class Buahadd extends javax.swing.JFrame {
DbHandler a = new DbHandler();
   
    
    public Buahadd() {
        initComponents(); 
        this.req.setText("");
       this.req1.setText("");
       this.req2.setText("");
       this.req3.setText("");
       this.req4.setText("");
       this.req5.setText("");
        this.successed.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        req6 = new javax.swing.JLabel();
        label_id = new javax.swing.JLabel();
        label_nama = new javax.swing.JLabel();
        label_stok = new javax.swing.JLabel();
        label_harga = new javax.swing.JLabel();
        label_kadalursa = new javax.swing.JLabel();
        label_rak = new javax.swing.JLabel();
        FID = new javax.swing.JTextField();
        FNAMA = new javax.swing.JTextField();
        FSTOK = new javax.swing.JTextField();
        FHARGA = new javax.swing.JTextField();
        FKADALURSA = new javax.swing.JTextField();
        FRAK = new javax.swing.JTextField();
        AddBuah = new javax.swing.JButton();
        successed = new javax.swing.JLabel();
        req = new javax.swing.JLabel();
        req1 = new javax.swing.JLabel();
        req2 = new javax.swing.JLabel();
        req3 = new javax.swing.JLabel();
        req4 = new javax.swing.JLabel();
        req5 = new javax.swing.JLabel();

        req6.setText("required!");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_id.setText("ID BUAH");

        label_nama.setText("NAMA  BUAH");

        label_stok.setText("STOK");

        label_harga.setText("HARGA");

        label_kadalursa.setText("KADALUARSA");

        label_rak.setText("ID RAK");

        FID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FIDActionPerformed(evt);
            }
        });

        FNAMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNAMAActionPerformed(evt);
            }
        });

        FKADALURSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FKADALURSAActionPerformed(evt);
            }
        });

        AddBuah.setText("ADD");
        AddBuah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBuahActionPerformed(evt);
            }
        });

        successed.setText("Successed!");

        req.setText("required!");

        req1.setText("required!");

        req2.setText("required!");

        req3.setText("required!");

        req4.setText("required!");

        req5.setText("required!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(successed)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddBuah))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_id)
                            .addComponent(label_nama)
                            .addComponent(label_stok)
                            .addComponent(label_harga)
                            .addComponent(label_kadalursa)
                            .addComponent(label_rak))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FID)
                            .addComponent(FNAMA)
                            .addComponent(FSTOK)
                            .addComponent(FHARGA)
                            .addComponent(FKADALURSA)
                            .addComponent(FRAK, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(req)
                    .addComponent(req3)
                    .addComponent(req4)
                    .addComponent(req5)
                    .addComponent(req1)
                    .addComponent(req2))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(label_id)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(req))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_nama)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FNAMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(req1)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_stok)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FSTOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(req2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_harga)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FHARGA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(req3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FKADALURSA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(req4))
                    .addComponent(label_kadalursa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_rak)
                    .addComponent(FRAK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(req5))
                .addGap(20, 20, 20)
                .addComponent(successed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddBuah))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBuahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBuahActionPerformed
 if(this.FID.getText().isEmpty() ){
            this.req.setText("Required !");
        }else{
            this.req.setText("");
        }
   if(this.FNAMA.getText().isEmpty() ){
            this.req1.setText("Required !");
        }else{
            this.req1.setText("");
        }
   if(this.FSTOK.getText().isEmpty() ){
            this.req2.setText("Required !");
        }else{
            this.req2.setText("");
        }
   if(this.FHARGA.getText().isEmpty() ){
            this.req3.setText("Required !");
        }else{
            this.req3.setText("");
        }
   if(this.FKADALURSA.getText().isEmpty() ){
            this.req4.setText("Required !");
        }else{
            this.req4.setText("");
        }
   if(this.FRAK.getText().isEmpty() ){
            this.req5.setText("Required !");
           
        }else{
            this.req5.setText("");
           
        }
   
        a.connect("localhost", "db_lemonshop", "root", "Sidabutar");
      if( !"Required !".equals(this.req.getText())  && !"Required !".equals(this.req1.getText())&& !"Required !".equals(this.req2.getText()) && !"Required !".equals(this.req3.getText()) && !"Required !".equals(this.req4.getText()) && !"Required !".equals(this.req3.getText()) && !"Required !".equals(this.req5.getText())){
          a.Buah(this.FID.getText(), this.FNAMA.getText(), this.FHARGA.getText() , this.FSTOK.getText() , this.FKADALURSA.getText(), this.FRAK.getText() );
          this.successed.setText("Successed");
          this.FID.setText("");
          this.FNAMA.setText("");
          this.FHARGA.setText("");
          this.FSTOK.setText("");
          this.FKADALURSA.setText("");
          this.FRAK.setText("");
          
      }
      else{
          this.successed.setText("");
        }
        a.disconnect();

    }//GEN-LAST:event_AddBuahActionPerformed

    private void FNAMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNAMAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNAMAActionPerformed

    private void FIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FIDActionPerformed

    private void FKADALURSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FKADALURSAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FKADALURSAActionPerformed

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
            java.util.logging.Logger.getLogger(Buahadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buahadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buahadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buahadd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buahadd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBuah;
    private javax.swing.JTextField FHARGA;
    private javax.swing.JTextField FID;
    private javax.swing.JTextField FKADALURSA;
    private javax.swing.JTextField FNAMA;
    private javax.swing.JTextField FRAK;
    private javax.swing.JTextField FSTOK;
    private javax.swing.JLabel label_harga;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_kadalursa;
    private javax.swing.JLabel label_nama;
    private javax.swing.JLabel label_rak;
    private javax.swing.JLabel label_stok;
    private javax.swing.JLabel req;
    private javax.swing.JLabel req1;
    private javax.swing.JLabel req2;
    private javax.swing.JLabel req3;
    private javax.swing.JLabel req4;
    private javax.swing.JLabel req5;
    private javax.swing.JLabel req6;
    private javax.swing.JLabel successed;
    // End of variables declaration//GEN-END:variables
}
