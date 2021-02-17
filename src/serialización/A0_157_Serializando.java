//CLASE 157 Y 158
//MANEJO DE CONFLICTO DE VERSIONES
package serialización;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class A0_157_Serializando {

	public static void main(String[] args) {
		
		Administrador jefe=new Administrador("Juan", 80000, 2005,12,15);
		jefe.setIncentivo(5000);
			
		Empleado[] personal=new Empleado[3];
		
		personal[0]=jefe;
		
		personal[1]=new Empleado("Ana", 25000, 2008, 10,1);
		
		personal[2]=new Empleado("Luis", 18000, 2012, 9,15);
		
		try {
			//CONSTRUIMOS UN FLUJO DE DATOS DE TIPO ObjectOutputStream POR EL CUAL VA A VIAJAR NUESTRO OBJ AL EXTERIOR:
			ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream("C:/Users/Fantasma/OneDrive/1.-DOCUMENTOS/1.-CURSOS/14.-JAVA  PILDORAS INFORMÁTICAS/A0_157_EMPLEADO.dat"));
			//ESCRIBIMOS EL OBJ ESPECIFICADO , PERSONAL ES EL OBJ QUE QUEREMOS TRANSFERIR HACIA EL EXTERIOR.
			escribiendoFichero.writeObject(personal);
			//CERRAMOS EL FLUJO
			escribiendoFichero.close();
			
			//AHORA RESCATAMOS EL ARCHIVO DAT QUE MANDAMOS AL EXTERIOR.
			//CREAMOS EL FLUJO DE ENTRADA
			ObjectInputStream recuperandoFichero = new ObjectInputStream(new FileInputStream("C:/Users/Fantasma/OneDrive/1.-DOCUMENTOS/1.-CURSOS/14.-JAVA  PILDORAS INFORMÁTICAS/A0_157_EMPLEADO.dat"))	;
			
			//EL ARCHIVO A RESCATAR, ES UN ARRAY,  POR LO TANTO HAY QUE ALMACENAR EL CONTENIDO EN UN ARRAY Y DE TIPO EMPLEADO
			//TENEMOS QUE HACER UN CASTING, PQ EL MÉTODO DEVUELVE UN OBJ DE TIPO OBJECT
			Empleado[] personalRecuperado = (Empleado[])recuperandoFichero.readObject(); 
			recuperandoFichero.close();
			
			//IMPRIMIMOS LO QUE HAY EN EL ARRAY DE "personalRecuperado"
			for(Empleado e: personalRecuperado) {
				System.out.println(e);
			}
		}catch(Exception e) {}
	}
}

//-----------------------------------------------------------------------------------------------------------

// CON SERIALIZABLE, LE DECIMOS A JAVA QUE LOS OBJ'S DE ESTA CLASE SE PUEDEN CONVERTIR EN BYTES. 
class Empleado implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Empleado(String n, double s, int agno, int mes, int dia){	
		nombre=n;
		sueldo=s;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);
		fechaContrato=calendario.getTime();
	}
	
	public String getNombre() {
		return nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	
	public void subirSueldo(double porcentaje){
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	public String toString(){
		return "El Nombre es =" + nombre + ",y su sueldo es =" + sueldo + ", fecha de contrato=" + fechaContrato;
	}

	private String nombre;
	private double sueldo;
	private Date fechaContrato;
}

//--------------------------------------------------------------------------------------------------------

class Administrador extends Empleado{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public Administrador(String n, double s, int agno, int mes, int dia){
			super(n,s,agno,mes,dia);
			incentivo=0;
		}
		
		public double getSueldo(){
			double sueldoBase=super.getSueldo();
			return sueldoBase + incentivo;
		}
		
		public void setIncentivo(double b){
			incentivo=b;
		}
		
		
		public String toString(){
			return super.toString() + " Incentivo=" + incentivo;
		}
		private double incentivo;	
}
