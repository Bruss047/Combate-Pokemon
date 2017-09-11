import java.util.Scanner;


public class principal {
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String nombre;
		int opcion;
		
		System.out.println("Cual es tu nombre?");
		nombre = s.nextLine();
		
		entrenador yo = new entrenador(nombre); //trabajamos con referencias cuando queremos que los cambios sean persistentes, Si queremos lo contrario usamos constructores copias.
		batalla bat = new batalla(yo);
		
		
		do{
			
			yo.mostrar_mochila();
			System.out.println();
			System.out.println();
			
			System.out.println("Elige una opcion: ");
			System.out.println("1) Empezar una batalla");
			System.out.println("2) Salir");
			
			opcion = s.nextInt();
			
			if(opcion == 1){
				bat.comienza();
			}
			
		}while(opcion != 2);
	}
}
