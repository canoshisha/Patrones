
package patrones;


public class Protector extends Champion {
    
            
    public Protector(String alias,String skin,String special_move){
        setAlias(alias);
        setAttack(80);
        setDefense(180);
        setHealth(200);
        setSkin(skin);
        setSpecial_move(special_move);
    }

    public String getSpecial_move() {
        return ""+getAlias()+" ha usado su habilidad "+ special_move;
    }

    public void setSpecial_move(String special_move) {
        if(special_move.equalsIgnoreCase("shield") || special_move.equalsIgnoreCase("blockage") ||special_move.equalsIgnoreCase("freezer bomb") ){
        this.special_move=special_move;
    }else{
            System.out.println("No se ha seleccionado una habilidad compatible con este campeón, por defecto será shield");
            this.special_move="shield";
        }
    }
    
}
