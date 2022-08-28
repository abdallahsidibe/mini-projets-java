package tp1;

public class Chocolat extends DecorateurBoisson {

	public Chocolat(Boisson boisson) {
		super(boisson);
	}

	@Override
	public double count() {
		return 2+boisson.count();
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + " Au Chocolat";
	}

}
