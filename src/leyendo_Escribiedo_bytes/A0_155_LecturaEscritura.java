package leyendo_Escribiedo_bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A0_155_LecturaEscritura {
	public static void main(String[]args) {
		
		//2.DECLARAMOS UN CONTADOR PARA SABER LA CANTIDAD DE BYTES DE LA IMAGEN.
		int contador = 0; 
		
		//3.CREAMOS UN ARRAY PARA ALMACENAR LOS BYTES DE LA IMAGEN.
		int[]datosEntrada = new int[129227]; 
		
		try {
			//1.DIRECCIÓN DE UNA IMAGEN... ESTA IMAGEN LA LEERÁ Y LA ESCRIBIRÁ EN BYTES POR CONSOLA. 
			//LA CONSOLA TIENE LIMITES PARA LEER UNA IMAGEN, SOLO MUESTRA ALGUNOS BYTES.
			FileInputStream archivoLectura = new FileInputStream("C:/Users/Fantasma/Pictures/IMAGENES/SUPERMAN.jpg");
			boolean finalArchivo = false;
			while(!finalArchivo == true) {
				int byteEntrada = archivoLectura.read();
				
				if(byteEntrada!=-1) 
					datosEntrada[contador]=byteEntrada;
				else 
					finalArchivo = true;
				
				System.out.println(datosEntrada[contador]);
				contador++;
			}
			archivoLectura.close();
		}catch(IOException e){System.out.println("Error de acceso a imagen");}
		
		System.out.println("La imagen tiene " + contador + " bytes");
		
		creaFichero(datosEntrada);
	}
	
	
	static void creaFichero(int[]datosNuevoFichero) {
		try {
			FileOutputStream ficheroNuevo = new FileOutputStream("C:/Users/Fantasma/OneDrive/1.-DOCUMENTOS/1.-CURSOS/14.-JAVA  PILDORAS INFORMÁTICAS/A0_155_SUPERMAN_imagenCreada.jpg");
			for(int i=0; i<datosNuevoFichero.length;i++) {
				ficheroNuevo.write(datosNuevoFichero[i]);
			}
			ficheroNuevo.close();
		}catch(IOException e) {System.out.println("Error de acceso a archivo");}
		
	}
}
