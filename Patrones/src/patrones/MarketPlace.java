
package patrones;
import java.util.*;

public class MarketPlace implements Iterator{
    
    List<IGame> games_list;
    
    public MarketPlace() {
        
    }
    
    public void addGame(Game game){
        games_list.add(game);
    }
    
    public List<IGame> getLista_juegos(){
        return games_list;
    }
    public boolean removeGameName(String name){
        IteratorNameGame game = (IteratorNameGame) createNameIterator();
        boolean terminado = false;
        IGame actual = game.first();
        IGame searched = null;
        if(actual.getNombre().compareToIgnoreCase(name)==0){
            searched = actual;
            terminado = true;
        }else {
            while (game.hasNext()) {
                actual = game.next();
                if (actual.getNombre().compareToIgnoreCase(name) == 0) {
                    searched = actual;
                    terminado = true;
                }

            }

        }if (terminado == true) {
            return games_list.remove(searched);
        } else {
            return false;
        }
        
    }
    public boolean removeGameBusiness(String name){
        IteratorBusinessGame game = (IteratorBusinessGame)createBusinessIterator();
        boolean terminado = false;
        IGame actual = game.first();
        IGame searched = null;
        if(actual.getNombre().compareToIgnoreCase(name)==0){
            searched = actual;
            terminado = true;
        }else {
            while (game.hasNext()) {
                actual = game.next();
                if (actual.getNombre().compareToIgnoreCase(name) == 0) {
                    searched = actual;
                    terminado = true;
                }

            }

        }if (terminado == true) {
            return games_list.remove(searched);
        } else {
            return false;
        }
        
    }

    @Override
    public Iterator createNameIterator() {
        Iterator it = (Iterator) new IteratorNameGame(games_list);
        return it;
    }

    @Override
    public Iterator createBusinessIterator() {
        Iterator it = (Iterator) new IteratorBusinessGame(games_list);
        return it;
    }
}
