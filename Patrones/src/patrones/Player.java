
package patrones;


public class Player extends Persona{
    String nick,hastag;

    public Player(String nombre, String apellido1, String apellido2, String correo, int telefono) {//constructor solo persona
        super(nombre, apellido1, apellido2, correo, telefono);
    }

    public Player(String nick, String hastag, String nombre, String apellido1, String apellido2, String correo, int telefono) {//Constructor Gamer completo
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
}
