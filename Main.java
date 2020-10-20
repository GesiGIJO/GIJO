import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); 
		   
	    System.out.println( "Digite o  total  de  eleitores:  " );  
	  int total  = s.nextInt( );  
	   
	    System.out.println( "Digite o  total  de  votos  válidos:  ");  
	  int validos =  s.nextInt() ;  
	   
	    System.out.println( "Digite o  total  de  votos  brancos:  ");  
	  int brancos = s.nextInt() ;  
	   
	    System.out.println( "Digite o  total  de  votos  nulos : " );  
	  int  nulos  = s.nextInt( );  
	   
	    System.out.println( "Porcentagem  de  válidos:  "  + ( validos * 100)  / 
	total +  "% ");  
	    System.out.println( "Porcentagem  de  brancos:  "  + ( brancos * 100)  / 
	    		total +  "% ");  
	    System.out.println( "Porcentagem  de  nulos : "  +  (nulos * 100)  / 
	total +  "% ");  
	}
}
