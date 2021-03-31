
package patrones;


public class Support extends Champion{

public String special_move;
            
    public Support(String alias,String skin,String special_move){
        setAlias(alias);
        setAttack(95);
        setDefense(100);
        setHealth(150);
        setSkin(skin);
        setSpecial_move(special_move);
    }

    public String getSpecial_move() {
        return ""+getAlias()+" ha usado su habilidad "+ special_move;
    }

    public void setSpecial_move(String special_move) {
        if(special_move.equalsIgnoreCase("medical kit") || special_move.equalsIgnoreCase("bandages") ||special_move.equalsIgnoreCase("curative potion") ){
        this.special_move=special_move;
    }else{
            System.out.println("No se ha seleccionado una habilidad compatible con este campeón, por defecto será medical kit");
            this.special_move="medical kit";
        }
    }


    
}
