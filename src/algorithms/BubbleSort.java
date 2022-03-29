package algorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] balls = {10, 2, 8, 6, 7, 3};
		
		for(int i = 0; i < balls.length; i++) {
			
			for(int j = 0; j < balls.length; j++) {
				
				if(balls[i] < balls[j]) {
					int temp = balls[j];
					balls[j] = balls[i];
					balls[i] = temp;
				}
				
			}
			
		}
		
		System.out.println(Arrays.toString(balls));
		
	}

}
