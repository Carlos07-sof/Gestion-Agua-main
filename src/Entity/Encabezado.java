
package Entity;

public class Encabezado {
    private Integer id_encabezado;
    private String nombre_empresa;
    private String sacv;
    private String municipio;
    private String estado;
    private String rfc;

    public Integer getId_encabezado() {
        return id_encabezado;
    }

    public void setId_encabezado(Integer id_encabezado) {
        this.id_encabezado = id_encabezado;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getSacv() {
        return sacv;
    }

    public void setSacv(String sacv) {
        this.sacv = sacv;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    
}
