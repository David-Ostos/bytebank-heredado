package clase2.com.bytebank.modelo;

/**
 * 
 * Cuenta va a crear nuevas instancias de CuentaCorriente y CuentaAhorros 
 * @author david
 * @version 1.0
 * 
 **/
public abstract class Cuenta {

	/**
	 *
	 * // public   		// Accesible para todos
	 * // --protected 	// Accesible solo dentro del paquete y clases hijas
	 * // ---defauld	// Accesible solo dentro del paquete
	 * // ----private	// Accesible solo desde la clase misma
	 * 
	 *
	 */	
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total = 0;
	
	/**
	 * instancia una nueva cuenta Sin parametros
	 */
	public Cuenta() {
		
	}
	
	/**
	 * ISnstancia una cuenta usando los parametros agencia y numero
	 * @param agencia Este parametro es para asignar el numero de la agencia
	 * @param numero Este parametro es para asignar el numero de la cuenta
	 */
	public Cuenta(int agencia,int numero) {
		
		if(agencia < 1) {
			throw new IllegalArgumentException("No se permiten numeros menores a 1");
		}else {
			this.agencia = agencia;
		}
		if(numero < 1) {
			throw new IllegalArgumentException("No se permiten numeros menores a 1");
		}else {
			this.numero = numero;
		}
		
		total++;
		System.out.println("Se van creando: " + total + " cuentas");
	}
	
	public abstract void depositar(double valor);
	/**
	 * Este metodo retira dinero de la cuenta y si ocurre un error devuelve una exception
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void retirar(double valor) throws SaldoInsuficienteException {
		if(this.getSaldo() < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente");
		}
			this.setSaldo(this.getSaldo() - valor);
	}
	
	public void transferir(double valor, Cuenta cuenta) throws SaldoInsuficienteException {
		
		if(this.getSaldo() < valor) {
		throw new SaldoInsuficienteException("Saldo insuficiente");
		}
			this.retirar(valor);
			cuenta.depositar(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		String cuenta ="Agencia: " + this.agencia +  ", Numero: " + this.numero;
		return cuenta;
	}
	
}
