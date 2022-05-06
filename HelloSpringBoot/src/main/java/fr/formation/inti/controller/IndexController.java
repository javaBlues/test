package fr.formation.inti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.formation.inti.entity.Person;

@Controller
public class IndexController {
	
	@RequestMapping(value= {"/" , "index"}, method=RequestMethod.GET)
	public String index(Model model,@ModelAttribute("person")Person person) {
		
		model.addAttribute("message", "HelloSpringBT");
		return"index";
	}

	@RequestMapping(value= {"/hello"}, method=RequestMethod.POST)
	public String hello(@ModelAttribute("person") Person person,BindingResult result,Model model) {
		
		model.addAttribute("message","Hello "+person.getPrenom()+" "+person.getNom());
		return"index";
	}
	
//	@RequestMapping(value= {"/hello"}, method=RequestMethod.POST)
//	public String hello(@RequestParam(name="prenom") String name,Model model) {
//		
//		model.addAttribute("message","Hello "+name);
//		return"index";
//	}
	
	
	
//	@RequestMapping(value= {"/hello"}, method=RequestMethod.GET)
//	public String hello(Model model) {
//		
//	
//		model.addAttribute("Exemple",new Exemple());
//		return"Exemple";
//	}
}
