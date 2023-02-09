package exercicio4;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Exercicio04 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###.##"); 
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, resposta;
		
		System.out.println("Escreva o primeiro número: ");
		n1 = leia.nextFloat();
		
		System.out.println("Escreva o segundo número: ");
		n2 = leia.nextFloat();
	
		System.out.println("Escreva o terceiro número: ");
		n3 = leia.nextFloat();
		
		System.out.println("Escreva o quarto número: ");
		n4 = leia.nextFloat();
		
		resposta = (n1 * n2) - (n3 * n4);
		System.out.println("Resposta: " + resposta);
		leia.close();
		
	}

} 










