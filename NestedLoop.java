package nested;
import java.util.Scanner;
public class NestedLoop {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int i=0, j=0; 
				for(i=0; i<n; i++) {
					for(j=0; j<n; j++) {
						System.out.print("*");
					}
					System.out.println("*");
				}
	}

}
