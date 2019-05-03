package br.edu.fapi.ex04;

import java.util.Scanner;

public class MainCalculadora {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("*****Calculadora****");
		System.out.println("Digite primeiro numero");
		float num1 = leia.nextFloat();
		System.out.println("Digite segundo numero");
		float num2 = leia.nextFloat();
		System.out.println("Digite operacao desejada");
		System.out.println("1-Somar");
		System.out.println("2-Subtração");
		System.out.println("3-Multiplicação");
		System.out.println("4-Divisão");
		int operacao = leia.nextInt();

		Calculadora calculadora = new Calculadora();
		calculadora.calcular(operacao, num1, num2);
		

	}

}
