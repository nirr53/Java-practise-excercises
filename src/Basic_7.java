import java.util.Scanner;

public class Basic_7 {

	public static void main(String[] args) {
		
		System.out.println("Please enter a number:");   

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);     
		int num = sc.nextInt();
		
		for (int i = 1; i <= 10; ++i){
			
			System.out.println(num + " X " + i + " = " + (num*i));   

		}
		
		


	}

}
