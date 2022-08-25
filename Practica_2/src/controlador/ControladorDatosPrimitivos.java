package controlador;

import modelo.TiposDeDatosPrimitivos;

/**
 * @author K.G
 */
public class ControladorDatosPrimitivos {
    //Atributo privado del objeto TiposDeDatosPrimitivos
    private TiposDeDatosPrimitivos datos;
    //Atributo privado del objeto ControladorMedirMemoria 
    private ControladorMedirMemoria[] m;

    //Metodo get del atributo  datos
    public TiposDeDatosPrimitivos getDatos() {
        return datos;
    }

    //Metodo get del atributo m
    public ControladorMedirMemoria[] getM() {
        return m;
    }

    //Metodo constructor de la clase ControladorDatosPrimitivos
    public ControladorDatosPrimitivos() {
        this.datos = new TiposDeDatosPrimitivos();
    }

    /**
     * Metodo que mide la memoria de los datos vacios y en un arreglo de ControladorMedirMemoria guarda
     * los datos con la ayuda de un metodo
     */
    public void medirMemoria() {
        this.m = new ControladorMedirMemoria[9];
        for (int i = 0; i < m.length; i++) {
            m[i] = new ControladorMedirMemoria();
        }
        datos.setDatoBoolean(Boolean.FALSE);
        datos.setDatoString("");
        datos.setDatoDouble(0.00);
        m[0].medirMemoria("String", datos.getDatoString());
        m[1].medirMemoria("Boolean", datos.getDatoBoolean());
        m[2].medirMemoria("bye", datos.getDatoByte());
        m[3].medirMemoria("Char", datos.getDatoChar());
        m[4].medirMemoria("Double", datos.getDatoDouble());
        m[5].medirMemoria("float", datos.getDatoFloat());
        m[6].medirMemoria("long", datos.getDatoLong());
        m[7].medirMemoria("short", datos.getDatoShort());
        m[8].medirMemoria("int", datos.getDatoInt());
    }

    /**
     * Metodo que permite llenar los datos del objeto TiposDeDatosPrimitivos
     * @param dString
     * @param dBoolean
     * @param dChar
     * @param dByte
     * @param dShort
     * @param dInt
     * @param dLong
     * @param dFloat
     * @param dDouble
     * @return
     */
    public Boolean llenarDatos(String dString, String dBoolean, char dChar, String dByte, String dShort, String dInt, String dLong, String dFloat, String dDouble) {
        try {
            datos.setDatoString(dString);
            datos.setDatoBoolean(Boolean.valueOf(dBoolean));
            datos.setDatoByte(Byte.valueOf(dByte));
            datos.setDatoChar(dChar);
            datos.setDatoFloat(Float.valueOf(dFloat));
            datos.setDatoDouble(Double.valueOf(dDouble));
            datos.setDatoInt(Integer.valueOf(dInt));
            datos.setDatoLong(Long.valueOf(dLong));
            datos.setDatoShort(Short.valueOf(dShort));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Metodo que mide la memoria de los datos llenos y en un arreglo de ControladorMedirMemoria guarda
     * los datos con la ayuda de un metodo
     */
    public void medirDatosLLenos() {
        m[0].medirMemoriaLlena(datos.getDatoString());
        m[1].medirMemoriaLlena(datos.getDatoBoolean());
        m[2].medirMemoriaLlena(datos.getDatoByte());
        m[3].medirMemoriaLlena(datos.getDatoChar());
        m[4].medirMemoriaLlena(datos.getDatoDouble());
        m[5].medirMemoriaLlena(datos.getDatoFloat());
        m[6].medirMemoriaLlena(datos.getDatoLong());
        m[7].medirMemoriaLlena(datos.getDatoShort());
        m[8].medirMemoriaLlena(datos.getDatoInt());
    }

}
