
public class DatosProductos {
private String nombreP;
private int cantidad;
private String marca;
private double valor;
private double peso;

public DatosProductos(String _nombreP,String _marca,double _peso,double _valor,int _cantidad){
nombreP=_nombreP;
marca=_marca;
peso=_peso;
valor=_valor;
cantidad=_cantidad;

	
}
public String getNombre() {
	return nombreP;
}

public void setNombre(String nombre) {
	this.nombreP = nombre;
}
public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}
public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
public double getPeso() {
	return peso;
}

public void setPeso(double peso) {
	this.peso= peso;
	}
public double getValor() {
	return valor;
}

public void setValor(double valor) {
	this.valor = valor;
}

}
