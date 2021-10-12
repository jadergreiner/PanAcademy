import java.util.Scanner;

/*
 * Escreva um programa que leia as medidas dos lados de um triângulo e escreva
 * se ele é Equilátero, Isósceles ou Escaleno. Sendo que:
 * 
 *  Triângulo equilátero: possui os três lados iguais;
 *  Triângulo Isóscele: possui 2 lados iguais
 *  Triângulo Escaleno: possui 3 lados diferentes
 */

public class MedidasLado {

	public static void main(String[] args) {
		
		int ladoA, ladoB, ladoC;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe a medida do lado A");
		ladoA = sc.nextInt();
		
		System.out.println("Informe a medida do lado B");
		ladoB = sc.nextInt();
		
		System.out.println("Informe a medida do lado C");
		ladoC = sc.nextInt();
		
		if ( ladoA != ladoB && ladoB != ladoC && ladoA != ladoC ) {
				System.out.println("Triângulo escaleno - possui1 os três lados diferentes >> " + ladoA + " - " + ladoB + " - " + ladoC);
		} else if  ( (ladoA == ladoB || ladoB == ladoC || ladoA == ladoC) && ( ladoA != ladoB || ladoB != ladoC || ladoA != ladoC ) ) {
				System.out.println("Triângulo Isóscele - possui dois lados iguais >> " + ladoA + " - " + ladoB + " - "+  ladoC);
		} else if (ladoB == ladoC) {
			System.out.println("Triângulo equilatero - possui os três lados iguais >> " + ladoA + " - " + ladoB + " - "+  ladoC);
		} else {
			System.out.println("Outra coisa >> "  + ladoA + " - " + ladoB + " - "+  ladoC);
		}
			
		
		sc.close();

	}

}
