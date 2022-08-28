package Package;

public class BD extends Livre{

	// un seul attribut supplémentaire : un booléen qui
	// définit si la BD est en couleur ou non
	private boolean encouleur ;
	//Le constructeur qui appelle celui de la classe Livre
	//et donc celui de la classe Oeuvre
	public BD(String t,String a,double p,int n,boolean c){
	 super(t,a,p,n) ;
	 encouleur = c ;
	 }
	//La méthode qui échange les noms des propriétaires si
	//le prix des BD est identique
	public void Echanger(BD b) {
	 if (this.prix==b.prix){
	 System.out.println("Prix égaux:échange possible" );
	 String ProTmp = this.proprietaire;
	 this.proprietaire = b.proprietaire ;
	 b.Acheter(ProTmp) ;
	 } else // ne pas échanger les BD
	System.out.println("Prix différents:échange	impossible");
	 }
	
}
