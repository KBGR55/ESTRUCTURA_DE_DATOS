package modelo;

/**
 * Clase Ciudad
 * @author K.G
 */
public class Ciudad {
    //Atributo privado nombrado id tipo Integer
    private Integer id;
    //Atributo privado nombrado nombre tipo String
    private String nombre;
    //Atributo privado nombrado nHabitantes tipo int
    private int nHabitantes;
    //Atributo privado nombrado ubicacion tipo Ubicacion
    private Ubicacion ubicacion;

    //Metodo constructor vacio
    public Ciudad() {
    }

    //Metodo constructor con todos los atributos
    public Ciudad(Integer id, String nombre, int nHabitantes, Ubicacion ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.nHabitantes = nHabitantes;
        this.ubicacion = ubicacion;
    }

    //Metodo get del atributo id
    public Integer getId() {
        return id;
    }

    //Metodo set del atributo id
    public void setId(Integer id) {
        this.id = id;
    }

    //Metodo get del atributo nombre
    public String getNombre() {
        return nombre;
    }

    //Metodo set del atributo nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodo get del atributo nHabitantes
    public int getnHabitantes() {
        return nHabitantes;
    }

    //Metodo set del atributo nHabitantes
    public void setnHabitantes(int nHabitantes) {
        this.nHabitantes = nHabitantes;
    }

    //Metodo get del atributo ubicacion
    public Ubicacion getUbicacion() {
        return ubicacion;
    }
    
    //Metodo set del atributo ubicacion
    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
}
