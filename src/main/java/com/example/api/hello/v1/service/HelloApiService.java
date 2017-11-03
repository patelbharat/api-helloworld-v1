package com.example.api.hello.v1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.hello.v1.HelloApi;
import com.example.api.hello.v1.model.Message;

@Service
public class HelloApiService implements HelloApi {

	@Autowired
	public HelloApiService() {

	}

	@Override
	public Message sayHello() {
		return new Message().msg("Hello World");
	}

}
