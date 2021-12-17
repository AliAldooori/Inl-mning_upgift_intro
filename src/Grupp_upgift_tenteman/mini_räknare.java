package Grupp_upgift_tenteman;

import java.util.Scanner;

public class mini_räknare {
static float result ;
	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
int count = 1;

char ch ;
		do {
			
			System.out.println("enter your no "+count++);
		int	x = input.nextInt();
			
			System.out.println("enter your method");
			ch = input.next().charAt(0);
       switch (ch )
       {
       case '+':
    	   plus(input);
    	   
    	   break ;
       case '-':
    	   plus(input);
    	   
    	   break ;
       case '*':
    	   plus(input);
    	   
    	   break ;
       case '/':
    	   plus(input);
    	   
    	   break ;
       case '=':
    	   System.out.println("the result is : "+ result );
    	   
    	   break ;
    	default :
    		  System.out.println("the result is : "+ result );
    		break;
    	
       
       }
    	   
      
	}while ( ch != '=');
//input.next().charAt(0);
}
	
		
		
	
	public static float plus ( Scanner input ) {
		
int x = input.nextInt();
 return (result+= x);

		
	}
	public static float minus ( Scanner input ) {
		
		int x = input.nextInt();
		return (result-= x);
		
		
	}
	public static float multiply  ( Scanner input ) {
		
		int x = input.nextInt();
		return (result*= x);
		
		
	}
	public static float divided( Scanner input ) {
		
		int x = input.nextInt();
		return (result/= x);
		
		
	}

}
