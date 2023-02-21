/*
 * 1. Write a function that prints "Hello World" n times recursively. 
 * 2. Write a function that returns the sum of all numbers between n1 and n2 that are multiples of 7 using recursion.
 * 3. Write a function that implements the binary search algorithm recursively.
 */

public class homework123 {

    static String helloWorld(int n){ //1st task
        if(n==0){ //base case
            return "";
        }
        else{
            System.out.println("Hello World");
            return helloWorld(n-1); //recursive call n times
        }
    }


    static int multiplesOfSeven(int n1, int n2){ //2nd task
        if (n1 > n2) { //base case
            return 0;
        } 
        else if (n1 % 7 == 0) { // checks if n1 is a multiple of 7
            return n1 + multiplesOfSeven(n1+7, n2);
        } 
        else { // executes if n1 isnt a multiple of 7
            return multiplesOfSeven(n1+1, n2);
        }
    }


    static int binarySearch(int[] list, int target, int lowerbound, int upperbound){ //3rd task
        int middle = (lowerbound + upperbound) /2;
        if(lowerbound > upperbound){ //base case
            return 0;
        }
        else if(list[middle] == target){ //when target found, return the value
            return list[middle];
        }
        else if(list[middle] < target){ //if target is greater than the middle of the array, increase lowerbound by 1
            return binarySearch(list, target, middle+1, upperbound);
        }
        else{ //if target is not greater than the middle of the array, decrease upperbound by one
            return binarySearch(list, target, lowerbound, middle-1);
        }
    }


    public static void main(String args[]){
        System.out.println("1st task:");
        helloWorld(10); //1st task

        System.out.println("2nd task:");
        System.out.println(multiplesOfSeven(0, 15));
        
        System.out.println("3rd task:");
        int[] list = {1, 3, 5, 8, 13, 21, 34};
        int target = 13;
        System.out.println(binarySearch(list, target, 0, list.length-1));

    }
}
