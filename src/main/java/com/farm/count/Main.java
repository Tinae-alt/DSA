package com.farm.count;


public class Main {
    public static void main(String[] args) {

        int nums[] ={5,7,9,11,13};
        int target = 11;
//        int result = linearSearch(nums,target);
        int result = binarySearch(nums,17);
         if(result != -1)
             System.out.println("Element found at index " + result);
         else
             System.out.println("Element not found");

    }

    private static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }
        return -1;
    }
    private static int binarySearch(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
       while (left <= right) {
           int mid = (left + right) / 2;

           if (nums[mid] == target)
               return mid;
           else if (nums[mid] < target)
               left = mid + 1;
           else if (nums[mid] > target)
               right = mid - 1;
       }

        return -1;
    }
}