
package patrones;

import java.util.*;

public class Forum {
    private List<String> goodComments;
    private List<String> badComments;

    public Forum() {
        this.goodComments = new ArrayList<>();
        this.badComments = new ArrayList<>();
    }
    
    public void addGoodComment(String comment){
        goodComments.add(comment);
        
    }
    public void addBadComment(String comment){
        badComments.add(comment);
        
    }

    public List<String> getGoodComments() {
        return goodComments;
    }

    public List<String> getBadComments() {
        return badComments;
    }
    
}
