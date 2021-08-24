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
public class Match {

    private String hTeam, aTeam;//Home and Away Team names
    private int hTeamWin = 0, aTeamWin = 0;//If away or home team is a winner
    private Set[] sets = new Set[5];//Array for Sets
    private int[] scoreSet = new int[30];//Array for score
    private String hPlayer1, hPlayer2, aPlayer1, aPlayer2;//Players of the home and away teams
    private boolean played;
    //Match constructor
    public Match(String hTeam, String aTeam) 
    {
        this.hTeam = hTeam;
        this.aTeam = aTeam;
        sets[0] = new Set();
        sets[1] = new Set();
        sets[2] = new Set();
        sets[3] = new Set();
        sets[4] = new DoubleSet();
        scoreSet[0] = 0;
        scoreSet[1] = 0;
    }
    public boolean isPlayed() 
    {
        return !(scoreSet[0] == 0 && scoreSet[1] == 0);
    }
    //Calculate the scores
    public void calculateScores() 
    {
        /** Updates player names before calculating scores for given sets **/
        sets[0].setHPlayer(hPlayer1);
        sets[0].setAPlayer(aPlayer1);

        sets[1].setHPlayer(hPlayer1);
        sets[1].setAPlayer(aPlayer2);

        sets[2].setHPlayer(hPlayer2);
        sets[2].setAPlayer(aPlayer1);

        sets[3].setHPlayer(hPlayer2);
        sets[3].setAPlayer(aPlayer2);

        sets[4].setHPlayer(null);
        sets[4].setAPlayer(null);

        for (int i = 0; i < sets.length; i++) 
        {
            Set set = sets[i];
            System.out.println(set.getHPlayer());
            System.out.println(set.getAPlayer());
            System.out.println(Integer.toString(set.calculateHomeWin()));
            if (set.getHWins() > set.getAWins()) {
                hTeamWin++;
            } else if (set.getAWins() > set.getHWins()) {
                aTeamWin++;
            }
        }
    }
    //If the Home Team Wins
    public boolean isHomeWin() 
    {
        return hTeamWin > aTeamWin;
    }
    /** Getters and Setters **/
    public int[] getScoreSet() {
        return scoreSet;
    }
    public void setScoreSet(int[] scoreSet) 
    {
        this.scoreSet = scoreSet;
    }
    public DoubleSet getDoubleSet() 
    {
        return (DoubleSet) sets[4];
    }
    //Return the name of the Home Team
    public String getHTeam() 
    {
        return hTeam;
    }
    //Set the Home Team
    public void setHTeam(String hTeam) 
    {
        this.hTeam = hTeam;
    }
    //Return a team name
    public String getATeam() 
    {
        return aTeam;
    }
    //Set a team 
    public void setATeam(String aTeam) 
    {
        this.aTeam = aTeam;
    }
    //Return if HomeTeam wins
    public int getHTeamWin() 
    {
        return hTeamWin;
    }
    //Set the home Team winner
    public void setHTeamWin(int hTeamWin) 
    {
        this.hTeamWin = hTeamWin;
    }
    //Return if Away Team wins
    public int getATeamWin() 
    {
        return aTeamWin;
    }
    //Set the Away Team winner
    public void setATeamWin(int aTeamWin) 
    {
        this.aTeamWin = aTeamWin;
    }
    //Return the array of Sets
    public Set[] getSets() 
    {
        return sets;
    }
    //Set the sets array
    public void setSets(Set[] sets) 
    {
        this.sets = sets;
    }
    //Return the name of player 1 for Home Team
    public String getHPlayer1() 
    {
        return hPlayer1;
    }
    //Set the name of the player 1 for Home Team
    public void setHPlayer1(String hPlayer1) 
    {
        this.hPlayer1 = hPlayer1;
    }
    //Return the name of player 2 for Home Team
    public String getHPlayer2() 
    {
        return hPlayer2;
    }
    //Set the name of the player 2 for Home Team
    public void setHPlayer2(String hPlayer2) 
    {
        this.hPlayer2 = hPlayer2;
    }
    //Return the name of player 1 for Away Team
    public String getAPlayer1() 
    {
        return aPlayer1;
    }
    //Set the name of the player 1 for Away Team
    public void setAPlayer1(String aPlayer1) 
    {
        this.aPlayer1 = aPlayer1;
    }
    //Return the name of player 2 for Away Team
    public String getAPlayer2() 
    {
        return aPlayer2;
    }
    //Set the name of the player 2 for Away Team
    public void setAPlayer2(String aPlayer2) 
    {
        this.aPlayer2 = aPlayer2;
    }
    @Override
    public String toString() 
    {
        return "Match:" + hTeam + " vs " + aTeam;
    }
}
