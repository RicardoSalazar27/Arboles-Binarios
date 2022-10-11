import java.util.Scanner;

public class Principal{

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int opcion = 0;
		int elemento;

		ArbolBinario Arbol = new ArbolBinario();

		do{
			try{

				System.out.println("1. Insertar Nodo, 2. Recorrido InOrder, 3. Recorrido PreOrden, 4. Recorrido PosOrden, 5.Salie");
				opcion = entrada.nextInt();

				switch(opcion){

				case 1 :
					System.out.println("inserta el valor del nodo");
					elemento = entrada.nextInt();

					Arbol.insertarNodo(elemento);

					break;

				case 2:
					if (!Arbol.estaVacio()) {

						System.out.println("Recorrido In-Order");
						Arbol.inOrden(Arbol.raiz);
						
					}else{

						System.out.println("Fin");
					}

					break;

				case 3 :  
					if (!Arbol.estaVacio()) {

						System.out.println("Recorrido Pre-Orden");
						Arbol.preOrden(Arbol.raiz);
						
					}else{

						System.out.println("Fin");
					}

					break;

				case 4:
					if (!Arbol.estaVacio()) {

						System.out.println("Recorrido Pos-Orden");
						Arbol.posOrden(Arbol.raiz);
						
					}else{

						System.out.println("Fin");
					}

					break;

				case 5 :
					System.exit(0);
				default:
					System.out.println("Opcion erronea");
				}

			}catch(NumberFormatException e){
				System.out.println("error " + e);
			}

		}while(opcion != 6);
	}
}