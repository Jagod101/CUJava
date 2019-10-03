import java.util.Scanner;
import java.lang.Math;

public class FactorialExample {
	public static void main(String[] args) {
        boolean loop = true;
        while(loop) {
            System.out.println("Please input a value for x");
            Scanner input = new Scanner(System.in);
            double x = input.nextDouble();
            int counter = 1;
            int n1 = 10;
            int n2 = 50;
            int n3 = 100;
            
            FactorialCalculation(n1, x);
            FactorialCalculation(n2, x);
            FactorialCalculation(n3, x);

            System.out.println("Would you like to continue?");
            Scanner in = new Scanner(System.in);
            String answer = in.nextLine();

            if(answer == "yes" || answer == "y") {
                loop = true;
            }
            else {
                loop = false;
            }
        }
    }

    public static void FactorialCalculation(int n, double x) {
        double factorial = 1;
		int counter = 1;
        double result = 1;

        while(n > counter) {
			factorial = factorial*counter;
			result = result + (Math.pow(x, counter))/factorial;
			counter++;
        }
        
        System.out.println(result);
    }
}