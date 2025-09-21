import java.util.Scanner;

class digits{
public static void main(String args[]){

Scanner scan=new Scanner(System.in);
int a; 
System.out.println("enter a three digit number");
a = scan.nextInt();
int rem;
int sum = 0,rev=0;

while(a>0){
rem = a%10;
rev=rev*10+rem;
sum+=rem;
a = a/10;}
System.out.println("the sum of digits is " + sum); 
System.out.println("the reverse of num is " +  rev); 
System.out.println("AADITIYA CHAUHAN 24CSU362");
}}