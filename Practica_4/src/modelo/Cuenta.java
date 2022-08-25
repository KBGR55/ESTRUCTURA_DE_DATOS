package modelo;

/** Clase Cuenta del paquete modelo
 *  @author kg*/

public class Cuenta {
    //Atributo privado tipo double nombrado saldo
    private double saldo;
    //Atributo privado String nombrado clave
    private String clave;

    //Metodo constructor de la clase Cuenta
    public Cuenta(double saldo, String clave) {
        this.saldo = saldo;
        this.clave = clave;
    }

    //Metodo get del atributo saldo
    public double getSaldo() {
        return saldo;
    }

    //Metodo set del atributo saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //Metodo get del atributo clave
    public String getClave() {
        return clave;
    }

    //Metodo set del atributo clave
    public void setClave(String clave) {
        this.clave = clave;
    }
    
}