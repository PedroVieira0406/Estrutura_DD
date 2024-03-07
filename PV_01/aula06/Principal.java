package aula06;

public class Principal {

	public static void main(String[] args) {
		Lista_Encadeada	l = new Lista_Encadeada();
		l.inserirFim(10);
		l.inserirFim(20);
		l.inserirFim(35);
		l.inserirInicio(0);
		System.out.println("Coloque o numero da posição que voce quer (1°, 2°) sem o sinal!!!");
		l.imprimir();
		l.inserirMeio(15, 3);
		l.inserirMeio(7, 2);
		l.imprimir();
		l.removerFim();
		l.removerIni();
		l.inserirInicio(2);
		l.inserirFim(55);
		l.imprimir();

	}

}
