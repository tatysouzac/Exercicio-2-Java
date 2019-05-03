package br.edu.fapi.ex02;

public class Produto {
	int idProduto = 11259;
	String nome = "Ventilador";
	String departamento = "Eletrodomestico";
	String cor = "Branco";
	String marca = "Stylo";
	float preco = 100.00f;

	int voltaId() {
		System.out.println("ID Produto: "+idProduto);
		return idProduto;
	}

	String voltaNome() {
		System.out.println("Nome: "+nome);
		return nome;
	}

	String voltaDep() {
		System.out.println("Departamento: "+departamento);
		return departamento;
	}

	String voltaCor() {
		System.out.println("Cor: "+cor);
		return cor;
	}

	String voltaMarca() {
		System.out.println("Marca: "+marca);
		return marca;
	}

	float voltaPreco() {
		System.out.println("Preço: "+preco);
		return preco;
	}
}
