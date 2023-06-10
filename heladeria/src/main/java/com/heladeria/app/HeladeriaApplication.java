package com.heladeria.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.heladeria.app.repository.ProductoRepository;
import com.heladeria.app.repository.RolRepository;
import com.heladeria.app.entity.Producto;
import com.heladeria.app.entity.Rol;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class HeladeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeladeriaApplication.class, args);
	
	}
	
	@Bean
	public CommandLineRunner demo(RolRepository repositoryRoles, ProductoRepository repositoryProductos) {
	    return (args) -> {

	      log.info("Rol encontrado con findAll():");
	      log.info("-------------------------------");
	      for (Rol rol : repositoryRoles.findAll()) {
	        log.info(rol.toString());
	      }
	      log.info("");
	      
	      Rol rol = repositoryRoles.findById(1);
	      log.info("Rol encontrado por findById(1):");
	      log.info("--------------------------------");
	      log.info(rol.toString());
	      log.info("");
	      
	      
	      Producto producto = repositoryProductos.findById(2);
	      log.info("Producto encontrado por findById(2):");
	      log.info("--------------------------------");
	      log.info(producto.toString());
	      log.info("");

	    };
	  }
}


