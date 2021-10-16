package animais;

public class Principal extends Aves{
	
	public String nome;

	public static void main(String[] args) {
		
		Animais ave01 = new Aves();
		
		ave01.apresentacao();
		
		Mamiferos mamifero01 = new Mamiferos();
		
		mamifero01.apresentacao();
	}

}
