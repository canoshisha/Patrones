
package patrones;


public class Game {
    private String nombre;
    private String empresa;
    private int numChampions;
    private boolean multiplayer;

    public Game(String nombre, String empresa, int numChampions, boolean multiplayer) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.numChampions = numChampions;
        this.multiplayer = multiplayer;
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

    public int getNumChampions() {
        return numChampions;
    }

    public void setNumChampions(int numChampions) {
        this.numChampions = numChampions;
    }

    public boolean isMultiplayer() {
        return multiplayer;
    }

    public void setMultiplayer(boolean multiplayer) {
        this.multiplayer = multiplayer;
    }

    @Override
    public String toString() {
        String s="Nombre del juego: "+getNombre();
        s+="Empresa del juego: "+getEmpresa();
        s+="Numero de personajes del juego: "+getNumChampions();
        s+="Multijugador del juego: "+isMultiplayer();
        return s;
    }
    
    
}
