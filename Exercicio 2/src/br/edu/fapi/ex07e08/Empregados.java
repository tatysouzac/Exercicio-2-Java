package br.edu.fapi.ex07e08;

import java.util.Scanner;

public class Empregados {
	String nome;
	int idade;
	int turno;
 	Scanner leia = new Scanner(System.in);
 
 	public void LerEmpregado() {
 		
 		System.out.println("Digite nome do funcionario");
 		nome = leia.next();
 		System.out.println("Digite idade do funcionario");
 		idade = leia.nextInt();
 		System.out.println("Digite o turno trabalhado");
 		System.out.println("1- Das 06:00 as 22:00");
 		System.out.println("2- Das 22:00 as 06:00");
 		turno= leia.nextInt();
 	}
}
