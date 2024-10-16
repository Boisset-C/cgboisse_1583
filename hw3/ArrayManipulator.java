package hw3;
/**
 * Author: Cosme Boisset
 * Student ID: 2906289
 * Description: I saw two main tasks at hand, sorting through the array to find positive elements. * For this I used a for loop and checked that each element is greater than zero. Depending on the * results we are looking for Implemented three functions. Calculate (version 1) returns sum of all * elements. Calculate (version 2) sums only positive elements. Calculate (version 3) based on the * operation type returns the sum of all positive elements or the average of all positive elements.
 */

public class ArrayManipulator {

    public static void main(String[] args) {
        // Your personalized test array
        int[] testArray = {-2, 9, 0, 6, 2, 8, -9}; // Replace with your generated array based on your student ID
        //{-1, 2, 3, 4, 5, 6, -7};
        // write code to print the array element

        // Task 1: Calculate sum of all elements
        System.out.println("Sum of all elements: " + calculate(testArray));

        // Task 2: Calculate sum of only positive elements
        System.out.println("Sum of positive elements (using overloaded version1): " + calculate(testArray, true));//taking only pos num
        System.out.println("Sum of all elements (using overloaded version1): " + calculate(testArray, false));

        // Task 3: Calculate average of positive elements
        System.out.println("Average of positive elements (using overloaded version2): " + calculate(testArray, "average"));
        System.out.println("Sum of positive elements (using overloaded version2): " + calculate(testArray, "sum"));
        
       
        
    }
   
    

   //takes an array of integers (nums) as a parameter and returns the sum of elements in the array
   public static int calculate(int[] nums) {
    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      }

    return sum;
    }

    //When onlyPositives = true, return sum of positive numbers. If false return sum of all numbers
    public static int calculate(int[] nums, boolean onlyPositives) {
     int sum = 0;

    for (int i = 0; i < nums.length; i++) {
      if (onlyPositives) {
        if (nums[i] > 0) {
          sum += nums[i];
          }

      } else {
         sum += nums[i];
        }
     }
      return sum;
    }
    

    /*
    operation = "sum", return sum of positive numbers
    operation = "average" return average of positive numbers
    */
    public static double calculate(int[] nums, String operation) {
      double count = 0;
      double sum = 0;

      for (int i = 0; i < nums.length; i++) {
        if (nums[i] > 0) {
              sum += nums[i];
              count++;
            } 
        }
      

      if (operation.equals("average")) {
        if (count == 0) {
          return 0;
        }
        return sum / count;
      }

      if (operation.equals("sum")) {
        return sum;
      }

      //event that neither operations are input
      return 0;
    }

}
