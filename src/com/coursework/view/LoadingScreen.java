/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.coursework.view;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author hp
 */
public class LoadingScreen extends javax.swing.JFrame {
    private Timer timer; // Timer that  updates progress bar
     private int progress = 0; // Progress value used for the loading bar

    /**
     * Creates new form mainScreen
     */
    public LoadingScreen() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startLoading();
    }
    
    // Starts the timer to update the progress bar
    private void startLoading() {
        timer = new Timer(50, (ActionEvent e) -> {
            progress += 2; // Increment progress
            Pbload.setValue(progress); // Set progress bar value
            lblLoadinglabel1.setText("Loading... " + progress + "%");
            
            // Check if loading is complete
            if (progress >= 100) {
                timer.stop(); // Stop the timer
             
            }
        } // Update every 50ms
        );
        timer.start(); // Start the timer
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlloadScreen = new javax.swing.JPanel();
        lblLoadinglabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Pbload = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlloadScreen.setBackground(new java.awt.Color(255, 102, 102));

        lblLoadinglabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLoadinglabel1.setText(" Loading");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("welcome to giftopia");

        Pbload.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout pnlloadScreenLayout = new javax.swing.GroupLayout(pnlloadScreen);
        pnlloadScreen.setLayout(pnlloadScreenLayout);
        pnlloadScreenLayout.setHorizontalGroup(
            pnlloadScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlloadScreenLayout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlloadScreenLayout.createSequentialGroup()
                .addContainerGap(239, Short.MAX_VALUE)
                .addGroup(pnlloadScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlloadScreenLayout.createSequentialGroup()
                        .addComponent(Pbload, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlloadScreenLayout.createSequentialGroup()
                        .addComponent(lblLoadinglabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(351, 351, 351))))
        );
        pnlloadScreenLayout.setVerticalGroup(
            pnlloadScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlloadScreenLayout.createSequentialGroup()
                .addGap(0, 261, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(lblLoadinglabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pbload, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlloadScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlloadScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoadingScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Pbload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLoadinglabel1;
    private javax.swing.JPanel pnlloadScreen;
    // End of variables declaration//GEN-END:variables
}
