public class ArbolBinario{

	NodoArbol raiz;//puntero hacia nodo raiz para saber si hay un nodo

	public ArbolBinario(){

		raiz = null; //se inicializa el arbol en null pues al inicio esta vacio
	}

	//Metodo para insertar nodos
	public void insertarNodo(int d){

		NodoArbol nuevoNodo = new NodoArbol(d);

		if (raiz == null) {
			raiz = nuevoNodo;
		}else{
			NodoArbol nodoAuxiliar = raiz;
			NodoArbol nodoPadre;

			while(true){
				nodoPadre = nodoAuxiliar;
				if (d<nodoAuxiliar.dato) {
					nodoAuxiliar = nodoAuxiliar.nodoIzquierdo;
					if (nodoAuxiliar==null) {
						nodoPadre.nodoIzquierdo = nuevoNodo;
						return;
					}
				}else{
					nodoAuxiliar=nodoAuxiliar.nodoDerecho;
					if (nodoAuxiliar==null) {
						nodoPadre.nodoDerecho = nuevoNodo;
						return;
					}
				}
			}
		}
	}


	//METODO PARA CORROBORAR SI EL ARBOL ESTA VACIO
	public boolean estaVacio(){

		return raiz == null;
	}

	//RECORRIDO EN IN-ORDER
	public void inOrden(NodoArbol r){

		if (r!=null) {
			
			inOrden(r.nodoIzquierdo);
			System.out.println(r.dato);
			inOrden(r.nodoDerecho);
		}
	}

	//RECORRIDO EN PRE-ORDEN
	public void preOrden(NodoArbol r){

		if (r!=null) {
			
			System.out.println(r.dato);
			preOrden(r.nodoIzquierdo);
			preOrden(r.nodoDerecho);
		}
	}

	//RECORRIDO POR-ORDEN

	public void posOrden(NodoArbol r){

		if (r!=null) {
			
			posOrden(r.nodoIzquierdo);
			posOrden(r.nodoDerecho);
			System.out.println(r.dato);
		}
	}

} 