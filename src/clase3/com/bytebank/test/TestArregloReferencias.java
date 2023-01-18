package clase3.com.bytebank.test;

import clase3.com.bytebank.modelo.*;

public class TestArregloReferencias {

	public static void main(String[] args) {
		
		CuentaCorriente cc = new CuentaCorriente(23, 45);
		
		CuentaAhorros ca = new CuentaAhorros(12, 22);
		
		Object[] cuentas = new Object[5];
		
		cuentas[4] = ca;
		
		cuentas[2] = cc;
		cuentas[0] = new CuentaCorriente(24, 20);
		
		//cast 
		CuentaCorriente cuenta = (CuentaCorriente) cuentas[0];
		
		
		//System.out.println(cuentas[2]);
		//System.out.println(cc);
		
		for(int i = 0; i < cuentas.length; i++) {
			System.out.println(cuentas[i]);
		}
		System.out.println();
		System.out.println("Cuenta castiada " + cuenta);
	}
	

	
}
