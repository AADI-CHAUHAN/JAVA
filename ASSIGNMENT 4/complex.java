import java.util.Scanner;

public class complex{
double real1;
double real2;
double imag1;
double imag2;

complex(double a,double b,double c,double d){
real1 = a;
imag1 = b;
real2 = c;
imag2 = d;}

public void sum(){
double sumr = real1 + real2;
double sumi = imag1 + imag2;
System.out.println("the sum of imaginary numbers are " + sumr + " + " + sumi + "i");  }

public void diff(){
double diffr = real1 - real2;
double diffi = imag1 - imag2;
System.out.println("the difference of imaginary numbers are " + diffr + " + " + diffi + "i");  }
public void product(){
double prodr = (real1*real2) + (imag1*imag2);
double prodi= (real1*imag2) - (imag1*real2);
System.out.println("the product of imaginary numbers are " + prodr + " + " + prodi + "i");} 
public static void main(String args[]){
Scanner scan = new Scanner(System.in);

System.out.println("Enter the real and imaginary part of first complex number:");
double x1 = scan.nextDouble(); 
double x2 = scan.nextDouble();
System.out.println("Enter the real and imaginary part of second complex number:");
double x3 = scan.nextDouble(); 
double x4 = scan.nextDouble(); 
complex c = new complex(x1,x2,x3,x4);
c.sum();
c.diff();
c.product();
System.out.println("AADITIYA CHAUHAN 24CSU362");
}
}