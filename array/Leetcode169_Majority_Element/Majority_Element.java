package Leetcode169_Majority_Element;

import java.util.HashMap;
import java.util.Arrays;


public class Majority_Element {
	public static int majorityElement(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int major_n =(int) Math.floor(nums.length/2);
		for (int num: nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
			if (map.get(num)>major_n) return num;
		}
		return 0;
    }
	
	public static int majorityElement2(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length/2];
    }
	
	public static int majorityElement3(int[] nums) {
		int major = nums[0];
		int count = 1;
		for (int num : nums) {
			if (major == num) {
				count++;
			}
			else if (count == 1) {
				major = num;
				count = 0;
			}
			else count--;
		}
		return major;
    }
	
	
	public static void main(String[] args) {
		int[] nums = {2,3,3,4,1,3,3};
		System.out.println(majorityElement3(nums));
	}
}
