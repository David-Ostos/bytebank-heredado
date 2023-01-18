package clase2.com.bytebank.test;

import clase1.com.bytebank.modelo.*;

public class TestCuenta {
	
	public static void main(String[] args) throws SaldoInsuficienteException {
		CuentaCorriente cc = new CuentaCorriente(-15, 50);
		CuentaAhorros ca = new CuentaAhorros(264, 3);
		cc.depositar(2000);
		
		System.out.println(cc.getSaldo());
		
		cc.transferir(1000, ca);
		System.out.println(cc.getSaldo() + " - " + ca.getSaldo());
		try {
		cc.transferir(2000,ca);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(cc.getSaldo() + " - " + ca.getSaldo());
	}
}
