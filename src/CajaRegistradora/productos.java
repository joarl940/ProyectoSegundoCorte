package CajaRegistradora;
import java.util.Random;



public class productos {
	private String nombre = "";
	private String cantidad = "";
	private String marca = "";
	private String peso = "";
	private static float valor = 7;
	
	
	private productos(String nombre, String cantidad, String marca, String peso, float valorf) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.marca = marca;
		this.peso = peso;
		this.valor = valor;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getCantidad() {
		return this.cantidad;
	}
	
	public String getMarca() {
		return this.marca;
	}
	public String getPeso() {
		return this.peso;
	}
	public float getValor() {
		return this.valor;
	}
	
	public Object[] getDetalles() {
		Object[] data = {this.nombre, this.cantidad, this.marca, this.peso, this.valor};
		return data;
	}
	
	
	public static productos build(String nombre, String cantidad, String marca, String peso, String valorf){
		return new productos(nombre,cantidad,marca,peso,valor);
	}
	
	public static String random(String[] array) {
		int rnd = new Random().nextInt(array.length);
	    return array[rnd];
	}
}


