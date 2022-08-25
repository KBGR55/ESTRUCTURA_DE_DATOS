package controlador.servicios;

import controlador.ControladorMarisol;

/**
 * @author K.G
 */
public class MirasolServices {
    //Atributo privado tipo Mirasol nombrado empresaMarisol
    private ControladorMarisol constMari;
    
    //Metodo Constructor de la clase MirasolServices
    public MirasolServices() {
        this.constMari =  new ControladorMarisol();
    }
    
    //Metodos get de la clase ControladorMarisol
    public ControladorMarisol getConstMari() {
        return constMari;
    }

    //Metodos set de la clase ControladorMarisol
    public void setConstMari(ControladorMarisol constMari) {
        this.constMari = constMari;
    }
    
    /**
     * Metodo que permite llamar al metodo guardarVentasMesAgencia del atributo constMari
     * @param a dos posiciones 
     * @param dato los valores a guardar
     * @return Boolean
     */
    public Boolean ingresar(int a[],String dato[]) {
        try {
            constMari.guardarVentasMesAgencia(a,dato);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    
    /**
     * Metodo que permite llamar al metodo calculopromedio del atributo constMari
     * @param a dos posiciones 
     * @param txt para mostar la informacion
     * @return Boolean
     */
    public Boolean promedio(int a[],javax.swing.JTextField txt) {
        try {
            txt.setText(constMari.calculopromedio(a[0],a[1]));
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    
    /**
     * Metodo que permite llamar al metodo mayorVentaMes del atributo constMari
     * @param a dos posiciones 
     * @param txt para mostar la informacion
     * @return Boolean
     */
    public Boolean mayorAgencia(int a[],javax.swing.JTextField txt) {
        try {
            txt.setText(constMari.mayorVentaMes(a[0],a[1]));
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
    
    /**
     * Metodo que permite llamar al metodo mesesMenorVentas del atributo constMari
     * @param txt1 para mostar la informacion
     * @param txt2 para mostar la informacion
     * @param txt3 para mostar la informacion
     * @param txt4 para mostar la informacion
     * @param txt5 para mostar la informacion
     * @return Boolean
     */
    public Boolean menorVentaMesAgencia(javax.swing.JTextField txt1,javax.swing.JTextField txt2,javax.swing.JTextField txt3,javax.swing.JTextField txt4,javax.swing.JTextField txt5) {
        try {
            String mesesMenor[] =constMari.mesesMenorVentas();
            txt1.setText(mesesMenor[0]);
            txt2.setText(mesesMenor[1]);
            txt3.setText(mesesMenor[2]);
            txt4.setText(mesesMenor[3]);
            txt5.setText(mesesMenor[4]);
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
