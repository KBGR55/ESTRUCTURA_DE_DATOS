package controlador.comando;

import controlador.tda.cola.ColaServices;
import controlador.tda.lista.exception.PosicionException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Objects;
import modelo.Comando;

/**
 * @author K.G
 */
public class ControladorComando {
    private Comando comando;
    private ColaServices<Comando> historial=new ColaServices<>(5);
  
    public void guardar(String c){
        metodoActualizar();
        SimpleDateFormat datefor=new  SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        comando=new Comando(c,datefor.format(Calendar.getInstance().getTime())) ;
        historial.push(comando);
    }
    
    public void metodoActualizar(){
        if(Objects.equals(historial.getSize(), historial.getTope())){
           historial.pop(0);
        }
    }
    
    public String  mostrarCola(){
        String comandos="--------------------------------------------------------------------------------------------------------------------------------------------\n\t\tFECHA\t|\tCOMANDO\n--------------------------------------------------------------------------------------------------------------------------------------------\n";
        for (int i = 0; i < historial.getSize(); i++) {
            try {
                Comando com=new Comando();
                com=historial.getCola().obtenerDato(i);
                comandos+="\t| "+com.getFecha()+" \t|\t"+com.getComando()+"\t\n";
            } catch (PosicionException e) {
                System.out.println(e);
            }
        }
        comandos+="--------------------------------------------------------------------------------------------------------------------------------------------\n";
       return comandos;
    }   
    
}