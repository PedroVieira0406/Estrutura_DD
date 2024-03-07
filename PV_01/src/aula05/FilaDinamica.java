package aula05;

public class FilaDinamica <T>{
	private No<T> base;
	private No<T> ult;
	
	public FilaDinamica(){
		this.base= null;
		this.ult=null;
	}
	public void push(T elemento) {
		No<T> noAux = new No<T>(elemento);
		if(base==null) {
			this.base=noAux;
			this.ult = base;
		}
		ult.setProximo(noAux);
		this.ult =noAux;
	}
	public void pop() {
		No<T> noAux = this.base;
		
		noAux.getProximo();
		this.base= noAux.getProximo();
		
	}
	
	public void imprimir() {
	    No<T> noAux = this.base;
	    while (noAux != null) {
	        System.out.println(noAux.getElemento());
	        noAux = noAux.getProximo();
	    }
	    
	}
}
