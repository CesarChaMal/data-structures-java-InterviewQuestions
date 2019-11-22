package com.balazsholczer;

public class app {

    public static void main(String[] args) {
        int[] nums = {3, 5, 2 , -4, 8, 11};
        int S = 7;

        System.out.println("Naive Solution O(N^2)");
        NaiveSolution naivesolution = new NaiveSolution(nums, S);
        naivesolution.solve();

        System.out.println();

        System.out.println("Naive Solution O(N)");
        DynamicProgramming dynamicprogramming = new DynamicProgramming(nums, S);
        dynamicprogramming.solve();
    }
}
