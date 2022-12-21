package Servicio;

import Dao.Det_abonoDao;
import Entity.DetAbono;

public class AbonoService {

    private Det_abonoDao da = new Det_abonoDao();

    public int Abonar(double pago, int id_pago, int T_pago, int id_desc, String folio_ventanilla, double pagado) {
        DetAbono DA = new DetAbono(pago, id_pago, T_pago, id_desc, folio_ventanilla, pagado);
        int ret = this.da.InsertarDetAbono(DA);

        return ret;
    }
}
