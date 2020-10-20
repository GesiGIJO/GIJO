import javax.swing.JOptionPane;

public class ClienteProduto {

	public static void main(String[] args) {
		
		//Declara o array Cliente e o Array Produto
		String cliente[] = new String[3];
		String produto[] = new String[2];
		String nome;
		
		//Percorre o Array Cliente
		for(int l=0; l < cliente.length; l++) {
			
			//Atribui valor para o cliente posição a posição.
			cliente[1] = JOptionPane.showInputDialog("Digite o seu Nome: ");
			
			//Percorre o array Produto e atribui o valor para o produto ...
			for (int g=0; g< produto.length; g++) {
				produto[g] = JOptionPane.showInputDialog("Digite o Produto: ");
			}
			System.out.println("Cliente: "+cliente[1]);
			for(int d=0; d < produto.length; d++) {
				System.out.println("Produto: "+produto[d]);
			}
			
		}
	

	}

}
