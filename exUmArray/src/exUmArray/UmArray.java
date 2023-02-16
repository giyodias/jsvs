package exUmArray;

import java.util.ArrayList;
import java.util.Scanner;

public class UmArray {

	public static void main(String[] args) {
		
				Scanner leia = new Scanner(System.in);
				ArrayList<String> cores = new ArrayList <String>();
				String cor;
						
				for (int contador = 0; contador < 5; contador ++) { 
					//
					//for (int contador = 0; contador < quantidade; contador ++)
					System.out.println("Digite uma cor: ");
					leia.skip("\\R?"); //usado apenas em variaveis string pro 
					//scanner não captar o retorno do cursor
					cores.add(leia.nextLine());
				}
				
				System.out.println("Lista de cores");
				cores.forEach(System.out::println);
				
				System.out.println("Cores ordenadas: ");
				cores.sort(null);
				cores.forEach(System.out::println); //mesma coisa que o for, porém adaptado ao array
				
				leia.close();
				
				}
			
			}



