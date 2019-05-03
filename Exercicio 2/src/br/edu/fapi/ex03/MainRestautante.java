package br.edu.fapi.ex03;

import java.util.Scanner;

public class MainRestautante {

	String nome;
	String raca;
	int idade;
	float peso;
	String cor;
	String porte;

	public MainRestautante Ler(MainRestautante animal) {
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite nome:");
		animal.nome = leia.next();
		System.out.println("Digite raça:");
		animal.raca = leia.next();
		System.out.println("Digite idade");
		animal.idade = leia.nextInt();
		System.out.println("Digite peso:");
		animal.peso = leia.nextFloat();
		System.out.println("Digite cor");
		animal.cor = leia.next();
		System.out.println("Digite porte: ex:Grande.");
		animal.porte = leia.next();

		return animal;
	}
	
	public void Printa(MainRestautante animal) {
		System.out.println("Nome:"+animal.nome);
		System.out.println("Raça:"+animal.raca);
		System.out.println("Idade:"+animal.idade);
		System.out.println("Peso:"+animal.peso);
		System.out.println("Cor: "+animal.cor);
		System.out.println("Porte: "+animal.porte);
	}
	
	
}