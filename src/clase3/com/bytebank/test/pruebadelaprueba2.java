package clase3.com.bytebank.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class pruebadelaprueba2 {
	
	public static void main(String[] args) {
		
		List<String> nombres = new ArrayList<>();
		nombres.add("Super Mario");
		nombres.add("Yoshi"); 
		nombres.add("Donkey Kong"); 

		Iterator<String> it = nombres.iterator();

		while(it.hasNext()) {
		  System.out.println(it.next());
			}
		}
	}
