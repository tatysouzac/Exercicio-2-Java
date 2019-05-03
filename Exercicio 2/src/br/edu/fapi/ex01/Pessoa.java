package br.edu.fapi.ex01;


public class Pessoa {

		 String nome="Tatyana";
		 String sobrenome="Souza";
		 int idade=18;
		 int telefone=995659496;
		 
		 String voltaNome(){
			 System.out.println("Nome: "+nome);
			 return nome;
		 }
		 
		 String voltaSobrenome() {
			 System.out.println("Sobrenome: "+sobrenome);
			 return sobrenome;
		 }
		 int voltaIdade() {
			 System.out.println("Idade: "+idade);
			 return idade;
		 }
		 int voltaTelefone() {
			 System.out.println("Telefone: "+telefone);
			 return telefone;
		 }
	}
