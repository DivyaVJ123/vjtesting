package log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log_Class1 {

	public static Logger demologger=LogManager.getLogger(log_Class1.class.getName());
	public static void main(String[] args) {
		System.out.println("program on logging");
		demologger.info("program on su");
		demologger.fatal("program on su1");
		demologger.warn("program on su");
		demologger.error("program on su1");

	}

}
