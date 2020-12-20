/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prii_01_examen;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Katherine Arzate
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
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

        lblHora = new javax.swing.JLabel();
        lblPagoxhora = new javax.swing.JLabel();
        lblTasaRef = new javax.swing.JLabel();
        btnNeto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tfHoras = new javax.swing.JTextField();
        tfPagoxHoras = new javax.swing.JTextField();
        tfTasaRef = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblPagar = new javax.swing.JLabel();
        ftfFechaInicio = new javax.swing.JFormattedTextField();
        ftfFechaHoy = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHora.setText("Horas:");

        lblPagoxhora.setText("Pago por horas:");

        lblTasaRef.setText("Tasa de referención:");

        btnNeto.setText("Neto");
        btnNeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNetoActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha de inicio a laborar:");

        tfHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHorasActionPerformed(evt);
            }
        });

        tfPagoxHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPagoxHorasActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha de hoy: ");

        ftfFechaInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        ftfFechaHoy.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHora)
                            .addComponent(lblPagoxhora))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfPagoxHoras, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(tfHoras)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTasaRef)
                        .addGap(18, 18, 18)
                        .addComponent(tfTasaRef))
                    .addComponent(btnNeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ftfFechaHoy, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(ftfFechaInicio)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lblPagar)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHora)
                    .addComponent(jLabel4)
                    .addComponent(tfHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftfFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPagoxhora)
                    .addComponent(tfPagoxHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(ftfFechaHoy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTasaRef)
                    .addComponent(tfTasaRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNeto)
                    .addComponent(lblPagar))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPagoxHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPagoxHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPagoxHorasActionPerformed

    private void btnNetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNetoActionPerformed
        //calculo de ingresos 
        double horas = Double.parseDouble(tfHoras.getText());
        double pagoHora = Double.parseDouble(tfPagoxHoras.getText());
        double tasa = Double.parseDouble(tfTasaRef.getText());
        double descuento, total, totalTrabajado;
        total = horas * pagoHora;
        descuento = total *(tasa/100);
        totalTrabajado = total - descuento; 
        //funcion de años enteros
        String f1= ftfFechaInicio.getText();                                      
        String f2= ftfFechaHoy.getText();
        Date date1 = null;
        Date date2 = null;
        try{
           date1=new SimpleDateFormat("dd/MM/yyyy").parse(f1);
           date2=new SimpleDateFormat("dd/MM/yyyy").parse(f2);
       } catch (ParseException ex){
           Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE,null,ex);
       }
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ChronoLocalDate desde = ChronoLocalDate.from(formato.parse(f1));
        ChronoLocalDate hasta = ChronoLocalDate.from(formato.parse(f2));
        ChronoPeriod period = ChronoPeriod.between(desde, hasta);
        double neto;
        neto = (period.get(java.time.temporal.ChronoUnit.YEARS))*1000 + totalTrabajado;
        
        lblPagar.setText("Total a pagar: " +neto);
    }//GEN-LAST:event_btnNetoActionPerformed

    private void tfHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHorasActionPerformed
        //nada
    }//GEN-LAST:event_tfHorasActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNeto;
    private javax.swing.JFormattedTextField ftfFechaHoy;
    private javax.swing.JFormattedTextField ftfFechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblPagar;
    private javax.swing.JLabel lblPagoxhora;
    private javax.swing.JLabel lblTasaRef;
    private javax.swing.JTextField tfHoras;
    private javax.swing.JTextField tfPagoxHoras;
    private javax.swing.JTextField tfTasaRef;
    // End of variables declaration//GEN-END:variables
}