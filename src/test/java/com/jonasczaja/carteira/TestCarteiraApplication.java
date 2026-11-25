package com.jonasczaja.carteira;

import org.springframework.boot.SpringApplication;

public class TestCarteiraApplication {

	public static void main(String[] args) {
		SpringApplication.from(CarteiraApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
