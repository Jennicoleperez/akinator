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
public class VentanaBuscarAnimal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaGeneral
     */
    public VentanaBuscarAnimal() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NombreDelAnimalQueSeBuscara = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(88, 204, 243));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Niagara Engraved", 0, 90)); // NOI18N
        jLabel3.setText("AKINATOR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 210, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese el nombre del animal que desee buscar:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        NombreDelAnimalQueSeBuscara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreDelAnimalQueSeBuscaraActionPerformed(evt);
            }
        });
        jPanel1.add(NombreDelAnimalQueSeBuscara, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 210, -1));

        Buscar.setBackground(new java.awt.Color(255, 255, 255));
        Buscar.setText("Buscar");
        jPanel1.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        Regresar.setBackground(new java.awt.Color(255, 255, 255));
        Regresar.setText("Regresar al menú");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        jPanel1.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 140, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/akinator1.png"))); // NOI18N
        jLabel4.setText("jLabel1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 270, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreDelAnimalQueSeBuscaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreDelAnimalQueSeBuscaraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreDelAnimalQueSeBuscaraActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        new VentanaMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_RegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField NombreDelAnimalQueSeBuscara;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
