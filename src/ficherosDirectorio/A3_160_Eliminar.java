package ficherosDirectorio;
import java.io.File;


//ELIMINAREMOS EL ARCHIVO DE LA CLASE A2_160

public class A3_160_Eliminar {
	public static void main(String[]args) {
		
		//RUTA DEL ARCHIVO A ELIMINAR
		File ruta2 = new File("C:" + File.separator + "Users" + File.separator + "Fantasma" + File.separator + "OneDrive" + File.separator + "1.-DOCUMENTOS" + File.separator + "1.-CURSOS" + File.separator + "14.-JAVA  PILDORAS INFORMÁTICAS" + File.separator + "A2_160_ARCHIVO_CREADO_DESDE_JAVA.txt");
		
		//ELIMINAMOS
		ruta2.delete();
	}

}
