package abstractfactory;

public abstract class AbstractFactory {
	abstract Vehicle getVehicle(String carType, int wheels, int passenger, boolean gas);
}
