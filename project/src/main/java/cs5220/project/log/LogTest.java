package cs5220.project.log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

import lombok.extern.java.Log;

@Log
public class LogTest {

	public static void main(String[] args) throws IOException {
		FileHandler fh;
		fh = new FileHandler("D:/MyLogFile.log");
		log.addHandler(fh);

		SimpleFormatter formatter = new SimpleFormatter();
		fh.setFormatter(formatter);

		log.setLevel(Level.ALL);
	
		log.log(Level.SEVERE, "Error occurred", new RuntimeException("Planned"));
		log.log(Level.INFO, "Test");

		log.severe("Info Log");
		log.warning("Info Log");
		log.info("Info Log");
		log.finest("Really not important");

	}
}
