package clase3.com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

import clase3.com.bytebank.modelo.Cliente;

public class TestRepasoArrays {

	public static void main(String[] args) {
		
		//int[] listaA = new int[10];
		int numero = 20;
		//Integer numeroObjeto = new Integer(40); deprecado 
		Integer numeroObjeto = Integer.valueOf(40); //nueva implementacion
		
		
		List<Integer> listaN = new ArrayList<Integer>();
		List<Cliente> lista = new ArrayList<Cliente>();
		
		Cliente cliente1 = new Cliente("Nine","374354685", "78543234354");
		Cliente cliente2 = new Cliente("Vilma","798537775", "95314574983");
		
		lista.add(cliente1);
		lista.add(cliente2);
		
		listaN.add(numeroObjeto);
		listaN.add(numero); // autoboxing
		listaN.add(Integer.valueOf(numero));
		
		// unboxing
		//int valorPrimitivo = numeroObjeto;
		
		
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		for(Cliente cliente : lista) {
			System.out.println(cliente);
		}
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		for(Integer listaNumero : listaN) {
			System.out.println(listaNumero);
		}
		
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		
		System.out.println(Integer.MAX_VALUE);

		System.out.println(Integer.MIN_VALUE);

		System.out.println(Integer.SIZE);
	}
	
}
