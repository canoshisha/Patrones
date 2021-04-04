
package patrones;


public class Champion {
    
    public int health,attack,defense;
    public String skin,alias, special_move;

    public String getSpecial_move() {
        return special_move;
    }

    public void setSpecial_move(String special_move) {
        this.special_move = special_move;
    }
    
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "Champion{" + "health=" + health + ", attack=" + attack + ", defense=" + defense + ", skin=" + skin + ", alias=" + alias + ", special_move=" + special_move + '}';
    }

    
    
    
    
    
}
