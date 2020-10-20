import br.com.jcavitreinamentos.ExibirInformacoes;

public class Aluno {

	public static void main(String[] args) {
		Calculadora.somar(100,50);
		Calculadora.subtrair(100, 50);
		Calculadora.multiplicar(100, 50);
		Calculadora.dividir(100, 2);
		ExibirInformacoes.escrever();
		
		System.out.println("A soma dos valores com Double é: "+ Calculadora.somar(543.5, 267.5));
		double valor = Calculadora.somar(400.8, 600.9);
		System.out.println("O Valor retornado é : "+ valor);

	}
	
	public static void somar(int numero1, int numero2) {
		System.out.println("A soma dos valores é: " + (numero1 + numero2));
		
	}

}
