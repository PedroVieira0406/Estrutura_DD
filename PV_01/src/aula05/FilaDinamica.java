package aula05;

public class FilaDinamica <T> {
	private No base;
	private No ult;
	
	public FilaDinamica(){
		this.base= null;
		this.ult=null;
	}
	public void push(T elemento) {
		No noAux = new No(elemento);
		if(base==null) {
			this.base=noAux;
			this.ult = base;
		}
		ult.setProximo(noAux);
		this.ult =noAux;
	}
	public void pop() {
		No noAux = this.base;
		
		noAux.getProximo();
		this.base= noAux.getProximo();
		
	}
	
	public void imprimir() {
	    No noAux = this.base;
	    while (noAux != null) {
	        System.out.println(noAux.getElemento());
	        noAux = noAux.getProximo();
	    }
	    
	}
}
