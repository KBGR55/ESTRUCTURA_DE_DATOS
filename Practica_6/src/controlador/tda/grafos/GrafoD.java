package controlador.tda.grafos;

import controlador.tda.grafos.exception.VerticeException;
import controlador.tda.lista.ListaEnlazada;
import controlador.tda.lista.exception.PosicionException;

/**
 *
 * @author K.G
 */
public class GrafoD extends Grafo {

    protected Integer numV;
    protected Integer numA;
    protected ListaEnlazada<Adyacencia> listaAdyacente[];

    public GrafoD(Integer numV) {
        this.numV = numV;
        this.numA = 0;
        listaAdyacente = new ListaEnlazada[numV + 1];
        for (int i = 0; i <= this.numV; i++) {
            listaAdyacente[i] = new ListaEnlazada<>();
        }
    }

    public void setAtributos(Integer numV, Integer numA, ListaEnlazada<Adyacencia>[] listaAdyacente) {
        this.numV = numV;
        this.numA = numA;
        this.listaAdyacente = listaAdyacente;
    }

    public void amentarGrafo() {
        GrafoD copia = new GrafoD(numVertices() + 1);
        try {
            for (int i = 0; i < numVertices(); i++) {
                ListaEnlazada<Adyacencia> lista = adyacente(i);
                for (int j = 0; j < lista.getSize(); j++) {
                    Adyacencia aux = lista.obtenerDato(j);
                    copia.insertarArista(i, aux.getDestino(), aux.getPeso());
                }
            }
            setAtributos(copia.numVertices(), copia.numAristas(), copia.listaAdyacente);
        } catch (Exception e) {
            System.out.println("EEROR COPIA: " + e);
        }
    }

    @Override
    public Integer numVertices() {
        return this.numV;
    }

    @Override
    public Integer numAristas() {
        return this.numA;
    }

    /**
     * Permite verificar si existe una conexion entre aristas
     *
     * @param i vertice inicial
     * @param f vertice final
     * @return arreglo de objetos: en la posicion 0 regresa un boolean y en la 1
     * el peso
     * @throws VerticeException
     */
    @Override
    public Object[] existeArista(Integer i, Integer f) throws VerticeException {
        Object[] resultado = {Boolean.FALSE, Double.NaN};
        if (i > 0 && f > 0 && i <= numV && f <= numV) {
            ListaEnlazada<Adyacencia> lista = listaAdyacente[i];
            for (int k = 0; k < lista.getSize(); k++) {
                try {
                    Adyacencia aux = lista.obtenerDato(k);
                    if (aux.getDestino().intValue() == f.intValue()) {
                        resultado[0] = Boolean.TRUE;
                        resultado[1] = aux.getPeso();
                        break;
                    }
                } catch (Exception e) {
                }
            }
            return resultado;
        } else {
            throw new VerticeException("Algun vertice ingreado no existe");
        }
    }

    @Override
    public Double pesoArista(Integer i, Integer f) throws VerticeException {
        Double peso = Double.NaN;
        Object[] existe = existeArista(i, f);
        if (((Boolean) existe[0])) {
            peso = (Double) existe[1];
        }
        return peso;
    }

    @Override
    public void insertarArista(Integer i, Integer j) throws VerticeException {
        insertarArista(i, j, Double.NaN);
    }

    @Override
    public void insertarArista(Integer i, Integer j, Double peso) throws VerticeException {
        if (i > 0 && j > 0 && i <= numV && j <= numV) {
            Object[] existe = existeArista(i, j);
            if (!((Boolean) existe[0])) {
                numA++;
                listaAdyacente[i].insertarCabecera(new Adyacencia(j, peso));
            }
        } else {
            throw new VerticeException("Algun vertice ingresado no existe");
        }

    }

    @Override
    public ListaEnlazada<Adyacencia> adyacente(Integer i) throws VerticeException {
        return listaAdyacente[i];
    }

    public ListaEnlazada<Integer> algoritmo_Floyd(Integer inicio, Integer fin) throws Exception {
        ListaEnlazada<Integer> retornar_camino = new ListaEnlazada<>();
        Integer[][] matriz_C = new Integer[numV + 1][numV + 1];
        Integer[][] matriz_Caminos = new Integer[numV + 1][numV + 1];
        Double[][] matriz_D = new Double[numV + 1][numV + 1];
        matrizPesos(matriz_C, matriz_Caminos, matriz_D);
        //Aloritmo Floyd
        for (int i = 1; i <= numVertices(); i++) {
            for (int j = 1; j <= numVertices(); j++) {
                for (int k = 1; k <= numVertices(); k++) {
                    if (matriz_D[j][i] + matriz_D[i][k] < matriz_D[j][k]) {
                        matriz_D[j][k] = matriz_D[j][i] + matriz_D[i][k];
                        matriz_C[j][k] = matriz_Caminos[i][k];
                    }
                }
            }
        }
        while (inicio != fin) {
            retornar_camino.insertarCabecera(inicio);
            inicio = matriz_C[inicio][fin];
        }
        retornar_camino.insertarCabecera(inicio);
        return retornar_camino;
    }

