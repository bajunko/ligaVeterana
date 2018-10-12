package hr.bajunko.liga.veterana.spring.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.bajunko.liga.veterana.spring.boot.model.Player;
import hr.bajunko.liga.veterana.spring.boot.repository.PlayerRepository;

@Service
public class MamcadServiceImpl implements MomcadService{
	
	  @Autowired
	  private PlayerRepository playerRepository;
	  
	

	 @Override
	  public List<String> getAllTeamPlayers(long teamId) {
		
		 List<String> result = new ArrayList<String>();
	        List<Player> players = playerRepository.findByTeamId(teamId);
	        
	        for (Player player : players) {
	            result.add(player.getName());
	        }
	        return result;
		
		
	}

	public void addBarcelonaPlayer(String name, String position, int number) {
		// TODO Auto-generated method stub
		
	}

}
