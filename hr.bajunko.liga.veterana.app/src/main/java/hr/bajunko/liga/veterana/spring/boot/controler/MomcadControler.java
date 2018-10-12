package hr.bajunko.liga.veterana.spring.boot.controler;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hr.bajunko.liga.veterana.spring.boot.service.MomcadService;

@Controller
public class MomcadControler {
	
	@Autowired
	MomcadService momcadService;
	
	@RequestMapping("/momcad")
	public String momcad(Map<String, Object> model) {
		
		
		 List<String> momcad = momcadService.getAllTeamPlayers(1);
		 System.out.println("Igraci Barcelone su: " + momcad);
		 
		 model.put("momcad", momcad);
		 
		 return "momcad";
		
	}
	

}
