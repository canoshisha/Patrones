/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import java.util.List;

public class IteratorMarketPlace {
    
    private List<IGame> listGame;
    private int position;

    public IteratorMarketPlace(List<IGame> listGame) {
        this.listGame = listGame;
        this.position = 0;
    }
    
    public boolean hasNext(){
        return position < listGame.size();
    }
    
    public IGame next(){
        IGame game = listGame.get(position);
        position++;
        return game;
    }
    
    
    
}
