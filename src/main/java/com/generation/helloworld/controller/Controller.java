package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class Controller {

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Proatividade\n"
				+ "Persistência\n"
				+ "Comunicação\n"
				+ "Trabalho em Equipe\n"
				+ "Respeito\n"
				+ "Gestão de Tempo\n"
				+ "Responsabilidade Pessoal\n"
				+ "Orientação ao Futuro";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {		
		return null;
	}
}
