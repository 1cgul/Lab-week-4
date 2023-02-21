/*
 * 
 * what is the time complexity of this algorithm and why?
 * The time complexity of this algorithm is O(n^2) because each time the function is called, it calls itself
 * two more times until the base case is reached.
 */

public class task03 {
    static int fib(int n){
        if (n <= 0) // base case
            return 0;
        else if (n == 1) // base case
            return 1;
        else
            return fib(n - 1) + fib(n - 2);

    }

    public static void main(String args[]) {
        System.out.println(fib(13)); //test
    }
}