/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import java.util.List;

/**
 *
 * @author mater
 */
public class IteratorBusinessGame implements Iterable{

   private List<IGame> sortlistGame;
    private int position;

    public IteratorBusinessGame(List<IGame> listGame) {
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
                if(game.getEmpresa().compareToIgnoreCase(listGame.get(i).getEmpresa()) == -1){
                    game = listGame.get(i);
                }
            }
            sortlistGame.add(game);
            listGame.remove(game);
        } 
    }
    
}
