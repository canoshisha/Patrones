
package patrones;
import java.util.*;

public class Game implements IGame{
    private String nombre;
    private String empresa;
    private boolean multiplayer;
    private Champion_Customizer champion;
    private List<Champion> champions;

    public Game(String nombre, String empresa, boolean multiplayer) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.multiplayer = multiplayer;
    }

    public Game(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }


    public boolean isMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(boolean multiplayer) {
        this.multiplayer = multiplayer;
    }

    public void newChampion(int code,String alias,String skin, String special_move){
        Champion newChampion = champion.createChampion( code, alias, skin, special_move);
        champions.add(newChampion);
    }

    public List<Champion> getChampions() {
        return champions;
    }
    
    @Override
    public String toString() {
        String s="Nombre del juego: "+getNombre();
        s+="Empresa del juego: "+getEmpresa();
        s+="Numero de personajes del juego: "+getChampions().size();
        s+="Multijugador del juego: "+isMultiplayer();
        return s;
    }
    
    
}
