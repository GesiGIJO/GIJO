
public class UsandoArray {

	public static void main(String[] args) {
		
		String nomes[] = new String[6];
		
		int valores[] = new int[100];
		
		// Inicializando o vetor na declaração
		String carros[] = {"Fusca","Fox","Uno","Jeep"};
		
		nomes[0] = "Daniel";
		nomes[1] = "Gesiel";
		nomes[2] = "Josiane";
		nomes[3] = "Emanuela";
		nomes[4] = "Lara";
		nomes[5] = "Antonio";
		
		for(int i=0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		for(int j=0; j < valores.length; j++) {
			valores[j] = j*2;
		}
		
		for(int k=0; k < valores.length;k++) {
			System.out.printf("%s", valores[k] + " ");
		}
 
	}

}
