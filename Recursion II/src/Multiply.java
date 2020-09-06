
public class Multiply {

	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
	
        if(n==1)
            return m;
        
        int a = multiplyTwoIntegers(m, n-1);
        return a+m;
	}
}