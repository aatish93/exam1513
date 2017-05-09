package exam1513;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test
	public void test() {
		Car car1=new Car("alto",1000000);
		Car car2=new Car("q3",3200000);
		assertEquals(1000,car1.getEngineCapacity());
		assertEquals(3200,car2.getEngineCapacity());
	}
}
