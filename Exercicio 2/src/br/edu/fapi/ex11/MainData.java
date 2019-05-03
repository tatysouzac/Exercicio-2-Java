package br.edu.fapi.ex11;

public class MainData {

	public static void main(String[] args) {
		 
		ValidarData valida= new ValidarData();
		
		
		int diam = valida.dia();
		int mesm= valida.mes();
		int anom= valida.ano();
		
		System.out.println(anom+"-"+mesm+"-"+diam);
		
	
		
	}

}
