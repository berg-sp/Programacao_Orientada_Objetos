package com.elevaaoquadrado.elevaaoquadrado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/numeros")
public class ElevaAoQuadradoApplication {
	private double quadrado
	@GetMapping("/{numero}")
	public String elevaAoQuadrado(@PathVariable String numero){
		double quadrado;
		quadrado = numero * numero;
		return quadrado;
	}

	public static void main(String[] args) {
		SpringApplication.run(ElevaAoQuadradoApplication.class, args);
	}

}
