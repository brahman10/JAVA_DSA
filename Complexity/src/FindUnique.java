
public class FindUnique{	

	public static int findUnique(int[] arr){
		/* Your class should be named FindUnique
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		 */
    
    
        int xor=0;
       
        for(int i=0;i<arr.length;i++)
       	{
           xor = myXOR(xor,arr[i]);
       	}
        
        return xor;
        
	}
    
    public static int myXOR(int x, int y) 
	{ 
		return (x & (~y)) | ((~x )& y); 
	} 
    
  
}
