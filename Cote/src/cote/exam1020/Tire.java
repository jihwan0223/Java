package cote.exam1020;

public class Tire {
	public String model;
	public int maxSpin;
	public int spin = 0;
	
	public Tire(String model, int maxSpin){
		this.model = model;
		this.maxSpin =  maxSpin;
		this.spin = 0;
	}
	
	public boolean rool() {
		spin += 1;
		if(spin > maxSpin) {
			return false;
		}
		else 
			return true;
	}
}
