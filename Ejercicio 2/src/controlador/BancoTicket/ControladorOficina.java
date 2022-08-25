package controlador.BancoTicket;

import controlador.tda.cola.ColaServices;
import controlador.tda.lista.exception.PosicionException;
import controlador.tda.lista.exception.TopeException;
import controlador.tda.pila.PilaServices;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import modelo.Oficina;
import modelo.Persona;
import modelo.Ticket;

/**
 * @author K.G
 */
public class ControladorOficina {

    PilaServices<Oficina> oficinas;

    public ControladorOficina() throws TopeException {
        this.oficinas = new PilaServices(3);
         this.oficinas.push(new Oficina("Oficina de préstamos", new ColaServices<>(20)));
        this.oficinas.push(new Oficina("Oficina de tarjetas de credito/debito", new ColaServices<>(20)));
        this.oficinas.push(new Oficina("Oficina de apertura de cuentas", new ColaServices<>(20)));
    }

    public Boolean ingresarDatosTikect(int pos, String nombres, String apellidos) {
        try {
            if (oficinas.getPila().obtenerDato(pos).getTickets().getTope() > oficinas.getPila().obtenerDato(pos).getTickets().getSize()) {
                Persona persona = new Persona(nombres, apellidos);
                Ticket dato = new Ticket(generarFechaHora(), persona, oficinas.getPila().obtenerDato(pos).getTickets().getSize() + 1);
                oficinas.getPila().obtenerDato(pos).getTickets().push(dato);
                return true;
            } else {
                return false;
            }
        } catch (PosicionException e) {
            return false;
        }
    }

    private String generarFechaHora() {
        SimpleDateFormat datefor = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        return datefor.format(Calendar.getInstance().getTime());
    }

    public String mostrarInformacionOficinas() {
        String comandos = "-_-_-_-_-_-_- _-_-_-_-_-_-_-_-_--_-_-_-_-_-_- _-_ -_-_-_ -_  OFICINAS -_-_-_-_-_-_- _-_-_-_-_-_-_-_-_--_-_-_-_-_-_- _-_ -_-_-_ -_\n---------------------------------------------------------------------------------------------------------------------------------\n";
        for (int i = 0; i < 3; i++) {
            try {
                Oficina com = new Oficina(oficinas.getPila().obtenerDato(i).getNombreOficina(), oficinas.getPila().obtenerDato(i).getTickets());
                comandos += "-> " + com.getNombreOficina() +"\n";
                 for (int j = 0; j < com.getTickets().getSize(); j++) {
                        Ticket ticket = new Ticket(com.getTickets().getCola().obtenerDato(j).getFechaHoraGenerado(), com.getTickets().getCola().obtenerDato(j).getPersona(), com.getTickets().getCola().obtenerDato(j).getnTurno());
                        comandos += "------------------------------------------------------------ TICKET ------------------------------------------------------------";
                        comandos += "\nGenerado : " + ticket.getFechaHoraGenerado() + " \t            |\t\tNumero de Turno : " + ticket.getnTurno();
                        comandos += "\nNombres y Apellidos : " + ticket.getPersona().getNombres() +" "+ ticket.getPersona().getApellidos()+"\n";
                }
                comandos += "\n---------------------------------------------------------------------------------------------------------------------------------\n";
            } catch (PosicionException e) {
                System.out.println("Error mostrarInformacionOficinas: " + e);
            }
        }
        return comandos;
    }

}
