package Package;

public class Main {
	
	public static void main(String[] args) {
		 //création de deux variables de type Livre
		 Livre l1 = new Livre("Le petit prince","St	Exupéry",10.40, 30) ;
		 Livre l2 = new Livre("Contes","Grimm",14.40, 250) ;
		 //on affiche les caractéristiques de chacun
		 l1.Afficher() ;
		 l1.Acheter("ABDALLAH") ;
		 l1.Afficher() ;
		 l1.prix = 0.0 ;
		 l2.Acheter("INES") ;
		 l2.Afficher();
		 //création de deux variables de type BD
		 BD b1 = new BD("Lucky Luke","Morris",10.40, 45, true);
		 BD b2 = new BD("Tintin","Herge",200.40, 50, false) ;
		 // "moi" achete deux BD b1 et b2
        
		 b1.Acheter("ABDALLAH");
		 b1.Afficher() ;
		 b2.Acheter("INES");
		 b2.Afficher() ;
		 // "ABDALLAH" revend à "INES" b2
		 b2.Revendre("INES",10.4);
		 b2.Afficher() ;
		 //on teste la fonction d'échange de b1 et b2
		 b1.Echanger(b2) ;
		 System.out.println("APRES ECHANGE DE "+b1.titre+" et "+b2.titre) ;
		 b1.Afficher();
		 b2.Afficher() ;
		 //on teste si la méthode de coloriage d'une page
		//fonctionne
		 Album a1 = new Album("Dora","Dora",3.5, 200) ;
		 a1.Afficher() ;
		 a1.Colorie(23) ;
		 a1.Acheter("ABDALLAH");
		 a1.Colorie(23) ;
		 // On crée un objet film
		 Film f = new Film("Taxi","Besson",20,90);
		 f.Afficher();
	}

}
