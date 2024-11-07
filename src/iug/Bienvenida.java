/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iug;

import javax.swing.JOptionPane;
import Persistencia.Conexion2;
import java.sql.Connection;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */

public class Bienvenida extends javax.swing.JFrame {
    
    //contructor para traer el nombre del cliente
      
    private String nombrecito;
    public void setUser(String user){
        this.nombrecito=user;
        txtUser.setText("Bienvenido "+user);  
        System.out.println(nombrecito + "Desde bienvenida");
    } 
    public void setNombre(String nombre){
    this.nombrecito=nombre; 
    System.out.println(nombrecito + ": Desde Bienvenida");
    }
    //  contructor para traer el balance del cliente
    private float balancito;
    public void setBalance(float balance){
        this.balancito=balance;
        txtSaldo.setText(balance+"");        
    } 
    //contructor para traer el numero de cuenta del cliente
    private String cuentica;
    public void setAccount(String account){
        this.cuentica=account;
        txtCuenta.setText("CUENTA "+account);        
    } 
    //  1. contructor para traer el cedula del cliente
    private String cedulita;
    public void setCedula(String cedula){
        this.cedulita=cedula; 
        System.out.println(cedulita+ "Desde bienvenida");
    } 
    //  4. contructor para traer el cumpleaños del cliente
    private String cumpleanitos;
    public void setCumple(String cumple){
        this.cumpleanitos=cumple;     
        System.out.println(cumpleanitos+ "Desde bienvenida");
    } 
    //  5. contructor para traer el genero del cliente
    private String generito;
    public void setGenero(String genero){
        this.generito=genero;
        System.out.println(generito+ "Desde bienvenida");
    } 
    //  6. contructor para traer el direccion del cliente
    private String direccioncita;
    public void setDireccion(String direccion){
        this.direccioncita=direccion;
        System.out.println(direccioncita+ "Desde bienvenida");
    } 
    //  7. contructor para traer el telefono del cliente
    private String telefonito;
    public void setTelefono(String telefono){
        this.telefonito=telefono;     
        System.out.println(telefonito+ "Desde bienvenida");
    } 
    //  8. contructor para traer el correo del cliente
    private String correito;
    public void setCorreo(String correo){
        this.correito=correo;
        System.out.println(correito+ "Desde bienvenida");
    } 
    //  9. contructor para traer el civil del cliente
    private String civilcito;
    public void setCivil(String civil){
        this.civilcito=civil;   
        System.out.println(civilcito+ "Desde bienvenida");
    } 
    //  10. contructor para traer el tipo de cuenta del cliente
    private String tcuentita;
    public void setTipoCuenta(String tipoCuenta){
        this.tcuentita=tipoCuenta;    
        System.out.println(tcuentita+ "Desde bienvenida");
    } 
    //  11. contructor para traer el numero de cuenta del cliente
    private String numCuentita;
    public void setNumCuenta(String numCuenta){
        this.numCuentita=numCuenta; 
        System.out.println(numCuentita+ "Desde bienvenida");
    } 
    //  12. contructor para traer el contraseña del cliente
    private String contrasenita;
    public void setContra(String contraseña){
        this.contrasenita=contraseña;  
        System.out.println(contrasenita+ "Desde bienvenida");
    } 
    //  14. contructor para traer el balance del cliente
    private String aperturita;
    public void setApertura(String apertura){
        this.aperturita=apertura; 
        System.out.println(aperturita+ "Desde bienvenida");
    } 
   
