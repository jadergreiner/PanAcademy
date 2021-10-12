import java.util.Scanner;

/*
 * Faça um algoritmo que escreva as seguintes mensagens:
 * - Caso o número de lados seja inferior a 3 escreva: NÃO É UM POLÍGONO;
 * - Caso o número de lados seja superior a 5 escreva: POLÍGONO NÃO IDENTIFICADO;
 */
public class ContaLados {

	public static void main(String[] args) {
		
		int qtdLados;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe a quantidade de lados: ");
		qtdLados = sc.nextInt();
		
		//utilizando if ternario
		System.out.println(
				
				(qtdLados < 3 ) ? "NÃO É UM POLÍGONO" : (qtdLados > 5) ? "POLÍGONO NÃO IDENTIFICADO" : "VALOR INFORMADO INVÁLIDO");
		
		sc.close();

	}

}
