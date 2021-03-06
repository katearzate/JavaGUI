/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregar_gestionar;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Katherine Arzate
 */
public class ReservasClientesGestionar extends javax.swing.JPanel {

    /**
     * Creates new form ReservasClientesGestionar
     */
    public ReservasClientesGestionar() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfPrecio = new javax.swing.JTextField();
        tfFechaFinal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReservaCliente = new javax.swing.JTable();
        btnRefrescar = new javax.swing.JButton();
        tfNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfApellidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfFechaInicio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel3.setText("Fecha Inicial:");

        jLabel4.setText("Fecha final:");

        tfPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrecioActionPerformed(evt);
            }
        });

        tfFechaFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFechaFinalActionPerformed(evt);
            }
        });

        jLabel6.setText("Precio:");

        btnActualizar.setText("Actualizar ");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar ");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        tblReservaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellidos", "Fecha Inicial", "Fecha Final", "Precio"
            }
        ));
        tblReservaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReservaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblReservaCliente);

        btnRefrescar.setText("Refrescar");
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre(s):");

        jLabel2.setText("Apellidos:");

        tfFechaInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFechaInicioActionPerformed(evt);
            }
        });

        jLabel5.setText("- Cliente -");

        jLabel7.setText("- Reserva -");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRefrescar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel5)
                            .addGap(10, 10, 10))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(163, 163, 163)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btnRefrescar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(47, 47, 47)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPrecioActionPerformed

    private void tfFechaFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFechaFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFechaFinalActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        ReservasclienteDTO reserva = new ReservasclienteDTO();
        reserva.setNombre(tfNombre.getText());
        reserva.setApellidos(tfApellidos.getText());
        reserva.setFecha_inicio(tfFechaInicio.getText());
        reserva.setFecha_final(tfFechaFinal.getText());
        reserva.setPrecio_t(Float.parseFloat(tfPrecio.getText()));

        int resp = JOptionPane.showConfirmDialog(null, "¿Deseas modificarlo?",
            "Confirmar actualizacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(resp == 0){
            Conector cone = new Conector();
            ReservasclienteDAO reservaDAO = new ReservasclienteDAO(cone.miconector);
            int resultado = reservaDAO.actualizarReservacli(reserva);
            if(resultado > 0){
                JOptionPane.showMessageDialog(null, "Actualizacion exitosa");
                refrescar();
            }else
            JOptionPane.showMessageDialog(null, "Actualizacion erronea");
            cone.cerrar();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        ReservaDTO reserva = new ReservaDTO();
        //reserva.setId_reserva();
        int resp = JOptionPane.showConfirmDialog(null, "¿Realmente deseas eliminar esta reserva?",
            "Confirmar ELIMINACION", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);

        if(resp == 0){
            Conector cone = new Conector();
            ReservaDAO reservaDAO = new ReservaDAO(cone.miconector);
            int resultado = reservaDAO.borrarReserva(reserva);
            if(resultado > 0){
                JOptionPane.showMessageDialog(null, "Eliminación exitosa");
                refrescar();
            }else
            JOptionPane.showMessageDialog(null, "Eliminación errónea");
            cone.cerrar();

        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void tblReservaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReservaClienteMouseClicked
        int r = tblReservaCliente.getSelectedRow();
        String nombre = (String) tblReservaCliente.getValueAt(r, 0);
        String apellidos = (String) tblReservaCliente.getValueAt(r, 1);
        String finicio = (String) tblReservaCliente.getValueAt(r, 2);
        String ffinal = (String) tblReservaCliente.getValueAt(r, 3);
        float precio = (float) tblReservaCliente.getValueAt(r, 4);

        tfNombre.setText(nombre);
        tfApellidos.setText(apellidos);
        tfFechaInicio.setText(finicio);
        tfFechaFinal.setText(ffinal);
        tfPrecio.setText(""+precio);
    }//GEN-LAST:event_tblReservaClienteMouseClicked

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        refrescar();
    }//GEN-LAST:event_btnRefrescarActionPerformed

    private void tfFechaInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFechaInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFechaInicioActionPerformed

        private void refrescar() {
        Conector cone = new Conector();
        
       ReservasclienteDAO reservaclienteDAO = new ReservasclienteDAO(cone.miconector);
        List <ReservasclienteDTO> reservas = reservaclienteDAO.reservaclienteGeneralDAO();
        
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tblReservaCliente.setModel(modeloTabla);
        
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellidos");
        modeloTabla.addColumn("Fecha Inicial");
        modeloTabla.addColumn("Fecha Final");
        modeloTabla.addColumn("Precio");
        
        Object[] columna = new Object[5];
        
        int objGuardados = reservas.size();
        
        for (int i = 0; i < objGuardados; i++) {
            columna[0] = reservas.get(i).getNombre();
            columna[1] = reservas.get(i).getApellidos();
            columna[2] = reservas.get(i).getFecha_inicio();
            columna[3] = reservas.get(i).getFecha_final();
            columna[4] = reservas.get(i).getPrecio_t();
            modeloTabla.addRow(columna);
        }
        cone.cerrar();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReservaCliente;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfFechaFinal;
    private javax.swing.JTextField tfFechaInicio;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPrecio;
    // End of variables declaration//GEN-END:variables
}
