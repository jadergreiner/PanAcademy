
import java.util.Scanner;

public class ImprimeLetrasDaPalavra {

	public static void main(String[] args) {
		
		/*
		 * Criar um programa que receba uma palavra e em seguida imprime no
		 * console letra por letra
		 */ 

		Scanner sc = new Scanner(System.in);
		
		String palavra;
			
		System.out.println("Informe uma palavra: ");
		palavra = sc.next();
		
		char [] letras = palavra.toCharArray(); 
		
		sc.close();
		
		for (int i=0; i < letras.length; i ++)
        {
            System.out.println(letras[i]);
        }
	}
}
