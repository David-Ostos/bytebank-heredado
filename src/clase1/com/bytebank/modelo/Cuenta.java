package clase1.com.bytebank.modelo;


abstract class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total = 0;
	
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

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void retirar(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente");
		}
			this.saldo -= valor;
	}
	
	public void transferir(double valor, Cuenta cuenta) throws SaldoInsuficienteException {
		
		if(this.saldo < valor) {
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
}
