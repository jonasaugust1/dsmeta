package com.devsuperior.dsmeta;

import com.devsuperior.dsmeta.entities.Employee;
import com.devsuperior.dsmeta.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class DsmetaApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(DsmetaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		List<Employee> result = repository.findAll();
//
//		for(Employee emp: result){
//			System.out.println(emp);
//		}
	}

}
