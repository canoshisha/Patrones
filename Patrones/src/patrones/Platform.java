
package patrones;

import java.util.ArrayList;
import java.util.List;


public class Platform implements Observable{

    private static Platform instance;
    List<Observer> Observers;
    List<IUpdate> updates;
    Forum forum;
    Ranking ranking;
    MarketPlace marketplace;

    private Platform() {
        this.Observers = new ArrayList<>();
        this.updates = new ArrayList<>();
        forum = new Forum();
        ranking = new Ranking();
    }
    
  
    public static Platform getInstance(){
        if (instance==null)
            instance=new Platform();
        return instance;
     
    }

    public List<Player> getPlayers() {
        return ranking.getPlayers_list();
    }

    public void addPlayerstoRanking(Player player) {
        this.ranking.addPlayer(player);
    }

    public Forum getForum() {
        return forum;
    }
    
    
    @Override
    public void notifyObservers() {
        for(Observer o:Observers)
            o.update(updates.get(updates.size() - 1));
    }

    public void registerObserver(Observer o) {
        this.Observers.add(o);
    }

    public void removeObserver(Observer o) {
        this.Observers.remove(o);
    }
    
    public void addNoticia(IUpdate update){
        this.updates.add(update);
        this.notifyObservers();
    }
    public String playerList(){
        String list = "";
        for (int i = 0; i < ranking.getPlayers_list().size(); i++) {
            list += "Player: "+ranking.getPlayers_list().get(i)+", hours played: "+ranking.getPlayers_list().get(i).getHorasJugadas()+"\n";
        }
        
        return list;
    }
    public String comments(){
        String comments = "Good Comments\n";
        for (int i = 0; i < forum.getGoodComments().size(); i++) {
            comments += "Comment "+i+"\n";
            comments += forum.getGoodComments().get(i)+"\n";
        }
        comments = "Bad Comments\n";
        for (int i = 0; i < forum.getBadComments().size(); i++) {
            comments += "Comment "+i+"\n";
            comments += forum.getBadComments().get(i)+"\n";
        }
        
        return comments;
    }
    public String GameList(){
        String list = "";
        for (int i = 0; i < marketplace.getLista_juegos().size(); i++) {
            list += ""+marketplace.getLista_juegos().get(i)+"\n";
        }
        
        return list;
    }
    
}
