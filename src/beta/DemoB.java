package beta;

import org.apache.logging.log4j.*;

public class DemoB {

	private static Logger log = LogManager.getLogger(DemoB.class.getName());
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("I am debugging");
		log.info("Object is present");
		log.error("Object is not present");
		log.fatal("This is fatal error");
	}

}
