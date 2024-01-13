package com.myblog8;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EntityScan(basePackages = "com.myblog8.entity")
public class MyblogApplication {


	public static void main(String[] args) {
		SpringApplication.run(MyblogApplication.class, args);
	}

		@Bean
		public ModelMapper modelMapper() {
			return new ModelMapper();

	}

}
