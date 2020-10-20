import javax.swing.JOptionPane;

public class UsandoMetodos {
	
	static int numeros[] = new int[3];

	public static void main(String[] args) {
		lerCliente();
		preencherNumeros();
		somarNumeros();

	}
	
	public static void lerCliente() {
		String nome = JOptionPane.showInputDialog("Digite o seu Nome: ");
		String cpf = JOptionPane.showInputDialog("Digite o seu CPF: ");
		
		JOptionPane.showMessageDialog(null, "Nome: "+ nome + "\n" +"CPF: "+cpf);
				
	}
	
	public static void preencherNumeros() {
		for (int i=0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para o Array: "));
		}
	}
	public static void somarNumeros() {
		int soma = 0;
		for(int i=0; i <numeros.length; i++) {
			soma += numeros[i];
		}
		
		JOptionPane.showMessageDialog(null,"A Soma dos números é: "+soma);
	}
	
}


