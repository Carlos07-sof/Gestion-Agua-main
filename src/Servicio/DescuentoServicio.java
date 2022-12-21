package Servicio;

import Dao.Cat_descuentoDao;
import Entity.Cat_descuento;
import java.util.List;

public class DescuentoServicio {
    Cat_descuentoDao cd = new Cat_descuentoDao();
    
    public List<Cat_descuento> ObtenerDescuentos() {
        return this.cd.ObtenerDescuentos();
    }
}
