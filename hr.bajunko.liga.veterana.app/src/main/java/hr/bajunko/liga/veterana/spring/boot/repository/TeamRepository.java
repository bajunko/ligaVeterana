package hr.bajunko.liga.veterana.spring.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hr.bajunko.liga.veterana.spring.boot.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long>{
	
	List<Team> findByName(String name);
		
		
}
