/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletennis202021;

import java.util.*;

/**
 *
 * @author andrei_timo
 */
public class Fixtures {

    public ArrayList<Match> matches = new ArrayList();//Matches array
    private ArrayList<Team> temp = new ArrayList();//Team array
    //constructor for Fixtures class
    public Fixtures() 
    {

    }

    //Generate a fixture
    public void generateFixtures(RegistrationManager reg) 
    {
        temp = reg.getAllTeams();
        matches.clear();
        for (int i = 0; i < temp.size(); i++) 
        {
            for (int j = 0; j < temp.size(); j++) 
            {
                Match match = new Match(temp.get(i).getName(),temp.get(j).getName());
                matches.add(match);
            }      
        }
        for (Match m : matches) 
        {
          System.out.println(m.getHTeam() + " v " + m.getATeam());
        }
    }
    //Get a Match in the views
    public Match getAMatch(String hteam, String ateam) 
    {
        for (Match m : matches) 
        {
            if (m.getHTeam().equals(hteam) && m.getATeam().equals(ateam)) 
            {
                return m;
            }
        }
        return null;
    }
    //Return a Match
    public ArrayList<Match> getMatches() 
    {
        return matches;
    }
    //Set the match array
    public void setMatches(ArrayList<Match> matches) 
    {
        this.matches = matches;
    }
    //Get a Team
    public ArrayList<Team> getTempTeam() 
    {
        return temp;
    }
    //Set a team
    public void setTempTeam(ArrayList<Team> tempteam) {
        this.temp = tempteam;
    }
}
