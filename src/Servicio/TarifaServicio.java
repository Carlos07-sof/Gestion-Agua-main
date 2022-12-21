package Servicio;

import Dao.TarifaDao;
import Entity.DetTipoconsumoTarifa;
import java.util.List;

public class TarifaServicio {

    TarifaDao td = new TarifaDao();

    public List<DetTipoconsumoTarifa> Tarifas(int id) {
        return this.td.Tarifas(id);
    }

    public List<DetTipoconsumoTarifa> Mostrar_Tarifas() {
        return this.td.Mostrar_Tarifas();
    }
    public boolean Insertar_Tarifa(int consec,int id_c, double tarifa){
        boolean status = this.td.Insertar_Tarifa(consec,id_c,tarifa);
        return status;
    }
}
