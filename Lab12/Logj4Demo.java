package LabBook12;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

//import com.sun.istack.internal.logging.Logger;

public class Logj4Demo {

	static Logger log = Logger.getLogger("Logj4Demo");
	//create a logger for Log4jDemo class 
	 
	public static void main(String args[]) { 
	 
	PropertyConfigurator.configure("logger.properties");
	log.error("This is an Error Msg");
	log.fatal("This is an fatal Msg");
	log.debug("This is an Debug msg");
	log.info("This is an info msg");
	
	          // create log messages for each priority level       } } 
	}
}
