package com.example.planets.pluto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class PlutoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(PlutoApplication.class, args);
	}

}
