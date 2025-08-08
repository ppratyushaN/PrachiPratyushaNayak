//Here I am solving the number series program 
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int x= sc.nextInt();
		
		int range;
		if(x%2==0) {
			range= x-1;
		}else {
			range= x;
		}
		
		System.out.println("The output range is: ");
		for(int i=1;i<=range;i++) {
			System.out.print(2 * i - 1);
            if (i < range) {
                System.out.print(", ");
            }
		}


	}

}

