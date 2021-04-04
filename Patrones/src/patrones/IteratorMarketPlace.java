
package patrones;

import java.util.List;

public class IteratorMarketPlace {
    
    private List<Game> listGame;
    private int position;

    public IteratorMarketPlace(List<Game> listGame) {
        this.listGame = listGame;
        listGame.sort(new ComparadorGames());
        this.position = 0;
    }
    
    public boolean hasNext(){
        return position < listGame.size()-1;
    }
    
    public Game next(){
        position++;
        Game game = listGame.get(position);
        return game;
    }
    
    public Game actual(){
        Game game = listGame.get(position);
        return game;
    }
    
    
}
