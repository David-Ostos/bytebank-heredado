package clase3.com.bytebank.test;

import clase3.com.bytebank.modelo.*;

public class TestGuardaObjetos {

	public static void main(String[] args) {
		
		GuardaObjetos guardaObjetos = new GuardaObjetos();
		
		Cuenta cc = new CuentaCorriente(11,25);
		guardaObjetos.adicionar(cc);
		
		Cuenta ca = new CuentaAhorros(95, 32);
		guardaObjetos.adicionar(ca);
		
		Cliente cl = new Cliente("Diego","25236995","04244577896");
		guardaObjetos.adicionar(cl);

		System.out.println(guardaObjetos.getIndice(0));
		System.out.println(guardaObjetos.getIndice(1));
		System.out.println(guardaObjetos.getIndice(2));
		
	}
	
}
