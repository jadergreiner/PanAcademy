
import java.util.Scanner;

public class QualMaiorNumero {

	public static void main(String[] args) {
		
		/*
		 * Crie um programa que recebe 10 valores e ao final imprima o maior número
		 * 
		 */ 

		Scanner sc = new Scanner(System.in);
		
		int numAtual = 0;
		int maiorNumero = 0;
		
		for (int i=1; i <= 10; i ++)
        {
			System.out.printf("Informe um numero (%d): ", i);
			numAtual = sc.nextInt();
			
			if ( numAtual > maiorNumero) {
				maiorNumero = numAtual;
			}
        }
		
		System.out.println("O maior número foi " + maiorNumero);
		
		sc.close();
	}
}
