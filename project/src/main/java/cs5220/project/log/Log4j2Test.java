package cs5220.project.log;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Log4j2Test {

	public static void main(String[] args) {

		log.error("Error occurred", new RuntimeException("Planned"));

		log.debug("the built-in DEBUG level");
		log.info("the built-in INFO level");
		log.warn("the built-in WARN level");
		log.error("the built-in ERROR level");
		log.fatal("the built-in FATAL level");

		log.traceEntry();
		try {
			String test = null;

			Integer test2 = (new Integer(test)).intValue();
		} catch (Exception e) {

			log.error(e.getMessage(), e);
		}
		log.traceExit();

	}

}
