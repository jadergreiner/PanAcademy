
public class exemploFor {

	public static void main(String[] args) {
		
		for (int i = 0; i <=10; i++) {
			System.out.println(i);
		}
		
		String [] cidades = {"Poa", "Gravataí", "Canoas"};
		
		for ( String j: cidades) {
			System.out.println(j);
		}
		
		int x = 0;
		for (; x<=10;) {
			System.out.println("Sim");
			x++;
		}

	}

}
