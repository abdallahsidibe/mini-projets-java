package compo;

public abstract class Composant {
	protected String nom;
	protected int niveau;
	public abstract void operation();
	public Composant(String nom) {
		super();
		this.nom = nom;
	}
	

}
