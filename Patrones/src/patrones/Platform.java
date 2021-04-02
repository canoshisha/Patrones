
package patrones;

import java.util.ArrayList;
import java.util.List;


public class Platform implements Observable{

    private static Platform instance;
    List<Observer> Observers;
    List<IUpdate> updates;
    Forum forum;
    Ranking ranking;

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
    
}
