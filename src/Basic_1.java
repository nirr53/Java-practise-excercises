import java.util.Scanner;

public class Basic_1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);   
		System.out.println("Hello");   
		while(sc.hasNextLine()) System.out.println(sc.nextLine());
	}

}
