
import java.util.Scanner;

public class SomaNumerosPositivos {

	public static void main(String[] args) {
		
		/*
		 *  Criar um programa que, enquanto estiver recebendo números positivos,
		 *  imprime no console a soma dos números inseridos, caso receba um
		 *  número negativo, encerre o programa
		 */ 

		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int soma = 0;
		
		while(i >=0) {
			
			System.out.println("Informe um número inteiro para somar ou um número negativo para SAIR");
			i = sc.nextInt();
			
			if ( i >= 0) {
				soma += i;
				System.out.println("A soma acumulada é " + soma);
			} else {
				System.out.println("SAIU DO PROGRAMA");
			}
			
		}
		
		sc.close();
	}
}
