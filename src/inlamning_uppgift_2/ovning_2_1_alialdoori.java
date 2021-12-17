package inlamning_uppgift_2;

import java.util.Arrays;
import java.util.Scanner;

public class ovning_2_1_alialdoori {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("enter your words ");

		String x = input.nextLine();

		count(x);
		
		System.out.println(" the number of vowles letters is  "+count_vowales(x));
		
		
		input.close();
	}
	public static void count(String x) {
		char[] ch = x.toCharArray();
System.out.println(Arrays.toString(ch));
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for (int i = 0; i < x.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			} else if (Character.isDigit(ch[i])) {
				num++;
			} else if (Character.isSpaceChar(ch[i])) {
				space++;
			} else {
				other++;
			}
		}
		
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);
	}
	public static int count_vowales(String x) {
		int count = 1;
		for (int i = 0; i < x.length(); i++) {

			if (x.charAt(i) == 'a' || x.charAt(i) == 'e' || x.charAt(i) == 'i' || x.charAt(i) == 'o'
					|| x.charAt(i) == 'u' || x.charAt(i) == 'y' || x.charAt(i) == 'å' || x.charAt(i) == 'ä'
					|| x.charAt(i) == 'ö') {

				count++;

			}

		}
		return count;

	}
}
