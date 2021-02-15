package tr.com.bit32.homework;

public interface ICargoCalculation {
	/**
	 * Calculates how many lightweight(2 Kg) soaps we need to use to reach exactly the target weight, if possible
     * If we can reach the target weight without using lightweight soaps(2 Kg), returns 0
     * but if the target weight can't be reached, returns -1
	 * 
	 * @param heavyAvailable -> The number of heavy soaps(7Kg) I can use
	 * @param lightAvailable -> The number of light soaps(2Kg) I can use
	 * @param targetWeight   -> The desired sum of the weights of all soaps
	 * @return
	 */
	int prepareCargoPacket(int heavyAvailable, int lightAvailable, int totalWeight);
		
}
