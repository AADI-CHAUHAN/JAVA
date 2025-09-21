import java.util.Scanner;

public class MinutesConverter {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

System.out.print("Enter total minutes: ");
int m =  scan.nextInt();

int td = m / (60 * 24); 

int y= td / 365;
int rd = td % 365;
int mon = rd / 30;  
int d = rd % 30;

System.out.println(m + " minutes is approximately:");
System.out.println( y + " years, " + mon + " months, and " + d + " days.");
System.out.println("AADITIYA CHAUHAN 24CSU362");
}
}
