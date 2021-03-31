
package patrones;


public class Player extends Persona{
    String nick,hastag;

    public Player(String nombre, String apellido1, String apellido2, String correo, int telefono, String nick, String hastag) {//constructor solo persona
        super(nombre, apellido1, apellido2, correo, telefono);
        this.nick = nick;
        this.hastag = hastag;
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

   
    
}
