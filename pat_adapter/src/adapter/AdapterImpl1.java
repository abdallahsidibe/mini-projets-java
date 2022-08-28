package adapter;
import ancienne.AncienneImpl;
public class AdapterImpl1 extends AncienneImpl implements Standard {
	@Override
	public void operation(double n1, double n2) {
		double p = produit(n1,n2);
		afficher(p);	
	}
}
