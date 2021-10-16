package animais;

public class Aves extends Animais {
	
	
	@Override
	public void movimentar() {
		System.out.println("A maioria das aves se movimenta com as asas!");
	}
	
	@Override
	public void comunicar() {
		System.out.println("Através do canto elas se comunicam entre seu próprio grupo social ou com outras espécies! \n");
	}
	
	@Override
	public void apresentacao() {
		System.out.println("Apresentação das Aves \n");
		
		movimentar();
		comunicar();
	}
	
}

