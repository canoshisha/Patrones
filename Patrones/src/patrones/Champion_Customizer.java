
package patrones;


public class Champion_Customizer {

    public Champion_Customizer() {
    }
    
    public Champion createChampion(int code,String alias,String skin, String special_move){
        Champion basic_champion=null;
        //Creación de support
        switch (code) {
            case 1:
                basic_champion = new Support(alias,skin, special_move);
                break;
            case 2:
                basic_champion = new Protector(alias,skin, special_move);
                break;
            case 3:
                basic_champion = new Entry(alias,skin, special_move);
                break;
            case 4:
                basic_champion = new Controller(alias, skin, special_move);
                break;
            default:
                break;
        }
        return basic_champion;
    }
}
