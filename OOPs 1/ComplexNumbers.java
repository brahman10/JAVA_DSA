public class ComplexNumbers {
	// Complete this class
	
    int real;
    int imaginary;

    public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    
    public void print(){
        System.out.println(real+" + i"+imaginary);
    }
    
    public void plus(ComplexNumbers c1){
        
        this.real=this.real + c1.real;
        this.imaginary = this.imaginary + c1.imaginary;
    }
    
    public void multiply(ComplexNumbers c1){
        
        int real1 = (this.real*c1.real)-(this.imaginary*c1.imaginary);
        int imag1 = (this.real*c1.imaginary)+(this.imaginary*c1.real);
        this.real = real1;
        this.imaginary = imag1;
    }
    
}
