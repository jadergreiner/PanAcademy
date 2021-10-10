/*
 * Escreva um programa para ler o ano de nascimento de uma pessoa e 
 * escrever uma mensagem que diga se ela poderá ou não votar este ano 
 * (não	é	necessário	considerar	o	mês	em	que	ela nasceu).
 */

import java.util.Scanner;

public class VerificaIdadeVotacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ano;
		
		System.out.println("Escreva seu ano de nascimneto: ");
		ano = sc.nextInt();
		
		if (2021 - ano >=16 && 2021 - ano <=17) {
			System.out.println("Seu voto é facultativo! ");
		} else if (2021 - ano >=18) {
			System.out.println("O voto é obrigatório");
		} else if (2021 - ano < 0) {
			System.out.println("Mas você nem nasceu ainda");
		} else {
			System.out.println("Você Não pode votar");
		}
		
		sc.close();
	}

}
