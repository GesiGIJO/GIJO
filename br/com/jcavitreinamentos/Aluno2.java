package br.com.jcavitreinamentos;

public class Aluno2 extends Pessoa {

	private String matricula;
	private Turmas turmas;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Turmas getTurmas() {
		return turmas;
	}

	public void setTurmas(Turmas turmas) {
		this.turmas = turmas;
	}

	@Override
	public String toString() {
		return "Aluno2 [matricula=" + matricula + ", turmas=" + turmas + ", getNome()=" + getNome() + ", getCPF()="
				+ getCPF() + ", getEndereco()=" + getEndereco() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
