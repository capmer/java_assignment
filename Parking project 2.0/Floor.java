package insa;

import java.util.ArrayList;

public class Floor {

	public Floor(){}
	
	private int floor;
	
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}

	private ArrayList<Car> carlist = new ArrayList<>();
	private ArrayList<Truck> trucklist = new ArrayList<>();
	private ArrayList<Motorcycle> motolist = new ArrayList<>();
	
	public void addVehicle(Car car){
		this.carlist.add(car);
		System.out.println("New car succesfully added.");
	}
	
	public void addVehicle(Truck truck){
		this.trucklist.add(truck);
		System.out.println("New truck succesfully added.");
	}
	
	public void addVehicle(Motorcycle motorcycle){
		this.motolist.add(motorcycle);
		System.out.println("New motorcycle succesfully added.");
	}
}
