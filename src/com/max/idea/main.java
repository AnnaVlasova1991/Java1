package com.max.idea;

public class main {
    public static void main(String[] args) {
        lesson2();
        lesson3();
    }

    public static void lesson2(){
        double a = 5.856;
        byte b = 127;
        System.out.println(a);
        System.out.println(b);
    }

    public static void lesson3(){
        int[] nums = {1, 2, 3, 4, 5};
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1]= temp;

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        int summ = nums[0] + nums[nums.length / 2];
        System.out.println(summ);
    }
}
