package algorithms;

import java.util.Arrays;

public class Segregate0sand1s {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(segregate(new int[] {0,1,0,1,1,1,0,0,1})));
	}

	private static int[] segregate(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		
		while(left < right) {
			
			while(arr[left] == 0 && left < right) {
				left++;
			}
			
			while(arr[right] == 1 && left < right) {
				right--;
			}
			
			if(left < right) {
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
		}
		return arr;
	}
}
