/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import java.util.*;
public class InterfaceServerPlayer {
    private Platform platform;
    
    public void showListComments(){
        System.out.println(platform.comments());
    }
    public void showRanking(){
        System.out.println(platform.playerList());
    }
    public void showListGames(){
        System.out.println(platform.GameList());
    }
    public void createGoodComment(){
        String comment = "La plataforma es increíble";
        platform.getForum().addGoodComment(comment);
    }
    public void createBadComment(){
        String comment = "La plataforma es muy lenta";
        platform.getForum().addBadComment(comment);
    }
    
    
}
