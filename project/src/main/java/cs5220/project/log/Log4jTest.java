package cs5220.project.log;

import lombok.extern.log4j.Log4j;

@Log4j
public class Log4jTest {

	public static void main(String[] args) {

		log.trace("the built-in TRACE level");
		log.debug("the built-in DEBUG level");
		log.info("the built-in INFO level");
		log.warn("the built-in WARN level");
		log.error("the built-in ERROR level");
		log.fatal("the built-in FATAL level");
		log.error("Error occurred", new RuntimeException("Planned"));

		if (log.isDebugEnabled())
			log.debug("Usuario = " + " suma( )" + "variable2");

	}

}

