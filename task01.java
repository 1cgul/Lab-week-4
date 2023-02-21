/*
 * 1) What is the output of this code?
 * The code will output "..." 'n' amount of times before finally hitting the base case which says Blastoff!
 * 
 * 2) Modify it so that it prints only the even numbers.
 * See lines 15-20
 * 
 * 3) What is the time complexity of this algorithm and why?
 * The time complexity of this algorithm is linear or O(n) because countDown is being recalled for 'n' amount of times until the base case is reached.
 */
public class task01 {
    static void countDown(int num) {

        if (num <= 0) // test
            System.out.println("Blastoff!");
        else if(num%2 == 1){  //if num is odd, print nothing and recall method with num-1
            countDown(num-1);
        }
        else{
            System.out.println("...\n...");
            countDown(num - 1); 
            /* recursive call. since num is even, print "..." twice. 
            Ex) num=6 will be printed 6 times, num=5 will be printed 4 since we cannot print odd nums. */ 
        }
    }

    public static void main(String[] args) {
        
        countDown(6);

    }
}