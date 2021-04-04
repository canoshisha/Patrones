/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import java.util.*;
public class ComparadorPlayer implements Comparator<Player>{

    @Override
    public int compare(Player p1, Player p2) {
        int cmp;
        if(p1.getHorasJugadas() < p2.getHorasJugadas()){
            cmp = -1;
        }else if(p1.getHorasJugadas() > p2.getHorasJugadas()){
            cmp = 1;
        }else{
            cmp = 0;
        }
        
        return cmp;
    }
    
}
