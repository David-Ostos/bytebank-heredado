package clase3.com.bytebank.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class pruebadelaprueba {
	
	public static void main(String[] args) {
		
			Set<String> nombres = new HashSet<>();
			nombres.add("Super Mario");
			nombres.add("Yoshi"); 
			nombres.add("Donkey Kong"); 
	
			Iterator<String> it = nombres.iterator();
	
			while(it.hasNext()) {
			  System.out.println(it.next());
		}
		}
	}
