package com.example.Eje.sesion456;

import com.example.Eje.sesion456.entities.Laptop;
import com.example.Eje.sesion456.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class EjeSesion456Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EjeSesion456Application.class, args);

		LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);

		//Crear laps
		Laptop laptop = new Laptop(null, "Sony", "Vaio", LocalDate.of(2014,06,25), 17500.50, false);
		Laptop laptop1 = new Laptop(null, "HP", "E35", LocalDate.of(2018,04,01), 11300.50, true);

		//Guardar laps
		laptopRepository.save(laptop);
		laptopRepository.save(laptop1);

		//Recuperar laps
		System.out.println("Numero de laptop´s: " + laptopRepository.findAll().size());
	}

}
