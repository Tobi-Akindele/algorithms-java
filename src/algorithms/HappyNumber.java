package algorithms;

public class HappyNumber {
	
	public static void main(String[] args) {
		
		int num = 82;  
        int result = num;  
          
        while(result != 1 && result != 4){  
            result = isHappy(result);  
        }  
          
        //Happy number always ends with 1  
        if(result == 1)  
            System.out.println(num + " is a happy number");  
        //Unhappy number ends in a cycle of repeating numbers which contains 4  
        else if(result == 4)  
            System.out.println(num + " is not a happy number");
		
	}
	
	public static int isHappy(int num){  
        int rem = 0, sum = 0;  
          
        //Calculates the sum of squares of digits  
        while(num > 0){  
            rem = num%10;  
            sum = sum + (rem*rem);  
            num = num/10;  
        }  
        return sum;  
    }  

}
