/*
 * Faça um programa que pede duas notas de um aluno. Em seguida ele deve calcular a média do aluno e dar o seguinte resultado:
  A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
  A mensagem "Reprovado", se a média for menor do que sete;
  A mensagem "Aprovado com Distinção", se a média for igual a dez.
 */

import java.util.Locale;
import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		
		double nota1, nota2, media;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a primeiro nota");
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota");
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2) /2 ;
		
		if (media == 10) {
			System.out.printf("Aprovado com distinção :: %.2f", media);
		} else if (media <7) {
			System.out.printf("Reprovado com media :: %.2f" ,media);
		} else {
			System.out.printf("Aprovado com média :: %.2f", media);
		}
		sc.close();
	}

}
