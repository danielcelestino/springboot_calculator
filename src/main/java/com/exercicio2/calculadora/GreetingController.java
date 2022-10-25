package com.exercicio2.calculadora;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	private static final String teste = "Hello, %s!";
	
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
	private Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(teste, name));
	}

}
