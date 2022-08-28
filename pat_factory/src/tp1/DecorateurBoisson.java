package tp1;

public abstract class DecorateurBoisson extends Boisson {
	protected Boisson boisson;

	public DecorateurBoisson(Boisson boisson) {
		//super();
		this.boisson = boisson;
	}

}
