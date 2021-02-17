package ficherosDirectorio;

import java.io.File;

public class A1_159_AccesoFicheros {
	public static void main(String[]args) {
		//VER UNA LISTA DE ARCHIVOS QUE HAY EN UN DIRECTORIO.
		
		File ruta = new File("C:/Users/Fantasma/OneDrive/1.-DOCUMENTOS/1.-CURSOS"); 
		//NOS DEVUELVE LA RUTA ESPECIFICADA
		System.out.println(ruta.getAbsolutePath());
		
		
		//list() NOS DEVUELVE UN ARRAY DE STRINGS,  CON LOS NOMBRES DE LAS CARPETAS Y ARCHIVOS QUE ESTÁN EN LA RUTA ESPECIFICADA.
		String[]nombresArchivos=ruta.list();
		
		
		//IMPRIMIMOS LOS ARCHIVOS CON UN FOR
		for(int i=0;i<nombresArchivos.length;i++) {
			System.out.println("");
			System.out.println(nombresArchivos[i]);
			
			
			//CREAMOS UNA NUEVA INSTANCIA DE FILE, PARA VER LOS ARCHIVOS QUE PUEDEN HABER EN UN DIRECTORIO.
			//EL 1ER PARÁMETRO NOS DEVUELVE LA RUTA Y EL 2DO PARÁMETRO EXAMINA LOS ARCHIVOS 
			File f = new File(ruta.getAbsolutePath(), nombresArchivos[i]);
			
			
			//LE PREGUNTAMOS A JAVA, SI ENTRE LOS ARCHIVOS EXAMINADOS HAY ALGÚN DIRECTORIO.
			if(f.isDirectory()) {
				String[]subcarpetas = f.list();
				for(int j=0; j<subcarpetas.length;j++) {
					System.out.println("	" + subcarpetas[j]);
				}
			}
		}
	}	
}
