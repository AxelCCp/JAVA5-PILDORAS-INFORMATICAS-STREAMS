package escribiendo;

import java.io.FileWriter;
import java.io.IOException;

public class A0_EscribirFichero {
	public static void main(String[]args) {
		
		Escribiendo accedeEscritura = new Escribiendo();
		accedeEscritura.escribir();
		
	}
}


class Escribiendo{
	
	public void escribir() {
	
		String frase = "Esto es una prueba de escritura";
	
		try {
			//CON ESTA CREAMOS UN ARCHIVO NUEVO Y ESCRIBIMOS EN ÉL:
			FileWriter escritura = new FileWriter("C:/Users/Fantasma/OneDrive/1.-DOCUMENTOS/1.-CURSOS/14.-JAVA  PILDORAS INFORMÁTICAS/textoNuevo.txt");
			//EN ESTA ESCRIBIMOS EN UN ARCHIVO EXISTENTE:
			//FileWriter escritura = new FileWriter("C:/Users/Fantasma/OneDrive/1.-DOCUMENTOS/1.-CURSOS/14.-JAVA  PILDORAS INFORMÁTICAS/textoNuevo.txt", true);
			
			for(int i=0; i<frase.length();i++) {
				escritura.write(frase.charAt(i));
			}
			escritura.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}              
		

	}
}
