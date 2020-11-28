package com.menino.sav;

import com.menino.sav.service.implementation.ScoreServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SavApplication {

	public static void main(String[] args) {
		SpringApplication.run(SavApplication.class, args);
	}

}
