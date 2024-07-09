package com.crud.restapi.s;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application //implements CommandLineRunner    
{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	adding field from here
	
//	@Autowired
//	private EmployeeRepo emprepo;
//
//	public void run(String... args) throws Exception {
//
////		Employee emp = new Employee();
////		emp.setName("vaibhav");
////		emp.setEmail("vaibhavbhatkare@gmail.com");
////		emprepo.save(emp);
////		
////		Employee emp2 = new Employee();
////		emp2.setName("yash");
////		emp2.setEmail("yashladekar2@gmail.com");
////		emprepo.save(emp2);
//		 
//	}
}
