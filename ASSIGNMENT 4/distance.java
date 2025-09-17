import java.util.Scanner;

public class Distance{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter x1 and y1: ");
double x1 = sc.nextDouble();
double y1 = sc.nextDouble();

System.out.print("Enter x2 and y2: ");
double x2 = sc.nextDouble();
double y2 = sc.nextDouble();

Point p1 = new Point(x1, y1);
Point p2 = new Point(x2, y2);

System.out.println("\nCoordinates:");
p1.display();
p2.display();
double dist = p1.distance(p2);
System.out.printf("\nDistance between points: %.2f\n", dist);
sc.close();
System.out.println("AADITIYA CHAUHAN 24CSU362");
}
}
