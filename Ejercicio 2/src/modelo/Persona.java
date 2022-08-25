package modelo;

/**
 * @author K.G
 */
public class Persona {
    private String Nombres;
    private String Apellidos;

    public Persona(String Nombres, String Apellidos) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    
}