package application;

/**
 * Driver class that creates an instance of the ArgWorker object using command line arguments
 * 
 * @author Don Laliberte
 * @author Elie Kabengele
 * @author Jared Smith
 * @author Jaekyung Jeon
 * @version June 30th, 2021
 *
 */
public class AppDriver {



	public static void main(String[] args) {
		// args passed here to specify whether to sort by volume, base area, height etc
		ArgWorker a = new ArgWorker(args);
	}
}
