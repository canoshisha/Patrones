
package patrones;
import java.util.*;

public class Ranking {
    
    Set<Player> players_list;

    public Ranking() {
        players_list = new HashSet<>();
    }
    
    public boolean addPlayer(Player new_player){
        return players_list.add(new_player);
        
    }
    public boolean removePlayer(Player player){
        return players_list.remove(player);
    }

    public Set<Player> getPlayers_list() {
        return players_list;
    }
    
    
}
