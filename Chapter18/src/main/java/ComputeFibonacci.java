import java.util.Scanner;

public class ComputeFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an index for Fibonacci number: ");
        int index = input.nextInt();

        System.out.println("The Fibonacci number at index: " + index
                + " is " + fib(index));
    }

    // evaluated from left to right so when left is done then right is started
    public static int fib(int index){
        if(index == 0)
            return 0;
        else if(index == 1)
            return 1;
        else
            return fib(index - 1) + fib(index - 2); // if index = 3, fib(3 -2) = 1 + fib(3-1) = fib(2) = 1 + fib(0) = total 3

    }
}
