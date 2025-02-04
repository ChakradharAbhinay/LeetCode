//https://www.geeksforgeeks.org/top-50-array-coding-problems-for-interviews/
//solving these problems
//Second Largest Element
//Third Largest Element
//Three Great Candidates
//Max Consecutive Ones
// all in one file as we need the same method






import java.util.Scanner;

//public class SecondLargestElementInArray {
//    public static void main(String[] args) {
//        System.out.println("enter numbers");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//
//
//
//    }
//}


import java.util.Arrays;
//im very proud,this bubble sort is my idea, but implementation i got it from net..mid point we will find which sort is that?
class SecondLargestElementInArray {
    public static void main(String args[]) {
        int[] intArray = {1,2,1,1,1,5,6,1};
//        int[] intArray = {1,0,2,3,4,1,1,2};
        int count=0;
//        System.out.println("enter length f araay");
//        Scanner sc = new Scanner(System.in);
//        int n1 = sc.nextInt();
//        int[] arr=new int[n1];
//        System.out.println("enter numbers of5");
//        for(int i=0;i<n1;i++){
//            sc.nextInt();
//        }


        //System.out.println("Original array: " + Arrays.toString(intArray));

        int n = intArray.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (intArray[j] > intArray[j+1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;

                }


            }

        }
        int maxcount=0;
        for(int j=0;j<intArray.length;j++) {
            if (intArray[j] == 1 && intArray[j] == intArray[j + 1]) {
                count = count + 1;
            }

            else if(intArray[j]!=1){
                maxcount=Math.max(maxcount,count);
                count=0;
            }

        }
        System.out.println("num of consec 1's "+count);
        //System.out.println("Sorted array: " + Arrays.toString(intArray));
        System.out.println("Second Largest Element in array: " + intArray[n-1]); //why??Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
        //at SecondLargestElementInArray.main(SecondLargestElementInArray.java:36)

        System.out.println("Second Largest Element in array: " + intArray[n-2]);
        System.out.println("third Largest Element in array: " + intArray[n-3]);
        System.out.println("product of largest-three (triplet)"+ intArray[n-1]*intArray[n-2]*intArray[n-3]);



    }
}

//ConsecutiveOnes
import java.util.*;
public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] intArray = {1,2,1,1,1,5,6,1,1,1,1,1,1,1};
        int count=0;
        int maxcount=0;
        if(intArray.length==1 && intArray[0]==1){
             maxcount=1;
            System.out.println(maxcount);
        }
        for(int j=0;j<intArray.length-1;j++) {
            if (intArray[j] == 1 && intArray[j] == intArray[j + 1]) {
                count = count + 1; //count=0,
                maxcount=Math.max(maxcount,count);//maxcount=0
            }

            else if(intArray[j]!=1){

                count=0;
            }

    }
        System.out.println(maxcount+1);
}

}







