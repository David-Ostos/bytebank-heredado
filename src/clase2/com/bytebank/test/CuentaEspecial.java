package clase2.com.bytebank.test;

import clase2.com.bytebank.modelo.Cuenta;

public class CuentaEspecial extends Cuenta {

	@Override
	public void depositar(double valor) {
		setSaldo(0.0);	
	}
}
