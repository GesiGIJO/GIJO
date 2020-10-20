
public class Calculadora {

	public static void main(String[] args) {
		somar(100,40);
		subtrair(100,40);
		multiplicar(100,40);
		dividir(100,40);

	}
	
	public static void somar(int numero1, int numero2) {
		System.out.println("A soma dos valores é: " + (numero1 + numero2));
		
	}
	
	public static void subtrair(int numero1, int numero2) {
		System.out.println("A subtração dos valores é: " + (numero1 - numero2));
		
	}

	public static void multiplicar(int numero1, int numero2) {
		System.out.println("A multiplicação dos valores é: " + (numero1 * numero2));
		
	}
	
	public static void dividir(int numero1, int numero2) {
		System.out.println("A divisão dos valores é: " + (numero1 / numero2));
		
	}
	
	public static double somar(double numero1, double numero2) {
		return numero1 + numero2;
	}
}
