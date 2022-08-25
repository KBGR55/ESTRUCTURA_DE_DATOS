package controlador;

import modelo.Arreglos;

/**
 * @author K.G
 */
public class ControladorArreglos {
 
    //Atributo privado del objeto Arreglos
    private Arreglos datos;
    //Atributo privado del objeto ControladorMedirMemoria 
    private ControladorMedirMemoria[] m;

    //Metodo get del atributo  datos
    public Arreglos getDatos() {
        return datos;
    }

    //Metodo get del atributo m
    public ControladorMedirMemoria[] getM() {
        return m;
    }

    //Metodo constructor de la clase ControladorArreglos
    public ControladorArreglos() {
        this.datos = new Arreglos();
    }

    /**
     * Metodo que mide la memoria de los datos vacios y en un arreglo guarda
     * los datos con la ayuda de un metodo
     */
    public void medirMemoria() {
        this.m = new ControladorMedirMemoria[5];
        for (int i = 0; i < m.length; i++) {
            m[i] = new ControladorMedirMemoria();
        }
        datos.setArregloDouble(new double[5]);
        datos.setArregloFloat(new float[5]);
        datos.setArregloInt(new int[5]);
        datos.setArregloLong(new long[5]);
        datos.setArregloString(new String[5]);
        m[0].medirMemoria("String", datos.getArregloString());
        m[1].medirMemoria("long", datos.getArregloLong());
        m[2].medirMemoria("Double", datos.getArregloDouble());
        m[3].medirMemoria("Float", datos.getArregloFloat());
        m[4].medirMemoria("int", datos.getArregloInt());
    }

    /**
     * Metodo que permite llenar los datos del objeto Arreglos
     */
    public void llenarDatos() {
        String arr[] = {"Karen", "Brigith", "Mayuri", "Lucrecia", "Lida"};
        datos.setArregloString(arr);
        int dInt[] = {5, 3, 5, 7, 11};
        datos.setArregloInt(dInt);
        double[] dDouble = {1.73, 251.67, 1.56, 15.894, 5120.50};
        datos.setArregloDouble(dDouble);
        long[] dLong = {1173, 25187, -1856, 158894, 2550};
        datos.setArregloLong(dLong);
        float[] dFloat = {9457.99f, 2.0f, 1.5f, 8.45f, 116.77f};
        datos.setArregloFloat(dFloat);
    }

    /**
     * Metodo que mide la memoria de los datos llenos y en un arreglo guarda
     * los datos con la ayuda de un metodo
     */
    public void medirDatosLLenos() {
        llenarDatos();
        m[0].medirMemoriaLlena(datos.getArregloString());
        m[1].medirMemoriaLlena(datos.getArregloLong());
        m[2].medirMemoriaLlena(datos.getArregloDouble());
        m[3].medirMemoriaLlena(datos.getArregloFloat());
        m[4].medirMemoriaLlena(datos.getArregloInt());
    }
}
