package it.epicode.be.segreteriastudentirest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class VersionController {

	@GetMapping("/version")
	public String getVersion() {
		return "version: 2.0";
	}
	
}
