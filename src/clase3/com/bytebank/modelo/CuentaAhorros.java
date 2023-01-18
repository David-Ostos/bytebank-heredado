package clase3.com.bytebank.modelo;


public class CuentaAhorros extends Cuenta {

	public CuentaAhorros(int agencia, int numero) {
		super(agencia, numero);
	}
	@Override
	public void depositar(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	
}
