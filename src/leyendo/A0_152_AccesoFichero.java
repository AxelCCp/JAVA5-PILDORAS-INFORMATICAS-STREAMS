package leyendo;

import java.io.FileReader;
import java.io.IOException;

public class A0_152_AccesoFichero {
	public static void main(String[]args) {
		LeerFichero accediendo = new LeerFichero();
		accediendo.lee();
	}
}


class LeerFichero{
	
	public void lee() {
		
		try {
			FileReader entrada =  new FileReader("C:/Users/Fantasma/OneDrive/1.-DOCUMENTOS/1.-CURSOS/14.-JAVA  PILDORAS INFORMÁTICAS/A0_154_AccesoFichero.txt");
			int c = 0; 								//= a 0, para que parta lleyendo desde el índice 0.
			
			while(c!=-1) {	
				c=entrada.read();					//guarda denuevo el caracter que esté evaluando en cada momento. 
				char letra = (char)c; 				//hacemos casting para traducir del ANCII A letras.
				System.out.print(letra);
			}
			entrada.close();
		
		} catch (IOException e) {
			System.out.print("Dirección fallida del archivo");
			e.printStackTrace();
		}
	}
}
