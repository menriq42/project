package cs5220.project;

import java.io.IOException;

import lombok.extern.log4j.Log4j;

@Log4j
public class Project {
	
	public static void main(String[] args) throws IOException {
		Project obj = new Project();
		try {
			obj.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void execute() throws Exception{		
		log.debug("Testing");
	}
	
	
}
