package Entity;

public class ErrorsAndSuccesses {

    private static String errorconexion;
    private static boolean ExitoConexion;
    private static int resultact;
    private static int resultinsert;
    private static String ubicacion = "null";
    public String getErrorconexion() {
        return errorconexion;
    }

    public void setErrorconexion(String errorconexion) {
        this.errorconexion = errorconexion;
    }

    public boolean isExitoConexion() {
        return ExitoConexion;
    }

    public void setExitoConexion(boolean ExitoConexion) {
        this.ExitoConexion = ExitoConexion;
    }

    public int getResultact() {
        return resultact;
    }

    public void setResultact(int resultact) {
        this.resultact = resultact;
    }

    public int getResultinsert() {
        return resultinsert;
    }

    public void setResultinsert(int resultinsert) {
        this.resultinsert = resultinsert;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
