package kelompok_01_lemonfruitshop;

public class Catatantulis extends javax.swing.JFrame {
    DbHandler a = new DbHandler();
    
    
    public Catatantulis() {
        initComponents();
        this.req.setText("");
        this.req1.setText("");
        this.req2.setText("");
        this.req3.setText("");
        this.req4.setText("");
        this.req5.setText("");
        this.done.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        f11 = new javax.swing.JTextField();
        f22 = new javax.swing.JTextField();
        f33 = new javax.swing.JTextField();
        f44 = new javax.swing.JTextField();
        f55 = new javax.swing.JTextField();
        f66 = new javax.swing.JTextField();
        addbb = new javax.swing.JButton();
        req = new javax.swing.JLabel();
        req1 = new javax.swing.JLabel();
        req2 = new javax.swing.JLabel();
        req3 = new javax.swing.JLabel();
        req4 = new javax.swing.JLabel();
        req5 = new javax.swing.JLabel();
        done = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tulis Catatan Restock");

        jLabel2.setText("ID");

        jLabel3.setText("Tanggal Transaksi");

        jLabel4.setText("Jenis Buah");

        jLabel5.setText("Jumlah (Kg)");

        jLabel6.setText("Supplier");

        jLabel7.setText("Harga Beli");

        f33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f33ActionPerformed(evt);
            }
        });

        addbb.setText("Add");
        addbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbbActionPerformed(evt);
            }
        });

        req.setText("Required!");

        req1.setText("Required!");

        req2.setText("Required!");

        req3.setText("Required!");

        req4.setText("Required!");

        req5.setText("Required!");

        done.setText("Done!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(f11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(f33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(f55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(f44, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(40, 40, 40)
                                .addComponent(f22, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(f66, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jLabel1)))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(done)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(req)
                        .addComponent(req5)
                        .addComponent(req4)
                        .addComponent(req3)
                        .addComponent(req2)
                        .addComponent(req1))
                    .addComponent(addbb))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(f11, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(req))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(f22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(req1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(f33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(req2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(f44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(req3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(f55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(req4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(f66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(req5))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbb)
                    .addComponent(done))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void f33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f33ActionPerformed

    private void addbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbbActionPerformed
        if(this.f11.getText().isEmpty()) {
            this.req.setText("Required!");
        } else {
            this.req.setText("");
        }
        if (this.f22.getText().isEmpty()){
            this.req1.setText("Required!");
        } else {
            this.req1.setText("");
        }
        if (this.f33.getText().isEmpty()){
            this.req2.setText("Required!");
        } else {
            this.req2.setText("");
        }
        if (this.f44.getText().isEmpty()){
            this.req3.setText("Required!");
        } else {
            this.req3.setText("");
        }
        if (this.f44.getText().isEmpty()){
            this.req3.setText("Required!");
        } else {
            this.req3.setText("");
        }
        if (this.f55.getText().isEmpty()){
            this.req4.setText("Required!");
        } else {
            this.req4.setText("");
        }
        if (this.f66.getText().isEmpty()){
            this.req5.setText("Required!");
        } else {
            this.req5.setText("");
        }
        
        a.connect("localhost", "db_lemonshop", "root", "Sidabutar");
        if(!"Required!".equals(this.req.getText())&& !"Required!".equals(this.req1.getText())&& !"Required !".equals(this.req2.getText()) && !"Required !".equals(this.req3.getText())&& !"Required !".equals(this.req4.getText())&& !"Required !".equals(this.req5.getText())){
           a.addCatatan_restock(this.f11.getText(), this.f22.getText(), this.f33.getText(), this.f44.getText(), this.f55.getText(), this.f66.getText());
           this.done.setText("Done!");
           this.f11.setText("");
           this.f22.setText("");
           this.f33.setText("");
           this.f44.setText("");
           this.f55.setText("");
           this.f66.setText("");
        }
        
        else {
                this.done.setText("");
           
        }
        a.disconnect();
    }//GEN-LAST:event_addbbActionPerformed

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
            java.util.logging.Logger.getLogger(Catatantulis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catatantulis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catatantulis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catatantulis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catatantulis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbb;
    private javax.swing.JLabel done;
    private javax.swing.JTextField f11;
    private javax.swing.JTextField f22;
    private javax.swing.JTextField f33;
    private javax.swing.JTextField f44;
    private javax.swing.JTextField f55;
    private javax.swing.JTextField f66;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel req;
    private javax.swing.JLabel req1;
    private javax.swing.JLabel req2;
    private javax.swing.JLabel req3;
    private javax.swing.JLabel req4;
    private javax.swing.JLabel req5;
    // End of variables declaration//GEN-END:variables
}
