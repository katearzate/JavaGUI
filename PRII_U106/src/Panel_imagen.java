
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Katherine Arzate
 */
public class Panel_imagen extends javax.swing.JPanel {
    ImageIcon imagenFondo;

    public Panel_imagen() {
        initComponents();
        imagenFondo = new ImageIcon(getClass().getResource("foto.jpg"));
    }
    
    public void fijarTam(Dimension d){
        this.setSize(d);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Dimension d = this.getSize();
        g.drawImage(imagenFondo.getImage(), 0, 0, d.width, d.height, null);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
