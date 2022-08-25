package controlador.BancoTicket;

import controlador.tda.lista.exception.TopeException;

/**
 * @author K.G
 */
public class OficinaServices {

    private ControladorOficina cOficinas;

    public OficinaServices() throws TopeException {
        this.cOficinas = new ControladorOficina();
    }

    public String visualizar( ) {
       return cOficinas.mostrarInformacionOficinas();          
    }

    public boolean ingresoDatos(int pos, String nombres, String apellidos) {
       return cOficinas.ingresarDatosTikect(pos, nombres, apellidos);
    }

}