package Package;

public class BD extends Livre{

	// un seul attribut suppl�mentaire : un bool�en qui
	// d�finit si la BD est en couleur ou non
	private boolean encouleur ;
	//Le constructeur qui appelle celui de la classe Livre
	//et donc celui de la classe Oeuvre
	public BD(String t,String a,double p,int n,boolean c){
	 super(t,a,p,n) ;
	 encouleur = c ;
	 }
	//La m�thode qui �change les noms des propri�taires si
	//le prix des BD est identique
	public void Echanger(BD b) {
	 if (this.prix==b.prix){
	 System.out.println("Prix �gaux:�change possible" );
	 String ProTmp = this.proprietaire;
	 this.proprietaire = b.proprietaire ;
	 b.Acheter(ProTmp) ;
	 } else // ne pas �changer les BD
	System.out.println("Prix diff�rents:�change	impossible");
	 }
	
}
