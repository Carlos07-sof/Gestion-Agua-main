package Dao;

import Conexion.Conexion;
import Entity.Informativo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InformativoDao {
    private static ResultSet Resultado;
    private final Conexion conexion = Conexion.getInstance();
    
    public List<Informativo> MostrarInformacion(){
    List<Informativo> CL = new ArrayList<>();
        
        String sql = "SELECT informativo FROM informativo ORDER BY id_informativo DESC LIMIT 1";
        PreparedStatement comando = null;
        
        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();
            
            while(Resultado.next()){
                Informativo in = new Informativo();
                in.setInformativo(Resultado.getString("informativo"));
                CL.add(in);
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
        return CL;
    }
    
}