/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package iug;

import Persistencia.Conexion2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Retirar extends javax.swing.JFrame {
    
    // Constructor para retornar a Bienvenida
    private String nombrecito;
    public void setNombre(String nombre){
    this.nombrecito=nombre; 
    System.out.println(nombrecito + "Desde Retirar");      
    }
    public void setUser(String user){
        this.nombrecito=user;
        System.out.println(nombrecito + "Desde Retirar");
    } 
    private float balancito;
    public void setBalance(float balance){
    this.balancito=balance; 
    System.out.println(balancito + ": Desde retirar");
    }//contructor para traer el numero de cuenta del cliente
    private String cuentica;
    public void setAccount(String account){
        this.cuentica=account;
    System.out.println(cuentica + ": Desde Retirar");  
    } 
    //  1. contructor para traer el cedula del cliente
    private String cedulita;
    public void setCedula(String cedula){
        this.cedulita=cedula; 
    System.out.println(cedulita + ": Desde Retirar"); 
    } 
    //  4. contructor para traer el cumpleaños del cliente
    private String cumpleanitos;
    public void setCumple(String cumple){
        this.cumpleanitos=cumple;  
    System.out.println(cumpleanitos + ": Desde Retirar"); 
    } 
    //  5. contructor para traer el genero del cliente
    private String generito;
    public void setGenero(String genero){
        this.generito=genero;
    System.out.println(generito + ": Desde Retirar"); } 
    //  6. contructor para traer el direccion del cliente
    private String direccioncita;
    public void setDireccion(String direccion){
        this.direccioncita=direccion;
    System.out.println(direccioncita + ": Desde Retirar"); 
    } 
    //  7. contructor para traer el telefono del cliente
    private String telefonito;
    public void setTelefono(String telefono){
        this.telefonito=telefono;    
    System.out.println(telefonito + ": Desde Retirar"); 
    } 
    //  8. contructor para traer el correo del cliente
    private String correito;
    public void setCorreo(String correo){
        this.correito=correo;
    System.out.println(correito + ": Desde Retirar"); 
    } 
    //  9. contructor para traer el civil del cliente
    private String civilcito;
    public void setCivil(String civil){
        this.civilcito=civil;   
    System.out.println(civilcito + ": Desde Retirar"); 
    } 
    //  10. contructor para traer el tipo de cuenta del cliente
    private String tcuentita;
    public void setTipoCuenta(String tipoCuenta){
        this.tcuentita=tipoCuenta;    
    System.out.println(tcuentita + ": Desde Retirar"); 
    } 
    //  11. contructor para traer el numero de cuenta del cliente
    private String numCuentita;
    public void setNumCuenta(String numCuenta){
        this.numCuentita=numCuenta; 
    System.out.println(numCuentita + ": Desde Retirar"); 
    } 
    //  12. contructor para traer el contraseña del cliente
    private String contrasenita;
    public void setContra(String contraseña){
        this.contrasenita=contraseña;  
    System.out.println(contrasenita + ": Desde Retirar"); 
    } 
    //  14. contructor para traer el balance del cliente
    private String aperturita;
    public void setApertura(String apertura){
        this.aperturita=apertura; 
    System.out.println(aperturita + ": Desde Retirar"); 
    } 
   

    /**
     * Creates new form Retirar
     */
    public Retirar() {
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
        jPanel3 = new javax.swing.JPanel();
        inicio = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCanti = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtPss = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(29, 34, 42));

        jPanel3.setBackground(new java.awt.Color(34, 40, 49));

        inicio.setBackground(new java.awt.Color(34, 40, 49));
        inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icoInicio.png"))); // NOI18N
        inicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(34, 40, 49));
        jPanel4.setForeground(new java.awt.Color(34, 40, 49));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RETIRAR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Digite su contraseña");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad a retirar");

        txtCanti.setBackground(new java.awt.Color(151, 230, 255));
        txtCanti.setText("0");
        txtCanti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantiActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(151, 230, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(29, 34, 42));
        btnLogin.setText("Retira");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtPss.setBackground(new java.awt.Color(151, 230, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtPss, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCanti, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(169, 169, 169)))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPss, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCanti, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        // Llamamos a la vista Bienvenida, le enviamos los datos y abrimos la vista
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
        Bienvenida vi=new Bienvenida();
        //Enviamos todos los datos para su uso en la otra vista
        vi.setUser(nombre);
        vi.setNombre(nombre);
        vi.setBalance(balance); 
        vi.setCedula(cedula);
        vi.setCumple(cumpleanos);
        vi.setGenero(genero);
        vi.setDireccion(direccion);
        vi.setTelefono(telefono);
        vi.setCorreo(correo);
        vi.setCivil(civil);
        vi.setTipoCuenta(tCuenta);
        vi.setNumCuenta(numCuenta);
        vi.setContra(contrasena);
        vi.setApertura(apertura);
        vi.setAccount(cuenta);
        vi.setVisible(true);
        this.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_inicioActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
      
        //  capturo contraseña de la interfaz y asigno la contraseña q ya traigo ambas a una nueva variable
        String contrav=(txtPss.getText());
        String contraa=(contrasenita);
        
        String x= cedulita;          
        String cantar=(txtCanti.getText());          
        float cantac=balancito-Integer.parseInt(cantar);
        String nbalance=Float.toString(cantac);
        
    if(contrav.isEmpty()){        
        System.out.println("Porfavor introduzca su Contraseña. ");
        }else{
            if (contrav.equals(contraa)){
            System.out.println("Contraseña Correcta");                  
                                        
                    // Hago conexion Base de datos
                    Conexion2 conter=new Conexion2();
                    Connection conexion=conter.getConexion();
                    System.out.println("Se hizo conexcion al dar depositar");
                    // Se termina conexion base de datos
                    
                                // try catch de la consulta 
                                try {
                                /**   Consulta DB     */
                                String updateQuery = "UPDATE clientes SET balance= ? WHERE CC= ?";
                                PreparedStatement updateStatement = conexion.prepareStatement(updateQuery);
                                updateStatement.setString(1, nbalance);
                                updateStatement.setString(2, x);
                                    int resultado = updateStatement.executeUpdate();
                                    if (resultado > 0) {
                                    
                                        System.out.println("Balance actualizado exitosamente.");
                                    JOptionPane.showMessageDialog(null, "Se deposito $"+cantar+" pesos a su Cuenta. Saldo: $"+nbalance);
                                                
                                                Bienvenida vi=new Bienvenida();
                                                //Enviamos todos los datos para su uso en la otra vista
                                                vi.setUser(nombrecito);
                                                vi.setNombre(nombrecito);
                                                vi.setBalance(cantac);
                                                vi.setCedula(cedulita);
                                                vi.setCumple(cumpleanitos);
                                                vi.setGenero(generito);
                                                vi.setDireccion(direccioncita);
                                                vi.setTelefono(telefonito);
                                                vi.setCorreo(correito);
                                                vi.setCivil(civilcito);
                                                vi.setTipoCuenta(tcuentita);
                                                vi.setNumCuenta(numCuentita);
                                                vi.setContra(contrasenita);
                                                vi.setApertura(aperturita);
                                                vi.setAccount(cuentica);
                                                vi.setVisible(true);
                                                this.dispose();   
                                } else {
                                    JOptionPane.showMessageDialog(null, "Error al actualizar el balance.");
                                }            

                                } catch (SQLException e) {
                                    //  si hay algun error con la consulta, se muestrar en el Output o consola
                                    JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta: " + e.getMessage());
             }}}
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtCantiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtCanti;
    private javax.swing.JPasswordField txtPss;
    // End of variables declaration//GEN-END:variables
}