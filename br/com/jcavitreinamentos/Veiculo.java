package br.com.jcavitreinamentos;

public class Veiculo {
	
	private String nome;
	private String marca;
	private Double preco;
	private boolean frear;
	
	public Veiculo() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Veiculo [nome=" + nome + ", marca=" + marca + ", preco=" + preco + ", frear=" + frear + "]";
	}
	
	public String acelerar(String vl) {
		return "Acelerar" + vl;
	}
	public String desacelerar(String vl) {
		return "Desacelerar" + vl;
	}
	
	public String frear() {
		return "Parando o Veiculo";
	}

	public boolean isFrear() {
		return frear;
	}

	public void setFrear(boolean frear) {
		this.frear = frear;
	}
	
	public String trocarMarcha(int marcha) {
		return "Trocar para a Marcha" + marcha;
	}
	
	
	
	
	

}
