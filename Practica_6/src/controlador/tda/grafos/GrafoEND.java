package controlador.tda.grafos;

import controlador.tda.grafos.exception.VerticeException;

/**
 * Clase GrafoEND - Grafo Etiquetado no dirijido
 * @author K.G
 */
public class GrafoEND <E> extends GrafoDE<E> {
    public GrafoEND(Integer numV, Class clazz) {
       super(numV, clazz);
    }

    @Override
    public void insertarArista(Integer i, Integer j, Double peso) throws VerticeException {
        if (i > 0 && j > 0 &&i <= numV && j <= numV) {
            Object[] existe = existeArista(i, j);
            if (!((Boolean) existe[0])) {
                numA++;
                listaAdyacente[i].insertarCabecera(new Adyacencia(j, peso));
                listaAdyacente[j].insertarCabecera(new Adyacencia(i, peso));
            }
        } else {
            throw new VerticeException("Algun vertice ingresado no existe");
        }
    }

    @Override
    public void insertarAristaE(E i, E j, Double peso) throws Exception {
        insertarArista(obtenerCodigo(i),obtenerCodigo(j), peso);
        insertarArista(obtenerCodigo(j),obtenerCodigo(i), peso);
    }

    /**
     *
     * @param inicio
     * @return String
     * @throws Exception
     */
    public String toStringBPA(E inicio) throws Exception {
        return super.toStringBPA(obtenerCodigo(inicio)); 
    }

    @Override
    public String arrayToString(Integer[] v) {
       StringBuilder sb = new StringBuilder();
        for (int i = 0; i < v.length; i++) {
           try {
               sb.append(obtenerEtiqueta(v[i]).toString() + " |\t");
           } catch (Exception ex) {               
           }
        }
        return sb.toString();
    }
    
  
    
}