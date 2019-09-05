import java.util.Scanner;

public class PrintCheetah {

	public static void main(String[] args) {
		
		int Weight =0;
		
		System.out.println("Please enter the weight of the Cheetah:\t");
		Scanner Input_ch = new Scanner(System.in);
		Weight = Input_ch.nextInt();
		
		Animal Cheetah = new Animal(0, true ,Weight, 0);
		Cheetah Cheetah_Class = new Cheetah(150);		//150 is the number of spots the cheetah has.
		
		if (Cheetah.getWeight() < 80)
			System.out.printf("The cheetah is a cub " + Cheetah_Class.toString());
			//System.out.printf("The cheetah is a cub with %d spots\n", Cheetah_Class.setNumSpots(150));
		else if ((Cheetah.getWeight() > 80) && (Cheetah.getWeight() < 120))
			System.out.printf("The cheetah is a female " + Cheetah_Class.toString());
			//System.out.printf("The cheetah is a female with %d spots\n", Cheetah_Class.setNumSpots(150));	
		else
			System.out.printf("The cheetah is a male " + Cheetah_Class.toString());
			//System.out.printf("The cheetah is a male with %d spots\n", Cheetah_Class.setNumSpots(150));
			//System.out.print(Cheetah_Class.toString());
			
		Input_ch.close();
		
		
	}  //end of method main
}  ///end of class PrintCheetah
