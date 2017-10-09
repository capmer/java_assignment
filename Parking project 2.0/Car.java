package insa;

public class Car extends Vehicle {

private int numDoors;

public Car(){
super();
}

public Car(String brand, String color, int numDoors){
	super(brand, color);
	this.numDoors = numDoors;
}

public int getNumDoors() {
	return numDoors;
}

public void setNumDoors(int numDoors) {
	this.numDoors = numDoors;
}
public void printsomethingcar(){
	System.out.println("This car has" + numDoors + "doors.");
}

}
