
public class PairStar {

	// Return the updated string
	public static String addStars(String s) {
		// Write your code here

        if(s.length()==1)
            return s;
        
        String a = s.substring(1);
        
        String b = addStars(a);
        
        if(s.charAt(0)==s.charAt(1))
            return s.charAt(0)+"*"+b;
        else
            return s.charAt(0)+b;
        
	}
}