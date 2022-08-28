package Package;

//La classe Livre hérite de la classe Oeuvre
class Livre extends Oeuvre {
//un seul attribut supplémentaire: nombre pages du livre
protected int nb_pages ;
//le constructeur de cette classe appelle celui de la
//classe supérieure c'est-à-dire de la classe Oeuvre

 public Livre(String t, String a, double p, int nb){
	 super(t,a,p) ;
	 nb_pages = nb ;
}
//la méthode revente modifie simplement le
// propriétaire et le prix du livre
	public void Revendre(String acheteur,double prix_occas){
	 proprietaire = acheteur ;
	 prix = prix_occas ;
	 }
   public String Proprietaire() {
	 return (proprietaire) ;
	 }
   
  
 }