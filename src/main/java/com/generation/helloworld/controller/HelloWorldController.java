package com.generation.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/site")
public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/bsm")
	public List<String> bsm() {
    	List<String> bsmGeneration = new ArrayList<>();
    	bsmGeneration.add("PERSISTÊNCIA");
    	bsmGeneration.add("TRABALHO EM EQUIPE");
    	bsmGeneration.add("ORIENTAÇÃO AOS DETALHES");
    	bsmGeneration.add("MENTALIDADE DE CRESCIMENTO");
    	bsmGeneration.add("PROATIVIDADE");
    	bsmGeneration.add("COMUNICAÇÃO");
    	bsmGeneration.add("RESPONSABILIDADE PESSOAL");
    	bsmGeneration.add("ORIENTAÇÃO AO FUTURO");
    
    	
    	return bsmGeneration;
	}
	
	@GetMapping("/objetivos")
	public List<String> objetivosSemana() {
    	List<String> objetivosSemanais = new ArrayList<>();
    	objetivosSemanais.add("Aprender mais sobre o MySql");
    	objetivosSemanais.add("Treinar mais a logica do Java");
    	objetivosSemanais.add("Definir um pitch");
    	objetivosSemanais.add("Treinar Spring Boot ");
    	objetivosSemanais.add("Aprender mais sobre os metodos");
    	
        return objetivosSemanais;
    }
	
}