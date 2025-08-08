//Here I am solving the Check Divisor Program
public class Problem4 {

	public static void main(String[] args) {
		int divisors[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int numbers[] = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        
        for (int i = 0; i < divisors.length; i++) {
            int divisor = divisors[i];
            int count = 0;
            
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] % divisor == 0) {
                    count++;
                }
            }
            
            System.out.println(divisor + ": " + count);
        }


	}

}

