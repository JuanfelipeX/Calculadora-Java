/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author pipesex
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public Vista() {
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
        txtOperation = new javax.swing.JLabel();
        txtResult = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JButtonAvanzado = new javax.swing.JButton();
        jButtonDivido = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonC2 = new javax.swing.JButton();
        jButtonPorcentaje = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Java");
        setBackground(new java.awt.Color(51, 51, 51));
        setLocationByPlatform(true);
        setSize(new java.awt.Dimension(100, 100));

        jPanel1.setBackground(new java.awt.Color(21, 13, 91));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtOperation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtOperation, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 220, 40));

        txtResult.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 340, 70));

        jPanel2.setBackground(new java.awt.Color(12, 9, 65));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JButtonAvanzado.setFont(new java.awt.Font("DejaVu Sans Light", 3, 14)); // NOI18N
        JButtonAvanzado.setForeground(new java.awt.Color(255, 255, 255));
        JButtonAvanzado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAvanzado.png"))); // NOI18N
        JButtonAvanzado.setText("AVANZADO");
        JButtonAvanzado.setActionCommand("Avanzado");
        JButtonAvanzado.setBorder(null);
        JButtonAvanzado.setFocusPainted(false);
        JButtonAvanzado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JButtonAvanzado.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAvanzadoOn.png"))); // NOI18N
        jPanel2.add(JButtonAvanzado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 50));

        jButtonDivido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonDivido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonDivido.setText("÷");
        jButtonDivido.setBorderPainted(false);
        jButtonDivido.setContentAreaFilled(false);
        jButtonDivido.setDefaultCapable(false);
        jButtonDivido.setFocusPainted(false);
        jButtonDivido.setFocusable(false);
        jButtonDivido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDivido.setRequestFocusEnabled(false);
        jButtonDivido.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCOn.png"))); // NOI18N
        jButtonDivido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDividoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDivido, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 50, 50));

        jButtonC.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonC.setText("C");
        jButtonC.setAutoscrolls(true);
        jButtonC.setBorderPainted(false);
        jButtonC.setContentAreaFilled(false);
        jButtonC.setDefaultCapable(false);
        jButtonC.setFocusPainted(false);
        jButtonC.setFocusable(false);
        jButtonC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCOn.png"))); // NOI18N
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 50, 50));

        jButtonC2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonC2.setText("±");
        jButtonC2.setBorderPainted(false);
        jButtonC2.setContentAreaFilled(false);
        jButtonC2.setDefaultCapable(false);
        jButtonC2.setFocusPainted(false);
        jButtonC2.setFocusable(false);
        jButtonC2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonC2.setRequestFocusEnabled(false);
        jButtonC2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCOn.png"))); // NOI18N
        jButtonC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonC2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 50, 50));

        jButtonPorcentaje.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonPorcentaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnC.png"))); // NOI18N
        jButtonPorcentaje.setText("%");
        jButtonPorcentaje.setBorderPainted(false);
        jButtonPorcentaje.setContentAreaFilled(false);
        jButtonPorcentaje.setDefaultCapable(false);
        jButtonPorcentaje.setFocusPainted(false);
        jButtonPorcentaje.setFocusable(false);
        jButtonPorcentaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPorcentaje.setRequestFocusEnabled(false);
        jButtonPorcentaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCOn.png"))); // NOI18N
        jButtonPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPorcentajeActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(383, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDividoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDividoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDividoActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButtonC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonC2ActionPerformed

    private void jButtonPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPorcentajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPorcentajeActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAvanzado;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonC2;
    private javax.swing.JButton jButtonDivido;
    private javax.swing.JButton jButtonPorcentaje;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperation;
    private javax.swing.JLabel txtResult;
    // End of variables declaration//GEN-END:variables
}