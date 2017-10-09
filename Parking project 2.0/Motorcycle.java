package insa;

public class Motorcycle extends Vehicle {
	
	private String owner;

	public Motorcycle(){
	super();
	}
	
	public Motorcycle(String brand, String color){
	super(brand, color);
	this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void printMotorcycleOwner(){
		System.out.println("Owner of this motorcycle:" + this.owner);
	}
}
