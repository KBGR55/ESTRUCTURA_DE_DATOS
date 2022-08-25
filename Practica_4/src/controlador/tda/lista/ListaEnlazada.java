package controlador.tda.lista;

import controlador.tda.lista.excepcion.PosicionException;
import java.lang.reflect.Method;


/**
 *
 * @author kg
 */
public class ListaEnlazada<E>{
  
    private NodoLista<E> cabecera;

    private Integer size;

    public NodoLista<E> getCabecera() {
        return cabecera;
    }

    public void setCabecera(NodoLista<E> cabecera) {
        this.cabecera = cabecera;
    }

    /**
     * Constructor de la clase se inicializa la lista en null y el tamanio en 0
     */
    public ListaEnlazada() {
        cabecera = null;
        size = 0;
    }

    /**
     * Permite ver si la lista esta vacia
     *
     * @return Boolean true si esta vacia, false si esta llena
     */
    public Boolean estaVacia() {
        return cabecera == null;
    }

    private void insertar(E dato) {
        NodoLista<E> nuevo = new NodoLista<>(dato, null);
        if (estaVacia()) {
            cabecera = nuevo;
        } else {
            NodoLista<E> aux = cabecera;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        size++;
    }

    public void insertarCabecera(E dato) {
        if (estaVacia()) {
            insertar(dato);
        } else {
            NodoLista<E> nuevo = new NodoLista<>(dato, null);

            nuevo.setSiguiente(cabecera);
            cabecera = nuevo;
            size++;
        }
    }

    public void insertar(E dato, Integer pos) throws PosicionException {
        //lista size = 1
        if (estaVacia()) {
            insertar(dato);
        } else if (pos >= 0 && pos < size) {
            NodoLista<E> nuevo = new NodoLista<>(dato, null);
            if (pos == (size - 1)) {
                insertar(dato);

            } else {

                NodoLista<E> aux = cabecera;
                for (int i = 0; i < pos - 1; i++) {
                    aux = aux.getSiguiente();
                }
                NodoLista<E> siguiente = aux.getSiguiente();
                aux.setSiguiente(nuevo);
                nuevo.setSiguiente(siguiente);
                size++;
            }

        } else {
            throw new PosicionException("Error en insertar: No existe la posicion dada");
        }
    }

    public Integer getSize() {
        return size;
    }

    /**
     * Metodo que permite obtener un dato segun la posicion
     *
     * @param pos posicion en la lista
     * @return Elemento
     */
    public E obtenerDato(Integer pos) throws PosicionException {
        if (!estaVacia()) {
            if (pos >= 0 && pos < size) {
                E dato = null;
                if (pos == 0) {
                    dato = cabecera.getDato();
                } else {
                    NodoLista<E> aux = cabecera;
                    for (int i = 0; i < pos; i++) {
                        aux = aux.getSiguiente();
                    }
                    dato = aux.getDato();
                }

                return dato;
            } else {
                throw new PosicionException("Error en obtener dato: No existe la posicion dada");
            }

        } else {
            throw new PosicionException("Error en obtener dato: La lista esta vacia, por endde no hay esa posicion");
        }
    }

    public E eliminarDato(Integer pos) throws PosicionException {
        E auxDato = null;
        if (!estaVacia()) {
            if (pos >= 0 && pos < size) {
                if (pos == 0) {
                    auxDato = cabecera.getDato();
                    cabecera = cabecera.getSiguiente();
                    size--;
                } else {
                    NodoLista<E> aux = cabecera;
                    for (int i = 0; i < pos - 1; i++) {
                        aux = aux.getSiguiente();
                    }
                    auxDato = aux.getDato();
                    NodoLista<E> proximo = aux.getSiguiente();
                    aux.setSiguiente(proximo.getSiguiente());
                    size--;
                }
                return auxDato;

            } else {
                throw new PosicionException("Error en eliminar dato: No existe la posicion dada");
            }

        } else {
            throw new PosicionException("Error en eliminar dato: La lista esta vacia, por endde no hay esa posicion");
        }
    }

    public void vaciar() {
        cabecera = null;
        size = 0;
        //en c utilizamos el free
        //malloc
    }

    public void modificarDato(Integer pos, E datoM) throws PosicionException {
        if (!estaVacia()) {
            if (pos >= 0 && pos < size) {
                // E dato = null;
                if (pos == 0) {
                    cabecera.setDato(datoM);
                } else {
                    NodoLista<E> aux = cabecera;
                    for (int i = 0; i < pos; i++) {
                        aux = aux.getSiguiente();
                    }
                    aux.setDato(datoM);
                }

            } else {
                throw new PosicionException("Error en obtener dato: No existe la posicion dada");
            }

        } else {
            throw new PosicionException("Error en obtener dato: La lista esta vacia, por endde no hay esa posicion");
        }
    }

    public E[] toArray() {
        // E[] matriz = (E[]) (new Object[this.size]);
        Class<E> clazz = null;
        E[] matriz = null;
        if (this.size > 0) {
            matriz = (E[]) java.lang.reflect.Array.newInstance(cabecera.getDato().getClass(), this.size);
            NodoLista<E> aux = cabecera;
            for (int i = 0; i < this.size; i++) {
                matriz[i] = aux.getDato();
                //System.out.print(aux.getDato().toString() + "\t");
                aux = aux.getSiguiente();
            }
        }

        return matriz;
    } 
    public ListaEnlazada<E> toList(E[] matriz) {
        //E[] matriz = (E[]) (new Object[this.size]);
        this.vaciar();
        for (int i = 0; i < matriz.length; i++) {
            this.insertar(matriz[i]);
        }
        return this;
    }/*
    private void quick(E[] arrelo, int inicio, int fin, String atributo, Class clazz, TipoOrdenacion tipoOrdenacion) throws Exception {
        E pivote = arrelo[inicio];
        int i = inicio;
        int j = fin;

        while (i < j) {

            Method method = getMethod("get" + Utilidades.capitalizar(atributo), arrelo[i].getClass());
            Method method1 = getMethod("get" + Utilidades.capitalizar(atributo), arrelo[j].getClass());
            Method method2 = getMethod("get" + Utilidades.capitalizar(atributo), pivote.getClass());
            if (Utilidades.isNumber(clazz)) {
                if (tipoOrdenacion.toString().equalsIgnoreCase(TipoOrdenacion.ASCENDENTE.toString())) {

                    while (((Number) method.invoke(arrelo[i])).doubleValue() <= ((Number) method2.invoke(pivote)).doubleValue() && i < j) {
                        // cambioBurbuja(j, matriz);
                        i++;
                    }
                    while (((Number) method1.invoke(arrelo[j])).doubleValue() > ((Number) method2.invoke(pivote)).doubleValue()) {
                        // cambioBurbuja(j, matriz);
                        j--;
                    }
                } else {
                    while (((Number) method.invoke(arrelo[i])).doubleValue() >= ((Number) method2.invoke(pivote)).doubleValue() && i < j) {
                        // cambioBurbuja(j, matriz);
                        i++;
                    }
                    while (((Number) method1.invoke(arrelo[j])).doubleValue() < ((Number) method2.invoke(pivote)).doubleValue()) {
                        // cambioBurbuja(j, matriz);
                        j--;
                    }
                }
                if (i < j) {
                    E aux = arrelo[i];
                    arrelo[i] = arrelo[j];
                    arrelo[j] = aux;

                }

            } else if (Utilidades.isString(clazz)) {

                if (tipoOrdenacion.toString().equalsIgnoreCase(TipoOrdenacion.ASCENDENTE.toString())) {
                    while (((String) method.invoke(arrelo[i])).toLowerCase().compareTo(((String) method2.invoke(pivote)).toLowerCase()) <= 0 && i < j) {
                        // cambioBurbuja(j, matriz);
                        i++;
                    }
                    while (((String) method1.invoke(arrelo[j])).toLowerCase().compareTo(((String) method2.invoke(pivote)).toLowerCase()) > 0) {
                        // cambioBurbuja(j, matriz);
                        j--;
                    }
                } else {
                    while (((String) method.invoke(arrelo[i])).toLowerCase().compareTo(((String) method2.invoke(pivote)).toLowerCase()) >= 0 && i < j) {
                        // cambioBurbuja(j, matriz);
                        i++;
                    }
                    while (((String) method1.invoke(arrelo[j])).toLowerCase().compareTo(((String) method2.invoke(pivote)).toLowerCase()) < 0) {
                        // cambioBurbuja(j, matriz);
                        j--;
                    }
                }
                if (i < j) {
                    E aux = arrelo[i];
                    arrelo[i] = arrelo[j];
                    arrelo[j] = aux;

                }

            }

        }
        arrelo[inicio] = arrelo[j];
        arrelo[j] = pivote;

        if (inicio < j - 1) {
            quick(arrelo, inicio, j - 1, atributo, clazz, tipoOrdenacion);
        }

        if (j + 1 < fin) {
            quick(arrelo, j + 1, fin, atributo, clazz, tipoOrdenacion);
        }

    }/**/
}
