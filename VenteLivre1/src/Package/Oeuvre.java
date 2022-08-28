package Package;

public  class  Oeuvre {

	// les attributs
	protected String titre, auteur, proprietaire ;
	protected double prix ;
	//le constructeur avec comme param�tre le titre, l'auteur et le prix
	//l'attribut proprietaire est initialis�
	public Oeuvre(String t, String a, double p){
	 titre = t ; auteur = a ; prix = p ; proprietaire = "";
	 }
	//une oeuvre est neuve si elle n'a pas encore de propri�taire
	//d'o� l'int�r�t de l'initialisation dans le constructeur
	public boolean Est_neuf() {
	 if ( proprietaire =="" ) return true ;
	 else return false ;
	 }
	//affiche les informations sur l'oeuvre
	public  void Afficher() {
	 System.out.println("Titre : " + titre) ;
	 System.out.println("Auteur : " + auteur) ;
	 System.out.println("Prix : " + prix) ;
	 if (this.Est_neuf())
	 System.out.println("Aucun proprietaire" );
	 else
	 System.out.println("Proprietaire : "+proprietaire);
	 System.out.println(); 
	}
	
	//la m�thode acheter donne un nom de propri�t� � l'objet
	public void Acheter(String nom) {proprietaire = nom ;}
	
	 public String getTitre()
	   {
		   return titre;
	   }
}
