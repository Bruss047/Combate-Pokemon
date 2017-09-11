import java.util.Vector;



public class entrenador {
	private String nombre;
	private int cont = 0, tam = 2;

	//private pikachu[] mochila = new pikachu[tam];
	private Vector<pikachu> mochila=new Vector<pikachu>(); //vector dinamico que se expande o contrae segun los datos que ingresemos. Solo guarda objetos del tipo pikachu.
	
	//Constructor
	public entrenador(String nombre){
		this.nombre = nombre;
		
		/*mochila[cont] = new pikachu(); //cont=0*/
		mochila.add(new pikachu ()); //se añadio en el vector un objeto del tipo Pikachu.
		cont++; //cont = 1
	}
	
	
	public entrenador (entrenador copia){
		
			this.nombre = copia.nombre;
		
		/*mochila[cont] = new pikachu(); //cont=0*/
		mochila.add(new pikachu ()); //se añadio en el vector un objeto del tipo Pikachu.
		cont++; //cont = 1
		
		
		
	}
	
	//Getter	
	public String getNombre(){
		return nombre;
	}
	
	//metodos
	//Se elige a un pikachu de la mochila en funcion del indice recibido (i) y se devuelve,
	//si el indice no se encuentra en el vector se devuelve null
	public pikachu elige(int i){
		if(i < cont){ //Cont es el lugar donde a partir de ahi esta vacio el vector
			//return mochila[i];
			return mochila.elementAt(i); //se le pasa el objeto pikachu que se encuentre en ese indice.
		}
		else{
			return null;
		}
	}
	
	//Metodo que se llama cuando un entrenador trata de capturar a un pikachu, devuelve
	//un booleano confirmando si lo ha capturado o no y solo lo capturara si existe
	//hueco en la mochila
	public boolean captura(pikachu enemigo){
		boolean capturado = false;
		
		if(enemigo.getVida() <= 20){
			/*mochila[cont] = enemigo; //Generar Constructor de copia para que se guarden sanos los pokemon.*/
			mochila.add(enemigo); //se añade un elemento al final del vector.
			capturado = true;
			cont++;
				
			System.out.println("Has capturado un nuevo Pikachu!");
		}
		/*else{
			System.out.println("Imposible de capturar.");
		}*/
		
		return capturado;		
	}
	
	//Metodo que muestra los pikachus que tenemos en la mochila junto con sus caracteristicas
	public void mostrar_mochila(){
		System.out.println("Tienes: "+cont+" Pikachus");
		
		for(int i = 0; i < cont; i++){
			System.out.println("Nº: "+i+" Nivel: "+mochila.elementAt(i).getNivel()+" Vida: "+mochila.elementAt(i).getVida());
		}
	}
}











