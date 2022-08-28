package Package;

//La classe Album qui h�rite de Livre
class Album extends Livre {
	//un seul attribut suppl�mentaire : un tableau de
	//bool�en de la taille du nombre de pages
	//d�finit si la page a �t� lue ou non
	boolean page_coloriee[] ;
	//le constructeur qui appelle celui de Livre
	//Notons que la taille du tableau de bool�en est
	//initialis�e dans ce constructeur en fonction des
	//param�tres pass�s au constructeur
	public Album(String t, String a, double p, int nb){
		super(t,a,p, nb) ;
		page_coloriee = new boolean[nb] ;
		int i ;
		for (i=0 ; i<nb ; i++)
		page_coloriee[i] = false ;
	}
	//la m�thode qui colorie une page : mettre � vrai la
	//valeur du tabelau page_colori�e si ce n'a pas �t� fait
	public void Colorie(int num_page){
		if ((page_coloriee[num_page] == false) && !Est_neuf())
		page_coloriee[num_page] = true ;
		else {
		System.out.println("page"+num_page+"deja coloriee");
		System.out.println();
	}
   }
} 