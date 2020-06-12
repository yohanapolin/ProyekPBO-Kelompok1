/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lemonshop;


public class jframe_Home_Buah extends javax.swing.JFrame {
      AddBuah addbuah = new AddBuah();
      SeachBuah searchbuah = new SeachBuah();
      UpdateStok updatestok = new UpdateStok();
      DataBuah databuah = new DataBuah();
    public jframe_Home_Buah() {
        initComponents();
        addbuah.setDefaultCloseOperation(HIDE_ON_CLOSE);
        searchbuah.setDefaultCloseOperation(HIDE_ON_CLOSE);
        updatestok.setDefaultCloseOperation(HIDE_ON_CLOSE);
        databuah.setDefaultCloseOperation(HIDE_ON_CLOSE);
      
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonEdit = new javax.swing.JButton();
        buttonseach = new javax.swing.JButton();
        buttonadd = new javax.swing.JButton();
        labelMenu = new javax.swing.JLabel();
        buttonData = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonEdit.setText("EDIT STOK");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonseach.setText("SEARCH BUAH");
        buttonseach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonseachActionPerformed(evt);
            }
        });

        buttonadd.setText("ADD DATA BUAH");
        buttonadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonaddActionPerformed(evt);
            }
        });

        labelMenu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelMenu.setText("Select Menu Buah ");

        buttonData.setText("DATA BUAH");
        buttonData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(labelMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonData, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(buttonseach, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonadd)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(labelMenu)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonadd)
                    .addComponent(buttonEdit))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonseach)
                    .addComponent(buttonData))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonaddActionPerformed
        // TODO add your handling code here:
        addbuah.setVisible(true);
        
        
    }//GEN-LAST:event_buttonaddActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        // TODO add your handling code here:
        updatestok.setVisible(true);
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonseachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonseachActionPerformed
        // TODO add your handling code here:
        searchbuah.setVisible(true);
        
    }//GEN-LAST:event_buttonseachActionPerformed

    private void buttonDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDataActionPerformed
      databuah.setVisible(true);
    }//GEN-LAST:event_buttonDataActionPerformed
    
   
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
            java.util.logging.Logger.getLogger(jframe_Home_Buah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jframe_Home_Buah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jframe_Home_Buah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jframe_Home_Buah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jframe_Home_Buah().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonData;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonadd;
    private javax.swing.JButton buttonseach;
    private javax.swing.JLabel labelMenu;
    // End of variables declaration//GEN-END:variables
}
