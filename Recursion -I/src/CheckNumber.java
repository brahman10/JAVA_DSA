
public class CheckNumber {
	
	public static boolean checkNumber(int a[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
        
        if(a.length==1)
        {
            if(a[0]==x){
                return true;
            }
            else
                return false;
            
        }
        if(a[0]==x)
            return true;
        
        int arr[]=new int[a.length-1];
        for(int i=1;i<a.length;i++)
        {
            arr[i-1]=a[i];
        }
        
        boolean check = checkNumber(arr,x);
        return check;
	}
}