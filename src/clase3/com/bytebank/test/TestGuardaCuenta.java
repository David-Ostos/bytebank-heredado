package clase3.com.bytebank.test;

import clase3.com.bytebank.modelo.*;

public class TestGuardaCuenta {

	public static void main(String[] args) {
		
		GuardaCuentas guardaCuentas = new GuardaCuentas();
		Cuenta cc = new CuentaCorriente(11,25);
		Cuenta ca = new CuentaAhorros(95, 32);
		
		guardaCuentas.adicionar(cc);
		guardaCuentas.adicionar(ca);
		
		//guardaCuentas.getIndice(1);
		//guardaCuentas.getIndice(2);
		
		System.out.println(guardaCuentas.getIndice(0));
		System.out.println(guardaCuentas.getIndice(1));
		
	}
	
}
