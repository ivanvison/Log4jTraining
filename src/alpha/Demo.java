package alpha;

import org.apache.logging.log4j.*;

public class Demo {

	private static Logger log = LogManager.getLogger(Demo.class.getName());
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("I have clicked on this button");
		log.info("Button displayed");
		log.error("Button not displayed");
		log.fatal("Button is missing");
	}

}
