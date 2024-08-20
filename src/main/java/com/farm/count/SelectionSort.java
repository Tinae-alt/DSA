package com.farm.count;

public class SelectionSort {
    public static void main(String[] args) {
    int nums[] = {6,5,2,8,9,4};
    int size = nums.length;
    int temp = 0;
    int numIndex;

        System.out.println("Before sorting");
        for(int num:nums)
    {
        System.out.print(num + " ");
    }
        for (int i = 0; i < size-1; i++){
            //NumIndex is used to hold the element to compare with all other elements
            numIndex = i;
        for (int j = i+1; j < size; j++){

            if(nums[numIndex] > nums[j])
            {
                System.out.println("numin" + nums[numIndex]);
                temp = nums[numIndex];
                nums[numIndex] = nums[j];
                nums[j] = temp;
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
