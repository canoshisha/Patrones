package patrones;

import java.util.List;

public interface IGame {

    public String getNombre();

    public String getEmpresa();

    public boolean isMultiplayer();

    public void setNombre(String nombre);

    public void setEmpresa(String empresa);

    public void setMultiplayer(boolean multiplayer);
    
    public void newChampion(int code,String alias,String skin, String special_move);

    public List<Champion> getChampions();

    @Override
    public String toString();
}
