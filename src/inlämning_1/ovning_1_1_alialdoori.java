package inlämning_1;

import java.util.Scanner;

public class ovning_1_1_alialdoori {

	public static void main(String[] args) {
		System.out.println(" ange årtal");

		Scanner input = new Scanner(System.in);

		int år = input.nextInt();

		if (år % 4 == 0) {

			System.out.println("der är skottår ");

			if (år % 100 != 0)

				System.out.println("det är  skottår /100");

			if (år % 400 == 0)

				System.out.println("det är inte skottår /400");

		} else
			System.out.println("det är  skottår *");

		
		input.close();
	}

}
