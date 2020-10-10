package cs5220.project.log;

import java.io.IOException;

import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
public class CommonLogTest {

	public static void main(String[] args)  throws IOException{
			
		log.info("======= Test Common Log ========");
		
		log.error("Error occurred", new RuntimeException("Planned"));
		   
		//Fatal Error 
		try {
			String test = null;
			int x = 0 / (new Integer(test)).intValue();
		} catch (Exception e) {
			log.fatal("Severe =>" + e);
		}
		
		//Warn Error 
		try {				
			String test = null;
			test.toString();
		} catch (Exception e) {
			log.warn("Warn =>" + e);
		}
		
		log.trace("Calling trace method.");
	}
}
