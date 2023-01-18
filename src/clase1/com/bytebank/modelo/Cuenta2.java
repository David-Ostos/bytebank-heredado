package clase1.com.bytebank.modelo;


abstract class Cuenta2 {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	private static int total = 0;
	
	public Cuenta2(int agencia,int numero) {
		
		
		if(agencia <= 0) {
			System.out.println("No se permiten numeros menores a 1");
			this.agencia = 1;
		}else {
			this.agencia = agencia;
		}
		if(numero <= 0) {
			System.out.println("No se permiten numeros menores a 1");
			this.numero = 1;
		}else {
			this.numero = numero;
		}
		
		total++;
		System.out.println("Se van creando: " + total + " cuentas");
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public boolean retirar(double valor) {

		if (this.saldo >= valor) {

			this.saldo -= valor;

			return true;

		} else {

			System.out.println("el monto es invalido");

			return false;

		}
	}
	
	public boolean transferir(double valor, Cuenta2 cuenta) {
		
		if(this.saldo >= valor) {
			this.retirar(valor);
			cuenta.depositar(valor);
			return true;
		}else {
			return false;
		}
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
		return Cuenta2.total;
	}
}
