
package patrones;
import java.util.*;

public class MarketPlace {
    
    List<Game> games_list;

    public MarketPlace() {
        
    }
    
    public void addGame(Game game){
        games_list.add(game);
    }
    
    public List<Game> getLista_juegos(){
        return games_list;
    }
    public boolean removeGame(String name){
        Iterator game = games_list.iterator();
        boolean terminado = false;
        Game actual = (Game) game;
        Game searched = null;
        if(actual.getNombre().compareToIgnoreCase(name)==0){
            searched = actual;
            terminado = true;
        }else {
            while (game.hasNext()) {
                game = (Iterator) game.next();
                actual = (Game) game;
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
