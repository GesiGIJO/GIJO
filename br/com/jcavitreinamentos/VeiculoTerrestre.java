package br.com.jcavitreinamentos;

public class VeiculoTerrestre extends Veiculo{

	private String TipoDeRoda;

	public String getTipoDeRoda() {
		return TipoDeRoda;
	}

	public void setTipoDeRoda(String tipoDeRoda) {
		TipoDeRoda = tipoDeRoda;
	}

	@Override
	public String toString() {
		return "VeiculoTerrestre [TipoDeRoda=" + TipoDeRoda + ", getNome()=" + getNome() + ", getMarca()=" + getMarca()
				+ ", getPreco()=" + getPreco() + ", toString()=" + super.toString() + ", frear()=" + frear()
				+ ", isFrear()=" + isFrear() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
	
	
}
