package br.edu.fapi.ex07e08;

public class CalcularSalario {
	
	float valor;

	public void Calcular() {
		Empregados funcionario = new Empregados();
		funcionario.LerEmpregado();
		
		if(funcionario.turno == 1) {
			valor=45*16;
			System.out.println("O valor a ser pago para o funcionario(a) "+ funcionario.nome+" é de "+ valor) ;
			
		}
		if(funcionario.turno == 2) {
			valor=70*16;
			System.out.println("O valor a ser pago para o funcionario(a) "+ funcionario.nome+" é de "+ valor) ;
		}
	}
}
