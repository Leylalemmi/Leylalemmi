package clasesjava;

public class humanojava {
 
	private int edad;
	private int peso;
	private int altura;
	private String nombre;
	
	
	public humanojava(int edad, int peso, int altira, String nombre) {
		super();
		this.edad = edad;
		this.peso = peso;
		this.altura = altira;
		this.nombre = nombre;
	}
	
	
	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altira) {
		this.altura = altira;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
