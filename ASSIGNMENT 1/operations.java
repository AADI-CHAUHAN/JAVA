import java.util.Scanner;

class operations{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a;
int b; 
System.out.println("enter the value of a");
a = scan.nextInt();S
System.out.println("enter the value of b");
b = scan.nextInt();
System.out.println("a sum" ); 
System.out.println("b difference" );
System.out.println("c product");
System.out.println("d divison" );
System.out.println("e modulous");
System.out.println("enter the your choice"); 

String choice;
choice = scan.next(); 
int sum = a+b;
int difference = a-b;
int product = a*b;
int div = a/b;
int modu = a%b;

if(choice.equals("a")){
System.out.println("the sum is " + sum);}
else if(choice.equals("b")){ 
System.out.println("the difference is " + difference);}
else if(choice.equals("c")){
System.out.println("the product is " + product);}
else if(choice.equals("d")){
System.out.println("the div is " + div);}
else if(choice.equals("e")){
System.out.println("the modu is " + modu);} 
System.out.println("AADITIYA CHAUHAN 24SCU362");
}
}