package cs5220.project.log;

@lombok.extern.jbosslog.JBossLog
public class JBossLog  {

	public static void main(String[] args) {
		
		log.error("Error occurred", new RuntimeException("Planned"));
		
		// log a message formatted using printf-style substitutions
		log.infof("My name is %s.", "David");
		
		// log a message formatted using MessageFormat-style substitutions
		log.errorv("The license for Solder is the {0}", "APL");
	}

}

