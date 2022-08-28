package tp1;

public abstract class Boisson {
	private String description;
	public abstract double count(); //protected pour que les classes filles puissent y avoir accès
	public abstract String getDescription();

}
