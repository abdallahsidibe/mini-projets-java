package Package;
import java.util.*;

public class CollectionLivre {
   // private Vector<Film> tabfilm;
   private ArrayList<Livre> tablivre;
   //private Film [] tabfilm;
    private int nblivre;
    private int maxlivre = 10;
  
    public CollectionLivre(){
      //  this.tabfilm = new Vector<Film>(this.maxfilm);
          this.tablivre = new ArrayList<Livre>(this.maxlivre);
    	//this.tabfilm = new Film[this.maxfilm];
    }  
    
    public void ajouter(Livre f){
       try {
          this.tablivre.add(f);
        }
        catch(Exception e) {
           System.out.println("Liste Pleine !");
        }
        this.maxlivre++;
        System.out.println("Film Ajouter avec success !");
    }
    
    
    public void afficheListeLivre(){
        for (Livre f : this.tablivre){
            f.Afficher();
        }
    }
    
    public void rechercheFilm(String titre){
        for (Livre f : this.tablivre){
            String t = f.getTitre();
            if(t == titre){
                f.Afficher();
                return;
            } else{
                System.out.println("Livre Non Disponible");
            }
            
        }
    }
    
}
