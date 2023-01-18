package clase3.com.bytebank.test;

public class TestMain {
	public static void main(String[] args) {
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		int edades2[]= {25,13,354,875,56};
		
		for(int i = 0; i < edades2.length; i++) {
			System.out.println(edades2[i]);
		}
		
		/*
		 * int edad = 20; int edad2 = 15; int edad3 = 67;
		 */
		int [] edades = new int[5];
		
		edades[2] = 30;
		edades[1] = 25;
		System.out.println(edades[4]);
		
		int tamanoArray = edades.length;
		
		System.out.println("el tamaño del array es de " +tamanoArray);
		
		for(int i = 0; i < tamanoArray; i++) {
			System.out.println(edades[i]);
		}
		
	}
}
