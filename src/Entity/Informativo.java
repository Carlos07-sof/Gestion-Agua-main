package Entity;

public class Informativo {
    private Integer id_informativo;
    private String informativo;

    public Informativo() {
    }
    
    public Informativo(String informativo) {
        this.informativo = informativo;
    }
    
    public Integer getId_informativo() {
        return id_informativo;
    }

    public void setId_informativo(Integer id_informativo) {
        this.id_informativo = id_informativo;
    }

    public String getInformativo() {
        return informativo;
    }

    public void setInformativo(String informativo) {
        this.informativo = informativo;
    }
    
}