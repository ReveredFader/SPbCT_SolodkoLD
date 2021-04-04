package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[4];;

        Scanner in = new Scanner(System.in);

        for (int i=0; i<4; i++){
            nums[i] = in.nextInt();
        }

        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        for (int i=0; i<4; i++) {
            if (nums[i] % 2 == 0)
                nums2.add(nums[i]);
        }
        Collections.sort(nums2);
        System.out.println(nums2);
    }
}
