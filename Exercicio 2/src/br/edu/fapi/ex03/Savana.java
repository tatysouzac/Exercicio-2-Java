package br.edu.fapi.ex03;

import java.util.ArrayList;
import java.util.List;

public class Savana {

	public static void main(String[] args) {
		List<MainRestautante> meusAnemaezenhos = new ArrayList<MainRestautante>();
		
		MainRestautante elefantenho = new MainRestautante();
		elefantenho.cor="Laranja";
		
		MainRestautante leaozenho = new MainRestautante();
		leaozenho.cor = "Cinza";
		
		meusAnemaezenhos.add(elefantenho);
		meusAnemaezenhos.add(leaozenho);
		
		for(MainRestautante animal : meusAnemaezenhos) {
			System.out.println("Minha corzenha: " + animal.cor);
		}
		
		
	}
	
}
