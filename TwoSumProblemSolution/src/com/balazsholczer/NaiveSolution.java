package com.balazsholczer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by a275492 on 11.10.2019.
 */
public class NaiveSolution {

    private int S;
    private final int[] nums;

    public NaiveSolution(int[] nums, int S) {
        this.nums = nums;
        this.S = S;
    }

    public void solve() {
        for (int i=0; i<nums.length; ++i) {
            for (int j=0; j<nums.length; ++j) {
                if (nums[i] + nums[j] ==S)
                System.out.println("Solution: " +  nums[i] + " + " + nums[j] + " = " + S);
            }
        }
    }
}
