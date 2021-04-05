
package patrones;
import java.util.*;

public class MarketPlace{
    
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
        IteratorNameGame game = new IteratorNameGame(games_list);
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
        IteratorBusinessGame game = new IteratorBusinessGame(games_list);
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
}
