package adapter;
import ancienne.AncienneImpl;
public class AdapterImpl2   implements Standard {
	private AncienneImpl ancienne = new AdapterImpl1();
	
	@Override
	public void operation(double n1, double n2) {
		double p = ancienne.produit(n1,n2);
		ancienne.afficher(p);		
	}
}
/**AdapterImpl2.java
package adapter;
import ancienne.AncienneImpl;
public class AdapterImpl2   implements Standard {
	private AncienneImpl ancienne; //ou adapte	
	public AdapterImpl2(AncienneImpl ancienne) {
		super();
		this.ancienne = ancienne;
	}
	@Override
	public void operation(double n1, double n2) {
		double p = ancienne.produit(n1,n2);
		ancienne.afficher(p);		
	}
}
**/
/**Test.java
package adapter;
import ancienne.AncienneImpl;
public class Test {
	public static void main(String[] args) {
		Client client = new Client();		
		//client.setStandard(new StandardImpl());
		//client.setStandard(new AdapterImpl1());
		client.setStandard(new AdapterImpl2(new AncienneImpl()));
		client.traitement(7,4);	
	}
}
**/