package com.example.api.hello.v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.example.api.hello.v1.client.HelloClientConfiguration;

@SpringBootApplication
@ComponentScan({ "com.example.api.hello.v1" })
@Import(value = { HelloClientConfiguration.class })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
