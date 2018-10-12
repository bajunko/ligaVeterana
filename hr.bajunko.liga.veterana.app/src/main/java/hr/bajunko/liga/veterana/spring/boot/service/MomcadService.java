package hr.bajunko.liga.veterana.spring.boot.service;

import java.util.List;

public interface MomcadService {

	public List<String> getAllTeamPlayers(long teamId);
    public void addBarcelonaPlayer(String name, String position, int number);
    
}
