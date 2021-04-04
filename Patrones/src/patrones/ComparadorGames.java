/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import java.util.*;
public class ComparadorGames implements Comparator<Game>{

    @Override
    public int compare(Game g1, Game g2) {
        int cmp = g1.getNombre().compareToIgnoreCase(g2.getNombre());
        if(cmp == 0){
            cmp = g1.getEmpresa().compareToIgnoreCase(g2.getEmpresa());
            
            if(cmp == 0){
                if(g1.getChampions().size() > g2.getChampions().size()){
                    cmp = 1;
                }else if(g1.getChampions().size() < g2.getChampions().size()){
                    cmp = -1;
                }else{
                    cmp = 0;
                }
            }
        }
        return cmp;
    }
    
}
