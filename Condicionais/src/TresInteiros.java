/*
 * Faça um programa que receba três inteiros e diga qual deles é o maior e qual o menor. 
 * 
 */

import java.util.Scanner;

public class TresInteiros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número:");
		int primeiroNumero = sc.nextInt();
		
		System.out.println("Informe o segundo número");
		int segundoNumero = sc.nextInt();
		
		System.out.println("Informe o terceiro número");
		int terceiroNumero = sc.nextInt();
		
		if(primeiroNumero == segundoNumero && segundoNumero == terceiroNumero) {
			System.out.println("Os três numeros são iguais");
		}
		
		else if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println("O numero maior é > " +primeiroNumero);
			if (segundoNumero < terceiroNumero) {
				System.out.println("O numero menor é > "+segundoNumero);
			
			}else {
				System.out.println("O menor número é  > "+ terceiroNumero);
			}
			
		}else if (segundoNumero > terceiroNumero) {
			System.out.println("O número maior é > " +segundoNumero);
			if (primeiroNumero <terceiroNumero) {
				System.out.println("O numero menor é > "+primeiroNumero);
			} else {
				System.out.println("O menor número é > "+ terceiroNumero);
			}
			
		}else {
			System.out.println("O maior número é  > " +terceiroNumero);
			if (primeiroNumero < segundoNumero) {
				System.out.println("O menor numero é  > "+primeiroNumero);
			} else {
				System.out.println("O menor numero é  > "+segundoNumero);
			}
		}
		
		sc.close();
		}
		
}
