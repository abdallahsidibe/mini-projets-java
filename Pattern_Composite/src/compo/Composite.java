package compo;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Composant {
	public Composite(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	//Un composite contient une liste de composant
	//On va prendre le cas de ArrayList
	private List<Composant> composants = new ArrayList<Composant>();

	@Override
	public void operation() {
		String tab ="";
		//J'affiche le composite
		for(int i=0; i<niveau; i++)
			tab+="----";
		System.out.println(tab+ "Composite:" +nom);
		/**
		 * Egalement, je vais afficher tous les
		 * composants qui se trouvent dans le composite  
		 */
		for(Composant c:composants) {
			c.operation();
		}
	}
	
	public void add(Composant c) {
		//On va definir le nieau du composant qu'on veut ajouter
		c.niveau = this.niveau+1;
		composants.add(c);
	}
	
	public void remove(Composant c ) {
		composants.remove(c);
	}
	
	//Permet de retourner la liste des composants
	public List<Composant> getChilds(){
		return composants;
	}

}
