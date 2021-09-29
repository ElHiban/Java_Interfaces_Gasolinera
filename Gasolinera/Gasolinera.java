/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gasolinera;

import javax.swing.ButtonModel;
import javax.swing.JComboBox;

/**
 *
 * @author dam
 */
public class Gasolinera extends javax.swing.JFrame {
    double dinero_pagado=0;
    double dinero_cambio=0;
    double precio_viaje=21;
    double dineroValencia=125;
    double dineroSegovia=43;
    double dineroBarcelona=87;
    double dineroMadrid=21;
    boolean descuento=false;
    
    /**
     * Creates new form Ejercicio
     */
    public Gasolinera() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        Titulo = new javax.swing.JLabel();
        Salidas = new javax.swing.JLabel();
        OpcionesSalidas = new javax.swing.JComboBox<>();
        Precio = new javax.swing.JLabel();
        Transportista = new javax.swing.JCheckBox();
        Abonado = new javax.swing.JCheckBox();
        Efectivo = new javax.swing.JRadioButton();
        Cheque = new javax.swing.JRadioButton();
        add1euro = new javax.swing.JButton();
        add2euros = new javax.swing.JButton();
        add3euros = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DineroPagado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DineroCambio = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        Moneda = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Microsoft Tai Le", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(102, 204, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Titulo.setText("Autovias Periquete S.A");
        Titulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Salidas.setText("Elige una salida");

        OpcionesSalidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Madrid", "Barcelona", "Segovia", "Valencia" }));
        OpcionesSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionesSalidasActionPerformed(evt);
            }
        });

        Precio.setText("21");

        Transportista.setText("Transportista");
        Transportista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransportistaActionPerformed(evt);
            }
        });

        Abonado.setText("Abonado");
        Abonado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbonadoActionPerformed(evt);
            }
        });

        buttonGroup1.add(Efectivo);
        Efectivo.setText("Efectivo");
        Efectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EfectivoActionPerformed(evt);
            }
        });

        buttonGroup1.add(Cheque);
        Cheque.setText("Cheque");
        Cheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChequeActionPerformed(evt);
            }
        });

        add1euro.setText("1€");
        add1euro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1euroActionPerformed(evt);
            }
        });

        add2euros.setText("2€");
        add2euros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2eurosActionPerformed(evt);
            }
        });

        add3euros.setText("3€");
        add3euros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add3eurosActionPerformed(evt);
            }
        });

        jLabel1.setText("Pagado");

        DineroPagado.setText("0");

        jLabel3.setText("Cambio");

        DineroCambio.setText("0");

        jButton4.setText("Nuevo Cliente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Moneda.setText("€");

        jLabel2.setText("€");

        jLabel4.setText("€");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Efectivo)
                        .addGap(18, 18, 18)
                        .addComponent(Cheque))
                    .addComponent(Salidas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OpcionesSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(Precio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Moneda))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Transportista)
                            .addComponent(Abonado))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(DineroPagado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(DineroCambio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(add1euro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(add2euros, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(add3euros, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(Titulo))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salidas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OpcionesSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Precio)
                    .addComponent(Moneda))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Transportista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Abonado)
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Efectivo)
                            .addComponent(Cheque)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add1euro)
                            .addComponent(add2euros)
                            .addComponent(add3euros))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(DineroPagado)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(DineroCambio)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpcionesSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionesSalidasActionPerformed
        // TODO add your handling code here:
        StartOpcionesSalidas();
    }//GEN-LAST:event_OpcionesSalidasActionPerformed

    private void TransportistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransportistaActionPerformed
        // TODO add your handling code here:
        descuentos();
    }//GEN-LAST:event_TransportistaActionPerformed

    private void AbonadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbonadoActionPerformed
        // TODO add your handling code here:
        descuentos();
    }//GEN-LAST:event_AbonadoActionPerformed

    private void EfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EfectivoActionPerformed
        // TODO add your handling code here:
        efectivoAction();
    }//GEN-LAST:event_EfectivoActionPerformed

    private void add1euroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1euroActionPerformed
        // TODO add your handling code here:
        Añadir1Euro();
    }//GEN-LAST:event_add1euroActionPerformed

    private void add2eurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2eurosActionPerformed
        // TODO add your handling code here:
        Añadir2Euros();
    }//GEN-LAST:event_add2eurosActionPerformed

    private void add3eurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add3eurosActionPerformed
        // TODO add your handling code here:
        Añadir3Euros();
    }//GEN-LAST:event_add3eurosActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        nuevoCliente();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChequeActionPerformed
        // TODO add your handling code here:
        descuentos();
    }//GEN-LAST:event_ChequeActionPerformed

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
            java.util.logging.Logger.getLogger(Gasolinera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gasolinera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gasolinera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gasolinera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gasolinera().setVisible(true);
            }
        });
    }
    
    public void StartOpcionesSalidas(){
     String itemSeleccionado = (String) OpcionesSalidas.getSelectedItem();
        switch (itemSeleccionado) {
            case "Madrid":
                Precio.setText(""+dineroMadrid);
                precio_viaje=dineroMadrid;
                cambio();
                descuentos();
                break;
            case "Barcelona":
                Precio.setText(""+dineroBarcelona);
                precio_viaje=dineroBarcelona;
                cambio();
                descuentos();
                break;
            case "Segovia":
                Precio.setText(""+dineroSegovia);
                precio_viaje=dineroSegovia;
                cambio();
                
                break;
            case "Valencia":
                Precio.setText(""+dineroValencia);
                precio_viaje=dineroValencia;
                cambio();
                descuentos();
                break;
        }
    }
    
    public void Añadir1Euro(){
        dinero_pagado++;
        DineroPagado.setText(""+dinero_pagado);
        descuentos();
    }
    
    public void Añadir2Euros(){
        dinero_pagado=dinero_pagado+2;
        DineroPagado.setText(""+dinero_pagado);
        descuentos();
    }
    
    public void Añadir3Euros(){
        dinero_pagado=dinero_pagado+3;
        DineroPagado.setText(""+dinero_pagado);
        descuentos();
    }
    
    public void descuentos(){
        double precio_sin_descuento=precio_viaje;
        if(Transportista.isSelected() && Abonado.isSelected() && !Cheque.isSelected()){
            precio_viaje=precio_viaje*0.8*0.7;
            Precio.setText(""+precio_viaje);
            cambio();
            precio_viaje=precio_sin_descuento;
        }
        else{
            if(Transportista.isSelected() && !Cheque.isSelected()){
                precio_viaje=precio_viaje*0.8;
                Precio.setText(""+precio_viaje);
                cambio();
                precio_viaje=precio_sin_descuento;
            }
            else{
                if(Abonado.isSelected() && !Cheque.isSelected()){
                precio_viaje=precio_viaje*0.7;
                Precio.setText(""+precio_viaje);
                cambio();
                precio_viaje=precio_sin_descuento;
                }
                else{
                    if(Cheque.isSelected()){
                    precio_viaje=precio_sin_descuento;
                    precio_viaje=precio_viaje*0.5;
                    Precio.setText(""+precio_viaje);
                    cambio();
                    precio_viaje=precio_sin_descuento;
                }
                else{
                    Precio.setText(""+precio_viaje);
                    cambio();
                }
              }
            }
        }
    }
    
    public void cambio(){
        dinero_cambio=dinero_pagado-precio_viaje;
                if(dinero_cambio>0){
                DineroCambio.setText(""+dinero_cambio);
                }
                else{
                    DineroCambio.setText("0");
                }
    }
    
    public void efectivoAction(){
        if(Efectivo.isSelected()){
        add1euro.setEnabled(false);
        }
        else{
            add1euro.setEnabled(true);
        }
        if(Efectivo.isSelected()){
        add2euros.setEnabled(false);
        }
        else{
            add2euros.setEnabled(true);
        }
        if(Efectivo.isSelected()){
        add3euros.setEnabled(false);
        }
        else{
            add3euros.setEnabled(true);
        }
    }
    
    public void nuevoCliente(){
        dinero_pagado=0;
        dinero_cambio=0;
        OpcionesSalidas.setSelectedIndex(0);
        boolean state=false;
        Transportista.setSelected(state);
        Abonado.setSelected(state);
        Efectivo.setSelected(false);
        Cheque.setSelected(false);
        buttonGroup1.clearSelection();
        efectivoAction();
        Precio.setText(""+precio_viaje);
        DineroPagado.setText(""+dinero_pagado);
        cambio();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Abonado;
    private javax.swing.JRadioButton Cheque;
    private javax.swing.JLabel DineroCambio;
    private javax.swing.JLabel DineroPagado;
    private javax.swing.JRadioButton Efectivo;
    private javax.swing.JLabel Moneda;
    private javax.swing.JComboBox<String> OpcionesSalidas;
    private javax.swing.JLabel Precio;
    private javax.swing.JLabel Salidas;
    private javax.swing.JLabel Titulo;
    private javax.swing.JCheckBox Transportista;
    private javax.swing.JButton add1euro;
    private javax.swing.JButton add2euros;
    private javax.swing.JButton add3euros;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
