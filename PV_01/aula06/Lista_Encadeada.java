package aula06;

public class Lista_Encadeada {
	private No base;
	private No topo;
	
	public Lista_Encadeada(){
		this.base= null;
		this.topo=null;
	}
	public void inserirInicio(int elemento) {
		No noAux = new No(elemento);
	    if (base == null) {
	        this.base = noAux;
	        this.topo = base;
	    } else {
	        noAux.setProximo(base);
	        this.base = noAux;
	    }
	}
	
	public void inserirFim(int elemento) {
		No noAux = new No(elemento);
		if(this.topo==null) {
			this.base = noAux;
	        this.topo = base;
		}else {
			this.topo.setProximo(noAux);
			noAux =this.topo;	
		}

	}
	
	public No procurar(int posicao) {
		No noAux = this.base;
		int i = 0;
		posicao-=2;
		while(i < posicao) {
			noAux=noAux.getProximo();
			i++;
		}
		return noAux;
	}
	
	public void inserirMeio(int elemento, int posicao) {
		No noAuxIns = new No(elemento);
		No noAuxPas = procurar(posicao);
		
		noAuxIns.setProximo(noAuxPas.getProximo());
		noAuxPas.setProximo(noAuxIns);
		
	}
	public void imprimir() {
		No noAux = this.base;
		while(noAux.getProximo()!=null) {
			System.out.println(noAux.getElemento());
			noAux=noAux.getProximo();
		}
		System.out.println(noAux.getElemento());
		System.out.println("---------------------");
	}
	
	public void removerIni() {
		No noAux = this.base;
	    this.base = noAux.getProximo();	
	    if (this.base == null) {
	        this.topo = null;
	    }
	}
	
	public void removerFim() {
	    No noAux = this.base;
	    if (noAux.getProximo() == null) {
	        this.base = null;
	        this.topo = null;
	    } else {
	        while (noAux.getProximo().getProximo() != null) {
	            noAux = noAux.getProximo();
	        }
	        this.topo = noAux;
	        noAux.setProximo(null);
	    }
	}
	
	public void removerMeio(int posicao) {
		No noAuxPas = procurar(posicao);
		noAuxPas.setProximo(noAuxPas.getProximo().getProximo());
		
	}
	
}
