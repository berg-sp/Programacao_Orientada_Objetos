package com.programando.verificaUsuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/logins")
public class VerificaUsuarioApplication {
	@GetMapping("/{login}")
	public String verificaUsuario(@PathVariable String login){
		return login;

	}

	public static void main(String[] args) {
		SpringApplication.run(VerificaUsuarioApplication.class, args);
	}

}
