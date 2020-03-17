package LabBook12;
import org.apache.log4j.Logger;
public class Log4jDemo3 { 
	 
	static Logger log = Logger.getLogger("Mylogger");//create a logger for Log4jDemo3 class
	public static void main(String args[]) { 
	 
	
		Message msg = new Message();
		msg.setMessage("This is a set msg");
		msg.getMessage();
		
		log.error("This is an error msg");
		log.warn("This is an Warn msg");
		log.debug("This is an debug msg");
		log.fatal("This is an Fatal msg");
		log.info("This is an Info msg");
		
		//create an instance of Message class //call setMessage() method
		//print the log messages using getMessage() method 
		// write log message statements for each priority level      
	}

} 