package br.edu.fapi.ex05;

import java.util.Scanner;

public class Pessoa {
	
	public int pessoas() {
		
		Scanner leia= new Scanner(System.in); 
		
		System.out.println("Em quantas pessoas vcs estão?");
		int qtdPessoas = leia.nextInt();
		
		return qtdPessoas;
		
	}


}
