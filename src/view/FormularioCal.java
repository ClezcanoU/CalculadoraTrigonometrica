
package view;

import java.text.DecimalFormat;
import javax.swing.JTextField;
import modelView.*;
import modelView.Operaciones;


public class FormularioCal extends javax.swing.JFrame {

    public FormularioCal() {
        initComponents();
    }
    
    public boolean enGrados() {
        Object seleccion = cbGR.getSelectedItem();
        if ("Grados".equals(seleccion)) {
            return true;
        } else if ("Radianes".equals(seleccion)) {
            return false;
        }else {
            return true;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CampoIngreso = new javax.swing.JTextField();
        Historial = new javax.swing.JButton();
        Result = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        bSeno = new javax.swing.JButton();
        bCoseno = new javax.swing.JButton();
        bTangente = new javax.swing.JButton();
        bCotangente = new javax.swing.JButton();
        bSecante = new javax.swing.JButton();
        bCosecante = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbGR = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CampoIngreso.setName(""); // NOI18N
        CampoIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoIngresoActionPerformed(evt);
            }
        });

        Historial.setText("Historial");
        Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistorialActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Calculadora Trigonometrica");

        bSeno.setText("Seno");
        bSeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSenoActionPerformed(evt);
            }
        });

        bCoseno.setText("Coseno");
        bCoseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCosenoActionPerformed(evt);
            }
        });

        bTangente.setText("Tangente");
        bTangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTangenteActionPerformed(evt);
            }
        });

        bCotangente.setText("Cotangente");
        bCotangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCotangenteActionPerformed(evt);
            }
        });

        bSecante.setText("Secante");
        bSecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSecanteActionPerformed(evt);
            }
        });

        bCosecante.setText("Cosecante");
        bCosecante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCosecanteActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Input");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Resultado");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Grados / Radianes");

        cbGR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grados", "Radianes" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Historial)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bSeno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bCoseno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bTangente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bCotangente, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bSecante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bCosecante, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoIngreso)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cbGR, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbGR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSeno)
                    .addComponent(bTangente)
                    .addComponent(bSecante))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCosecante)
                    .addComponent(bCoseno)
                    .addComponent(bCotangente))
                .addGap(32, 32, 32)
                .addComponent(Historial)
                .addContainerGap())
        );

        CampoIngreso.getAccessibleContext().setAccessibleName("campoNombre");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIngresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoIngresoActionPerformed

    private void HistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistorialActionPerformed
        Calculadora.MostrarHistorial();
    }//GEN-LAST:event_HistorialActionPerformed

    private void bSenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSenoActionPerformed
        Result.setText("");
        double valor = Double.parseDouble(CampoIngreso.getText());
        double resultado = Operaciones.trigonometricas(valor, "seno", enGrados());
        
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        String resultadoFormateado = decimalFormat.format(resultado);
        
        Result.setText("Seno(" + valor + ") = " + resultadoFormateado);
        Calculadora.guardar("Seno(" + valor + ") = " + resultadoFormateado);
    }//GEN-LAST:event_bSenoActionPerformed

    private void bCosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCosenoActionPerformed
        Result.setText("");
        double valor = Double.parseDouble(CampoIngreso.getText());
        double resultado = Operaciones.trigonometricas(valor, "coseno", enGrados());
        
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        String resultadoFormateado = decimalFormat.format(resultado);
        
        Result.setText("Coseno(" + valor + ") = " + resultadoFormateado);
        Calculadora.guardar("Coseno(" + valor + ") = " + resultadoFormateado);
    }//GEN-LAST:event_bCosenoActionPerformed

    private void bTangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTangenteActionPerformed
        Result.setText("");
        double valor = Double.parseDouble(CampoIngreso.getText());
        double resultado = Operaciones.trigonometricas(valor, "tangente", enGrados());
        
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        String resultadoFormateado = decimalFormat.format(resultado);
        
        Result.setText("Tangente(" + valor + ") = " + resultadoFormateado);
        Calculadora.guardar("Tangente(" + valor + ") = " + resultadoFormateado);
    }//GEN-LAST:event_bTangenteActionPerformed

    private void bCotangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCotangenteActionPerformed
        Result.setText("");
        double valor = Double.parseDouble(CampoIngreso.getText());
        double resultado = Operaciones.trigonometricas(valor, "cotangente", enGrados());
        
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        String resultadoFormateado = decimalFormat.format(resultado);
        
        Result.setText("Cotangente(" + valor + ") = " + resultadoFormateado);
        Calculadora.guardar("Cotangente(" + valor + ") = " + resultadoFormateado);
    }//GEN-LAST:event_bCotangenteActionPerformed

    private void bSecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSecanteActionPerformed
        Result.setText("");
        double valor = Double.parseDouble(CampoIngreso.getText());
        double resultado = Operaciones.trigonometricas(valor, "secante", enGrados());
        
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        String resultadoFormateado = decimalFormat.format(resultado);
        
        Result.setText("Secante(" + valor + ") = " + resultadoFormateado);
        Calculadora.guardar("Secante(" + valor + ") = " + resultadoFormateado);
    }//GEN-LAST:event_bSecanteActionPerformed

    private void bCosecanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCosecanteActionPerformed
        Result.setText("");
        double valor = Double.parseDouble(CampoIngreso.getText());
        double resultado = Operaciones.trigonometricas(valor, "cosecante", enGrados());
        
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        String resultadoFormateado = decimalFormat.format(resultado);
        
        Result.setText("Cosecante(" + valor + ") = " + resultadoFormateado);
        Calculadora.guardar("Cosecante(" + valor + ") = " + resultadoFormateado);
    }//GEN-LAST:event_bCosecanteActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioCal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioCal().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoIngreso;
    private javax.swing.JButton Historial;
    private javax.swing.JTextField Result;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton bCosecante;
    private javax.swing.JButton bCoseno;
    private javax.swing.JButton bCotangente;
    private javax.swing.JButton bSecante;
    private javax.swing.JButton bSeno;
    private javax.swing.JButton bTangente;
    private javax.swing.JComboBox<String> cbGR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
