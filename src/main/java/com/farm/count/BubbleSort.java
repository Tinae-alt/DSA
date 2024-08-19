package com.farm.count;

public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = {6,5,2,8,9,4};
        int size = nums.length;
        int temp = 0;

        System.out.println("Before sorting");
        for(int num:nums)
            {
                System.out.print(num + " ");
            }
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size-i-1; j++){
                //NB The way the inner loop accesses the second
                // element of the outer array during the first iteration
                // is through the index arithmetic nums[j] and nums[j+1].
                    if(nums[j] > nums[j+1])
                    {
                        temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                    }
                System.out.print("After iteration " + (i + 1) + ": ");
                for (int num : nums) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }

        }
        System.out.println();
        System.out.println("After sorting");
        for(int num:nums)
        {
            System.out.print(num + " ");
        }
    }
}