    public void matrizPesos(Integer[][] matriz_C, Integer[][] matriz_Caminos, Double[][] matriz_D) throws Exception {
        for (int i = 1; i <= numVertices(); i++) {
            for (int j = 1; j <= numVertices(); j++) {
                matriz_C[i][j] = j;
                matriz_Caminos[i][j] = i;
                if (i == j) {
                    matriz_D[i][j] = 0.0;
                    matriz_C[i][j] = 0;
                    matriz_Caminos[i][j] = 0;
                } else {
                    matriz_D[i][j] = ((!(Boolean) existeArista(i, j)[0]) ? Double.POSITIVE_INFINITY : pesoArista(i, j));
                }

            }
        }
    }

    /*public static void main(String[] args) {
        GrafoD grafo = new GrafoD(5);

        try {
            grafo.insertarArista(3,5, 4.0);
            grafo.insertarArista(3,2, 4.0);
            grafo.insertarArista(5,4, 4.0);
            grafo.insertarArista(2,1, 4.0);
            grafo.insertarArista(4,1, 4.0);
            grafo.insertarArista(3,1, 4.0);
            System.out.println(grafo.toString());

            System.out.println("-----------Floy ------------------");
            grafo.algoritmo_Floyd(1, 3).imprimir();
            System.out.println("-----------minimo ------------------");
            //grafo.caminoMinimo(1, 3).imprimir();
            System.out.println("-----------Profun------------------");
            System.out.println(grafo.toStringDFS());
            System.out.println("-----------Anchura------------------");
            System.out.println(grafo.arrayToString(grafo.BPA(3)));
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
    }*/

    protected Integer[] visitados;
    protected Integer ordenVisita;
    protected ListaEnlazada<Integer> q;

    //busqueda en profundidad (DFS)
    public Integer[] toArrayDFS() throws Exception {
        Integer[] recorrido = new Integer[numVertices()];
        visitados = new Integer[numVertices() + 1];
        ordenVisita = 0;
        
        for (int i = 0; i <= numVertices(); i++) {
            visitados[i] = 0;
        }

        for (int i = 1; i <= numVertices(); i++) {
            if (visitados[i] == 0) {
                toArrayDFS(i, recorrido);
            }
        }
        Integer aux[] = recorrido;
        for (int j = 0; j < recorrido.length; j++) {
            for (int k = 0; k < aux.length; k++) {
                if (j != k) {
                    if (recorrido[j] == aux[k]) {
                        for (int i = k; i < aux.length-1; i++) {
                                recorrido[i] = aux[i + 1];
                           
                        }
                    }
                }
            }
        }
        
        return recorrido;
    }

    private void toArrayDFS(Integer origen, Integer res[]) throws Exception {
        res[ordenVisita] = origen;
        visitados[origen] = ordenVisita++;
        ListaEnlazada<Adyacencia> lista = listaAdyacente[origen];
        for (int i = 0; i < lista.getSize(); i++) {
            Adyacencia a;           
            if (lista.existeDato(i)) {
                 break;
            } else {
                a = lista.obtenerDato(i);
            }
            
            lista.setCabecera(lista.getCabecera().getSiguiente());
            if (visitados[a.getDestino()] == 0) {
                toArrayDFS(a.getDestino(), res);
                
            }
        }
    }

    public String toStringDFS() throws Exception {
        return arrayToString(toArrayDFS());
    }

    //Recorrido en anchura (BPA) 
    public Integer[] BPA(Integer inicio) throws PosicionException {
        Integer[] recorrido = new Integer[numV];
        recorrido[0] = inicio;
        Integer cont = 1;
        int i = 0;
        boolean esta = false;
        while (cont < numV) {
            i++;
            for (int j = 0; j < listaAdyacente[inicio].getSize(); j++) {
                for (int k = 0; k < recorrido.length; k++) {
                    if (recorrido[k] == listaAdyacente[inicio].obtenerDato(j).getDestino()) {
                        esta = true;
                        break;
                    } else {
                        esta = false;
                    }
                }
                if (!esta) {
                    recorrido[cont] = listaAdyacente[inicio].obtenerDato(j).getDestino();
                    cont++;
                }
            }

            if (inicio == numV) {
                inicio = 0;
            }
            if (cont == numV) {
                break;
            }
            inicio++;
            if (i > numV) {
                break;
            }
        }
  
        
        return recorrido;
    }

    public String toStringBPA(Integer inicio)throws Exception {
        return arrayToString(BPA(inicio));
    }
    
    public String arrayToString(Integer v[]) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < v.length; i++) {
            sb.append(v[i] + " |\t");
        }
        return sb.toString();
    }

}