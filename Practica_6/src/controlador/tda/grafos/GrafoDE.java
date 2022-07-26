package controlador.tda.grafos;

import controlador.tda.grafos.exception.VerticeException;
import controlador.tda.lista.ListaEnlazada;
import java.util.HashMap;

/**
 *
 * @author K.G
 */
public class GrafoDE<E> extends GrafoD {
    protected Class<E> clazz;
    protected E etiquetas[];
    protected HashMap<E, Integer> dicVertices;

    public GrafoDE(Integer numV,Class clazz) {
        super(numV);
        this.clazz = clazz;
        etiquetas = (E[]) java.lang.reflect.Array.newInstance(this.clazz, numV + 1);
        dicVertices = new HashMap<>(numV);
    }

    @Override
    public void amentarGrafo() {
        super.amentarGrafo(); 
        E aux[] = (E[]) java.lang.reflect.Array.newInstance(this.clazz, numV + 1);
        HashMap<E, Integer> auxdicVertices= new HashMap<>(numV);
        for (int i = 0; i < etiquetas.length; i++) {
            aux[i]=etiquetas[i];
            auxdicVertices.put(aux[i],i);
        }
        etiquetas = aux;
        dicVertices = auxdicVertices;        
    }    

    public Boolean modificar(E viejo,E nuevo) throws Exception{
        Integer pos= obtenerCodigo(viejo);
        etiquetas[pos]=nuevo;
        dicVertices.remove(viejo);
        dicVertices.put(nuevo, pos);
        return true;  
    }
    
    public Object[] existeAristaE(E i, E j) throws Exception {
        return this.existeArista(obtenerCodigo(i), obtenerCodigo(j));
    }

    public void insertarAristaE(E i, E j, Double peso) throws Exception {
        this.insertarArista(obtenerCodigo(i), obtenerCodigo(j), peso);
    }

    public void insertarAristaE(E i, E j) throws Exception {
        this.insertarArista(obtenerCodigo(i), obtenerCodigo(j), Double.NaN);
    }

    public Integer obtenerCodigo(E etiqueta) throws Exception {
        Integer key = dicVertices.get(etiqueta);
        if (key != null) {
            return key;
        } else {
            throw new VerticeException("NO SE ENCUENTRA LA ETIQUETA CORRESPONDTENTE");
        }
    }

    public E obtenerEtiqueta(Integer codigo) throws Exception {
        return etiquetas[codigo];
    }

    public ListaEnlazada<Adyacencia> adyacentesDEE(E i) throws Exception {
        return adyacente(obtenerCodigo(i));
    }

    public void etiquetarVertice(Integer codigo, E etiqueta) {
        etiquetas[codigo] = etiqueta;
        dicVertices.put(etiqueta, codigo);
    }
    
    @Override
    public String toString() {
        StringBuilder grafo=new StringBuilder();
        try {
            for(int i = 1; i <= numVertices(); i++) {
            grafo.append("VERTICE "+i+" --E-- " + obtenerEtiqueta(i));
            try {
                ListaEnlazada<Adyacencia> lista = adyacente(i);
                for(int j = 0; j < lista.getSize(); j++) {
                    Adyacencia aux = lista.obtenerDato(j);
                    if(aux.getPeso().toString().equalsIgnoreCase(String.valueOf(Double.NaN)))
                        grafo.append(" --- VERTICE DESTINO "+aux.getDestino()+ " --E-- "+ obtenerEtiqueta(aux.getDestino()));
                    else 
                        grafo.append(" --- VERTICE DESTINO "+aux.getDestino()+ " --E-- "+ obtenerEtiqueta(aux.getDestino()) + " --peso-- "+aux.getPeso());
                }
                grafo.append("\n");
            } catch (Exception e) {
                System.out.println("Error en toString "+e);
               
            }
        }
        } catch (Exception e) {
            System.out.println("Error en toString"+e);
        }
        return grafo.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public ListaEnlazada<E> algoritmo_Floyd(E origen,E destino) throws Exception {
        ListaEnlazada<Integer> camino =super.algoritmo_Floyd(obtenerCodigo(origen),obtenerCodigo(destino));
        ListaEnlazada<E> retornar_camino=new ListaEnlazada<>();
        for (int i = 0; i < camino.getSize(); i++) {
            retornar_camino.insertarCabecera(obtenerEtiqueta(camino.obtenerDato(i)));
        }
        return retornar_camino;
    }
  
}