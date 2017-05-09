package exam1513;

public class Car {
	private String name;
	private int capacity;
	public Car(String name,int cap){
		this.name=name;
		capacity=cap;
	}
	public int getEngineCapacity(){
		System.out.println("The Capacity is: "+capacity/1000+"cc");
		return capacity/1000;
	}
}
