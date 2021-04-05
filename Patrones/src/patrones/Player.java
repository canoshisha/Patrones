
package patrones;

import java.util.ArrayList;
import java.util.List;



public class Player extends Persona implements Observer{
    String nick,hastag;
    double horasJugadas;
    List<IUpdate> Actualizaciones=new ArrayList<>();
    private Strategy mStrategy=new EmailStrategy(super.getCorreo());
    private InterfaceServerPlayer facade;
    
    public Player(String nombre, String apellido1, String apellido2, String correo, int telefono, String nick, String hastag) {//constructor solo persona
        super(nombre, apellido1, apellido2, correo, telefono);
        this.nick = nick;
        this.hastag = hastag;
        this.horasJugadas = Math.random()*(300 + 1);
    }

    public double getHorasJugadas() {
        return horasJugadas;
    }

    public void setHorasJugadas(double horasJugadas) {
        this.horasJugadas = horasJugadas;
    }

    
    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getHastag() {
        return hastag;
    }

    public void setHastag(String hastag) {
        this.hastag = hastag;
    }
   

    
    //Codigo para modificaciones
    public void setStrategy(Strategy strategy) {
        this.mStrategy = strategy;
    }

    @Override
    public void update(IUpdate actualizacion) {
        Actualizaciones.add(actualizacion);
        mStrategy.enviar(actualizacion);
    }
    
    public void showListComments(){
        facade.showListComments();
    }
    public void showRanking(){
        facade.showRanking();
    }
    public void showListGames(){
        facade.showListGames();
    }
    public void createGoodComment(){
        facade.createGoodComment();
    }
    public void createBadComment(){
        facade.createBadComment();
    }
    
}
