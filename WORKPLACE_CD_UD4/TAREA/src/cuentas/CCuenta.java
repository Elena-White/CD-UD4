package cuentas;

public class CCuenta {
/**
 * Clase que represent auna cuenta bancaria con operaciones básicas.  
 */
	
/**
 * Parámetros de la clase
 * @param nombre Nombre del titular de la cuenta
 * @param cuenta Nombre de la cuenta del titular
 * @param saldo Cantidad que hay en la cuenta
 * @param tipoInterés Tipo de interés en la cuenta
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

/**
 * Constructor de la clase CCuenta por defecto sin parámetros.
 */
    public CCuenta()
    {
    }
    
/**
 * Constructor de la clase CCuenta con parámetros
 * @param nombre Nombre del titular de la cuenta
 * @param cuenta Nombre de la cuenta del titular
 * @param saldo Cantidad que hay en la cuenta
 * @param tipoInterés Tipo de interés en la cuenta
*/

    public CCuenta(String nombre, String cuenta, double saldo, double tipoInterés)
    {
        this.nombre = nombre;
    	this.cuenta = cuenta;
    	this.saldo = saldo;
    	this.tipoInterés = tipoInterés;
    }   

/**
 * Métodos get de la clase CCuenta, con los que podemos obtener el valor
 * de cada parámetro de la clase
*/
    public String getNombre() {
		return nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

/**
 * Métodos set de l clase CCuenta, con los que podemos cambiar el valor
 * de cada parámetro de la clase
*/	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

/**
 * Método estado() el cual devuelve el saldo de la cuenta.*/
	public double estado()
    {
        return saldo;
    }

/**
 * Método ingresar al que se le pasa por parámetro una cantidad a ingresar
 * en la cuenta y devuelve el saldo de la cuenta tras el ingreso. También 
 * maneja la excepción de que se intente ingresar una cantidad negativa.
*/
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

/**
 * Método retirar al que se le pasa por parámetro una cantidad a retirar de la
 * cuenta y devuelve el saldo de la cuenta tras retirar esa cantidad. También
 * maneja la excepción de que se intente retirar una cantidad negativa y la
 * exceoción de que se intente retirar una cantidad mayor al saldo de la cuenta.*/
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
