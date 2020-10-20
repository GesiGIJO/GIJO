package br.com.jcavitreinamentos;

public class UsaVeiculo {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Veiculo();
		
		veiculo.setNome("Fusca");
		veiculo.setMarca("VolksWagem");
		veiculo.setPreco(70.000);
		veiculo.setFrear(false);
		veiculo.trocarMarcha(3);
		
		System.out.println(veiculo.acelerar("50"));
		System.out.println(veiculo.trocarMarcha(3));
		
		System.out.println(veiculo);
		
		VeiculoMaritimo veiculoM = new VeiculoMaritimo();
		
		veiculoM.setNome("JetSki");
		veiculoM.setMarca("Honda");
		veiculoM.setPreco(25.000);
		veiculoM.setTipoDeVela("Vela SDK");
		veiculoM.setFrear(true);
	
		System.out.println(veiculo.acelerar("80"));
		System.out.println(veiculo.trocarMarcha(4));
		
		
		System.out.println(veiculoM);

	}

}
