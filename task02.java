/*
 * what is the output of this code?
 * The output of this code will be the greatest common denominator of two integers
 * 
 * modify it to find the gcd using subtraction instead of %.
 * See lines 11-18
 */

public class task02{
    static int gcd(int x, int y) {
        if (x % y == 0) //base case
            return y;
        else if (x>y){
            return gcd(x-y, y); 
        }
        else{
            return gcd(x, y-x);
        }
            
  }

    public static void main(String args[]){
        System.out.println(gcd(15,45));
    }
}