package controlador.cuenta;

import controlador.tda.lista.ListaEnlazadaServices;
import java.nio.charset.Charset;
import java.util.Random;
import modelo.Cuenta;

/**
 * @author kg
 */
public class ControladorCuentaOrdenacion {

    //atributo publico tipo ListaEnlazadaServices<Cuenta>
    public ListaEnlazadaServices<Cuenta> listaCuentas;

    //Metodo constructor de la clase ControladorCuentaOrdenacion
    public ControladorCuentaOrdenacion() {
        this.listaCuentas = new ListaEnlazadaServices();
    }

    /**
     * Metodo que permite ordenar los datos de un arreglo de acuerdo a un
     * atributo usando la logica de la ordenacion por el metodo Shell
     * @param A
     * @param tipo
     * @return Cuenta[]
     */
    public Cuenta[] ordenacionShell(Cuenta A[], String tipo) {
        int n = listaCuentas.getSize();
        int salto = n;
        boolean ordenado;
        while (salto > 1) {
            salto = salto / 2;
            do {
                ordenado = true;
                for (int j = 0; j <= n - 1 - salto; j++) {
                    int k = j + salto;
                    boolean intercambiar = false;
                    if (A[j].getClave().getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                        intercambiar = (A[j].getClave().compareTo(A[k].getClave()) > 0);
                    } else {
                        intercambiar = (String.valueOf(A[j].getSaldo()).compareTo(String.valueOf(A[k].getSaldo())) > 0);
                    }
                    if (intercambiar == true) {
                        Cuenta aux = new Cuenta(A[j].getSaldo(), A[j].getClave());
                        A[j].setClave(A[k].getClave());
                        A[j].setSaldo(A[k].getSaldo());//matriz[j] = matriz[k];
                        A[k].setClave(aux.getClave());
                        A[k].setSaldo(aux.getSaldo());//matriz[k] = aux;
                        ordenado = false;
                    }

                }
            } while (!ordenado);
        }
        return A;
    }

    /**
     * Metodo que permite ordenar los datos de acuerdo a un atributo usando la
     * logica de la ordenacion por el metodo quicksort
     *
     * @param A
     * @param izq
     * @param der
     * @param tipo
     * @return Cuenta[]
     */
    public Cuenta[] quicksort(Cuenta A[], int izq, int der, String tipo) {
        try {
            Cuenta pivote = A[izq]; // tomamos primer elemento como pivote
            int i = izq;         // i realiza la búsqueda de izquierda a derecha
            int j = der;         // j realiza la búsqueda de derecha a izquierda
            Cuenta aux;
            boolean atributo = A[0].getClave().getClass().getSimpleName().equalsIgnoreCase(tipo);
            while (i < j) {                          // mientras no se crucen las búsquedas                                   
                if (atributo == true) {
                    while (A[i].getClave().compareTo(pivote.getClave()) <= 0 && i < j) {
                        i++;
                    }
                    while (A[j].getClave().compareTo(pivote.getClave()) > 0) {
                        j--;
                    }

                } else {
                    while (A[i].getSaldo() <= pivote.getSaldo() && i < j) {
                        i++; // busca elemento mayor que pivote
                    }
                    while (A[j].getSaldo() > pivote.getSaldo()) {
                        j--;           // busca elemento menor que pivote
                    }

                }
                if (i <= j) {                        // si no se han cruzado                      
                    aux = A[i];                      // los intercambia
                    A[i] = A[j];
                    A[j] = aux;
                }
            }

            A[izq] = A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
            A[j] = pivote;      // los menores a su izquierda y los mayores a su derecha

            if (izq < j - 1) {
                quicksort(A, izq, j - 1, tipo);          // ordenamos subarray izquierdo
            }
            if (j + 1 < der) {
                quicksort(A, j + 1, der, tipo);          // ordenamos subarray derecho
            }
        } catch (Exception e) {
        }
        return A;
    }

    /**
     * Metodo que genera una clave de longitud 6
     *
     * @return String
     */
    public String generarClave() {
        byte[] bytearray = new byte[256];
        new Random().nextBytes(bytearray);
        String mystring = new String(bytearray, Charset.forName("UTF-8"));
        StringBuilder thebuffer = new StringBuilder();
        int i = 6;//Longitud de la clave
        for (int m = 0; m < mystring.length(); m++) {
            char n = mystring.charAt(m);
            if (((n >= 'A' && n <= 'Z') || (n >= '0' && n <= '9')) && (i > 0)) {
                thebuffer.append(n);
                i--;
            }
        }
        return thebuffer.toString();
    }

    /**
     * Metodo que permite generar saldo aleatorio
     *
     * @return double
     */
    public double generarSlado() {
        Random rand = new Random();
        return 0.99 + (9999999.10 - 0.99) * rand.nextDouble();
    }

    /**
     * Metodo que llama a los metodos de generar datos aleatorios para ir
     * guardandolos en la lista enlazada
     */
    public void GenerarDatos() {
        for (int m = 0; m < 10000; m++) {
            Cuenta dato = new Cuenta(generarSlado(), generarClave());
            listaCuentas.insertarAlInicio(dato);
        }
    }

    /**
     * Metodo que recorre una lista enlazada y va guardando sus datos en un
     * String
     *
     * @return String
     */
    public String mostrarDatos() {
        String info = "------------------------------------- LISTA DE CUENTAS -------------------------------------\nCLAVE\t|\tSALDO\n";
        for (int i = 0; i < listaCuentas.getSize(); i++) {
            info += listaCuentas.obtenerDato(i).getClave() + "\t|\t" + listaCuentas.obtenerDato(i).getSaldo() + "\n";
        }
        return info;
    }

    /**
     * Metodo que recorre la lista enlazada de forma desendente
     */
    public void ordenarDescendente() {
        ListaEnlazadaServices<Cuenta> aux = new ListaEnlazadaServices();
        for (int j = (listaCuentas.getSize() - 1); j >= 0; j--) {
            aux.insertarAlFinal(listaCuentas.obtenerDato(j));
        }
        listaCuentas.limpiarLista();
        for (int i = 0; i < aux.getSize(); i++) {
            listaCuentas.insertarAlFinal(aux.obtenerDato(i));
        }
    }
}
