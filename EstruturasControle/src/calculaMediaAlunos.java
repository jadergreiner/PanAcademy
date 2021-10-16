import java.util.Scanner;

public class calculaMediaAlunos {

	public static void main(String[] args) {
		/* 
		 * Calcular média de X alunos.
		 * Notas válidas: entre 0 e 10
		 * Contar quantas notas válidas foram digitadas
		 * Usuário deve digitar -1 para sair do programa e ser informado da sua média e quantidade de notas
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int qtdeNotas = 0;
		double total = 0.0;
		double nota = 0.0;
		
		while(nota != -1) {
			System.out.println("Informe a próxima Nota ou (-1) para sair ?");
			nota = sc.nextDouble();
			
			if( nota >= 0 && nota <=10) {
				qtdeNotas ++;
				total =+ nota;
			} else if (nota == -1) {
				System.out.println("\nEncerrando o programa \n ");
				System.out.println("O total de notas válidas digitadas foram :: "+qtdeNotas);
				System.out.printf("A média das notas dos alunos é de %.2f" ,total);
			} else {
				System.out.println("Nota inválida! Informe valores entre 0 e 10");
			}
		}
		
		sc.close();
	}
		
}
