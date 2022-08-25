package controlador.cuenta;

import controlador.cuenta.ControladorCuentaOrdenacion;
import modelo.Cuenta;

/**
 *
 * @author kg
 */
public class CuentaServicio {
     private ControladorCuentaOrdenacion ac = new ControladorCuentaOrdenacion();
  
    public String visualizarLista(){
        return ac.mostrarDatos();
    }
    
    public void datosNuevos(){
        ac.GenerarDatos();
    }

    public void listaDescendente(){
        ac.ordenarDescendente();
    }
    
    public String shell(String atributo){
        long inicio = System.currentTimeMillis();
        Cuenta l[]=ac.ordenacionShell(ac.listaCuentas.getLista().toArray(),atributo);
        ac.listaCuentas.limpiarLista();
        ac.listaCuentas.getLista().toList(l);  
        long fin = System.currentTimeMillis();
        double tiempo = (double) ((fin - inicio) / 1000);
        return "Tiempo de ejecucion :\t" + tiempo +" segundos |\t "+(fin - inicio)+" milisegundos";
    }
    
    public String quicksort(String atributo){
        long inicio = System.currentTimeMillis();
        Cuenta l[]= ac.quicksort(ac.listaCuentas.getLista().toArray(),0,ac.listaCuentas.getSize()-1,atributo);
        ac.listaCuentas.limpiarLista();
        ac.listaCuentas.getLista().toList(l);  
        long fin = System.currentTimeMillis();
        double tiempo = (double) ((fin - inicio) / 1000);
        return "Tiempo de ejecucion :\t" + tiempo+" segundos |\t "+(fin - inicio)+" milisegundos";
    }
    
}