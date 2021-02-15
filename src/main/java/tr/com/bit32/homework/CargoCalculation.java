package tr.com.bit32.homework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CargoCalculation implements ICargoCalculation {

	public static final int HEAVY_WEIGHT = 7;
	public static final int LIGHT_WEIGHT = 2;

	Logger logger = LoggerFactory.getLogger(CargoCalculation.class);
	
	@Override
	public int prepareCargoPacket(int heavyAvailable, int lightAvailable, int targetWeight) {
		
		if (HEAVY_WEIGHT * heavyAvailable > targetWeight) {
			/*
			 * if we have many of 7Kg soaps, it should get upper Bound, and put it in recursive method, and decrease it by one
			 * otherwise it had to do this for so many times if there is big gap between target weight, and heavy_weight*heavyAvailable
			 */
			heavyAvailable = targetWeight / HEAVY_WEIGHT + 1;
			
			logger.info("Calling the recursive method");
			return prepareCargoPacket(heavyAvailable - 1, lightAvailable, targetWeight);

		} else if (HEAVY_WEIGHT * heavyAvailable == targetWeight) { 
			/*
			 * if we have enough 7Kgs that are equal to target weight, we will not use 2Kgs, and it will return 0
			 * since we can get target weight only by using 7Kg soaps
			 */						
			return 0;

		} else {
			/*
			 * if we have less 7Kg soaps that we can't reach target weight,
			 * then I need to see how many 2Kg soaps I can use
			 */
			int remainingWeight;  // is equal to the amount of Kg that we can use for 2Kgs

			for (int i = heavyAvailable; i >= 0; i--) {

				remainingWeight = targetWeight - HEAVY_WEIGHT * i;

				if (remainingWeight % LIGHT_WEIGHT == 0 && lightAvailable * LIGHT_WEIGHT >= remainingWeight) {
					/*
					 * checks if remaining weight is dividable by 2, and we have enough of 2Kg soaps
					 */
					return remainingWeight / LIGHT_WEIGHT;
				}
			}
		}
	    logger.debug("the solution is: ");

	    // No solution
		return -1;
	}
}