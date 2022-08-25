package controlador.tda.pila;

import controlador.tda.lista.exception.EstructuraDataVaciaExpetion;
import controlador.tda.lista.exception.PosicionException;
import controlador.tda.lista.exception.TopeException;

/**
 * @author K.G
 */
public class PilaServices <E> {
    private Pila<E> pila;

    public PilaServices(Integer tope) {
        if(tope == 0)
            pila = new Pila<>();
        else
            pila = new Pila<>(tope);
    }

    public Pila<E> getPila() {
        return pila;
    }
    
    public boolean push(E dato) {
        try {
            pila.push(dato);
            return true;
        } catch (TopeException e) {
            System.out.println("Error "+e);
        }
        return false;
    }
    
    public E pop(Integer pos) {
        try {
            return pila.pop(pos);
            
        } catch (EstructuraDataVaciaExpetion | PosicionException e) {
            System.out.println("Error "+e);
        }
        return null;
    }
    
    public Integer getSize() {
        return pila.getSize();
    }
    
    public Integer getTope() {
        return pila.getTope();
    }
    
}
