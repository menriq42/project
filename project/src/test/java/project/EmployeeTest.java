package project;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.util.Arrays;

import org.junit.Test;

import cs5220.project.model.Employee;

public class EmployeeTest {

	private static Employee emp1 = Employee.builder()
			.id(1)
			.occupations(Arrays.asList("Doctor","Dentist"))
			.name("JHON").build();
	
	private static Employee emp2 = Employee.builder()
			.id(1)
			.name("JHON").build();
	
	private static Employee emp3 = Employee.builder()
			.id(1)
			.name("JHON").build();
	
	@Test
	public void testCopy() throws Exception {
		//Employee emp3_copy = emp3.toBuilder().build();
		//assertEquals(emp3, emp3_copy);
		/*
		 * System.out.println(emp1); System.out.println(emp3_copy);
		 */
	}
	
	@Test
	public void testName() throws Exception {
		assertEquals(emp1.getName(), "JHON");
	}
	
	@Test
	public void testNotEquals() throws Exception {
		//Test without EqualsAndHashCode
		
	}	
	
	@Test
	public void testSame() throws Exception {
		//Test Same Object 
		//emp2 = emp1;
		assertSame(emp1, emp2);

	}	
	
	
}
