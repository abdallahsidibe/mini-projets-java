package Package;

//La classe Film h�rite de la classe Oeuvre
public class Film extends Oeuvre{
	//un seul attribut suppl�mentaire:la dur�e du film en mn
	protected int dur�e ;
	//le constructeur de cette classe appelle celui de la
	//classe sup�rieure c'est-�-dire de la classe Oeuvre
	public Film(String t, String a, double p, int d){
	 super(t,a,p) ;
	 dur�e = d ;
	 }
	//la m�thode revente modifie simplement le propri�taire	et le prix du livre
	public void Revendre(String acheteur,double prix_occas){
	 proprietaire = acheteur ;
	 prix = prix_occas ;
	 }
	public String Proprietaire() {
	 return (proprietaire) ;
	 } 

}
