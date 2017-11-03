package com.example.api.hello.v1;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.example.api.hello.v1.service.HelloApiService;

@Component
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(HelloApiService.class);
	}
}
