import java.util.Scanner;

public class Search {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

System.out.print("Enter the size of the array: ");
int s = scan.nextInt();
int[] arr = new int[s];

System.out.println("Enter " + s + " elements:");
for (int i = 0; i < s; i++) {
arr[i] = scan.nextInt();
}

System.out.print("Enter the element to search: ");
int d = scan.nextInt();

int t = -1; 
for (int i = 0; i < s; i++) {
if (arr[i] == d) {
t = i;
break;
}
}

if (t != -1) {
System.out.println("Element found at index: " + t);
} else {
System.out.println("Element not found in the array -1 ");
}

System.out.println("AADITIYA CHAUHAN 24CSU362");
    }
}
