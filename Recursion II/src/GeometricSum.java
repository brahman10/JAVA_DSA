
import java.lang.Math;
public class GeometricSum {

	public static double findGeometricSum(int k){
		// Write your code here
        if(k==0)
            return 1;
        
        double small = findGeometricSum(k-1);
        return small+1/(Math.pow(2,k));

	}
}
