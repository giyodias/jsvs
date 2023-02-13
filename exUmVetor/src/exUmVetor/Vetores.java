package exUmVetor;
	import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
	int valores[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
	int numero;
	
	System.out.println("Digite o número que você deseja encontrar: ");
	numero = leia.nextInt();
	
		for(int indice = 0; indice < valores.length; indice++) {
			if(valores[indice] == numero) {
				
				System.out.println("O número " + numero + "está localizado na posição: " + indice);
				indice = valores.length;
			}
			else if(indice == valores.length -1)
				System.out.println("O número não foi encontrado");

	leia.close();		
		
		}
	}

}
