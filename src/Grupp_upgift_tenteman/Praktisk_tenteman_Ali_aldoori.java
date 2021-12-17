package Grupp_upgift_tenteman;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Praktisk_tenteman_Ali_aldoori {

	public static void main(String[] args) {

		boolean flag = false;
		Scanner input = new Scanner(System.in);
		System.out.println("choose one of this methods please , ");
		System.out.println("1 . to sum numbers ");
		System.out.println("2 . to avarge numbers ");
		System.out.println("3 . to factor  numbers ");
		System.out.println("4 . to multiply  numbers ");
		System.out.println("5 . to multiply  tabell ");
		System.out.println("6 . to divide numbers and Modulus  the first tow numbers  ");
		System.out.println("7 . to minimize numbers  ");
		System.out.println("8 . to take the sin , cos and tan from the number you want  ");
		System.out.println("9 . to take witch square from   the number you want  ");
		System.out.println("10 .to exit from the program  ");

		do {
			System.out.println("enter your number from the meny that you want to calculate ");

			try {
				int x = input.nextInt();

				switch (x) { // för användaren kan välja vilken metod som han vill

				case 1:
					Sum(input);
					flag = true;
					break;
				case 2:
					avarge(input);
					flag = true;
					break;
				case 3:
					factor(input);
					flag = true;
					break;
				case 4:
					multiplay(input);
					flag = true;
					break;
				case 5:
					multiplyTabell(input);
					flag = true;
					break;
				case 6:
					dividedBy(input);
					flag = true;
					break;
				case 7:
					minimize(input);
					flag = true;
					break;
				case 8:
					sincostan(input);
					flag = true;
					break;
				case 9:
					SquareNummer(input);
					flag = true;
					break;
				case 10:
					System.out.println("Good bye ");
					flag = true;
					break;
				default:
					break;
				}

			} catch (Exception e) {
				System.out.println("you have choosed fel , please tyr again ");
				input.nextLine();
			}
		} while (!flag);

		try {
			File myfile = new File("/Users/Ali Al-Doori/Desktop", "Ali Aldoori"); // skappa ny fil

			FileWriter minfil = new FileWriter("/Users/Ali Al-Doori/Desktop//Ali Aldoori"); // för skriva i fil

			minfil.write("1 . to sum numbers \n" + "2 . to avarge numbers \n" + "3 . to factor  numbers \n"
					+ "4 . to multiply  numbers \n" + "5 . to multiply  tabell \n" + "6 . to divide numbers  \n"
					+ "7 . to minimize numbers  \n" + "8 . to take the sin , cos and tan from the number you want  \n"
					+ "9 . good bye \n" + "enter your number from the meny \n" + "8\n" + "enter your number please \n"
					+ "45\n" + "sin1.0\n" + "cos0.5253219888177297\n" + "tan1.6197751905438615");
			minfil.flush();
			minfil.close();

		} catch (Exception e) {

			System.out.println(e);
		} finally {
			input.close();
		}

	}

	public static void Sum(Scanner input) { // för att göra plus två nummer
		System.out.println("enter your first number ");
		double n1 = input.nextDouble();
		System.out.println("enter your second number ");
		double n2 = input.nextDouble();
		System.out.println("enter your third number ");
		double n3 = input.nextDouble();
		double s = n1 + n2 + n3;
		System.out.println("the sum is : " + s);
	}

	public static void avarge(Scanner input) { // för att få avarge
		System.out.println("enter your first number ");
		double n1 = input.nextDouble();
		System.out.println("enter your second number ");
		double n2 = input.nextDouble();
		System.out.println("enter your third number ");
		double n3 = input.nextDouble();

		double avarge = (n1 + n2 + n3) / 3;
		System.out.println("the avarge is : " + avarge);

	}

	public static void factor(Scanner input) { // för att kan få faktor för nummer
		System.out.println("enter your  number  that you want to make factor on it :");
		int num = input.nextInt();
		int count = 1;
		for (int i = 1; i <= num; i++) {

			count *= i;

		}
		System.out.println("the factor is : " + count);

	}

	public static void multiplay(Scanner input) { // for multiplay between three numbers

		System.out.println("enter your first number ");
		float z = input.nextFloat();
		System.out.println("enter your second number ");
		float y = input.nextFloat();
		System.out.println("enter your third  number ");
		float x = input.nextFloat();
		double m = z * y * x;
		System.out.println("the multiplay is : " + m);
	}

	public static void multiplyTabell(Scanner input) { // multiply table
		System.out.println("enter your number please ");
		int n1 = input.nextInt();
		int n;
		for (int i = 1; i <= 10; i++) {

			n = n1 * i;
			System.out.println(n1 + "*" + i + " = " + n);

		}

	}

	public static void dividedBy(Scanner input) { // divde method och Modulus method
		System.out.println("enter your first number ");
		double n1 = input.nextDouble();
		System.out.println("enter your second number ");
		double n2 = input.nextDouble();
		System.out.println("the Modulus  between the first and the scond number is : " + n1 % n2);

		System.out.println("enter your third number ");
		double n3 = input.nextDouble();
		System.out.println("the resule is : " + n1 / n2 / n3);

	}

	public static void minimize(Scanner input) { // för minska tre nummer
		System.out.println("enter your first number ");
		float n1 = input.nextFloat();
		System.out.println("enter your scond number ");
		float n2 = input.nextFloat();
		System.out.println("enter your third number ");
		float n3 = input.nextFloat();

		float result = n1 - n2 - n3;

		System.out.println("the result is :" + result);

	}

	public static void sincostan(Scanner input) { // för att kan få sin , cos och tan för nummer

		System.out.println("enter your number please ");
		double n1 = input.nextFloat();

		double sin = Math.sin(n1);
		double cos = Math.cos(n1);
		double tan = Math.tan(n1);

		System.out.println("sin" + sin);
		System.out.println("cos" + cos);
		System.out.println("tan" + tan);

	}

	public static void SquareNummer(Scanner input) { // för kan få square nummer
		System.out.println("enter your number please ");
		int n1 = input.nextInt();
		System.out.println("enter the square number  please ");
		int n2 = input.nextInt();

		double result = Math.pow(n1, n2);

		System.out.println("the result is :" + result);

	}

}
