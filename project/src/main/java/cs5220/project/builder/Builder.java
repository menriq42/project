package cs5220.project.builder;

import java.util.Arrays;

import cs5220.project.model.Employee;
import lombok.extern.log4j.Log4j;

@Log4j
public class Builder {

	public static void main(String[] args) {
		
		//Employee emp0 = new Employee();
		
		
		Employee emp = Employee.builder()
				.id(1)
				.name("Jim")				
				.occupation("Doctor")
				.occupation("Dentist")
				.build();
		
		Employee emp2 = Employee.builder()
				.id(2)
				.name("Peter")
				.occupations(Arrays.asList("Developer","Driver"))
				.supervisor(emp)
				.build();
		
		log.info(emp);
		log.info(emp2.toString());

	}

}
