package clase3.com.bytebank.test;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import clase3.com.bytebank.modelo.Cuenta;
import clase3.com.bytebank.modelo.CuentaAhorros;
import clase3.com.bytebank.modelo.CuentaCorriente;



public class OrdenarListas {

	public static void main(String[] args) {
		
		Cuenta cc1 = new CuentaCorriente(22, 33);
		cc1.depositar(333.0);

		Cuenta cc2 = new CuentaAhorros(22, 44);
		cc2.depositar(444.0);

		Cuenta cc3 = new CuentaCorriente(22, 11);
		cc3.depositar(111.0);

		Cuenta cc4 = new CuentaAhorros(22, 22);
		cc4.depositar(222.0);

		List<Cuenta> lista = new ArrayList<Cuenta>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		//Imprimiendo las cuentas
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		System.out.println("Antes de ordenar");
		System.out.println();
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		// Ordenar las cuentas
		
		//Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta();
		
		//lista.sort(comparator);
		
		lista.sort(new Comparator<Cuenta>() {

			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return o1.getNumero() - o2.getNumero();
			}
		});
		
		System.out.println("Despues de ordenar");
		System.out.println();
		
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
	}	
	
}

class OrdenadorPorNumeroCuenta implements Comparator<Cuenta>{

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
			return o1.getNumero() - o2.getNumero();
	
		}
	}