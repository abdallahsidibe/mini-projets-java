package Package;

public  class  Oeuvre {

	// les attributs
	protected String titre, auteur, proprietaire ;
	protected double prix ;
	//le constructeur avec comme paramètre le titre, l'auteur et le prix
	//l'attribut proprietaire est initialisé
	public Oeuvre(String t, String a, double p){
	 titre = t ; auteur = a ; prix = p ; proprietaire = "";
	 }
	//une oeuvre est neuve si elle n'a pas encore de propriétaire
	//d'où l'intérêt de l'initialisation dans le constructeur
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
	
	//la méthode acheter donne un nom de propriété à l'objet
	public void Acheter(String nom) {proprietaire = nom ;}
	
	 public String getTitre()
	   {
		   return titre;
	   }
}
