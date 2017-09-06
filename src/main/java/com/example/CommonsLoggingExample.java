package com.example;

import org.apache.commons.logging.LogFactory;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.logging.Log;

public class CommonsLoggingExample {
	
	static Log Log = LogFactory.getLog(CommonsLoggingExample.class);
	static Logger Log2 = Logger.getLogger(CommonsLoggingExample.class.getName());
	
	public static void main(String[] args) {
		
		Log2.log(Level.INFO, "Java standard logger");
		
		Log.trace("Commons 1. TRACE level log");
		Log.debug("Commons 2. DEBUG level log");
		Log.warn("Commons 3. WARN level log");
		Log.info("Commons 4. INFO level log");
		Log.error("Commons 5. ERROR level log");
		Log.fatal("Commons 6. FATAL level log");
		
	}
}
