package lemonshop;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ITD
 */
public class lihatcatatan extends javax.swing.JFrame {
    tuliscatatan add = new tuliscatatan();
    List <Catatan_restock> catt = new ArrayList<Catatan_restock>();
    DbHandler a = new DbHandler();
    int lps = 0;
    int maxi = 0;
    
   
    public lihatcatatan() {
        initComponents();
        add.setDefaultCloseOperation(HIDE_ON_CLOSE);
        
        refresh();
        reset();
    }
    
     public void refresh(){
        a.connect("localhost","db_lemonshop","root","yohana2809");
        this.catt = a.getallcatatan();
        this.maxi = a.counter;
        a.disconnect();
    }
    
    public void reset(){
        if(this.maxi > 0) {
            this.lps = 0;
            this.id.setText ("ID.Restock : " + catt.get(0).getid());
            this.tanggal.setText ("Tanggal Restock : " + catt.get(0).gettanggal());
            this.jenis.setText ("Jenis Buah : " + catt.get(0).getjenis());
            this.jumlah.setText ("Jumlah (Kg) : " + catt.get(0).getjumlah());
            this.harga.setText ("Harga (Rp) : " + catt.get(0).getharga());
            this.sup.setText ("Supplier : " + catt.get(0).getsup());
            
        }
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
        id = new javax.swing.JLabel();
        tanggal = new javax.swing.JLabel();
        jenis = new javax.swing.JLabel();
        jumlah = new javax.swing.JLabel();
        sup = new javax.swing.JLabel();
        harga = new javax.swing.JLabel();
        addbb = new javax.swing.JButton();
        nextbb = new javax.swing.JButton();
        prevbb = new javax.swing.JButton();
        refbb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Catatan Restock");

        id.setText("ID Restock");

        tanggal.setText("Tanggal Restock");

        jenis.setText("Jenis Buah");

        jumlah.setText("Jumlah (Kg)");

        sup.setText("Supplier");

        harga.setText("Harga Beli");

        addbb.setText("Add");
        addbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbbActionPerformed(evt);
            }
        });

        nextbb.setText("Next");
        nextbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbbActionPerformed(evt);
            }
        });

        prevbb.setText("Prev");
        prevbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevbbActionPerformed(evt);
            }
        });

        refbb.setText("Refresh");
        refbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refbbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(id))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tanggal))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jenis))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jumlah))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(sup))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(harga)))
                        .addGap(0, 134, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(prevbb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nextbb))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(refbb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addbb)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbb)
                    .addComponent(refbb))
                .addGap(16, 16, 16)
                .addComponent(id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tanggal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jenis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jumlah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(harga)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextbb)
                    .addComponent(prevbb))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prevbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevbbActionPerformed
       refresh();
        if(this.maxi > 0) {
            lps = (lps + 1) % maxi;
            this.id.setText ("ID.Restock : " + catt.get(lps).getid());
            this.tanggal.setText ("Tanggal Restock : " + catt.get(lps).gettanggal());
            this.jenis.setText ("Jenis Buah : " + catt.get(lps).getjenis());
            this.jumlah.setText ("Jumlah (Kg) : " + catt.get(lps).getjumlah());
            this.harga.setText ("Harga (Rp) : " + catt.get(lps).getharga());
            this.sup.setText ("Supplier : " + catt.get(lps).getsup());
        }
    }//GEN-LAST:event_prevbbActionPerformed

    private void addbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbbActionPerformed
      add.setVisible(true);
    }//GEN-LAST:event_addbbActionPerformed

    private void nextbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbbActionPerformed
        refresh();
        if(this.maxi > 0) {
            lps = (lps + 1) % maxi;
              this.id.setText ("ID.Restock : " + catt.get(lps).getid());
            this.tanggal.setText ("Tanggal Restock : " + catt.get(lps).gettanggal());
            this.jenis.setText ("Jenis Buah : " + catt.get(lps).getjenis());
            this.jumlah.setText ("Jumlah (Kg) : " + catt.get(lps).getjumlah());
            this.harga.setText ("Harga (Rp) : " + catt.get(lps).getharga());
            this.sup.setText ("Supplier : " + catt.get(lps).getsup());
        }
    }//GEN-LAST:event_nextbbActionPerformed

    private void refbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refbbActionPerformed
        refresh();
        reset();
    }//GEN-LAST:event_refbbActionPerformed

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
            java.util.logging.Logger.getLogger(lihatcatatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lihatcatatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lihatcatatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lihatcatatan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lihatcatatan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbb;
    private javax.swing.JLabel harga;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jenis;
    private javax.swing.JLabel jumlah;
    private javax.swing.JButton nextbb;
    private javax.swing.JButton prevbb;
    private javax.swing.JButton refbb;
    private javax.swing.JLabel sup;
    private javax.swing.JLabel tanggal;
    // End of variables declaration//GEN-END:variables
}
