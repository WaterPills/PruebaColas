import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class main {
	
	//Se tienen los metodos peek(), poll(), add(), 
 	public static void main(String[] args) {
 		
 		loop();	
 		
	}
 	
 	/**
 	 * Crea lo que va a funcionar como la interfaz de usuario para probar colas. 
 	 * Si el input es 9, se termina el programa
 	 */
 	public static void loop() {
 		System.out.println("---------- Tests de Colas ---------- \n");
 		System.out.println("Presione 1 para agregar datos de un archivo .txt a una cola");
 		System.out.println("Presione 2 para agregar datos a una cola");
 		System.out.println("Presione 3 para leer la cola actual");
 		System.out.println("Presione 4 eliminar el primer elemto de la cola");
 		System.out.println("Presione 5 para vaciar la cola");
 		int i = 0;
 		Queue colaejem = new LinkedList();
 		while(i != 9) {
 			Scanner in = new Scanner(System.in);
 			 i = in.nextInt();
 			
 			switch(i) {
			case 1:
				System.out.println("La direccion del archivo es:  ");
				Scanner sc = new Scanner(System.in);
				String dir = sc.nextLine();
				colaejem = agregarDatosACola(dir);
				System.out.println("los datos de " +dir +" se han agregado a la cola");
				break;
			case 2:
				System.out.println("El dato que quiere agregar es:  ");
				Scanner sca = new Scanner(System.in);
				String data = sca.nextLine();
				colaejem.add(data);
				System.out.println("presione 2 si quiere agregar otro dato");
				break;
			case 3:
				System.out.println(colaejem);
				break;
			case 4:
				System.out.println("se elimino " +colaejem.peek());
				colaejem.poll();
				break;
			case 5:
				colaejem = new LinkedList();
				System.out.println("Se eliminaron todos los elementos de la cola");
				break;
			default:
				System.out.println("input incorrecto");
				break;
				
				
		}
 		}
 	}
 	
	
	/**
	 * Agrega los datos de un archivo .txt a una cola y retorna la cola con los datos
	 * @param direccion
	 */
	public static Queue agregarDatosACola(String direccion) {
		Queue cola = new LinkedList();
		File file = new File(direccion);
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				cola.add(data);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cola;
				
	}
	
	//C:\Users\Carlos Sebastian\Documents\. UNIVERSIDAD NACIONAL\CUARTO SEMESTRE\ESTRUCTURAS DE DATOS\ENTREGA\nombres
	
}
