package br.com.jcavitreinamentos;

public class VeiculoMaritimo extends Veiculo {
	
	private String tipoDeVela;

	public String getTipoDeVela() {
		return tipoDeVela;
	}

	public void setTipoDeVela(String tipoDeVela) {
		this.tipoDeVela = tipoDeVela;
	}

	@Override
	public String toString() {
		return "VeiculoMaritimo [tipoDeVela=" + tipoDeVela + ", getNome()=" + getNome() + ", getMarca()=" + getMarca()
				+ ", getPreco()=" + getPreco() + ", toString()=" + super.toString() + ", frear()=" + frear()
				+ ", isFrear()=" + isFrear() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	

}
