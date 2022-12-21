package Servicio;

import Dao.ContratoDao;
import Entity.Contrato;
import java.util.List;

public class ContratoServicio {

    private ContratoDao Ctdao = new ContratoDao();

    public int InsertarContrato(String municipio, String residencia, String nombrec, String referencia, String observaciones, Integer mzn, Integer lt, Integer consec, Integer consumo, Integer periodo, Integer folio_cte, String status) {
        int ret = 0;
        Contrato ct = new Contrato(municipio, residencia, nombrec, referencia,observaciones, mzn, lt, consec, consumo, periodo, folio_cte, status);
        ret = this.Ctdao.InsertarContrato(ct);
        return ret;
    }

    public int ActualizarContrato(Integer folio, String municipio, String residencia, String nombrec, String referencia,String observaciones, Integer mzn, Integer lt) {
        int ret = 0;
        Contrato ct = new Contrato(folio, municipio, residencia, nombrec, referencia,observaciones, mzn, lt);
        ret = this.Ctdao.ActualizarContrato(ct);
        return ret;
    }

    public List<Contrato> ContratosC(int folio) {
        return this.Ctdao.ContratosC(folio);
    }

    public List<Contrato> SearchExistencia(int folio) {
        return this.Ctdao.SearchExisencia(folio);
    }
    public List<Contrato> SearchContrato(int folio){
        return this.Ctdao.SearchContratos(folio);
    }
    public List<Contrato> SearchContrato_c(int folio){
        return this.Ctdao.SearchContratos_c(folio);
    }
    public List<Contrato> MostrarContratos() {
        return this.Ctdao.MostrarContratos();
    }
    public void DardeBaja(int folio){
        Ctdao.DarDeBajaContrato(folio);
    }
    public List<Contrato> Generarcontrato(int folio){
        return this.Ctdao.GenerarContrato(folio);
    }
}
