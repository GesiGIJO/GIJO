package br.com.jcavitreinamentos;

import java.util.Arrays;

public class Turmas {
	
	private String nome;
	private int codigo;
	
	private Disciplina disciplina[] = new Disciplina[2];
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Disciplina[] getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina[] disciplina) {
		this.disciplina = disciplina;
	}
	@Override
	public String toString() {
		return "Turmas [nome=" + nome + ", codigo=" + codigo + ", disciplina=" + Arrays.toString(disciplina) + "]";
	}
	
		


	
	

}
