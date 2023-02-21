public class task03 {
    int fib(int n){
        if (n <= 0) // base case
            return 0;
        else if (n == 1) // base case
            return 1;
        else
            return fib(n – 1) + fib(n – 2);

    }

    public static void main(String args[]) {

    }
}