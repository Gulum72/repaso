package com.cmc.repaso.test;

import com.cmc.repaso.entidades.item;

public class TestItem {

	public static void main(String[] args) {
		item i=new item();
		item i2=new item();
		
		i.setNombre("Jugo");
		i.setProductosActuales(20);
		i.setProductosDevueltos(1);
		i.setProductosVendidos(2);
		
		i.imprimir();
		System.out.println("______________________");
		
		i.vender(5);
		i.imprimir();
		System.out.println("______________________");
		
		System.out.println("PRODUCTO 2");
		System.out.println("______________________");
		i.setNombre("Carro");
		i.setProductosActuales(15);
		i.setProductosDevueltos(0);
		i.setProductosVendidos(0);
		
		i.imprimir();
		i.vender(5);
		System.out.println("______________________");
		i.imprimir();
		System.out.println("_______DEVUELTOS________");
		i.devolver(5);
		i.imprimir();
		

	}

}
