import java.util.Scanner;

class TiposTriangulo {
	
	/*
	 * Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva
	 * se o triângulo é Acutângulo, Retângulo ou Obsusângulo. Sendo que:
	 * 
	 * - Triângulo retângulo: possui um ângulo reto (igual a 90 graus)
	 * - Triângulo Obtusângulo: possui um ângulo obtuso (maior que 90 graus)
	 * - Triângulo Acutângulo: possui três angulos agudos (menos que 90graus)
	 */
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int ang1, ang2, ang3;
			
		System.out.println("Angulo do retangulo 1?");
		ang1 = sc.nextInt();
		
		System.out.println("Angulo do retangulo 2?");
		ang2 = sc.nextInt();
		
		System.out.println("Angulo do retangulo 3?");
		ang3 = sc.nextInt();
		
		if ( ang1 == 90 || ang2 == 90 || ang3 == 90)  {
			System.out.println("Triangulo retangulo");
		} else if ( ang1 > 90 || ang2 > 90 || ang3 > 90 ) {
			System.out.println("Triângulo Obtusângulo");
		} else if (  ang1 < 90 && ang2 < 90 && ang3 < 90) {
			System.out.println("Triângulo Acutângulo");
		} else {
			System.out.println("Não foi possível determinar o tipo");
		}
		
		sc.close();

	}

}
