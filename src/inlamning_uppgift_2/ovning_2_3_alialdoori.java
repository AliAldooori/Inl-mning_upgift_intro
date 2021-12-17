package inlamning_uppgift_2;

public class ovning_2_3_alialdoori {

	public static void main(String[] args) {
		
		
		for (int i = 0, count =1; i <8; i++, count*=3) {
			for ( int j = i ; j < 8 ;j++) {
				
				System.out.print("   ");
				
			} for (int j = 0 ,p=1; j <= i; j++, p*=3) {
				
				System.out.print(p+"  ");
			}for ( int k =1,p=count ;k<=i;k++, p/=3) {
				
				
				System.out.print(p/3+"  ");
				
			}
		
			
			
			System.out.println();
		}
		
		
		
		
	}

}
