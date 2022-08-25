package controlador.tda.cola;

import controlador.tda.lista.exception.EstructuraDataVaciaExpetion;
import controlador.tda.lista.exception.PosicionException;
import controlador.tda.lista.exception.TopeException;

/**
 * @author K.G
 */
public class ColaServices <E> {
    private Cola<E> cola;

    public ColaServices(Integer tope) {
       cola = new Cola<>(tope);
    }

    public Cola<E> getCola() {
        return cola;
    }
    
    public boolean push(E dato) {
        try {
            cola.queue(dato);
            return true;
        } catch (TopeException | PosicionException e) {
            System.out.println("Error "+e);
        }
        return false;
    }
    
    public E pop(Integer pos) {
        try {
            return cola.dequeue(pos);
            
        } catch (EstructuraDataVaciaExpetion | PosicionException e) {
            System.out.println("Error "+e);
        }
        return null;
    }
    
    public Integer getSize() {
        return cola.getSize();
    }
    
    public Integer getTope() {
        return cola.getTope();
    }
    
}