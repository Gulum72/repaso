package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public double setPrecio(double precio) {
		if(precio>0) {
		this.precio = precio;
		return precio;
		}
		else if(precio<0) {
			precio=precio*(-1);
			this.precio= precio;
			return precio;
		}
		return precio;
		
		
	}


	public Producto(String nombre,double precio) {
		this.nombre=nombre;
		this.precio=precio;
		
	}
	
	public int calcularPrecioPromo(double porcentajeDescuento) {
		int resultado;
		resultado=(int)(precio/porcentajeDescuento);
		return resultado;
	}
}
