package hr.bajunko.liga.veterana.spring.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Player {
	
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "player_Sequence")
	    @SequenceGenerator(name = "player_Sequence", sequenceName = "PLAYER_SEQ")
	    private Long id;
	    @Column(name = "name")
	    private String name;
	    @Column(name = "number")
	    private int number;
	    @Column(name = "position")
	    private String position;
	    @ManyToOne(fetch = FetchType.LAZY)
	        @JoinColumn(name = "team_id", nullable = false)
	        private Team team;
	    public Player() {
	    }
	        // getters/setters
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public String getPosition() {
			return position;
		}
		public void setPosition(String position) {
			this.position = position;
		}
		public Team getTeam() {
			return team;
		}
		public void setTeam(Team team) {
			this.team = team;
		}
		

}
