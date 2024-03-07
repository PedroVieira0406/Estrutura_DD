package aula05;

public class Main {

	public static void main(String[] args) {
		PilhaDinamica<Integer> pilha = new PilhaDinamica<Integer>();
		pilha.push(20);
		pilha.push(30);
		pilha.push(40);
		pilha.imprimir();
		System.out.println("----");
		pilha.pop();
		pilha.imprimir();
		System.out.println("----");
		
		FilaDinamica<Integer> f = new FilaDinamica<Integer>();
		f.push(20);
		f.push(30);
		f.push(40);
		f.pop();
		f.imprimir();
		System.out.println("----");
		f.pop();
		f.imprimir();
		System.out.println("----");
		
	}

}
