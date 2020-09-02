
public class LastIndex {

	public static int lastIndex(int a[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        if(a.length==1)
        {
            if(a[0]==x){
                return 0;
            }
            else
                return -1;
            
        }
        if(a[a.length-1]==x)
            return a.length-1;
        
        int arr[]=new int[a.length-1];
        for(int i=a.length-2;i>=0;i--)
        {
            arr[i]=a[i];
        }
        int result = lastIndex(arr,x);
        if(result==-1)
            return -1;
        else
            return result;
	}
	
}