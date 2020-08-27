

public class Solution {  

    public static void rotate(int[] arr, int d) {
    	//Your code goes here
        
        int temp[] = new int[d];
        for(int i=0;i<d;i++)
        {
            temp[i]=arr[i];
        }
        for(int j=0;j<arr.length-d;j++)
        {
            arr[j]=arr[j+d];
        }
        int k=0;
        for(int m=(arr.length)-d;m<arr.length;m++)
        {
            arr[m]=temp[k];
            k++;
        }
    }

}