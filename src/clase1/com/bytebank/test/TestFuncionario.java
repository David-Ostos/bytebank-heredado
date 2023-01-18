package clase1.com.bytebank.test;

import clase1.com.bytebank.modelo.*;

public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setNombre("Diego");
		diego.setDocumento("2547452");
		diego.setSalario(2000);
		diego.setTipo(0);
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
	}
}
