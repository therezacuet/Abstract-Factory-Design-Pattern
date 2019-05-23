package abstractfactory;
 public class FactoryProducer {
	
	public static AbstractFactory getFactory(){
		
	      return new VehicleFactory();
	}
}
