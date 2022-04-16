Thank you for getting to this point. This repository was created for a training related to Log4j framework.  

## Topics Covered
- Concepts
- Logging
	- Example: When only there are errors
	- Example: All logs
	- TimeStamp
	- Past logs
	- Identify errors in logs
- Standard: `private static Logger log = LogManager.getLogger(Demo.class.getName());`
- Log4j Functions
- When to use Log4J methods. Examples:
	- Use log. Error() to log when elements are not displayed in the page or if any validations fail
	- Use Log. Debug() When each Selenium action is performed like click, SendKeys, getText()
	- Use log.info(). When operation is successfully completed ex: After loading page, or after any successful validations
- Importance of log4j.xml file (https://logging.apache.org/log4j/2.x/manual/configuration.html)
	- Where to log? (console or file) - Appenders
	- What to log? - Loggers
		- Trance, Error, etc
	- How to log? (Pattern)

## **Prerequisites (in this case):**
- Java JDK
- Download and setup Log4j jar file
- Proper setup for System variables environment
- Eclipse IDE
