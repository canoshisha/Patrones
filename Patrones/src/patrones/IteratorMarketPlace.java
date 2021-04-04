
package patrones;

import java.util.List;

public class IteratorMarketPlace {
    
    private List<Game> listGame;
    private int position;

    public IteratorMarketPlace(List<Game> listGame) {
        this.listGame = listGame;
        this.position = 0;
    }
    
    public boolean hasNext(){
        return position <= listGame.size();
    }
    
    public Game next(){
        Game game = listGame.get(position);
        position++;
        return game;
    }
    
    
    
}
