package animais;

public class Mamiferos extends Animais {
	
	
	@Override
	public void comunicar() {
		System.out.println("Os animais podem se comunicar por meio de vários sinais. Eles podem ser químicos ");
		System.out.println("que dependem do olfato e do paladar), acústicos (sons), visuais (cores, luminosidade e movimentos), táteis (carícias) e elétricos!");
	}
	
	@Override
	public void movimentar() {
		System.out.println("Os mamíferos normalmente deslocam-se com o auxílio dos seus membros!");
	}
	
	@Override
	public void apresentacao() {
		System.out.println("Apresentação dos Mamiferos \n");
		
		movimentar();
		comunicar();
	}
	
}
