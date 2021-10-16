package poo;

public class TesteCarro {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		System.out.println(c1);
		
		
		c1.acelerar();
		c1.acelerar();		
		System.out.println(c1.getVelocidade());
		
		System.out.println(c1.toString());
	}

}
