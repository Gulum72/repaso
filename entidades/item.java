package com.cmc.repaso.entidades;

public class item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

	public void imprimir() {
		System.out.println("PRODUCTOS ACUTALES: "+productosActuales);
		System.out.println("PRODUCTOS DEVUELTOS: "+productosDevueltos);
		System.out.println("PRODUCTOS VENDIDOS: "+productosVendidos);
	}
	
	public void vender(int productosVendidos) {
		productosActuales=productosActuales-productosVendidos;
		this.productosVendidos+=productosVendidos;
	}
	
	public void devolver(int productosVendidos) {
		productosActuales=productosActuales+productosVendidos;
		productosDevueltos=productosVendidos;
		this.productosVendidos=productosVendidos-productosVendidos;
		
		
	}
}
