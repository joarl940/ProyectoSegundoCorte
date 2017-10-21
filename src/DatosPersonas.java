
public class DatosPersonas {
	private String nombre;
	private String apellido;
	private int cedula;
	private int edad;
	private String empresa;
	private double sueldo;
	private String foto;
	
	  
	
	//  constructor de la clase DatosPeronas
	 
	public DatosPersonas(String _nombre,String _apellido,int _cedula,int _edad,String _empresa,double _sueldo,String foto) {
	this.setNombre(_nombre);
	this.setApellido(_apellido);
	this.setCedula(_cedula);
	this.setEdad(_edad);
	this.setEmpresa(_empresa);
	this.setSueldo(_sueldo);
	this.setFoto(foto);
		
	}

	 
	 // metodos get y set para el control de los datos recibir y enviar
	 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public int getEdad() {
		return cedula;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
}
