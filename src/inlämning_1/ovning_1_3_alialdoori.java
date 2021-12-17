package inlämning_1;

import java.util.Scanner;

public class ovning_1_3_alialdoori {

	public static void main(String[] args) {
	
		
		Scanner input = new Scanner ( System.in);
		
		
		System.out.println(" ange massa för vatten per kilo ");
		
		int m = input.nextInt();
		
		System.out.println(" ange temperaturen för vatten ");
		
		int t1 = input.nextInt();
		
		int t2 = 100 ;
		
		int q = m * ( t2 - t1) * 4184 ;
		
		
		System.out.println("energi är q = m * ( t2 - t1) * 4184= "+q+"j");
		
		
		input.close();

	}

}
