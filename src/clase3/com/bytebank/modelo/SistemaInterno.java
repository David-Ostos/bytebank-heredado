package clase3.com.bytebank.modelo;


public class SistemaInterno {
	
	private String clave = "AluraCursosOnLine";
	
	public boolean autentica(Autenticable usuario) {
		
		boolean puedeIniciarSesion = usuario.iniciarSesion(clave);
		
		if(puedeIniciarSesion) {
			System.out.println("Login exitoso");
			return true;
		}else {
			System.out.println("Error en login");
			return false;
		}
	}
}
