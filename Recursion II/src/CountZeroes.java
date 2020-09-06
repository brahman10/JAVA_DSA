
public class CountZeroes {

	public static int countZerosRec(int n){
		// Write your code here
        
        int c=0;
        
        if(n<10)
        {
            if(n==0)
                return 1;
            else
                return 0;
        }
        
        if(n%10==0)
            c=1;
        
        int a = countZerosRec(n/10);
        
        return a+c;
        
	}
}

