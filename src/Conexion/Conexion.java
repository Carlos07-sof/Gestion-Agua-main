package Conexion;

import Entity.ErrorsAndSuccesses;
import Entity.Logeo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Logeo lg = new Logeo();
    ErrorsAndSuccesses eae = new ErrorsAndSuccesses();
    private String driver = "org.postgresql.Driver";
    private String Cadenacon;

    public Conexion() {
    }

    public static Conexion getInstance() {
        return ConexionHolder.INSTANCE;
    }

    private static class ConexionHolder {
        private static final Conexion INSTANCE = new Conexion();
    }

    public Connection conectar() {
        
        Connection con = null;
        Cadenacon = "jdbc:postgresql://" + lg.getIp() + ":" + lg.getPuerto() + "/" + lg.getBase() + "";
        
        try {
            
            con = DriverManager.getConnection(Cadenacon, lg.getUsuario(), lg.getPassword());
            eae.setExitoConexion(true);
            
        } catch (SQLException ex) {
            eae.setErrorconexion(""+ex.getMessage());
            eae.setExitoConexion(false);
        }
        return con;
    }
}