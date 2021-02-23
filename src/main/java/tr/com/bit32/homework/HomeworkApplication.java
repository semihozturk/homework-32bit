package tr.com.bit32.homework;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeworkApplication {
	
	public static Logger logger = LoggerFactory.getLogger(HomeworkApplication.class);	
	

	public static void main(String[] args) {
		SpringApplication.run(HomeworkApplication.class, args);
/*		ICargoCalculation calculation = new CargoCalculation();		
				
		int result1 = calculation.prepareCargoPacket(5, 3, 41);				
		logger.info("input:(5,3,41)\tResult: " + result1);	 */		
		
		consoleInput();

	}	
	
	static void consoleInput() {
		System.out.print("Please provide us how many heavy weight, and light weight packet we have, and what's the target weight?");
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine(); // read all the input from the user until he hits enter
		String [] parts = userInput.split(" "); 
		performOperation(parts);		
	}

	private static void performOperation(String[] parts) {
		int heavy = Integer.parseInt(parts[0]); // heavy weight
		int light = Integer.parseInt(parts[1]); // light weight
		int target = Integer.parseInt(parts[2]); // target
		
		ICargoCalculation calculation = new CargoCalculation();		
		
		int result1 = calculation.prepareCargoPacket(heavy,light,target);	
		logger.info("Result:" + result1);		
	}
}
