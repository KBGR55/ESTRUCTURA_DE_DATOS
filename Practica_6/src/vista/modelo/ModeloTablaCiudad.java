package vista.modelo;

import controlador.tda.grafos.GrafoEND;
import javax.swing.table.AbstractTableModel;
import modelo.Ciudad;

/**
 *
 * @author K.G
 */
public class ModeloTablaCiudad extends AbstractTableModel {

    private GrafoEND<Ciudad> grafo;

    public GrafoEND<Ciudad> getGrafo() {
        return grafo;
    }

    public void setGrafo(GrafoEND<Ciudad> grafo) {
        this.grafo = grafo;
    }

    
    @Override
    public int getRowCount() {
        return grafo.numVertices();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nro";
            case 1:
                return "Nombre";
            case 2:
                return "nHabitantes";
            case 3:
                return "Ubicacion";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        try {
            Ciudad c = grafo.obtenerEtiqueta(rowIndex+1);
            switch (columnIndex) {
                case 0:
                    return (rowIndex + 1);
                case 1:
                    return c.getNombre();
                case 2:
                    return c.getnHabitantes();
                case 3:
                    return (c.getUbicacion()==null)?"No tiene":c.getUbicacion().toString();
                default:
                    return null;
            }
        } catch (Exception e) {
            return null;
        }
    }

}