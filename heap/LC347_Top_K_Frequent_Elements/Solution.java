package LC347_Top_K_Frequent_Elements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
	public static List<Integer> topKFrequent(int[] nums, int k) {
		List<Integer>[] bucket  = new List[nums.length+1];
		HashMap<Integer, Integer> map =  new HashMap<Integer, Integer>();
		
		for (int n: nums) {
			map.put(n, map.getOrDefault(n,0)+1);
		}
		
		for (int key: map.keySet() ) {
			int freq = map.get(key);
			if (bucket[freq]==null) {
				bucket[freq] = new ArrayList<>();
			}
			bucket[freq].add(key);
		}
		
		List<Integer> res = new ArrayList<Integer>();
		for (int i = bucket.length-1; i > 0 && res.size() < k; i--) {
			if (bucket[i]!=null) {
				res.addAll(bucket[i]);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		int nums[] = {1,1,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,5,5};
		System.out.println(topKFrequent(nums, 2));
	}
}
