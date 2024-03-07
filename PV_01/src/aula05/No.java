package aula05;

public class No <T> {
	private T elemento;
	private No <T> proximo;
	
	public No(T valor) {
		this.elemento = valor;
		this.proximo = null;
	}

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
}
