

public class StringPalindrome {

	public static boolean isStringPalindrome(String input) {
		// Write your code here
        int n = input.length();
        if(n<=1)
            return true;
            
        if(input.charAt(0)!=input.charAt(n-1))
            return false;
        
        String a = input.substring(1,n-1);
    
        boolean palindrome = isStringPalindrome(a);
        
        return palindrome;

	}
}

