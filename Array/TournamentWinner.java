/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author sreek
 */
public class TournamentWinner {
    
    public static void main(String args[]){
        
         ArrayList<ArrayList<String>> competitions = new ArrayList<>();
         ArrayList<String> team = new ArrayList<>() ;
         team.add("HTML");
         team.add("C++");
         competitions.add(team);
         team = new ArrayList<>() ;
         team.add("C++");
         team.add("Phython");
         competitions.add(team);
         team = new ArrayList<>() ;
         team.add("Phython");
         team.add("HTML");
         competitions.add(team);
         ArrayList<Integer> results = new ArrayList<>() ;
          results.add(1);
         results.add(1);
          results.add(1);
          tournamentWinner(competitions,results);
    }
    
      public static String tournamentWinner(
              
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    // Write your code here.
    String bestTeam = "";
		Map<String,Integer> map = new HashMap<>();
		
		for(int i=0;i<competitions.size();i++){
				List<String> team = competitions.get(i);
				if(results.get(i)==0){
					if(map.containsKey(team.get(0))){
							map.put(team.get(0),map.get(team.get(0))+0);
					}else{
							map.put(team.get(0),0);
					}	
					if(map.containsKey(team.get(1))){
							map.put(team.get(1),map.get(team.get(0))+3);
					}else{
							map.put(team.get(1),3);
					}
                                        
                                        if(bestTeam.length()>0){
                                             if(map.get(bestTeam) < map.get( team.get(1))){
                                                bestTeam =  team.get(1);
                                            }else{

                                            }
                                        }else{
                                            bestTeam = team.get(1);
                                        }
                                       
				}else{
					if(map.containsKey(team.get(0))){
							map.put(team.get(0),map.get(team.get(0))+3);
					}else{
							map.put(team.get(0),3);
					}	
					if(map.containsKey(team.get(1))){
							map.put(team.get(1),map.get(team.get(1))+0);
					}else{
							map.put(team.get(1),0);
					}
                                        
                                        if(bestTeam.length()>0){
                                             if(map.get(bestTeam) < map.get( team.get(0))){
                                                bestTeam =  team.get(0);
                                            }else{

                                            }
                                        }else{
                                            bestTeam = team.get(0);
                                        }
				}
		}
		
		System.out.println(map);
                System.out.println(bestTeam);
		
    return bestTeam;
  }
    
}
