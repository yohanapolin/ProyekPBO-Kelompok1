/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok_01_lemonfruitshop;

public class SistemHome extends javax.swing.JFrame {

   Buahhome buah = new Buahhome();
   Catatanrestockhome catt = new Catatanrestockhome();
   Laporanhome lapor = new Laporanhome();
   RakBuah_Add rakk = new RakBuah_Add();
   TransaksiJFrame trans = new TransaksiJFrame();
    public SistemHome() {
        initComponents();
        buah.setDefaultCloseOperation(HIDE_ON_CLOSE);
        catt.setDefaultCloseOperation(HIDE_ON_CLOSE);
        lapor.setDefaultCloseOperation(HIDE_ON_CLOSE);
        rakk.setDefaultCloseOperation(HIDE_ON_CLOSE);
        trans.setDefaultCloseOperation(HIDE_ON_CLOSE);
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
        transbb = new javax.swing.JButton();
        buahbb = new javax.swing.JButton();
        restockbb = new javax.swing.JButton();
        lappbb = new javax.swing.JButton();
        rakbb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LemonFruit Shop");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Lemon Fruit Shop");

        transbb.setText("Transaksi");
        transbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transbbActionPerformed(evt);
            }
        });

        buahbb.setText("Buah");
        buahbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buahbbActionPerformed(evt);
            }
        });

        restockbb.setText("Restock");
        restockbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restockbbActionPerformed(evt);
            }
        });

        lappbb.setText("Laporan");
        lappbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lappbbActionPerformed(evt);
            }
        });

        rakbb.setText("Rak Buah");
        rakbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rakbbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(restockbb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transbb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rakbb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buahbb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lappbb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(transbb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buahbb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rakbb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(restockbb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lappbb)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transbbActionPerformed
        trans.setVisible(true);
    }//GEN-LAST:event_transbbActionPerformed

    private void buahbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buahbbActionPerformed
        buah.setVisible(true);
    }//GEN-LAST:event_buahbbActionPerformed

    private void lappbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lappbbActionPerformed
       lapor.setVisible(true);
    }//GEN-LAST:event_lappbbActionPerformed

    private void restockbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restockbbActionPerformed
        catt.setVisible(true);
    }//GEN-LAST:event_restockbbActionPerformed

    private void rakbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rakbbActionPerformed
        rakk.setVisible(true);
    }//GEN-LAST:event_rakbbActionPerformed

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
            java.util.logging.Logger.getLogger(SistemHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buahbb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lappbb;
    private javax.swing.JButton rakbb;
    private javax.swing.JButton restockbb;
    private javax.swing.JButton transbb;
    // End of variables declaration//GEN-END:variables
}
