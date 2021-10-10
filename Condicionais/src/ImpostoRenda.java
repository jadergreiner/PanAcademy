
public class ImpostoRenda {

	public static void main(String[] args) {
		
		double salario = 3550.0;
		
		if (salario < 2500) {
			System.out.println("A sua aliquota é de 15%");
			System.out.println("Você pode deduzir até R$ 350.00");
		} else if (salario < 3500){ 
			System.out.println("A sua aliquota é de 23%");
			System.out.println("Você pode deduzir até R$ 630.00");
		} else {
			System.out.println("A sua aliquota é de 28%");
			System.out.println("Você pode deduzir até R$ 750.00");
		}

	}

}

