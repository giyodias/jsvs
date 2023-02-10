package condicionalif2;

import java.util.Scanner;

public class CondicionalIfDois {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero;
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if((numero > 0) && (numero / 2 == 0))
			System.out.println("O número "+ numero + "é par e positivo!");
		
		else if((numero > 0) && (numero / 2 != 0))
			System.out.println("O número " + numero + " é impar e positivo!");
		
		else if((numero < 0) && (numero / 2 == 0))
			System.out.println("O número " + numero + " é par e negativo! ");
		
		else 
			System.out.println("O número " + numero + " é impar e negativo!");
		
		
	}

}
