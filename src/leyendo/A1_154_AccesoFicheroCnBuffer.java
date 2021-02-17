package leyendo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class A1_154_AccesoFicheroCnBuffer {
	public static void main(String[]args) {
		LeerFichero2 accediendo2 = new LeerFichero2();
		accediendo2.lee2();
	}
}

class LeerFichero2 {
	
	public void lee2() {	
		
		try {
			FileReader entrada = new FileReader("C:/Users/Fantasma/OneDrive/1.-DOCUMENTOS/1.-CURSOS/14.-JAVA  PILDORAS INFORMÁTICAS/A1_154_AccesoFicheroCnBuffer.txt");
			BufferedReader miBuffer = new BufferedReader(entrada); //almacenamos en una memoria intermedia nuestro fichero de texto.
			
			String linea = "";
			while(linea != null) {
				linea = miBuffer.readLine();
				
				if(linea != null) 									//se pone un if para que no imprima "null" al final.	
				System.out.println(linea);
			}
			
			entrada.close();
			
		} catch (IOException e) {
			System.out.println("Dirección fallida del archivo");
			e.printStackTrace();
		}
	}
}
