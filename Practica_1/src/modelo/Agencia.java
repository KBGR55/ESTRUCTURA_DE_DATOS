package modelo;

/**
 * @author K.G
 */
public class Agencia {
    //Atributo privado arreglo bidimencional tipo double nombrado ventasMensuales
    private double ventasMensuales[][];
    //Atributo privado tipo double nombrado sumaVentasMensual
    private double sumaVentasMensual;
    //Metodos get y set de ventasMensuales
    public double[][] getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(double[][] ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }
    //Metodos get y set de sumaVentasMensual
    public double getSumaVentasMensual() {
        return sumaVentasMensual;
    }

    public void setSumaVentasMensual(double sumaVentasMensual) {
        this.sumaVentasMensual = sumaVentasMensual;
    }
}