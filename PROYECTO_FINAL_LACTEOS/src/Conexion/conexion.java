package Conexion;
import java.sql.*;
import javax.swing.JOptionPane;

public class conexion {
    Connection conectar=null;
    public Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","root","1234");
            JOptionPane.showMessageDialog(null, "Conexión exitosa", "Conexión", JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Sin conexión" +e, "Conexión", JOptionPane.ERROR_MESSAGE);
            
        }
        return conectar;
    }

    Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

