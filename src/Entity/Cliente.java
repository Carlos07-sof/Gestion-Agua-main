package Entity;

import java.sql.Date;

public class Cliente {

    private Integer folio;
    private Integer folio_c;
    private String nombre;
    private String apellido_p;
    private String apellido_m;
    private Date fecha_nac;
    private String telefono;
    private String celular;
    private String email;
    private String curp;
    private String rfc;
    private String municipio;
    private String residencia;
    private String nombreCalle;
    private String calleReferencia;
    private int numeroMzn;
    private int numeroLt;
    private String status;
    private double deuda;
    private String consumo;
    private static Integer folioc = 0;

    public Cliente(Integer folio, String municipio, String residencia, String nombreCalle, String calleReferencia, int numeroMzn, int numeroLt) {
        this.folio = folio;
        this.municipio = municipio;
        this.residencia = residencia;
        this.nombreCalle = nombreCalle;
        this.calleReferencia = calleReferencia;
        this.numeroMzn = numeroMzn;
        this.numeroLt = numeroLt;
    }

    

    public Integer getFolio() {
        return folio;
    }

    public void setFolio(Integer folio) {
        this.folio = folio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    public String getApellido_m() {
        return apellido_m;
    }

    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public String getCalleReferencia() {
        return calleReferencia;
    }

    public void setCalleReferencia(String calleReferencia) {
        this.calleReferencia = calleReferencia;
    }

    public int getNumeroMzn() {
        return numeroMzn;
    }

    public void setNumeroMzn(int numeroMzn) {
        this.numeroMzn = numeroMzn;
    }

    public int getNumeroLt() {
        return numeroLt;
    }

    public void setNumeroLt(int numeroLt) {
        this.numeroLt = numeroLt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cliente() {
    }
    

    public Cliente(Integer folio, String nombre, String apellido_p, String apellido_m, Date fecha_nac, String telefono, String celular, String email, String curp, String rfc, String municipio, String residencia, String nombreCalle, String calleReferencia, int numeroMzn, int numeroLt) {
        this.folio = folio;
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.fecha_nac = fecha_nac;
        this.telefono = telefono;
        this.celular = celular;
        this.email = email;
        this.curp = curp;
        this.rfc = rfc;
        this.municipio = municipio;
        this.residencia = residencia;
        this.nombreCalle = nombreCalle;
        this.calleReferencia = calleReferencia;
        this.numeroMzn = numeroMzn;
        this.numeroLt = numeroLt;
    }
    
    public Cliente(String nombre, String apellido_p, String apellido_m, Date fecha_nac, String telefono, String celular, String email, String curp, String rfc, String municipio, String residencia, String nombreCalle, String calleReferencia, int numeroMzn, int numeroLt, String status) {
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.fecha_nac = fecha_nac;
        this.telefono = telefono;
        this.celular = celular;
        this.email = email;
        this.curp = curp;
        this.rfc = rfc;
        this.municipio = municipio;
        this.residencia = residencia;
        this.nombreCalle = nombreCalle;
        this.calleReferencia = calleReferencia;
        this.numeroMzn = numeroMzn;
        this.numeroLt = numeroLt;
        this.status = status;
    }

    public Cliente(String nombre, String apellido_p, String apellido_m, Date fecha_nac, String telefono, String celular, String email, String curp, String rfc, String municipio, String residencia, String nombreCalle, String calleReferencia, int numeroMzn, int numeroLt) {
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.fecha_nac = fecha_nac;
        this.telefono = telefono;
        this.celular = celular;
        this.email = email;
        this.curp = curp;
        this.rfc = rfc;
        this.municipio = municipio;
        this.residencia = residencia;
        this.nombreCalle = nombreCalle;
        this.calleReferencia = calleReferencia;
        this.numeroMzn = numeroMzn;
        this.numeroLt = numeroLt;
    }

    public double getDeuda() {
        return deuda;
    }

    public void setDeuda(double deuda) {
        this.deuda = deuda;
    }

    public Cliente(String nombre, String apellido_p, String apellido_m, String celular, String municipio, String residencia, int numeroMzn, int numeroLt, double deuda) {
        this.nombre = nombre;
        this.apellido_p = apellido_p;
        this.apellido_m = apellido_m;
        this.celular = celular;
        this.municipio = municipio;
        this.residencia = residencia;
        this.numeroMzn = numeroMzn;
        this.numeroLt = numeroLt;
        this.deuda = deuda;
    }

    public Integer getFolio_c() {
        return folio_c;
    }

    public void setFolio_c(Integer folio_c) {
        this.folio_c = folio_c;
    }

    public Integer getFolioc() {
        return folioc;
    }

    public void setFolioc(Integer folioc) {
        this.folioc = folioc;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }
    
}
