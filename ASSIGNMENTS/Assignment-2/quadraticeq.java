import java.util.Scanner;

class quadraticeq{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("Quadratic equation is as follows  ax^2 + bx + c = 0");
System.out.println("enter the value of a");
int a = scan.nextInt();
System.out.println("enter the value of b");
int b = scan.nextInt();
System.out.println("enter the value of c");
int c = scan.nextInt();
double d = (b*b)-(4*a*c);
if (d>0){
System.out.println("the roots are real and distinct");
double t = Math.sqrt(d);
double root1 = (-b+t)/(2*a);
double root2 = (-b-t)/(2*a);
System.out.println("the roots are " + root1 + " and " + root2);}

else if(d==0){
System.out.println("the roots are real and equal");
double t = Math.sqrt(d);
double root1 = (-b+t)/(2*a);
System.out.println("the roots are " + root1 + " and " + root1);}

else{
System.out.println("the roots are imaginary");
double rootr = - b/(2*a);
double t = Math.sqrt(-d);
double rooti = (t)/(2*a);
System.out.println("The roots are "+rootr+" + "+rooti+"i and "+rootr+" - "+rooti+ "i"
);
}
System.out.println("AADITIYA CHAUHAN 24CSU362");
}
}