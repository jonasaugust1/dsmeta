package com.devsuperior.dsmeta;

import com.devsuperior.dsmeta.entities.Department;
import com.devsuperior.dsmeta.entities.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DsmetaApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(DsmetaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Department d1 = new Department(1L, "Vendas");
		System.out.println(d1);

		Employee e1 = new Employee(1L, "Maria", 6000.0, d1);
		System.out.println(e1);
	}

}
