package controlador;

import modelo.MedirMemoria;
import org.github.jamm.MemoryMeter;

/**
 * @author K.G
 * @param <E>
 */
public class ControladorMedirMemoria<E>{
    //Atributo privado del objeto MedirMemoria 
    private MedirMemoria medir;
    //Atributo privado del objeto MemoryMeter que se importa de la libreria jamm-0.4.1
    private MemoryMeter memory;

    //Metodo get del atributo medir
    public MedirMemoria getMedir() {
        return medir;
    }
    
    //Medodo constructor de la clase ControladorMedirMemoria
    public ControladorMedirMemoria(){
        medir=new  MedirMemoria();
        this.memory= MemoryMeter.builder().build();
    }
    
    /**
     * Metodo para medir la memoria de un dato vacio y guardar el tipo de dato
     * @param tipoDato
     * @param dato
    */
    public void medirMemoria(String tipoDato,E dato){
        medir.setTipoDato(tipoDato);
        try {
            medir.setVacio(memory.measureDeep(dato));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    /**
     * Metodo para medir la memoria de un dato lleno
     * @param dato
    */
    public void medirMemoriaLlena(E dato){
        try {
            medir.setLleno(memory.measureDeep(dato)); 
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
