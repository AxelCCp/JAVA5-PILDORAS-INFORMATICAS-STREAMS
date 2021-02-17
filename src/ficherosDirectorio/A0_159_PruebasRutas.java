package ficherosDirectorio;

import java.io.File;

public class A0_159_PruebasRutas {
	public static void main(String[]args) {
		//RUTA A UN ARCHIVO QUE EN PRINCIPIO NO EXISTE
		//SI PONEMOS EN LA RUTA, SOLO EL NOMBRE DEL ARCHIVO, NOS TOMARÁ LA RUTA POR DEFECTO, QUE ES LA...
		//MISMA RUTA DE ESTA CLASE.
		File archivo = new File("A0_159_archivo");
		
		//IMPRIMIMOS EN CONSOLA LA RUTA DEL ARCHIVO.
		System.out.println(archivo.getAbsolutePath());
		
		//VERIFICAMOS SI EL ARCHIVO EXISTE O NO EXISTE.
		System.out.println(archivo.exists());
		
	}
}
