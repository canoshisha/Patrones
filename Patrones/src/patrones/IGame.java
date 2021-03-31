package patrones;

public interface IGame {

    public String getNombre();

    public String getEmpresa();

    public int getNumChampions();

    public boolean isMultiplayer();

    public void setNombre(String nombre);

    public void setEmpresa(String empresa);

    public void setNumChampions(int numChampions);

    public void setMultiplayer(boolean multiplayer);

    @Override
    public String toString();
}
