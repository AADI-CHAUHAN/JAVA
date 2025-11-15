public class maincircle{
public static void main(String args[]){

circle c1 = new circle(5.0);
System.out.println("circle perimeter: "+ c1.getperimeter());
System.out.println("circle area: "+ c1.getarea());

resizeablecircle c2 = new resizeablecircle(10.0);
System.out.println("ResizableCircle Perimeter before resize: " + c2.getperimeter());
System.out.println("ResizableCircle Area before resize: " + c2.getarea());       

c2.resize(50); 
System.out.println("ResizableCircle Perimeter after resize: " + c2.getperimeter());        
System.out.println("ResizableCircle Area after resize: " + c2.getarea());
System.out.println("AADITIYA CHAUHAN 24CSU362");
}}