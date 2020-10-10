package cs5220.project.log;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import com.google.common.flogger.StackSize;

import cs5220.project.model.Employee;
import lombok.extern.flogger.Flogger;

@Flogger
public class FloggerTest {

	public static void main(String[] args) {

		String msg = "Test";
		Employee emp = Employee.builder().id(1).name("Jim").occupation("Doctor").occupation("Dentist").build();

		log.atInfo().log("Ths user is: %s", emp.toString());
		log.atInfo().log("Ths user is: %s" + emp);

		log.atSevere().withCause(new RuntimeException("Planned")).log("Error occurred");

		log.atInfo().log("My message Info: %s", msg);

		log.atInfo().every(10).log("This log shows every 10 iterations");

		try {
			int result = 45 / 0;
		} catch (RuntimeException re) {
			log.atInfo().withStackTrace(StackSize.FULL).withCause(re).log("Message");
		}

		log.atSevere().atMostEvery(30, TimeUnit.SECONDS).log(doExpensiveCalculation());
		log.atInfo().every(100).log("Info logs %s", "test");

	}

	public static String doExpensiveCalculation() {
		Random rand = new Random();

		int rand_int1 = rand.nextInt(10000);
		int rand_int2 = rand.nextInt(5000);
		String var = (rand_int1 * rand_int2) + "";
		return var;

	}

}
