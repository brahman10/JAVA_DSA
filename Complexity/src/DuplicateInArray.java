
public class DuplicateInArray{	

	public static int duplicate(int[] arr){  
		/* Your class should be named DuplicateInArray
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        int n = arr.length;
        int sum = ((n-2)*(n-1))/2;
        int sum1=0;
        for(int i=0;i<arr.length;i++)
        {
            sum1=sum1+arr[i];
        }
        
        return sum1-sum;

	}
}