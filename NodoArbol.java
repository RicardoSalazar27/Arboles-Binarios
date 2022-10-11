public class NodoArbol{

	//Un nodo esta compuesto del tipo de dato y punteros al nodo izquierdo y derecho
	int dato;
	NodoArbol nodoIzquierdo;
	NodoArbol nodoDerecho;

	public NodoArbol(int d){ //Constructor del nodo para ingresar un nodo

		this.dato=d;
		this.nodoIzquierdo=null;
		this.nodoDerecho=null;
	}

	/*public String toString() {
		return "nodo :" + NodoArbol.d;
	}*/
}