package aula05;

public class PilhaDinamica <T>{
	private No <T> topo;
	public PilhaDinamica() {
		this.topo = null;
	}
	
	public void push(T elemento) {
		No <T> noAux = new No<T>(elemento);
		noAux.setProximo(this.topo);
		this.topo =noAux;
	}
	public void pop() {
		No <T> noAux = this.topo;
		this.topo= noAux.getProximo();
		noAux.setProximo(null);
		
	}
	public void imprimir() {
		No <T> noAux = this.topo;
		while(noAux.getProximo()!=null) {
			System.out.println(noAux.getElemento());
			noAux=noAux.getProximo();
		}
		System.out.println(noAux.getElemento());
	}
}
