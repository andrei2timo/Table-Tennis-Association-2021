/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletennis202021;

import java.util.Comparator;
/**
 *
 * @author andrei_timo
 */
public class StatsComparator implements Comparator<TeamStats> 
{
    @Override
    public int compare(TeamStats o1, TeamStats o2) 
    {
        return o2.getMatchesWon() - o1.getMatchesWon();
    }
}
