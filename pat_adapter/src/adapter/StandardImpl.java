package adapter;
public class StandardImpl implements Standard {
	@Override
	public void operation(double n1, double n2) {
		System.out.println("Standard Impl R�sultat="+n1*n2);
	}
}
