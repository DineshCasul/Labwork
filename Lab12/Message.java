package LabBook12;

import org.apache.log4j.Logger;
import java.util.logging.*;
 
	public class Message { 
 
	Logger log = Logger.getLogger("Message");		//create a logger for Message class 
 
	private String msg; 
 
	public void setMessage(String msg) {          
		
		this.msg = msg; 
		log.warn("This is a warning msg");
		log.debug("This is a debug msg");
		log.fatal("This is a fatal msg");
		log.error("This is a error msg");
   
            
} 
	public String getMessage() 
	{ 
		
            return "This is a msg";
            //log messages for each priority level returnmsg;   
	}

} 
 