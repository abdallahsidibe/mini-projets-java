package Package;
import java.util.*;

public class CollectionFilm {
	   private ArrayList<Film> tabfilm;
	    private int nbfilm;
	    private int maxfilm = 10;
	  
	    public CollectionFilm(){
	          this.tabfilm = new ArrayList<Film>(this.maxfilm);
	    }  
	    
	    public void ajouter(Film f){
	       try {
	          this.tabfilm.add(f);
	        }
	        catch(Exception e) {
	           System.out.println("Liste Pleine !");
	        }
	        this.maxfilm++;
	        System.out.println("Film Ajouter avec success !");
	    }
	    
	    
	    public void afficheListeFilm(){
	        for (Film f : this.tabfilm){
	        	f.Afficher();
	        }
	    }
	    
	    public void rechercheFilm(String titre){
	        for (Film f : this.tabfilm){
	            String t = f.getTitre();
	            if(t == titre){
	                f.Afficher();
	                return;
	            } else{
	                System.out.println("Film Non Disponible");
	            }
	            
	        }
	    }
    
}
