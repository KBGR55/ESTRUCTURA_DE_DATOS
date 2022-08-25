package modelo;

/**
 * @author K.G
 */
public class Mirasol {
    //Atributo privado arreglo unidimencional tipo Agencia nombrado agencias
    private  Agencia agencias[];
    //Atributo privado arreglo bidimencional tipo String nombrado meses
    private String meses[][];
    //Atributo privado tipo double nombrado sumasTotales
    private double sumasTotales;
    //Metodo Constructor 
    public Mirasol(Agencia[] agencias) {
        this.agencias = agencias;
    }
    //Metodos get de la clase Mirasol 
    public Agencia[] getAgencias() {
        return agencias;
    }
    //Metodos set de la clase Mirasol 
    public void setAgencias(Agencia[] agencias) {
        this.agencias = agencias;
    }
    //Metodos get y set de sumasTotales
    public double getSumasTotales() {
        return sumasTotales;
    }

    public void setSumasTotales(double sumasTotales) {
        this.sumasTotales = sumasTotales;
    }
    //Metodos get y set de meses
    public String[][] getMeses() {
        return meses;
    }

    public void setMeses(String[][] meses) {
        this.meses = meses;
    }    
}