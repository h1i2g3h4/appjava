
package Persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.sql.Statement;


public class Conexion2 {
    Connection conexion;
    String url="jdbc:mysql://localhost:3306/empresa";
    String usuario="root";
    String clave="highlander";
    String Drive="com.mysql.cj.jdbc.Driver";
    
    
            
        


public Conexion2() {
        try{
            Class.forName(Drive);
            //Modulo de conexion
            conexion=DriverManager.getConnection(url,usuario,clave);
            System.out.println("Conexion Exitosa");
            
        }catch(ClassNotFoundException e){
            System.out.println("Error al cargar el drive de MySQL"+e.getMessage());
           }catch(SQLException e){
               System.out.println("Error al conectar la Base de Datos"+e.getMessage());
           }
    }


    public Connection getConexion(){
        return conexion;
    }

    
     public void CerrarConexion(){
        try{
            if(conexion !=null && !conexion.isClosed()){
                conexion.close();
                System.out.println("Se a Cerrado la conexion");
            }
        }catch(SQLException e){
            System.out.println("Error al cerrar la conexion"+e.getMessage());
        }
    }
     
    public String[] ejecutarConsulta(String consulta){
         String[] result=new String[14];
        try{
            Statement stmt=conexion.createStatement();
            ResultSet rs=stmt.executeQuery(consulta);
            
            while(rs.next()){
                //Aqui coloca el nombre de las columnas que tiene en MySQL
                
                
                result[0]="CC: "+rs.getInt("CC");
                result[1]="Nombre: "+rs.getString("first_name");
                result[2]="Apellido: "+rs.getString("last_name");
                result[3]="Cumpleaños: "+rs.getDate("birth_date");
                result[4]="Genero: "+rs.getString("gender");
                result[5]="Direccion: "+rs.getString("address");
                result[6]="Telefono: "+rs.getString("phone");
                result[7]="Correo: "+rs.getString("email");
                result[8]="Estado civil: "+rs.getString("marital_status");
                result[9]="Tipo de cuenta: "+rs.getString("account_type");
                result[10]="Numero de cuenta: "+rs.getString("account_number");
                result[11]="Contraseña de cuenta: "+rs.getString("account_password");
                result[12]="Balance: "+rs.getFloat("balance");
                result[13]="Fecha de apertura: "+rs.getDate("account_open_date");
            }
        }catch(SQLException e){
            System.out.println("Error al ejecutar la consulta "+e.getMessage());
        }
             return result;
    }
    public String[] login(String cons){
        String[] result=new String[2];
        try {
            Statement stm = conexion.createStatement();
            ResultSet rs = stm.executeQuery(cons);
            while(rs.next()){
                //Aqui coloca el nombre de las columnas que tiene en MySQL
                
                result[0]= String.valueOf( rs.getInt("CC"));
                result[1]="Contraseña de cuenta: "+rs.getString("account_password");
            }
        } catch (SQLException e){
            System.out.println("Error en la consulta :"+e.getMessage());
        }
        return result;
    }
}

