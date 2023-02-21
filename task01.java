/*
 * what is the output of this code?

 modify it so that it prints only the even numbers. 

- what is the time complexity of this algorithm and why?
 * 
 */

public class task01 {
    void countDown(int num)

    {
        if (num == 0) // test
            System.out.println("Blastoff!");
        else {

            System.out.println("...");

            countDown(num - 1); // recursive call

        }

    }
}