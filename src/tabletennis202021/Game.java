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
public class Game 
{
    private int homePts, awayPts;
    //Constructor for Game
    public Game() 
    {
        homePts = 0;
        awayPts = 0;
    }
    //The Game scor for home and away team
    public void enterGameScore(int hpoint, int apoint) 
    {
        this.homePts = hpoint;
        this.awayPts = apoint;
    }
    //Is the home team a winner?
    public boolean isHomeWin() 
    {
        return homePts > awayPts;
    }
    //Get the Home team points
    public int getHPoints() 
    {
        return homePts;
    }
    //Set the Home team points
    public void setHPoints(int hpoint) 
    {
        this.homePts = hpoint;
    }
    //Get the Away Team Points
    public int getAPoints() 
    {
        return awayPts;
    }
    //Set the Away Team points
    public void setAPoints(int apoint) 
    {
        this.awayPts = apoint;
    }
    @Override
    public String toString() 
    {
        return homePts + ":" + awayPts;
    }
}
