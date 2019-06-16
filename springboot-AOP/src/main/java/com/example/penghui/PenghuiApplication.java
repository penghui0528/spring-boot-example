package com.example.penghui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("aspect.*")
public class PenghuiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PenghuiApplication.class, args);
	}

}
