package Dao;

import Conexion.Conexion;
import Entity.Encabezado;
import Entity.Informativo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EncabezadoDao {
    private static ResultSet Resultado;
    private final Conexion conexion = Conexion.getInstance();
    
    public List<Encabezado> MostrarEncabezado(){
    List<Encabezado> CL = new ArrayList<>();
        
        String sql = "SELECT nombre_empresa,sacv,municipio,estado,rfc"
                + " FROM encabezado ORDER BY id_encabezado DESC LIMIT 1";
        PreparedStatement comando = null;
        
        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();
            
            while(Resultado.next()){
                Encabezado en = new Encabezado();
                en.setNombre_empresa(Resultado.getString("nombre_empresa"));
                en.setSacv(Resultado.getString("sacv"));
                en.setMunicipio(Resultado.getString("municipio"));
                en.setEstado(Resultado.getString("estado"));
                en.setRfc(Resultado.getString("rfc"));
                CL.add(en);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
        return CL;
    }
}
