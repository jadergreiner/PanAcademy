package poo;

public class Carro implements Controlador {
	
	private String cor;
	private boolean ligado;
	private String marca;
	private String placa;
	private int ano;
	private int velocidade;
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	@Override
	public void acelerar() {
		System.out.println("Aumentando a velocidade em 5KM");
		this.velocidade = getVelocidade() +5;
	}

	@Override
	public String toString() {
		return "Carro [cor=" + cor + ", ligado=" + ligado + ", marca=" + marca + ", placa=" + placa + ", ano=" + ano
				+ ", velocidade=" + velocidade + "]";
	}
	
	
}
