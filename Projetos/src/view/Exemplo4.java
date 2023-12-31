package view;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Geral
 */
public class Exemplo4 extends javax.swing.JFrame {

    /**
     * Creates new form Exemplo4
     */
    public Exemplo4() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonVerificar = new javax.swing.JButton();
        jButtonMarcar = new javax.swing.JButton();
        jButtonDesmarcar = new javax.swing.JButton();
        jCheckBoxInformatica = new javax.swing.JCheckBox();
        jCheckBoxIngles = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonVerificar.setText("Verificar");
        jButtonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarActionPerformed(evt);
            }
        });

        jButtonMarcar.setText("Marcar");
        jButtonMarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMarcarActionPerformed(evt);
            }
        });

        jButtonDesmarcar.setText("Desmarcar");
        jButtonDesmarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesmarcarActionPerformed(evt);
            }
        });

        jCheckBoxInformatica.setSelected(true);
        jCheckBoxInformatica.setText("Informatica");
        jCheckBoxInformatica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxInformaticaActionPerformed(evt);
            }
        });

        jCheckBoxIngles.setText("Ingles");
        jCheckBoxIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxInglesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDesmarcar)
                    .addComponent(jCheckBoxIngles)
                    .addComponent(jCheckBoxInformatica)
                    .addComponent(jButtonVerificar)
                    .addComponent(jButtonMarcar))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jCheckBoxIngles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxInformatica)
                .addGap(28, 28, 28)
                .addComponent(jButtonVerificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDesmarcar)
                .addGap(2, 2, 2)
                .addComponent(jButtonMarcar)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarActionPerformed
            String selecao = "Selecionados: ";
            if (jCheckBoxIngles.isSelected()){
                selecao +="\n"+jCheckBoxIngles.getText();
            }
            if (jCheckBoxInformatica.isSelected()){
                selecao+="\n"+jCheckBoxInformatica.getText();
                
            }
            if(!jCheckBoxIngles.isSelected() && !jCheckBoxInformatica.isSelected()){
                JOptionPane.showMessageDialog(null, "Se é loco doidãooo");
            }else {
                JOptionPane.showMessageDialog(null, selecao);
            }
    }//GEN-LAST:event_jButtonVerificarActionPerformed

    private void jButtonMarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMarcarActionPerformed
        jCheckBoxInformatica.setSelected(true);
        jCheckBoxIngles.setSelected(true);
    }//GEN-LAST:event_jButtonMarcarActionPerformed

    private void jCheckBoxInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxInglesActionPerformed
        jCheckBoxInformatica.setSelected(true);
        jCheckBoxIngles.setSelected(true);
    }//GEN-LAST:event_jCheckBoxInglesActionPerformed

    private void jButtonDesmarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesmarcarActionPerformed
        jCheckBoxInformatica.setSelected(false);
        jCheckBoxIngles.setSelected(false);
    }//GEN-LAST:event_jButtonDesmarcarActionPerformed

    private void jCheckBoxInformaticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxInformaticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxInformaticaActionPerformed

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
            java.util.logging.Logger.getLogger(Exemplo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDesmarcar;
    private javax.swing.JButton jButtonMarcar;
    private javax.swing.JButton jButtonVerificar;
    private javax.swing.JCheckBox jCheckBoxInformatica;
    private javax.swing.JCheckBox jCheckBoxIngles;
    // End of variables declaration//GEN-END:variables
}
