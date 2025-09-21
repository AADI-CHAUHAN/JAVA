import java.util.Scanner;

public class area{
int length;
int breadth;

void area(int l,int b){
length = l;
breadth = b;}

int returnarea(){
return length*breadth;}


public static void main(String args[]){
Scanner scan = new Scanner(System.in);
area a = new area();
System.out.println("enter the length of the rectangle");
int l = scan.nextInt();
System.out.println("enter the breath of the rectangle");
int b = scan.nextInt();
a.area(l,b);
System.out.println("the Area of rectangle is " + a.returnarea());
System.out.println("AADITIYA CHAUHAN 24CSU362");
}
}