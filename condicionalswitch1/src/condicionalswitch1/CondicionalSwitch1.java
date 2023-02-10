package condicionalswitch1;

import java.util.Scanner;


public class CondicionalSwitch1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float cod, cod1, cod2, cod3, cod4, cod5, cod6, qt, valor, vt;
		
		System.out.println("Digite o código do produto: ");
		cod = leia.nextInt();
		
		System.out.println("Digite a quantidade de itens: ");
		qt = leia.nextInt();
		
		cod1 = 10;
		cod2 = 15;
		cod3 = 18;
		cod4 = 12;
		cod5 = 8;
		cod6 = 13;
		
		
		switch(cod) {
		
			case 1:
				System.out.println("Você escolheu " + qt + " cachorro(s) quente(s) no valor de: " + cod1 + " reais cada!");
					vt = (qt * cod1);
				System.out.println("Valor total: " + vt + " reais");
				break;
				
			case 2:
				System.out.println("Você escolheu " + qt + " X-salada(s)no valor de: " + cod2 + " reais cada!");
					vt = (qt * cod2);
				System.out.println("Valor total:3 " + vt + " reais");
				break;
				
			case 3:
				System.out.println("Você escolheu " + qt + " X-Bacon(s) no valor de: " + cod3 + " reais cada!");
					vt = (qt * cod3);
				System.out.println("Valor total: " + vt + " reais");
				break;
				
			case 4:
				System.out.println("Você escolheu " + qt + " Bauru(s)no valor de: " + cod4 + " reais cada!");
				vt = (qt * cod4);
				System.out.println("Valor total: " + vt + " reais");
				break;
			case 5:
				System.out.println("Você escolheu " + qt + " refrigerante(s)no valor de: " + cod5 + " reais cada!");
				vt = (qt * cod5);
				System.out.println("Valor total: " + vt + " reais");
				break;
				
			case 6:
				System.out.println("Você escolheu" + qt + " suco(s) de laranja no valor de: " + cod6 + " reais cada!");
				vt = (qt * cod6);
				System.out.println("Valor total: " + vt + " reais");
				break;
				
			default:
				System.out.println("Opção inválida.");
		}
	}

}