    public Bienvenida() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnDtbase = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnAcci = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtUser = new javax.swing.JLabel();
        btnOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtSaldo = new javax.swing.JLabel();
        txtCuenta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(29, 34, 42));

        jPanel3.setBackground(new java.awt.Color(34, 40, 49));

        btnDtbase.setBackground(new java.awt.Color(34, 40, 49));
        btnDtbase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icoBaseDatos.png"))); // NOI18N
        btnDtbase.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDtbase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDtbaseActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(34, 40, 49));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icoInicio.png"))); // NOI18N
        btnHome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnAcci.setBackground(new java.awt.Color(34, 40, 49));
        btnAcci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icoAcciones.png"))); // NOI18N
        btnAcci.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAcci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcciActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAcci)
                .addGap(304, 304, 304)
                .addComponent(btnDtbase)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAcci)
                    .addComponent(btnHome)
                    .addComponent(btnDtbase))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(34, 40, 49));
        jPanel4.setForeground(new java.awt.Color(34, 40, 49));

        txtUser.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUser.setText("Hola \"Otro Yo\"");

        btnOut.setBackground(new java.awt.Color(34, 40, 49));
        btnOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icoAtras.png"))); // NOI18N
        btnOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addGap(62, 62, 62)
                .addComponent(btnOut)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnOut)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Saldo Disponible");

        jPanel2.setBackground(new java.awt.Color(184, 228, 242));

        txtSaldo.setFont(new java.awt.Font("Segoe UI", 0, 72)); // NOI18N
        txtSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSaldo.setText("$1.700.000");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        );

        txtCuenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCuenta.setForeground(new java.awt.Color(255, 255, 255));
        txtCuenta.setText("Cuenta Corritente: 12333213212");
        txtCuenta.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtCuenta)
                .addGap(163, 163, 163))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDtbaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDtbaseActionPerformed
        // Boton para ir a la base de datos
        String nombre=nombrecito; 
        float balance=balancito;
        String cedula=cedulita;
        String cumpleanos=cumpleanitos;
        String genero=generito;
        String direccion=direccioncita;
        String telefono=telefonito;
        String correo=correito;
        String civil=civilcito;
        String tCuenta=tcuentita;
        String numCuenta=numCuentita;
        String contrasena=contrasenita;
        String apertura=aperturita;
        String cuenta=cuentica;
        BaseDatos verDtbase=new BaseDatos();
        verDtbase.setNombre(nombre);
        verDtbase.setBalance(balance);
        verDtbase.setCedula(cedula);
        verDtbase.setCumple(cumpleanos);
        verDtbase.setGenero(genero);
        verDtbase.setDireccion(direccion);
        verDtbase.setTelefono(telefono);
        verDtbase.setCorreo(correo);
        verDtbase.setCivil(civil);
        verDtbase.setTipoCuenta(tCuenta);
        verDtbase.setNumCuenta(numCuenta);
        verDtbase.setContra(contrasena);
        verDtbase.setApertura(apertura);        
        verDtbase.setAccount(cuenta); 
        verDtbase.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDtbaseActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // Boton de inicio
        JOptionPane.showMessageDialog(null, "Ya estas en la Pantalla de inicio");
        
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnAcciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcciActionPerformed
        // boton de acciones
        // le asignamos una variable a cada campo
        String nombre=nombrecito; 
        float balance=balancito;
        String cedula=cedulita;
        String tCuenta=tcuentita;
        String numCuenta=numCuentita;
        String contrasena=contrasenita;
        String cuenta=cuentica;
        String cumpleanos=cumpleanitos;
        String genero=generito;
        String direccion=direccioncita;
        String telefono=telefonito;
        String correo=correito;
        String civil=civilcito;
        String apertura=aperturita;
        Acciones verAcci=new Acciones();
        verAcci.setVisible(true);
        //Enviamos todos los datos para su uso en la otra vista
        verAcci.setNombre(nombre);
        verAcci.setBalance(balance);
        verAcci.setCedula(cedula);
        verAcci.setTipoCuenta(tCuenta);
        verAcci.setNumCuenta(numCuenta);
        verAcci.setContra(contrasena);
        verAcci.setAccount(cuenta);        
        verAcci.setCumple(cumpleanos);
        verAcci.setGenero(genero);
        verAcci.setDireccion(direccion);
        verAcci.setTelefono(telefono);
        verAcci.setCorreo(correo);
        verAcci.setApertura(apertura);        
        verAcci.setCivil(civil);
        this.dispose();        
    }//GEN-LAST:event_btnAcciActionPerformed

    private void btnOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutActionPerformed
        //Boton para cerrar sesion
        Ingresar verLogin=new Ingresar();
        verLogin.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcci;
    private javax.swing.JButton btnDtbase;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnOut;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel txtCuenta;
    private javax.swing.JLabel txtSaldo;
    private javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables
}
