package com.balazsholczer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by a275492 on 11.10.2019.
 */
public class DynamicProgramming {

    private int S;
    private final Map<Integer, Integer> hashTable;
    private final int[] nums;

    public DynamicProgramming(int[] nums, int S) {
        this.hashTable = new HashMap<>();
        this.nums = nums;
        this.S = S;
    }

    public void solve() {
        for (int i=0; i<nums.length; ++i) {
            int remainder = S - nums[i];
            if (hashTable.containsValue(remainder))
                System.out.println("Solution: " + nums[i] + " + " + remainder + " = " + S);
            hashTable.put(i, nums[i]);
        }
    }
}
