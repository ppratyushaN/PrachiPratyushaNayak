import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x= sc.nextInt();
		
		System.out.println("The output range is: ");
		for (int i = 1; i <= x; i++) {
            System.out.print(2 * i - 1);
            if (i < x) { // to avoid comma after last number
                System.out.print(", ");
            }
        }

	}

}
