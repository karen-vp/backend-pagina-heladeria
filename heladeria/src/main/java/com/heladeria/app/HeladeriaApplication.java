package com.heladeria.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import com.heladeria.app.repository.RolRepository;
import com.heladeria.app.entity.Rol;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootApplication
public class HeladeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeladeriaApplication.class, args);
	
	}
	
	// @Bean
	  public CommandLineRunner demo(RolRepository repository) {
	    return (args) -> {

	      // fetch all customers
	      log.info("Rol encontrado con findAll():");
	      log.info("-------------------------------");
	      for (Rol rol : repository.findAll()) {
	        log.info(rol.toString());
	      }
	      log.info("");

	      // fetch an individual customer by ID
	      Rol rol = repository.findById(1);
	      log.info("Rol found with findById(1):");
	      log.info("--------------------------------");
	      log.info(rol.toString());
	      log.info("");

	    };
	  }
}


