import java.util.Scanner;

public class Basic_23 {

	public static void main(String[] args) {
		
		
		
		System.out.println("Please enter a binary number:");   
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int binNum = sc.nextInt()	;
		
		int reminder = 0, sum = 0, powIdx = 1;
		
		
		while (binNum != 0) {
			
			reminder = binNum % 10;
			binNum   = binNum / 10;
			
			System.out.println("reminder - " + reminder);   
			System.out.println("binNum - " + binNum);   
			System.out.println("powIdx - " + powIdx + "\n");   


			sum    += (reminder * powIdx);
			powIdx *= 2;

			
		}
		System.out.println(sum);  
		
		

	}

}
