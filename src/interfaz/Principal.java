/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clase.NumComplejos;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        cmbOperacion = new javax.swing.JComboBox<>();
        txtParteReal1 = new javax.swing.JTextField();
        txtParteReal2 = new javax.swing.JTextField();
        txtParteImaginaria1 = new javax.swing.JTextField();
        txtParteImaginaria2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtParteImaginaria3 = new javax.swing.JTextField();
        txtparteReal3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtNumeradorParteReal = new javax.swing.JTextField();
        txtDenominadorParteReal = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNumeradorParteImaginaria = new javax.swing.JTextField();
        txtDenominadorParteImaginaria = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setText("Operaciones con numeros Complejos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 300, -1));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 70, -1));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sumar", "Restar", "Multiplicar", "Dividir" }));
        cmbOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOperacionActionPerformed(evt);
            }
        });
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        txtParteReal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParteReal1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtParteReal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 60, -1));

        txtParteReal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParteReal2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtParteReal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 60, -1));

        txtParteImaginaria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParteImaginaria1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtParteImaginaria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 60, -1));

        txtParteImaginaria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParteImaginaria2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtParteImaginaria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 60, -1));

        jLabel1.setText("N. real");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jLabel3.setText("N. imaginario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        jLabel4.setText("+");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel5.setText("N. real");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel6.setText("N. imaginario");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtParteImaginaria3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParteImaginaria3ActionPerformed(evt);
            }
        });
        jPanel2.add(txtParteImaginaria3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 70, -1));

        txtparteReal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtparteReal3ActionPerformed(evt);
            }
        });
        jPanel2.add(txtparteReal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 70, -1));

        jLabel7.setText("+");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 30, -1));

        jLabel10.setText("N. imaginario");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 20));

        jLabel11.setText("N. real");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 140, 180));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Division"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNumeradorParteReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeradorParteRealActionPerformed(evt);
            }
        });
        jPanel3.add(txtNumeradorParteReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 60, -1));
        jPanel3.add(txtDenominadorParteReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, 10));

        txtNumeradorParteImaginaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeradorParteImaginariaActionPerformed(evt);
            }
        });
        jPanel3.add(txtNumeradorParteImaginaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 60, -1));

        txtDenominadorParteImaginaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDenominadorParteImaginariaActionPerformed(evt);
            }
        });
        jPanel3.add(txtDenominadorParteImaginaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 60, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 60, 10));

        jLabel8.setText("+");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        jLabel9.setText("Fraccion Imaginaria");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 100, -1));

        jLabel12.setText("Fraccion Real");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 250, 160));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed

        try {
            int op;
            int R1, I1, R2, I2, aux;
            NumComplejos G1, G2, G3;

            op = cmbOperacion.getSelectedIndex();
            R1 = Integer.parseInt(txtParteReal1.getText());
            I1 = Integer.parseInt(txtParteImaginaria1.getText());
            R2 = Integer.parseInt(txtParteReal2.getText());
            I2 = Integer.parseInt(txtParteImaginaria2.getText());

            G1 = new NumComplejos(R1,I1);
            G2 = new NumComplejos(R2,I2);
            switch (op) {
                case 0:
                    G3 = G1.sumar(G2);
                    txtparteReal3.setText("" + G3.getParteR());
                    txtParteImaginaria3.setText("" + G3.getParteI());
                    break;
                case 1:
                    G3 = G1.restar(G2);
                    txtparteReal3.setText("" + G3.getParteR());
                    txtParteImaginaria3.setText("" + G3.getParteI());
                    break;
                case 2:
                    G3 = G1.multiplicar(G2);
                    txtparteReal3.setText(""+G3.getParteR());
                    txtParteImaginaria3.setText(""+G3.getParteI());
                    break;
                case 3:
                    G3 = G1.dividir(G2);
                    txtparteReal3.setText("");
                    txtParteImaginaria3.setText("");
                    aux = (G2.getParteR()*G2.getParteR())+(G2.getParteI()*G2.getParteI());
                    txtNumeradorParteReal.setText(""+G3.getParteR());
                    txtDenominadorParteReal.setText(""+aux);
                    txtNumeradorParteImaginaria.setText(""+G3.getParteI());
                    txtDenominadorParteImaginaria.setText(""+aux);
                    break;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo(s) inválido(s)", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtParteReal1.setText("");
            txtParteImaginaria1.setText("");
            txtParteReal2.setText("");
            txtParteImaginaria2.setText("");
            txtparteReal3.setText("");
            txtParteImaginaria3.setText("");
            txtNumeradorParteReal.setText("");
            txtDenominadorParteReal.setText("");
            txtNumeradorParteImaginaria.setText("");
            txtDenominadorParteImaginaria.setText("");
            txtParteReal1.requestFocusInWindow();
            cmbOperacion.setSelectedIndex(0);
        }

    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
      
        txtParteReal1.setText("");
        txtParteImaginaria1.setText("");
        txtParteReal2.setText("");
        txtParteImaginaria2.setText("");
        txtparteReal3.setText("");
        txtParteImaginaria3.setText("");
        txtNumeradorParteReal.setText("");
        txtDenominadorParteReal.setText("");
        txtNumeradorParteImaginaria.setText("");
        txtDenominadorParteImaginaria.setText("");
        txtParteReal1.requestFocusInWindow();
        cmbOperacion.setSelectedIndex(0);
    

    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmbOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOperacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOperacionActionPerformed

    private void txtParteReal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParteReal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParteReal1ActionPerformed

    private void txtParteReal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParteReal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParteReal2ActionPerformed

    private void txtNumeradorParteRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeradorParteRealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeradorParteRealActionPerformed

    private void txtNumeradorParteImaginariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeradorParteImaginariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeradorParteImaginariaActionPerformed

    private void txtparteReal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtparteReal3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtparteReal3ActionPerformed

    private void txtParteImaginaria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParteImaginaria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParteImaginaria1ActionPerformed

    private void txtParteImaginaria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParteImaginaria2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParteImaginaria2ActionPerformed

    private void txtParteImaginaria3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParteImaginaria3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParteImaginaria3ActionPerformed

    private void txtDenominadorParteImaginariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDenominadorParteImaginariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDenominadorParteImaginariaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtDenominadorParteImaginaria;
    private javax.swing.JTextField txtDenominadorParteReal;
    private javax.swing.JTextField txtNumeradorParteImaginaria;
    private javax.swing.JTextField txtNumeradorParteReal;
    private javax.swing.JTextField txtParteImaginaria1;
    private javax.swing.JTextField txtParteImaginaria2;
    private javax.swing.JTextField txtParteImaginaria3;
    private javax.swing.JTextField txtParteReal1;
    private javax.swing.JTextField txtParteReal2;
    private javax.swing.JTextField txtparteReal3;
    // End of variables declaration//GEN-END:variables
}
