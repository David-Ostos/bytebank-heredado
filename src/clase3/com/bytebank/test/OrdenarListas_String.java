package clase3.com.bytebank.test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import clase3.com.bytebank.modelo.Cliente;
import clase3.com.bytebank.modelo.Cuenta;
import clase3.com.bytebank.modelo.CuentaAhorros;
import clase3.com.bytebank.modelo.CuentaCorriente;



public class OrdenarListas_String {

	public static void main(String[] args) {
		
		Cuenta cc1 = new CuentaCorriente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNombre("Nico");
		cc1.setTitular(clienteCC1);
		cc1.depositar(755.0);

		Cuenta ca2 = new CuentaAhorros(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNombre("Guilermo");
		ca2.setTitular(clienteCC2);
		ca2.depositar(758.0);

		Cuenta cc3 = new CuentaCorriente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNombre("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.depositar(923.0);

		Cuenta ca4 = new CuentaAhorros(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNombre("Ana");
		ca4.setTitular(clienteCC4);
		ca4.depositar(154.0);
		
		List<Cuenta> lista = new ArrayList<Cuenta>();
		lista.add(cc1);
		lista.add(ca2);
		lista.add(cc3);
		lista.add(ca4);
		
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
		
		
		
		Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta();
		lista.sort(comparator);
		
		System.out.println("Despues de ordenar por nombre");
		System.out.println();
		
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		
		//Comparator<Cuenta> ComparaNombre = new OrdenadorPorNombreTitular();
		lista.sort(new OrdenadorPorNombreTitular());
		
		System.out.println("Despues de ordenar por numero");
		System.out.println();
		
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		//Collections.sort(lista, new OrdenadorPorNombreTitular());
		Collections.sort(lista);
		
		System.out.println("Despues de ordenar "
				+ "por collections (impuesto o naturla por defecto)");
		System.out.println();
		
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		
	}	
	
}

class OrdenadorPorNombreTitular implements Comparator<Cuenta>{

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		
		return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());	
	}
	
	
}
