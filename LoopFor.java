import javax.swing.JOptionPane;

public class LoopFor {

	public static void main(String[] args) {
		
		String cliente;
		String produto;
		int quantidade;
		double valor;
		
		for(int i=0; i < 3; i++) {
			//System.out.println("O Valor de i é: "+i);
			
			cliente = JOptionPane.showInputDialog("Digite o seu Nome: ");
			
			double total = 0;
			
			for (int j=0; j < 3; j++) {
				produto = JOptionPane.showInputDialog("Digite o nome do Produto: ");
				quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: "));
				valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor: "));
				
				total += quantidade * valor;
				
				System.out.println("Cliente: "+cliente + "\n" + "Produtos: "+produto +"\n"+ "Quantidade: "+quantidade + "\n"+ "Valor: "+valor);
				System.out.println("Total a Pagar: "+total);
				
			}
		}

	}

}
