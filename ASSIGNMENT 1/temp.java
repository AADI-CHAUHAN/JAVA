import java.util.Scanner;

class temp{
public static void main(String args[]){

Scanner scan=new Scanner(System.in);
String choice;
System.out.println("Do you want to give  temp in C/F");
choice = scan.next();
if(choice.equals("C")){ 
double a;
System.out.println("enter a temp in celsius");  
a = scan.nextDouble();

double feren = (1.8 * a) + 32;

System.out.println("temperature in Fahrenheit is " + feren); 
}
else if(choice.equals("F")){
double b; 
System.out.println("enter a temp in Ferenheit"); 
b = scan.nextDouble();

double celci = (b - 32) * 0.55;

System.out.println("temperature in Fahrenheit is " + celci);
}
System.out.println("AADITIYA CHAUHAN 24CSU362");
}}


