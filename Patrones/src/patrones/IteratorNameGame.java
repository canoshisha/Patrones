
package patrones;

import java.util.ArrayList;
import java.util.List;

public class IteratorNameGame {
    
    private List<IGame> sortlistGame;
    private int position;

    public IteratorNameGame(List<IGame> listGame) {
        sortList(listGame);
        this.position = 0;
    }
    
    public boolean hasNext(){
        return position < sortlistGame.size()-1;
    }
    
    public IGame next(){
        position++;
        IGame game = sortlistGame.get(position);
        return game;
    }
    
    public IGame first(){
        IGame game = sortlistGame.get(0);
        return game;
    }
    public void sortList(List<IGame> listGame){
        while(listGame.size() > 1){
            IGame game = listGame.get(0); 
            for (int i = 1; i < listGame.size(); i++) {
                if(game.getNombre().compareToIgnoreCase(listGame.get(i).getNombre()) == -1){
                    game = listGame.get(i);
                }
            }
            sortlistGame.add(game);
            listGame.remove(game);
        } 
    }
 
}
