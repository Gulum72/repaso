package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p=new Producto("Jugo",2.50);
		
		double resultado1=p.setPrecio(2);
		double resultado2=p.calcularPrecioPromo(2);
		
		System.out.println(resultado1);
		System.out.println(resultado2);
	}

}
