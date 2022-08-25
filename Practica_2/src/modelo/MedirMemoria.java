package modelo;

/**
 * @author K.G
 */

public class MedirMemoria {
    private String tipoDato;
    private long vacio;
    private long lleno;

    public long getVacio() {
        return vacio;
    }

    public void setVacio(long vacio) {
        this.vacio = vacio;
    }

    public long getLleno() {
        return lleno;
    }

    public void setLleno(long lleno) {
        this.lleno = lleno;
    }

    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
    }
        
}
