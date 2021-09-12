import java.util.Scanner;
public class ComputeFactorial {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a non negative integer: ");

        int n = input.nextInt();

        // Display the factorial
        System.out.println("Factorial of " + n + " is " + factorial(n));


    }

    // return the factorial for the specified number
    public static long factorial(int n){
        if(n == 0)
            return 1;
        else
            return n * factorial(n - 1); // recursive call

    }

}
