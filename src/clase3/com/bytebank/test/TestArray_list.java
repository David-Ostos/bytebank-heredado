package clase3.com.bytebank.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import clase3.com.bytebank.modelo.Cliente;
import clase3.com.bytebank.modelo.Cuenta;
import clase3.com.bytebank.modelo.CuentaCorriente;

public class TestArray_list {

	public static void main(String[] args) {
		
		System.out.println(); 
		List<Cliente> listaCliente = new LinkedList<Cliente>();
		ArrayList<Cuenta> lista = new ArrayList<Cuenta>();
		
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc2 = new CuentaCorriente(75, 49);
		Cuenta cc3 = new CuentaCorriente(11, 22);
		
		lista.add(cc);
		lista.add(cc2);
		
		Cliente cliente1 = new Cliente("Jose", "1561681684", "16468168437");
		Cliente cliente2 = new Cliente("Vilma","798537775", "95314574983");
		Cliente cliente3 = new Cliente("Vilma","798537775", "95314574983");
		Cliente cliente4 = new Cliente("Nine","374354685", "78543234354");
		
		listaCliente.add(cliente1);
		listaCliente.add(cliente2);
		listaCliente.add(cliente3);
		listaCliente.add(cliente4);
		
		//lista.add(cliente);
		
		//Cuenta obtenerCuenta = (Cuenta) lista.get(0);
		
		/*System.out.println(obtenerCuenta);
		System.out.println(lista.get(1));
		*/
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			
		}
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		boolean contiene = lista.contains(cc3);
		
		System.out.println(contiene);
		
		// se compara por referencia
		if(contiene) {
			System.out.println("Si, es igual, se esta utilizando (equals)");
		}
		
		/*
		 * 
		//se compara por valores
		if(cc.esIgual(cc3)) {
			System.out.println("Si, son iguales");
		}
		*
		*/
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		for(int i = 0; i < listaCliente.size(); i++) {
			System.out.println(listaCliente.get(i));
			
		}
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		for(Cliente cliente : listaCliente) {
			System.out.println(cliente);
		}
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		if(listaCliente.contains(cliente3)){
			System.out.println("Si, es igual, se esta utilizando (equals)");
		}
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
	}
	
}
