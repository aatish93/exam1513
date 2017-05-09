package exam1513;

public class Car {
	private int capacity;
	public Car(int cap){
		capacity=cap;
	}
	public int getEngineCapacity(){
		System.out.println("The Capacity is: "+capacity/100+"cc");
		return capacity/100;
	}
}
