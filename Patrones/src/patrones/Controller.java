
package patrones;


public class Controller extends Champion{
    
      public String special_move;
            
    public Controller(String alias,String skin,String special_move){
        setAlias(alias);
        setAttack(120);
        setDefense(130);
        setHealth(150);
        setSkin(skin);
        setSpecial_move(special_move);
    }

    public String getSpecial_move() {
        return ""+getAlias()+" ha usado su habilidad "+ special_move;
    }

    public void setSpecial_move(String special_move) {
        if(special_move.equalsIgnoreCase("smoke bomb") || special_move.equalsIgnoreCase("stealth") ||special_move.equalsIgnoreCase("invisibility") ){
        this.special_move=special_move;
    }else{
            System.out.println("No se ha seleccionado una habilidad compatible con este campeón, por defecto será smoke bomb");
            this.special_move="smoke bomb";
        }
    }
    
}
