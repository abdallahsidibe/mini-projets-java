package tp1;

public abstract class Boisson {
	private String description;
	public abstract double count(); //protected pour que les classes filles puissent y avoir acc�s
	public abstract String getDescription();

}
