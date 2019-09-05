
public class Animal {
	//public final String NumSpots = null;
	private int numTeeth = 0;    //these parameters are private because we don't want another class to be able to access and change these parameters
	private boolean spots = false;
	private int weight = 0;
	private double PawSize = 0;
	
	
	public Animal(int numTeeth, boolean spots, int weight, double PawSize ){ //this is a constructor 
		this.setNumTeeth(numTeeth);
		this.setSpots(spots);
		this.setWeight(weight);
		this.setPawSize(PawSize);
	}
	
	public int getNumTeeth(){
		return numTeeth;
	}

	public void setNumTeeth(int numTeeth) {
		this.numTeeth = numTeeth;
	}
	
	public boolean getSpots() {
		return spots;
	}

	public void setSpots(boolean spots) {
		this.spots = spots;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getPawSize(double getPawSize) {
		return PawSize;
	}

	public void setPawSize(double PawSize) {
		this.PawSize = PawSize;		
	}
} //end of class animal