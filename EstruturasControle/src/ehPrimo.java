import java.util.Scanner;

public class ehPrimo {

	public static void main(String[] args) {
		/*
		 * Criar um programa que receba um número e diga se ele é um número primo
		 */
		
		int proxNum = 0;
		
		Scanner sc = new Scanner (System.in);
		
			while ( proxNum != -999) {
				
				int resultado = 0;
					
				System.out.println("Informe o próximo número ou (-999 para SAIR):: ");
				proxNum = sc.nextInt();
				
				for (int i = 2; i <= proxNum /2; i++) {
					if (proxNum % i == 0) {
						resultado ++;
						break;
					}
				}
			
				if (proxNum == -999){
					System.out.println("Fim do programa");
				} else {
					System.out.println((resultado == 0) ? proxNum + " É um número primo \n" : proxNum + " NÃO é um número primo \n");
				}
			
			}
			
		sc.close();
	}
			
}