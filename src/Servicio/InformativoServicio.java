package Servicio;

import Dao.InformativoDao;
import Dao.pie_paginaDao;
import Entity.Informativo;
import Entity.pie_pagina;
import java.util.List;

public class InformativoServicio {
    private InformativoDao info = new InformativoDao();
    private pie_paginaDao infos = new pie_paginaDao();
    public List<Informativo> MostrarInformacion() {
        return this.info.MostrarInformacion();
    }
    /*public List<Encabezado>MostrarEncabezado() {
        return this.info.MostrarEncabezado();
    }*/
    public List<pie_pagina>MostrarPie_Pagina() {
        return this.infos.MostrarPie_Pagina();
    }
}
