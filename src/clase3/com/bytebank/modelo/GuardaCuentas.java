package clase3.com.bytebank.modelo;

public class GuardaCuentas {
	
	// crear objetos para guardar cuentas
	
	
	
	Cuenta[] cuenta = new Cuenta[10];
	int indice = 0;
	
	public void adicionar(Cuenta cc) {
		cuenta[indice] = cc;
		indice++;
		//System.out.println(cc);
	}

	public Cuenta getIndice(int indice) {
		return cuenta[indice];
	}
	
	
}
