
public class SumOfDigits {

	public static int sumOfDigits(int n){
		// Write your code here
        
        if(n<10)
            return n;
        
        int a = sumOfDigits(n/10);
        
        return a+n%10;

	}
}

