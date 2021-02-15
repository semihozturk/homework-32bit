package tr.com.bit32.homework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeworkApplication {
	
	public static Logger logger = LoggerFactory.getLogger(HomeworkApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HomeworkApplication.class, args);
		ICargoCalculation calculation = new CargoCalculation();		
				
		int result1 = calculation.prepareCargoPacket(5, 3, 41);				
		logger.info("input:(5,3,41)\tResult: " + result1);		
	}
}
