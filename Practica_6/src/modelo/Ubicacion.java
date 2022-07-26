package modelo;

/**
 * Clase Ubicacion 
 * @author K.G
 */
public class Ubicacion {
    //Atributo privado nombrado id tipo Integer
    private Integer id;
    //Atributo privado nombrado longitud tipo Double
    private Double longitud;
    //Atributo privado nombrado latitud tipo Double
    private Double latitud;

    //Metodo constructor vacio
    public Ubicacion() {
    }

    //Metodo constructor con todos los atributos
    public Ubicacion(Integer id, Double longitud, Double latitud) {
        this.id = id;
        this.longitud = longitud;
        this.latitud = latitud;
    }

    //Metodo get del atributo id
    public Integer getId() {
        return id;
    }

    //Metodo set del atributo id
    public void setId(Integer id) {
        this.id = id;
    }

    //Metodo get del atributo longitud
    public Double getLongitud() {
        return longitud;
    }

    //Metodo set del atributo longitud
    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    //Metodo get del atributo latitud
    public Double getLatitud() {
        return latitud;
    }

    //Metodo set del atributo latitud
    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    /*
    * Metodo  toString() que devuelve un String con informacion del atributo longitud y latitud
    */
    @Override
    public String toString() {
        return " Longitud : "+longitud+" || Latitud: "+latitud;
    }
    
}