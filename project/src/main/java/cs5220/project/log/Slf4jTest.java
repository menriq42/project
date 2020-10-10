package cs5220.project.log;

import lombok.extern.slf4j.Slf4j;

@Slf4j(topic = "integration")
public class Slf4jTest {

	public static void main(String[] args) {

		log.info("Slf4j Test");
		log.debug("log {} {} {}", 1, 2, 3);
		log.trace("test");
		log.error("Error", new RuntimeException());

	}

}
