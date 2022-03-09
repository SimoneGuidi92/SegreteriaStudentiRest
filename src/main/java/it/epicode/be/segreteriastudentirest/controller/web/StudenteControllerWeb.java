package it.epicode.be.segreteriastudentirest.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import it.epicode.be.segreteriastudentirest.service.StudenteService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/web")
public class StudenteControllerWeb {

	@Autowired
	StudenteService studenteService;
	
	@GetMapping("/mostraelenco")
	public ModelAndView findAllStudenti() {
		log.info("*** findAllStudenti ***");
		ModelAndView view = new ModelAndView("visualizzaStudenti"); // all'interno delle parentesi facciamo riferimento al file html dedicato
		view.addObject("pippo", studenteService.findAll());
		return view;
	}
	
}
