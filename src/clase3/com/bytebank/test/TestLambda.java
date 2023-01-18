package clase3.com.bytebank.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import clase3.com.bytebank.modelo.Cliente;
import clase3.com.bytebank.modelo.Cuenta;
import clase3.com.bytebank.modelo.CuentaAhorros;
import clase3.com.bytebank.modelo.CuentaCorriente;

public class TestLambda {

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
		
		//Utilizando Lambdas 
		lista.sort((Cuenta o1, Cuenta o2) ->
				Integer.compare(o1.getNumero(), o2.getNumero())
				);
		
		
		/*lista.sort(new Comparator<Cuenta>() {

			@Override
			public int compare(Cuenta o1, Cuenta o2) {
				return o1.getNumero() - o2.getNumero();
			}
		});*/
		
		System.out.println("Despues de ordenar por numero con Lambda");
		System.out.println();
		
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		
		Collections.sort(lista, (c1 , c2) ->
			c1.getTitular().getNombre().compareTo(c2.getTitular().getNombre())
		);
		
		System.out.println("Despues de ordenar por nombre con Lambda");
		System.out.println();
		
		lista.forEach(cuenta -> System.out.println(cuenta));
		
		/*
		 * for(Cuenta cuenta : lista){
		 *  	System.out.println(cuenta);
		 * }
		 */
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		
		
	}	
	
}

























