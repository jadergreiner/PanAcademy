
import java.util.Random;
import java.util.Scanner;

public class JodoDeAdvinheNumero {

	public static void main(String[] args) {
		
		/*
		 * 1. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
		 * Armazene um número aleatório em uma variável. O jogador tem 10
		 * tentativas para adivinhar o número gerado. Ao final de cada tentativa,
		 * imprima a quantidade de tentativas restantes, e imprima se o número
		 * inserido é maior ou menor do que o número armazenado.
		 */ 
		
		Random random = new Random();
		
		int numOculto = random.nextInt(100);
		
		for (int i=1; i<=10 ; i ++) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Informe um número entre 0 e 100");
			int numInformado = sc.nextInt();
			
			if (numInformado == numOculto) {
				System.out.println("PARABÉNS! Você acertou na tentativa número "+i);
			} else if (i <=10) {
				
				// i é o numero de tentativas
				System.out.println("Que pena!! Você errou..");
				System.out.println("Você ainda tem " + (10 - i) + "tentativas \n");
				System.out.println((numInformado > numOculto) ? "O número oculto é menor \n" : "O número oculto é maior \n");
				
			} else {
				System.out.println("Que pena! Chegou ao fim do jogo sem revelar o número oculto");
			}
		
			sc.close();
		
		}

	}

}
