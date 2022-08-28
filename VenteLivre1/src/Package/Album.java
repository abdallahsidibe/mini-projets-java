package Package;

//La classe Album qui hérite de Livre
class Album extends Livre {
	//un seul attribut supplémentaire : un tableau de
	//booléen de la taille du nombre de pages
	//définit si la page a été lue ou non
	boolean page_coloriee[] ;
	//le constructeur qui appelle celui de Livre
	//Notons que la taille du tableau de booléen est
	//initialisée dans ce constructeur en fonction des
	//paramètres passés au constructeur
	public Album(String t, String a, double p, int nb){
		super(t,a,p, nb) ;
		page_coloriee = new boolean[nb] ;
		int i ;
		for (i=0 ; i<nb ; i++)
		page_coloriee[i] = false ;
	}
	//la méthode qui colorie une page : mettre à vrai la
	//valeur du tabelau page_coloriée si ce n'a pas été fait
	public void Colorie(int num_page){
		if ((page_coloriee[num_page] == false) && !Est_neuf())
		page_coloriee[num_page] = true ;
		else {
		System.out.println("page"+num_page+"deja coloriee");
		System.out.println();
	}
   }
} 