package modelo;

/**
 * @author K.G
 */
public class Ticket {
    private String fechaHoraGenerado;
    private Persona persona;
    private int nTurno;

    public Ticket(String fechaHoraGenerado, Persona persona, int nTurno) {
        this.fechaHoraGenerado = fechaHoraGenerado;
        this.persona = persona;
        this.nTurno = nTurno;
    }
    
    public String getFechaHoraGenerado() {
        return fechaHoraGenerado;
    }

    public void setFechaHoraGenerado(String fechaHoraGenerado) {
        this.fechaHoraGenerado = fechaHoraGenerado;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getnTurno() {
        return nTurno;
    }

    public void setnTurno(int nTurno) {
        this.nTurno = nTurno;
    }
        
}