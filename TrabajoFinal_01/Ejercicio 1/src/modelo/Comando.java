package modelo;

/**
 * @author K.G
 */
public class Comando {
    //Atributo privado tipo String nombrado como comando
    private String comando;
    //Atributo privado tipo String nombrado como fecha
    private String fecha;

    public Comando(String comando, String fecha) {
        this.comando = comando;
        this.fecha = fecha;
    }

    public Comando() {
    }
    
    
    //Metodo get del atributo comando
    public String getComando() {
        return comando;
    }
    //Metodo set del atributo comando
    public void setComando(String comando) {
        this.comando = comando;
    }
    
    //Metodo get del atributo fecha
    public String getFecha() {
        return fecha;
    }
    //Metodo set del atributo fecha
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
        
}
