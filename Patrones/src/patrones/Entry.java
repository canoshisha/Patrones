
package patrones;


public class Entry extends Champion {
    
            
    public Entry(String alias,String skin,String special_move){
        setAlias(alias);
        setAttack(180);
        setDefense(90);
        setHealth(120);
        setSkin(skin);
        setSpecial_move(special_move);
    }

    public String getSpecial_move() {
        return ""+getAlias()+" ha usado su habilidad "+ special_move;
    }

    public void setSpecial_move(String special_move) {
        if(special_move.equalsIgnoreCase("flash") || special_move.equalsIgnoreCase("stun") ||special_move.equalsIgnoreCase("dash") ){
        this.special_move=special_move;
    }else{
            System.out.println("No se ha seleccionado una habilidad compatible con este campeón, por defecto será flash");
            this.special_move="flash";
        }
    }
    
    
    
}
