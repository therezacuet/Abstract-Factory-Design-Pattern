package abstractfactory;

public class Plane implements Vehicle{

	private int wheels;
	private int passengers;
	private boolean hasGas;
	
	public Plane(int wheels, int passengers, boolean hasGas) {
		this.wheels = wheels;
		this.passengers = passengers;
		this.hasGas = hasGas;
	}

	@Override
	public int set_num_of_wheels() {
		// TODO Auto-generated method stub
		return wheels;
	}

	@Override
	public int set_num_of_passengers() {
		// TODO Auto-generated method stub
		return passengers;
	}

	@Override
	public boolean has_gas() {
		// TODO Auto-generated method stub
		return hasGas;
	}

	@Override
	public String toString() {
		return "Plane [wheels=" + wheels + ", passengers=" + passengers + ", hasGas=" + hasGas + "]";
	}
	
	

}

