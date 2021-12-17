package inlamning_uppgift_2;

import java.util.Random;
import java.util.Scanner;

public class ovning_2_2_4_alialdoori {

	public static void main(String[] args) {
		
		System.out.println("please enter your number : ");

		System.out.println(input());

		System.out.println("the lotteri number is : ");

		System.out.println(random());

		vinner(input(),random());
		

	}

	public static String input() {

		Scanner input = new Scanner(System.in);

		int x = input.nextInt() ;

		String zero = "0";

		String spelare = String.valueOf(x);

		if (x % 11 !=0) {
if (  x <=9) {
			spelare = zero.concat(spelare);
}else {
	spelare = String.valueOf(x);
}
	
		}else {
			spelare ="0";
		}
		return spelare;
	}

	public static String random() {

		Random rnd = new Random();
		int x = rnd.nextInt(99) + 1;
		String zero = "0";
		String	lotteri = String.valueOf(x);
         String mylotteri="";
	if (x %11 !=0)	{
if (x <= 9) {
			mylotteri = zero.concat(lotteri);

		}else {
			mylotteri = String.valueOf(x);
		}
	}
return mylotteri;
	
	}
	

	public static void vinner(	String lotteri ,String spelare ) {
	
		
		
		if (lotteri.equals(spelare)) {

			System.out.println("congrats , you win 10000 kr:- ");
			
		

		} else
			if (lotteri.charAt(0) == spelare.charAt(1) && lotteri.charAt(1) == spelare.charAt(0)) {

			System.out.println("congrats , you win 5000 kr:-");
			
		

		} else if (lotteri.charAt(0) == spelare.charAt(0) || lotteri.charAt(0) == spelare.charAt(1)
				|| lotteri.charAt(1) == spelare.charAt(0) || lotteri.charAt(1) == spelare.charAt(1)) {

			System.out.println("Not bad , but you win 1000 kr :-");

		
			
		} else {

			System.out.println(" Bad luck");
			
		

		}

	}

}
