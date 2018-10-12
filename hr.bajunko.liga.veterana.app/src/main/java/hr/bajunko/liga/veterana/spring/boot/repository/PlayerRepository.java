package hr.bajunko.liga.veterana.spring.boot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hr.bajunko.liga.veterana.spring.boot.model.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
	
	List<Player> findByTeamId(long teamId);

}
