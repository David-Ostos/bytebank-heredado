package clase3.com.bytebank.modelo;

public class TestString {
	
	public static void main(String[] args) {
	
		String nombre = "Alura";
		System.out.println("Antes del replace " + nombre);
		
		
		nombre = nombre.replace("A", "a");
		nombre = nombre.concat(" (Cursos online)");
		nombre = nombre.toUpperCase();
		nombre = nombre.toLowerCase();
		
		
		char letra = nombre.charAt(3);
		int indice = nombre.indexOf("r");
		
		
		System.out.println("Despues del replace " + nombre);
		System.out.println("La letra es " + letra);
		
		System.out.println();
		
		Cuenta cuenta = new CuentaAhorros(200,300);
			printLine(nombre);
			printLine(letra);
			printLine(indice);
			printLine(cuenta);
			printLine(new CuentaAhorros(300, 200));
			printLine(new CuentaCorriente(150,1));
	
	}
	
	public static void printLine(Object valor) {
		System.out.println(valor.toString());
		System.out.println();
		
	}
	
	/*
	public static void printLine(String valor) {
		System.out.println(valor);	
	}
	
	public static void printLine(int valor) {
		System.out.println(valor);	
	}
	public static void printLine(char valor) {
		System.out.println(valor);	
	}
	public static void printLine(CuentaAhorros valor) {
		System.out.println(valor);	
	}
	*/
}


