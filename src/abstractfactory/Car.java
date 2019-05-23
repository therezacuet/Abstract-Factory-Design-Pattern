package abstractfactory;

public class Car implements Vehicle{

	private int wheels;
	private int passengers;
	private boolean hasGas;
	
	
	public Car(int wheels, int passengers, boolean hasGas) {
		this.wheels = wheels;
		this.passengers = passengers;
		this.hasGas = hasGas;
	}

	@Override
	public int set_num_of_wheels() {
		return wheels;
	}

	@Override
	public int set_num_of_passengers() {
		return passengers;
	}

	@Override
	public boolean has_gas() {
		return hasGas;
	}

	@Override
	public String toString() {
		
		return "Car [wheels=" + wheels + ", passengers=" + passengers + ", hasGas=" + hasGas + "]";
	}

}
