import java.util.Scanner;
public class PrintAnimalType {

	public static void main(String[] args) {
		int Weight =0;
		
		System.out.println("Please enter the weight of the lion:\t");
		Scanner Input = new Scanner(System.in);
		Weight = Input.nextInt();
		
		Animal Anim = new Animal(0, false,Weight, 0); //(30,"False",60,150.00);
		if (Anim.getWeight() < 80)
			System.out.println("The lion is a cub");
		else if ((Anim.getWeight() > 80) && (Anim.getWeight() < 120))
			System.out.println("The lion is a female");	
		else
			System.out.println("The lion is a male");
	
		
		
		System.out.println("Please enter the weight of the Cheetah:\t");
		Scanner Input_ch = new Scanner(System.in);
		Weight = Input_ch.nextInt();
		
		Animal AnimCh = new Animal(0, false,Weight, 0); //(30,"False",60,150.00);
		if (AnimCh.getWeight() < 80)
			System.out.println("The cheetah is a cub");
		else if ((AnimCh.getWeight() > 80) && (AnimCh.getWeight() < 120))
			System.out.println("The cheetah is a female");	
		else
			System.out.println("The cheetah is a male");
		
		
	}//end method main

} // end of class PrintAnimalType	