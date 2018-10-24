package hr.bajunko.liga.veterana.spring.boot.controler.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hr.bajunko.liga.veterana.spring.boot.model.Team;
import hr.bajunko.liga.veterana.spring.boot.repository.TeamRepository;

@RestController
public class TeamController {
	
	@Autowired
	TeamRepository teamRepository;
	
	@RequestMapping("/")
	public String healthCheck()	{
		return "REST radi ok";
	}
	
	@GetMapping("/teams")
	public List<Team> allTeams(){
		return (List<Team>) teamRepository.findAll();
	}
	
	//Exposanje pojednigog tima po nekom kriteriju
	@GetMapping("/teamsid/{id}")
	public Team teamById(@PathVariable long id){
		
		Team team = teamRepository.findOne(id);
		
		return team;
	}
	
	//Exposanje pojednigog tima po nekom imenu gdje su koristili notaciju @Query
	@GetMapping("/teams/{name}")
	public Team teamByName(@PathVariable String name){
		
		List<Team> findByName = teamRepository.findByName(name);
		
		return findByName.get(0);
	}
	
	
	
	

}
