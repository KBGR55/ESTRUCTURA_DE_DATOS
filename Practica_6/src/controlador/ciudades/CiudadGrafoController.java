package controlador.ciudades;

import controlador.tda.grafos.GrafoEND;
import java.util.Random;
import modelo.Ciudad;
import modelo.Ubicacion;

/**
 * Clase CiudadGrafoController 
 * @author K.G
 */
public class CiudadGrafoController {
    //Atributo privado nombrado gend tipo GrafoEND<Ciudad>
    private GrafoEND<Ciudad> gend;
    //Atributo privado nombrado ciudad tipo Ciudad
    private Ciudad ciudad;

    /**
    * Metodo constructor de la clase  CiudadGrafoController
    */
    public CiudadGrafoController() {
        gend=new GrafoEND<>(5,Ciudad.class);
        Random rand = new Random();
        for (int i = 1; i <= 5; i++) {
            Ubicacion u= new Ubicacion();
            u.setId(i);
            u.setLatitud(Math.round((90.99 + ( 90.99 - (-90.99) ) * rand.nextDouble())*100.0)/100.0);
            u.setLongitud(Math.round((90.99 + ( 90.99 - (-90.99) ) * rand.nextDouble())*100.0)/100.0);
            Ciudad p= new Ciudad(i,"Ciudad "+i, i, u);
            gend.etiquetarVertice(i, p);
        }
        vaciarCiudad();    
    }

    //Metodo get del atributo gend
    public GrafoEND<Ciudad> getGend() {
        return gend;
    }
    
    //Metodo set del atributo gend
    public void setGend(GrafoEND<Ciudad> gend) {
        this.gend = gend;
    }
    
    //Metodo get del atributo ciudad
    public Ciudad getCiudad() {
        if(ciudad==null){
            ciudad= new Ciudad();
        }
        return ciudad;
    }
    
    //Metodo set del atributo ciudad
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
     /**
     * Metodo crea nuevamente el atributo ciudad con el objetivo de ponerle valores por defecto
     * @return Double 
     */
    public void vaciarCiudad(){
        Ubicacion u= new Ubicacion(0,0.0,0.0);        
        ciudad = new Ciudad(0,"",0, u); 
    }
     
     /**
     * Metodo que calcula la distancia  
     * @return Double 
     */
    public Double calcularDistancia(Ciudad po, Ciudad pd) {
        Double dis = 0.0;
        Double x = po.getUbicacion().getLongitud() - pd.getUbicacion().getLongitud();
        Double y = po.getUbicacion().getLatitud() - pd.getUbicacion().getLatitud();
        dis = Math.sqrt((x*x) + (y*y));
        return dis;
    }

     /**
     * Metodo que llama al metodo amentarGrafo() y el nuevo grafo nos permite etiquetarlo 
     * @return Boolean
     */
    public Boolean aumentarCiudad( ) {
        try {
            gend.amentarGrafo();
            System.out.println(ciudad.getNombre());
            gend.etiquetarVertice(gend.numVertices(), ciudad);
            vaciarCiudad();
            return true;
        } catch (Exception e) {
            return false;
        }       
    }
    
}