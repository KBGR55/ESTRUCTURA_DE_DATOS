package controlador;

import modelo.Agencia;
import modelo.Mirasol;

/**
 * @author K.G
 */
public class ControladorMarisol extends ControladorJson {
    //Atributo privado tipo Mirasol nombrado empresaMarisol
    private Mirasol empresaMarisol;
    
    //Metodo constructor de la clase ControladorMarisol 
    public ControladorMarisol() {
        try {
            empresaMarisol= listar();
            empresaMarisol.setMeses(llenarMeses());
            empresaMarisol.setSumasTotales(sumasTotales());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    //Metodo get de  getEmpresaMarisol
    public Mirasol getEmpresaMarisol() {
        return empresaMarisol;
    }

    //Metodo set de  setEmpresaMarisol
    public void setEmpresaMarisol(Mirasol empresaMarisol) {
        this.empresaMarisol = empresaMarisol;
    }
    
    /**
     * Metodo que permite sumar todas las sumastotales de la ventas de cada agencia
     * @return suma
     */
    public  double sumasTotales(){
        double suma = 0;
        for (Agencia agencia : empresaMarisol.getAgencias()) {
            suma += agencia.getSumaVentasMensual();
        }
        return suma;
    }
    
    /**
     * Metodo que permite duardar las ventas de las agencias en dicho mes
     * @param poss nos da las posiciones en las que guardar la venta,dichas posiciones son las que se relacionarian con el mes
     * @param txt nos da los valores de las ventas 
     * @return Boolean 
     */
    public Boolean guardarVentasMesAgencia(int[] poss,String txt[]) {
        try {
            double dato[]=new double[5];
            for (int i = 0; i < 5; i++) {
                dato[i]=Double.parseDouble(txt[i]);
            }                
            Agencia b[] = new Agencia[5];   
            for (int i = 0; i < b.length; i++) {
                b[i] = rellenar(poss[0], poss[1], dato[i], empresaMarisol.getAgencias()[i]);
            }
            this.empresaMarisol.setAgencias(b);
            this.empresaMarisol.setSumasTotales(sumasTotales());
            guardar(empresaMarisol);
            return true;
        } catch (Exception e) {
            System.out.println("Error al guardar ventas " + e);
        }
        return false;
    }

    /**
     * Metodo que permite obtener un objeto Agencia a partir de otro objeto agencia y el dato a agregar en las posiciones indicadas
     * @param k porimera posicion del arreglo bidimencional [k][]
     * @param l segunda posicion del arreglo bidimencional [k][l]
     * @param dato el valor a guardar 
     * @param anterior agencia anterior 
     * @return Agencia
     */
    private Agencia rellenar(int k, int l, double dato, Agencia anterior) {
        Agencia a = new Agencia();
        a.setVentasMensuales(new double[3][4]);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                a.getVentasMensuales()[i][j] = anterior.getVentasMensuales()[i][j];
                if ((k == i) && (l == j)) {
                    a.getVentasMensuales()[i][j] = dato;
                }
                a.setSumaVentasMensual(a.getSumaVentasMensual() + a.getVentasMensuales()[i][j]);
            }
        }
        return a;
    }

    /**
     * Metodo que rellena  un arreglo bidimensional tipo String , datos que son informacion de los 12 meses 
     * @return String[][] 
     */
    private String[][] llenarMeses() {
        String m[][] = new String[3][4];
        m[0][0] = "ENERO";
        m[0][1] = "FEBRERO";
        m[0][2] = "MARZO";
        m[0][3] = "ABRIL";
        m[1][0] = "MAYO";
        m[1][1] = "JUNIO";
        m[1][2] = "JULIO";
        m[1][3] = "AGOSTO";
        m[2][0] = "SEPTIEMBRE";
        m[2][1] = "OCTUBRE";
        m[2][2] = "NOVIEMBRE";
        m[2][3] = "DICIEMBRE";
        return m;
    }

    /**
     * Metodo que permite calcular el promedio de las ventas de las agencias, de dicho mes.
     * @param k porimera posicion del arreglo bidimencional [k][]
     * @param l segunda posicion del arreglo bidimencional [k][l]
     * @return String
     */
    public String calculopromedio(int k, int l) {
        double suma = 0;
        for (Agencia agencia : empresaMarisol.getAgencias()) {
            suma = suma + agencia.getVentasMensuales()[k][l];
        }
        return String.valueOf(suma/empresaMarisol.getAgencias().length);
    }
    
    /**
     * Metodo que nos da un string con la informacoion de que venta de las agencias es mayor en dicho mes. 
     * @param k porimera posicion del arreglo bidimencional [k][]
     * @param l segunda posicion del arreglo bidimencional [k][l]
     * @return String
     */
    public String mayorVentaMes(int k, int l) {
        String agencia = "";
        double mayor = 0.0;
        for (int i = 0; i < empresaMarisol.getAgencias().length; i++) {
            if (empresaMarisol.getAgencias()[i].getVentasMensuales()[k][l] > mayor) {
                mayor = empresaMarisol.getAgencias()[i].getVentasMensuales()[k][l];
                agencia = "Agencia " + (i + 1);
            }
        }
        return agencia;
    }

    /**
     * Metodo que nos da un string con la informacoion de los meses que tuvieron menor ventas en cada agencia.
     * @return String[]
     */
    public String[] mesesMenorVentas() {
        String mesesMenor[] = new String[5];
        for (int i = 0; i < 5; i++) {
            double menor=empresaMarisol.getAgencias()[i].getVentasMensuales()[0][0];
            mesesMenor[i]= empresaMarisol.getMeses()[0][0];
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    if (empresaMarisol.getAgencias()[i].getVentasMensuales()[j][k] < menor) {
                        menor = empresaMarisol.getAgencias()[i].getVentasMensuales()[j][k];
                        mesesMenor[i]= empresaMarisol.getMeses()[j][k];
                    }
                }
            }
        }
        return mesesMenor;
    }
}