package com.pra.boot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.pra.boot.springboot.service.CarService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		CarService service =  ctx.getBean(CarService.class);
		service.createNewCar(10L, "abc", "lmn");
	}
}
