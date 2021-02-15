package tr.com.bit32.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HomeworkApplicationTests {

	CargoCalculation calculator = new CargoCalculation();
	
	@Test
	public void prepareCargoPacketTest() {
		Assertions.assertEquals(calculator.prepareCargoPacket(2, 3, 8), -1);
		Assertions.assertEquals(calculator.prepareCargoPacket(2, 3, 11), 2);
		Assertions.assertEquals(calculator.prepareCargoPacket(2, 3, 10), -1);
		Assertions.assertEquals(calculator.prepareCargoPacket(2, 10, 22), 4);
		Assertions.assertEquals(calculator.prepareCargoPacket(5, 3, 45), -1);
		Assertions.assertEquals(calculator.prepareCargoPacket(15, 3, 50), -1);
		Assertions.assertEquals(calculator.prepareCargoPacket(0, 5, 4), 2);
		Assertions.assertEquals(calculator.prepareCargoPacket(7, 0, 7), 0);
		Assertions.assertEquals(calculator.prepareCargoPacket(100, 100, 70), 0);
		Assertions.assertEquals(calculator.prepareCargoPacket(3, 25, 27), 3);
		Assertions.assertEquals(calculator.prepareCargoPacket(23, 12, 15), 4);
		Assertions.assertEquals(calculator.prepareCargoPacket(20, 15, 40), 6);
		Assertions.assertEquals(calculator.prepareCargoPacket(13, 13, 28), 0);
		Assertions.assertEquals(calculator.prepareCargoPacket(5, 3, 15), -1);
		Assertions.assertEquals(calculator.prepareCargoPacket(21, 13, 44), 1);
		Assertions.assertEquals(calculator.prepareCargoPacket(3, 7, 20), 3);
		Assertions.assertEquals(calculator.prepareCargoPacket(2, 2, 10), -1);
		Assertions.assertEquals(calculator.prepareCargoPacket(4, 5, 24), 5);
	}
}
