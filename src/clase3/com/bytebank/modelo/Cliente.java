package clase3.com.bytebank.modelo;


public class Cliente implements Autenticable {
	
	private String nombre;
	private String documento;
	private String telefono;
	
	private static int total = 0;
	
	private AutenticacionUtil util;
	
	public Cliente() {
		this.util = new AutenticacionUtil();
	}
	
	public Cliente(String nombre, String documento, String telefono) {
		
		this.nombre = nombre;
		this.documento = documento;
		this.telefono = telefono;
		
		total++;
		
		if(total == 1)
		{
			System.out.println("Se ha creado: " + total + " cliente.");
		}else {
			System.out.println("Se han creando: " + total + " clientes.");
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDocumento() {
		return documento;
	}
	
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}

	@Override
	public void setClave(String clave) {
		this.util.setClave(clave);
		
	}
	
	@Override
	public String toString() {
		String cliente = "Nombre: " + this.nombre +  ", Documento: " + this.documento + ", Telefono: " + this.telefono;
		return cliente;
	}
	
	public boolean equals(Object obj) {
		Cliente cliente = (Cliente) obj;
		return this.nombre == cliente.getNombre() &&
				this.documento == cliente.getDocumento() &&
				this.telefono == cliente.getTelefono();
	}
	
	
	
}
