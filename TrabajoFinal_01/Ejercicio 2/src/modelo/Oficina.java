package modelo;

import controlador.tda.cola.ColaServices;

/**
 * @author K.G
 */
public class Oficina {
    private String nombreOficina;
    private ColaServices<Ticket>  tickets;

    public Oficina(String nombreOficina, ColaServices<Ticket> tickets) {
        this.nombreOficina = nombreOficina;
        this.tickets = tickets;
    }

    public ColaServices<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ColaServices<Ticket> tickets) {
        this.tickets = tickets;
    }

    public String getNombreOficina() {
        return nombreOficina;
    }

    public void setNombreOficina(String nombreOficina) {
        this.nombreOficina = nombreOficina;
    }
    
}