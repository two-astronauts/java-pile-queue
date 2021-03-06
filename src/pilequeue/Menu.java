/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilequeue;

import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Menu extends java.awt.Frame {
    
    private Pile pila;
    private Queue cola;
    private Random rand = new Random();
    DefaultTableModel modelPila;
    DefaultTableModel modelCola;

    /**
     * Creates new form NewFrame
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        // pila
        pila = new Pile();
        this.modelPila = new DefaultTableModel();
        DatosPila.setModel(modelPila);
        modelPila.addColumn("Pila");
        // cola
        cola = new Queue();
        this.modelCola = new DefaultTableModel();
        DatosCola.setModel(modelCola);
        modelCola.addColumn("Cola");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnApilar = new javax.swing.JButton();
        btnDesapilar = new javax.swing.JButton();
        btnEncolar = new javax.swing.JButton();
        btnDesencolar = new javax.swing.JButton();
        btnPilaCola = new javax.swing.JButton();
        btnColaPila = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        DatosPila = new javax.swing.JTable();
        lblMensaje = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DatosCola = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setPreferredSize(new java.awt.Dimension(450, 450));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Pilas y colas con listas ligadas");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        btnApilar.setText("Apilar");
        btnApilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApilarActionPerformed(evt);
            }
        });
        add(btnApilar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 100, -1));

        btnDesapilar.setText("Desapilar");
        btnDesapilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesapilarActionPerformed(evt);
            }
        });
        add(btnDesapilar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 100, -1));

        btnEncolar.setText("Encolar");
        btnEncolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncolarActionPerformed(evt);
            }
        });
        add(btnEncolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 100, -1));

        btnDesencolar.setText("Desencolar");
        btnDesencolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesencolarActionPerformed(evt);
            }
        });
        add(btnDesencolar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 100, -1));

        btnPilaCola.setText("Pila a Cola");
        btnPilaCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilaColaActionPerformed(evt);
            }
        });
        add(btnPilaCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, -1));

        btnColaPila.setText("Cola a pila");
        btnColaPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColaPilaActionPerformed(evt);
            }
        });
        add(btnColaPila, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 100, -1));

        DatosPila.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(DatosPila);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 90, 290));
        add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, 10));

        DatosCola.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(DatosCola);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 90, 290));

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void inicializarDatosPila() {
        this.modelPila = new DefaultTableModel();
        DatosPila.setModel(this.modelPila);
        this.modelPila.addColumn("Pila");
    }
    
    private void mostrarPila(){
        Node cabeza;
        cabeza = this.pila.getCabeza();
        Node nodoSiguiente;
        inicializarDatosPila();
        if(cabeza != null) {
            nodoSiguiente = cabeza;
            for(int i = 0; i < this.pila.getTamanio(); i++) {
                this.modelPila.addRow(new String[]{Integer.toString(nodoSiguiente.getDato())});
                nodoSiguiente = nodoSiguiente.getNodoSgte();
            }
        }
    }
    
    private void btnApilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApilarActionPerformed
        int numero = 1 + rand.nextInt((100 - 1) + 1);
        this.pila.apilar(numero);
        lblMensaje.setText("Se ha apilado el número: " + numero);
        mostrarPila();
    }//GEN-LAST:event_btnApilarActionPerformed

    private void btnDesapilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesapilarActionPerformed
        if(this.pila.getCabeza() == null) {
            lblMensaje.setText("No existen datos para desapilar");
        }else {
            int numero = this.pila.desapilar();
            lblMensaje.setText("Se ha desapilado el número: " + numero);
            mostrarPila();
        }
    }//GEN-LAST:event_btnDesapilarActionPerformed

    private void inicializarDatosCola() {
        this.modelCola = new DefaultTableModel();
        DatosCola.setModel(this.modelCola);
        this.modelCola.addColumn("Cola");
    }
    
    private void mostrarCola(){
        Node cabeza;
        cabeza = this.cola.getCabeza();
        Node nodoSiguiente;
        inicializarDatosCola();
        if(cabeza != null) {
            nodoSiguiente = cabeza;
            for(int i = 0; i < this.cola.getTamanio(); i++) {
                this.modelCola.addRow(new String[]{Integer.toString(nodoSiguiente.getDato())});
                nodoSiguiente = nodoSiguiente.getNodoSgte();
            }
        }
    }
    
    private void btnEncolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncolarActionPerformed
        int numero = 1 + rand.nextInt((100 - 1) + 1);
        this.cola.encolar(numero);
        lblMensaje.setText("Se ha encolado el número: " + numero);
        mostrarCola();
    }//GEN-LAST:event_btnEncolarActionPerformed

    private void btnDesencolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesencolarActionPerformed
        if(this.cola.getCabeza() == null) {
            lblMensaje.setText("No existen datos para desencolar");
        }else {
            int numero = this.cola.desencolar();
            lblMensaje.setText("Se ha desencolado el número: " + numero);
            mostrarCola();
        }
    }//GEN-LAST:event_btnDesencolarActionPerformed

    private void btnPilaColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilaColaActionPerformed
        if(this.pila.getCabeza() != null){
            int numero;
            numero = this.pila.desapilar();
            this.cola.encolar(numero);
            lblMensaje.setText("El número: " + numero + " se ha pasado de la pila a la cola");
            mostrarCola();
            mostrarPila();
        }else{
            lblMensaje.setText("No existen datos para intercambiar");
        }
    }//GEN-LAST:event_btnPilaColaActionPerformed

    private void btnColaPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColaPilaActionPerformed
        if(this.cola.getCabeza() != null){
            int numero;
            numero = this.cola.desencolar();
            this.pila.apilar(numero);
            lblMensaje.setText("El número: " + numero + " se ha pasado de la cola a la pila");
            mostrarCola();
            mostrarPila();
        }else{
            lblMensaje.setText("No existen datos para intercambiar");
        }
    }//GEN-LAST:event_btnColaPilaActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DatosCola;
    private javax.swing.JTable DatosPila;
    private javax.swing.JButton btnApilar;
    private javax.swing.JButton btnColaPila;
    private javax.swing.JButton btnDesapilar;
    private javax.swing.JButton btnDesencolar;
    private javax.swing.JButton btnEncolar;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnPilaCola;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblMensaje;
    // End of variables declaration//GEN-END:variables
}
