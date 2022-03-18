/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Raydo
 */
public class VentanaEscogerCsv extends javax.swing.JFrame {

    /**
     * Creates new form VentanaGeneral
     */
    public VentanaEscogerCsv() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        EscogerArchivo = new javax.swing.JButton();
        ArchivoPredeterminado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(88, 204, 243));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Raydo\\Documents\\akinator\\akinator1.png")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 270, 450));

        jLabel3.setFont(new java.awt.Font("Niagara Engraved", 0, 90)); // NOI18N
        jLabel3.setText("AKINATOR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 210, 70));

        Salir.setBackground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 90, -1));

        EscogerArchivo.setBackground(new java.awt.Color(255, 255, 255));
        EscogerArchivo.setText("Buscar la base de conocimientos en su ordenador");
        EscogerArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscogerArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(EscogerArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 380, -1));

        ArchivoPredeterminado.setBackground(new java.awt.Color(255, 255, 255));
        ArchivoPredeterminado.setText("Continuar con la base de conocimientos predeterminados");
        ArchivoPredeterminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoPredeterminadoActionPerformed(evt);
            }
        });
        jPanel1.add(ArchivoPredeterminado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 380, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione el archivo con el que desee continuar el juego:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ArchivoPredeterminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoPredeterminadoActionPerformed
        new VentanaMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_ArchivoPredeterminadoActionPerformed

    private void EscogerArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscogerArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EscogerArchivoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_SalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ArchivoPredeterminado;
    private javax.swing.JButton EscogerArchivo;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}