import java.util.Scanner;

public class FirstIndex {

	
	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(FirstIndex.firstIndex(input, x));
	}
	
	public static int firstIndex(int a[], int x) {
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
        if(a[0]==x)
            return 0;
        
        int arr[]=new int[a.length-1];
        for(int i=1;i<a.length;i++)
        {
            arr[i-1]=a[i];
        }
        int result = firstIndex(arr,x);
        if(result==-1)
            return -1;
        else
            return result+1;
        
        
	}
	
}