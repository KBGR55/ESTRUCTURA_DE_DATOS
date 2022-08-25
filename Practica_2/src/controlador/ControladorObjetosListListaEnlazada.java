package controlador;

import java.util.List;
import java.util.ArrayList;
import modelo.ListaEnlazada;
import modelo.NodoLista;
import modelo.ObjetosListaEnlazadaList;

/**
 * @author K.G
 * @param <E>
 */
public class ControladorObjetosListListaEnlazada<E> {
    //Atributo privado de la clase ObjetosListaEnlazadaList
    private ObjetosListaEnlazadaList obj;
     //Atributo privado de la clase ControladorMedirMemoria
    private ControladorMedirMemoria[] m;

    //Metodo constructor de la clase ControladorObjetosListListaEnlazada
    public ControladorObjetosListListaEnlazada( ) {
        this.obj = new ObjetosListaEnlazadaList();
    }

    //Metodo get del atributo obj
    public ObjetosListaEnlazadaList getObj() {
        return obj;
    }

    //Metodo get del atributo m
    public ControladorMedirMemoria[] getM() {
        return m;
    }

    /**
     * Metodo que mide la memoria de los datos vacios y en un arreglo el guarda
     * los datos con la ayuda de un metodo
     */
    public void medirMemoria() {
        this.m = new ControladorMedirMemoria[2];
        for (int i = 0; i < m.length; i++) {
            m[i] = new ControladorMedirMemoria();
        }
        List lit=new ArrayList();
        obj.setLita(lit);
        obj.setListaEnlazada(new ListaEnlazada<>());
        m[0].medirMemoria("List", obj.getLita());
        m[1].medirMemoria("ListaEnlazada", obj.getListaEnlazada());
    }

    /**
     * Metodo que permite llenar los datos del objeto ObjetosListaEnlazadaList
     */
    public void llenarDatos() {
        for (int i = 0; i < 25; i++) {
            insertar((E)("N"+i));
            obj.getLita().add("N"+i);
        }
    }

    /**
     * Metodo que mide la memoria de los datos llenos y en un arreglo el guarda
     * los datos con la ayuda de un metodo.
     */
    public void medirDatosLLenos() {
        llenarDatos();
        m[0].medirMemoriaLlena(obj.getLita());
        m[1].medirMemoriaLlena(obj.getListaEnlazada());
    }

    /**
     * Metodo que permite ingresar un dato en la liztaEnlazada.
     * @param dato
     */
    public void insertar(E dato) {
        NodoLista<E> nuevo = new NodoLista<>(dato, null);
        if (obj.getListaEnlazada().estaVacia()) {
            obj.getListaEnlazada().setCabecera(nuevo);
        } else {
            NodoLista<E> aux = obj.getListaEnlazada().getCabecera();
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        obj.getListaEnlazada().setSize(obj.getListaEnlazada().getSize() + 1);
    }

}
