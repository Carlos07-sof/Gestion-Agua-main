package Dao;

import Conexion.Conexion;
import Entity.pie_pagina;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class pie_paginaDao {

    private static ResultSet Resultado;
    private Conexion conexion = Conexion.getInstance();

    public List<pie_pagina> MostrarPie_Pagina() {
        List<pie_pagina> CL = new ArrayList<>();

        String sql = "SELECT pie_pagina FROM pie_pagina ORDER BY id_pie_pagina";
        PreparedStatement comando = null;
        try {
            comando = conexion.conectar().prepareStatement(sql);
            Resultado = comando.executeQuery();
            while (Resultado.next()) {
                pie_pagina p_p = new pie_pagina();
                p_p.setPie_pagina(Resultado.getString("pie_pagina"));
                CL.add(p_p);
                
            }
            conexion.conectar().close();
            comando.close();
        } catch (SQLException ex) {
            Logger.getLogger(InformativoDao.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }
        System.out.println(Resultado);
        return CL;
    }
}
