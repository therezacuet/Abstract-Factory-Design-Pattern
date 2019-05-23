package abstractfactory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Vehicle type : ");
		String type = input.nextLine();
		
		System.out.println("Enter No of wheels : ");
		int wheels = input.nextInt();
		
		System.out.println("Enter no of passengers : ");
		int passenger = input.nextInt();
		
		System.out.println(type+ " has Gas? : ");
		boolean gas = input.nextBoolean();
		
		AbstractFactory factory = FactoryProducer.getFactory();
		
		System.out.println(factory.getVehicle(type,wheels,passenger,gas).toString());
		

	}

}
