package abstractfactory;

public class VehicleFactory extends AbstractFactory{

	@Override
	Vehicle getVehicle(String type, int wheels, int passenger, boolean gas) {
		
		if(type.equalsIgnoreCase("car")) {
			return new Car(wheels,passenger,gas);
		}
		else if(type.equalsIgnoreCase("plane")) {
			return new Plane(wheels,passenger,gas);
		}
		return null;
	}

}
