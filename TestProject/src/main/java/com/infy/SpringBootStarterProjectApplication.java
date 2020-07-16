package com.infy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.infy.model.Employee;


@SpringBootApplication
public class SpringBootStarterProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringBootStarterProjectApplication.class, args);
		Employee e= new Employee();
		e=(Employee) ctx.getBean(Employee.class);
		e.setEid(123);
		e.setEname("Rahul");
		e.setEprofile("Engineer");
		e.setSalary(30000);
		e.lap.setSystemId(11);
		e.lap.setSystemName("Infy System");
		e.print();
		
	}

}
