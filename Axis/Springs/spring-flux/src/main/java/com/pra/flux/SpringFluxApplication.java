package com.pra.flux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.pra.flux.demo.ReactiveComponents;

@SpringBootApplication
public class SpringFluxApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringFluxApplication.class, args);

		ReactiveComponents cp =  ctx.getBean(ReactiveComponents.class);
		cp.monoFluxDemo1();
	}


}
