package memoria;
import java.util.Scanner;
/**
 * @author K.G
 */
public class Memoria {

    public final static int OVERFLOW = 200000000;
    private String salida;
    
    public Memoria() {//Metodo constructor de la clase Memoria2
        //StringBuilder(int capacidad) , se le pasa la capacidad (número de caracteres) como argumento.
        StringBuilder s = new StringBuilder(OVERFLOW);
        for (int j = 0; j < OVERFLOW; j++) {
            try {   
                s.append("a");//El metodo append( ), inserta al final del StringBuilder, un String o la representación en forma de String 
            } catch (OutOfMemoryError e) {
                break;
            }
        }
        this.salida=s.toString();//El metodo toString(),convierte un StringBuilder en un String 
        s.setLength(0);//El metodo.setLength(0),Modifica la longitud del StringBuilder
        this.salida = "";
    }

    public String getOom() {
        return salida;
    }

    public static void main(String[] args) {
        System.out.println(new Memoria().getOom().length()+"\nprecione cualquier numero");
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
    }
}