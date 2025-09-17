public class Point {
double x;
double y;

public Point() {
x = 0.0;
y = 0.0;}

public Point(double a, double b) {
x = a;
y = b;}

public double getX() {
return x;}

public void setX(double a) {
x = a;}

public double getY() {
return y;}

public void setY(double b) {
y = b;}

public double distance(Point p) {
return Math.sqrt(Math.pow((x - p.x), 2) + Math.pow((y - p.y), 2));}

public void display() {
System.out.printf("%7.2f %7.2f\n", x, y);
}
}
