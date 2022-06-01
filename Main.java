import java.util.*;

class Main {
  public static void main(String[] args) {
    /**
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
  **/ 

    int[] nums = {1,2,3,1};


    System.out.println(containsDuplicate(nums));


    /**
      SOLUTION: 
      - First, initialize an empty HashSet<Integer>
      - Create a for each loop and iterate through each element 'num' in nums, adding each 'num' to your Set.
      - While looping, if a duplicate is found, exit loop and return true.
      - If at end of program, return false.
    **/

    
    
  }

  public static boolean containsDuplicate(int[] nums) {
        
    HashSet<Integer> numbers = new HashSet<Integer>();
        
    for (int num : nums)
    {
        if(numbers.contains(num))
        {
            return true;
        }
        
        numbers.add(num);
    }
    
    return false;
}

  
}