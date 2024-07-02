package com.generation.helloworld.controller;

import java.util.Arrays;
import java.util.List;
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
	public List<String> objetivos() {		
		return Arrays.asList(
				"Aprender Java",
				"Aprender Spring Boot",
				"Aprender mais sobre API",
				"Criar um Projeto ponta a ponta",
				"Ficar Fluente em Inglês",
				"Conseguir produzir uma música própria",
				"Criar um Projeto com meus amigos",
				"Tirar minha CNH",
				"Me Formar na Faculdade",
				"Conseguir um Emprego"
				);
	}
}
