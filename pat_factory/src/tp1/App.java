package tp1;

public class App {

	public static void main(String[] args) {
		
		Boisson b = new Expresso();
		System.out.println(b.getDescription());
		System.out.println(b.count());
		
		b = new Chocolat(b);
		System.out.println(b.getDescription());
		System.out.println(b.count());
 
	}

}
