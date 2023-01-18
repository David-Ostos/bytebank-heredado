package clase3.com.bytebank.modelo;

public class GuardaObjetos {
	
	// crear objetos para guardar cuentas
	
	
	Object[] object = new Object[10];
	int indice = 0;
	
	public void adicionar(Object objeto) {
		object[indice] = objeto;
		indice++;
		//System.out.println(objeto);
	}

	public Object getIndice(int indice) {
		return object[indice];
	}
	
	
}
