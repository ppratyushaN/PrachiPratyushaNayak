import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers to perform the operations: ");
		double a= sc.nextDouble();
		double b= sc.nextDouble();
		
		System.out.println("Enter: add.............for Addition");
		System.out.println("Enter: sub.............for Subtraction");
		System.out.println("Enter: mul.............for Multiplication");
		System.out.println("Enter: div.............for Division");
		
		System.out.println("Enter your choice of operation you want to perform: ");
		sc.nextLine();
		String typeOfOperation= sc.nextLine();
		
		switch(typeOfOperation) {
		case "add": double addition= a+b;
		System.out.println("Addition result is: "+addition);
		break;
		
		case "sub": double subtraction= a-b;
		System.out.println("Subtraction result is: "+subtraction);
		break;
		
		case "mul": double multiplication= a*b;
		System.out.println("Multiplication result is: "+multiplication);
		break;
		
		case "div": double division= a/b;
		System.out.println("Division result is: "+division);
		break;
		
		default: System.out.println("Invalid input!!");
		}

	}

}
