import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {		
Scanner scan = new Scanner(System.in);

System.out.print("Enter the size of the array: ");
int s = scan.nextInt();

int[] arr = new int[s];
int[] reverse = new int[s];

System.out.println("Enter " + s + " elements:");
for (int i = 0; i < s; i++) {
arr[i] = scan.nextInt();
}

for (int i = 0; i < s; i++) {
reverse[i] = arr[s - 1 - i];}
System.out.println("Reversed array:");
for (int i = 0; i < s; i++) {
System.out.print(reverse[i] + " ");}
System.out.println("\nAADITIYA CHAUHAN 24CSU362");
}
}
