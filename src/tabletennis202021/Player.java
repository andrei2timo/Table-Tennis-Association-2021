/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletennis202021;

/**
 *
 * @author andrei_timo
 */
public class Player {

    private String pname;// assume players have unique names
    //Constructor for Player class
    public Player(String pname) 
    {
        this.pname = pname;
    }
    /** Getters and Setters **/ 
    public String getPlayerName() 
    {
        return pname;
    }
    public void setPlayerName(String pname) 
    {
        this.pname = pname;
    }
    @Override
    public String toString() 
    {
        return "Player{" + "pname=" + pname + '}';
    }

}
