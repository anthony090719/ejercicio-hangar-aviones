
public class Pila {
	private NodoPila cima;
	int tama;
	public Pila() {
		cima=null;
		tama=0;
		
	}
	public boolean estaVacia() {
		return cima==null;
				
	}
	public void empujar(int elem) {
		NodoPila nuevo = new NodoPila(elem);
		nuevo.siguiente=cima;
		cima=nuevo;
		tama++;
		
	}
	public int sacar() {
		int auxiliar=cima.dato;
		cima=cima.siguiente;
		tama--;
		return auxiliar;
		
		
	}
	public int cima() {
		return cima.dato;
		
	}
	public int tamanioPila() {
		return tama;
		
	}
	public void  limpiarPila() {
		while(!estaVacia()) {
			sacar();
		}
	}
	
}
