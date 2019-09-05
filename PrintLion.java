import java.util.Scanner;
public class PrintLion {

	public static void main(String[] args) {
		int Weight =0;
		
		System.out.println("Please enter the weight of the lion:\t");
		Scanner Input = new Scanner(System.in);
		Weight = Input.nextInt();
		
		Animal Anim = new Animal(0, false,Weight, 0);
		if (Anim.getWeight() < 80)
			System.out.println("The lion is a cub");
		else if ((Anim.getWeight() > 80) && (Anim.getWeight() < 120))
			System.out.println("The lion is a female");	
		else
			System.out.println("The lion is a male");
		
		
		Input.close();
		
		
	}//end method main

} // end of class PrintLion	