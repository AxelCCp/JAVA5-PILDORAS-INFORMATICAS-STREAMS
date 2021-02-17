package ficherosDirectorio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A2_160_Creando {
	public static void main(String[]args) {
	
	//ESCRIBIMOS LA RUTA DE ESTA MANERA, PARA QUE SEA COMPATIBLE CON DIFERENTES SISTEMAS OPERATIVOS. 
	//Y AL FINAL DE LA RUTA AGREGAMOS EL NUEVO DIRECTORIO CARPETA.
	File ruta = new File("C:" + File.separator + "Users" + File.separator + "Fantasma" + File.separator + "OneDrive" + File.separator + "1.-DOCUMENTOS" + File.separator + "1.-CURSOS" + File.separator + "14.-JAVA  PILDORAS INFORMÁTICAS" + File.separator + "A2_160_DIRECTORIO_CREADO_DESDE_JAVA");
	

	//AQUI CREAMOS LA CARPETA ESPECIFICADA EN LA RUTA
	ruta.mkdir();
		
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
		
	//CREAMOS AHORA UN ARCHIVO.
	File ruta2 = new File("C:" + File.separator + "Users" + File.separator + "Fantasma" + File.separator + "OneDrive" + File.separator + "1.-DOCUMENTOS" + File.separator + "1.-CURSOS" + File.separator + "14.-JAVA  PILDORAS INFORMÁTICAS" + File.separator + "A2_160_ARCHIVO_CREADO_DESDE_JAVA.txt");
	try {
		//AQUI CREAMOS EL ARCHIVO ESPECIFICADO EN LA RUTA2
		ruta2.createNewFile();
	} catch (IOException e) {
		System.out.println("No fue posible crear el archivo");
		e.printStackTrace();
	}
	
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	//ESCRIBIREMOS EN EL ARCHIVO CREADO
	
	//ALMACENAMOS RUTA2 Y PARA PASARLA POR PARÁMETRO AL MÉTODO "ESCRIBIR()"
	String archivoDestino = ruta2.getAbsolutePath() ; 
	//INSTANCIAMOS LA CLASE "ESCRIBIENDO"
	Escribiendo accedeEs = new Escribiendo();
	//LLAMAMOS AL MÉTODO Y LE PASAMOS POR PARAMETRO "RUTA2"
	accedeEs.escribir(archivoDestino);
	
	}
}


class Escribiendo {
	
	public void escribir(String rutaArchivo) {
		
		String frase = "esto es un ejemplo. Espero que salga!";
		
		try {
			
			//CON ESTO LE INDICAMOS QUE VAMOS A ESCRIBIR EN LA RUTA DEL ARCHIVO DE LA OTRA CLASE.
			FileWriter escritura = new FileWriter(rutaArchivo);
			
			for(int i=0; i<frase.length();i++) {
				escritura.write(frase.charAt(i));
			}
			
			escritura.close();
		
		} catch (IOException e) {e.printStackTrace();} 
	}
}






