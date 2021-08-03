package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JobPortalApplication {

	@Autowired
	EmployeeRepository erepo;
	
	public static void main(String[] args) {
		SpringApplication.run(JobPortalApplication.class, args);
	}

	@Bean
	CommandLineRunner runner()  {
			return args->{
			
				Employee e1 = new Employee("wai","ADMIN");
				Employee e2 = new Employee("esther","ADMIN");
				Employee e3 = new Employee("SZ","STUDENT");
				
				erepo.save(e1);
				erepo.save(e2);
				erepo.save(e3);
			};
	}
}
