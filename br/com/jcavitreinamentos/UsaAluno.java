package br.com.jcavitreinamentos;

import javax.swing.JOptionPane;

public class UsaAluno {

	public static void main(String[] args) {
		
		Aluno2 alunos[] = new Aluno2[1];
		
		for(int i=0; i < alunos.length; i++) {
			
			Aluno2 objAluno = new Aluno2();
			
			objAluno.setNome(JOptionPane.showInputDialog("Digite o nome do Aluno: "));
			objAluno.setCPF(JOptionPane.showInputDialog("Digite o CPF do aluno: "));
			objAluno.setMatricula(JOptionPane.showInputDialog("Digite a Matricula do Aluno: "));
			
			Endereco endereco = new Endereco();
			endereco.setLogradouro(JOptionPane.showInputDialog("Digite o Logradouro: "));
			endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número: ")));
			endereco.setMunicipio(JOptionPane.showInputDialog("Digite o seu Municipio: "));
			endereco.setBairro(JOptionPane.showInputDialog("Digite o seu Bairro: "));
			endereco.setCep(JOptionPane.showInputDialog("Digite o seu CEP: "));
			endereco.setEstado(JOptionPane.showInputDialog("Digite o Estado: "));
			
			objAluno.setEndereco(endereco);
			
			Turmas turmas = new Turmas();
			turmas.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código da turma: ")));
			turmas.setNome(JOptionPane.showInputDialog("Digite o nome da Turma: "));
			
			Disciplina disciplinas[] = new Disciplina[2];
			
			for(int h=0; h < disciplinas.length; h++) {
				Disciplina disciplina = new Disciplina();
				disciplina.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o código da Disciplina: ")));
				disciplina.setNome(JOptionPane.showInputDialog("Digite o nome da Disciplina: "));
				disciplina.setTurno(JOptionPane.showInputDialog("Digite o turno da Disciplina: "));
				
				disciplinas[h] = disciplina;
			}
			
			turmas.setDisciplina(disciplinas);
			
			objAluno.setTurmas(turmas);
			
			alunos[i] = objAluno;
		}
		
		for(int f=0;f < alunos.length; f++) {
			System.out.println(alunos[f]);
		}
		

	}

}
