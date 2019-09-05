
public class Cheetah{// extends Animal{

	private static int[] Array1 = new int[1];	//array of size 1
	public static int NumSpots = 150; //static implies that every object will share the variable NumSpots
	
	public Cheetah(int NumSpots) {   //constructor
		this.setNumSpots(NumSpots);
	}
	
	public static int getNumSpots() {  //static getter
		return NumSpots;
	}
	
	public static int setNumSpots(int NumSpots) {  //static setter
		return NumSpots;
	}
	
	public String toString() {
		return "and it has " + Cheetah.NumSpots + " spots \n";
	}
	
	
} //end of class Cheetah
