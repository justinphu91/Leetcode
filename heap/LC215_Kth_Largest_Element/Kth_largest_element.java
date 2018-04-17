package LC215_Kth_Largest_Element;

import java.util.PriorityQueue;

public class Kth_largest_element {
	public static void main(String[] args) {
		int[] array = {5,1,2,8,0,3,12};
		System.out.println(findkthlargest2(array,3));
	}
	
	public static int findkthlargest(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for (int val: nums) {
			pq.offer(val);
			if (pq.size()>k) pq.poll();
		}
		return pq.poll();
	}
	
	public static int findkthlargest2(int[] nums, int k) {
        k = nums.length - k;
		int lo = 0;
		int hi = nums.length-1;
		while(lo < hi) {
			int j = partion(nums, lo, hi);
			if (j < k) {
				lo = j+1;

			}
			else if (j>k) {
				hi = j-1;
			}
			else break;
		}
		return nums[k];
	}
	public static int partion (int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j <= high-1; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i]= temp;
			}
		}
		return i+1;
	}
	
}

