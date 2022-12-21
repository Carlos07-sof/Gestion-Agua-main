/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

public class ticket_generado {
    //Encabezado ticket
    private static String nombre_empresa = null;
    private static String s_a_c_v = null;
    private static String municipio= null;
    private static String estado = null;
    private static String rfc = null;
    /*
    private static Integer folio_contrato = null;
    private static Integer folio_cliente = null;
    private static String direccion = null;
    private static String manzana = null;
    private static String lote = null;*/

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        ticket_generado.nombre_empresa = nombre_empresa;
    }

    public String getS_a_c_v() {
        return s_a_c_v;
    }

    public void setS_a_c_v(String s_a_c_v) {
        ticket_generado.s_a_c_v = s_a_c_v;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        ticket_generado.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        ticket_generado.estado = estado;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        ticket_generado.rfc = rfc;
    }    
    
}
