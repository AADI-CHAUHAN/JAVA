public class triangle{
int a;
int b;
int c;
triangle(){
a = 3;
b = 4;
c = 5;}

public static void main(String args[]){
triangle t = new triangle();
int s = (t.a + t.b +t.c)/2;
int s1=s*(s-(t.a))*(s-(t.b))*(s-(t.c));
double area = Math.sqrt(s1);
System.out.println("the Semi-perimeter of triangle is "+s);
System.out.println("the Area of triangle is "+area);
System.out.println("AADITIYA CHAUHAN 24CSU362");
 }}