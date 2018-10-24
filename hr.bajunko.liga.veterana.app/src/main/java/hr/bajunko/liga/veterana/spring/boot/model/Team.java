package hr.bajunko.liga.veterana.spring.boot.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Team {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "team_Sequence")
	    @SequenceGenerator(name = "team_Sequence", sequenceName = "TEAM_SEQ")
	    private Long id;
	    @Column(name = "name")
	    private String name;
	    @Column(name = "ukupno")
	    private Integer ukupno;
	    @Column(name = "pobjeda")
	    private Integer pobjeda;
	    @Column(name = "nerijeseno")
	    private Integer nerijeseno;
	    @Column(name = "poraz")
	    private Integer poraz;
	    @Column(name = "postignutiGolovi")
	    private Integer postignutiGolovi;
	    @Column(name = "primljeniGolovi")
	    private Integer primljeniGolovi;
	    @Column(name = "golRazlika")
	    private Integer golaRazlika;
	    @Column(name = "bodovi")
	    private Integer bodovi;
	    
	    @OneToMany(cascade = CascadeType.ALL,
	            fetch = FetchType.EAGER,
	            mappedBy = "team")
	    
	    private List<Player> players;
	    
	    
	    public Team() {
	    }
	        // getters/setters	


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public List<Player> getPlayers() {
			return players;
		}


		public void setPlayers(List<Player> players) {
			this.players = players;
		}


		public Integer getUkupno() {
			return ukupno;
		}


		public void setUkupno(Integer ukupno) {
			this.ukupno = ukupno;
		}


		public Integer getPobjeda() {
			return pobjeda;
		}


		public void setPobjeda(Integer pobjeda) {
			this.pobjeda = pobjeda;
		}


		public Integer getNerijeseno() {
			return nerijeseno;
		}


		public void setNerijeseno(Integer nerijeseno) {
			this.nerijeseno = nerijeseno;
		}


		public Integer getPoraz() {
			return poraz;
		}


		public void setPoraz(Integer poraz) {
			this.poraz = poraz;
		}


		public Integer getPostignutiGolovi() {
			return postignutiGolovi;
		}


		public void setPostignutiGolovi(Integer postignutiGolovi) {
			this.postignutiGolovi = postignutiGolovi;
		}


		public Integer getPrimljeniGolovi() {
			return primljeniGolovi;
		}


		public void setPrimljeniGolovi(Integer primljeniGolovi) {
			this.primljeniGolovi = primljeniGolovi;
		}


		public Integer getGolaRazlika() {
			return golaRazlika;
		}


		public void setGolaRazlika(Integer golaRazlika) {
			this.golaRazlika = golaRazlika;
		}


		public Integer getBodovi() {
			return bodovi;
		}


		public void setBodovi(Integer bodovi) {
			this.bodovi = bodovi;
		}



}
