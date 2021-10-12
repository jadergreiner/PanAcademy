import java.util.Scanner;

/*
 * As maças custam R$ 0,30 cada se forem compradas menos do que uma dúzia
 * se forrem comprados ao menos 12, o valor unitário é de R$ 0,25
 * 
 * escreva um programa que leia o número de maças compradas, calcule e escreva
 * o valor total da compra
 */
public class CalcVendaMaca {

	public static void main(String[] args) {
		
		int qtdMacas; // quantidade de maças compradas (informado no console)
		double totalCompra; // preço de venda1 (menor que 12) e preço de venda 2 (a partir de 12)
		
		double pv1 = 0.3;  // preço de venda1 (menor que 12)
		double pv2 = 0.25; // preço de venda2 (a partir de 12)
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informa a quantidade de maças que deseja comprar");
		qtdMacas = sc.nextInt();
		
		if ( qtdMacas >=12 ) {
			totalCompra = qtdMacas * pv2;
			System.out.println("Você está comprando "+ qtdMacas + " maças");
			System.out.printf("Pela quantidade seu valor promocional é de R$ %.2f   e o total da compra é de R$ %.2f", pv2, totalCompra );
		} else {
			totalCompra = qtdMacas * pv1;
			System.out.println("Você está comprando "+ qtdMacas + " maças");
			System.out.printf("Seu valor por unidade é de R$ %.2f e o total da compra é de R$ %.2f", pv1, totalCompra );
		}
		
		sc.close();

	}

}
