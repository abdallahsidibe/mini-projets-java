package Package;

//La classe Film hérite de la classe Oeuvre
public class Film extends Oeuvre{
	//un seul attribut supplémentaire:la durée du film en mn
	protected int durée ;
	//le constructeur de cette classe appelle celui de la
	//classe supérieure c'est-à-dire de la classe Oeuvre
	public Film(String t, String a, double p, int d){
	 super(t,a,p) ;
	 durée = d ;
	 }
	//la méthode revente modifie simplement le propriétaire	et le prix du livre
	public void Revendre(String acheteur,double prix_occas){
	 proprietaire = acheteur ;
	 prix = prix_occas ;
	 }
	public String Proprietaire() {
	 return (proprietaire) ;
	 } 

}
