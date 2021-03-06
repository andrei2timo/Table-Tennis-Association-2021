package tabletennis202021;

import java.util.ArrayList;
/**
 *
 * @author andrei_timo
 */
public class RegistrationManager 
{

    private ArrayList<Team> teams = new ArrayList<>();
    private ArrayList<Player> players = new ArrayList<>();
    //Constructor of RegistragionManager class
    public RegistrationManager() 
    {

    }
    //Create and Add a team
    public void createAndAddTeam(String tname) 
    {
        if (tname.equals("")) 
        {
            System.out.println("Team name can't be emtpy");
        } 
        else 
        {
            Team t = new Team(tname);
            teams.add(t);
            System.out.println("Team " + tname + " created");
        }
    }
    //Create and Add a Player to the team
    public void createAndAttachPlayer(String tname, String pname) 
    {
        Player p = new Player(pname);
        for (Team t : teams) 
        {
            if (t.getName().equals(tname)) 
            {
                t.addTeamMember(p);
                System.out.println("Player " + pname + " added to " + tname);
                break;
            }
        }
        players.add(p);
    }
    /**
     * Getters and Setters *
     */
    public ArrayList<String> returnMembers(String tname) 
    {
        Team t = new Team(tname);
        return t.listMembers();
    }
    public Team getTeam(String tname) 
    {
        for (Team t : teams) 
        {
            if (t.getName().equals(tname)) 
            {
                return t;
            }
        }
        return null;
    }
    public ArrayList<Team> getAllTeams() 
    {
        return teams;
    }
    public void setTeams(ArrayList<Team> teams) 
    {
        this.teams = teams;
    }
    public ArrayList<Player> getAllPlayers() 
    {
        return players;
    }
    public void setPlayers(ArrayList<Player> players) 
    {
        this.players = players;
    }
}
