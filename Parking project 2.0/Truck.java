package insa;

public class Truck extends Vehicle {

	private Boolean isEuropean;
	
	public Truck(){
		super();
	}
	
	public Truck(String brand, String color, Boolean isEuropean){
	super (brand, color);
	this.isEuropean = isEuropean;
	}

	public Boolean getIsEuropean() {
		return isEuropean;
	}

	public void setIsEuropean(Boolean isEuropean) {
		this.isEuropean = isEuropean;
	}

}
