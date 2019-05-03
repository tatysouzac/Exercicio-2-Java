package br.edu.fapi.ex04;

public class Calculadora {

	public void calcular(int operacao, float num1, float num2) {

		switch (operacao) {
		case 1:
			Soma soma = new Soma();
			soma.calcularSoma(num1, num2);
			break;
		case 2:
			Subtracao sub = new Subtracao();
			sub.calcularSub(num1, num2);
			break;
		case 3:
			Multiplicacao mult = new Multiplicacao();
			mult.calcularMult(num1, num2);
			break;
		case 4:
			Divisao div = new Divisao();
			div.calcularDiv(num1, num2);
			break;

		}
	}
}
