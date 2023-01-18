package clase3.com.bytebank.test;

import clase1.com.bytebank.modelo.*;

public class Referencias {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Contador();
		funcionario.setNombre("Diego");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		System.out.println(funcionario.getSalario());
	}
}
