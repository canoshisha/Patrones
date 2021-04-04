
package patrones;
import java.util.*;

public class Ranking {
    
    private List<Player> players_list;

    public Ranking() {
        players_list = new ArrayList<>();
    }
    
    public boolean addPlayer(Player new_player){
        return players_list.add(new_player);
        
    }
    public boolean removePlayer(Player player){
        
        return players_list.remove(player);
    }

    public List<Player> getPlayers_list() {
        return players_list;
    }
    
    
}
