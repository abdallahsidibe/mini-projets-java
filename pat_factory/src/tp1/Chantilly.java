package tp1;

public class Chantilly extends DecorateurBoisson{

	public Chantilly(Boisson boisson) {
		super(boisson);
	}

	@Override
	public double count() {
		return 1.5+boisson.count();
	}

	@Override
	public String getDescription() {
		return boisson.getDescription()+"Au Chantilly";
	}

}
