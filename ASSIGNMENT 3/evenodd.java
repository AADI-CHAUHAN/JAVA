import java.util.Scanner;

public class evenodd {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

System.out.print("Enter the size of the array: ");
int s = scan.nextInt();
int[] arr = new int[s];
System.out.println("Enter " + s + " elements:");
for (int i = 0; i < s; i++) {
arr[i] = scan.nextInt();}

int evenCount = 0, oddCount = 0;
for (int i = 0; i < s; i++) {
if (arr[i] % 2 == 0) {
evenCount++;
} else {
oddCount++;}
}
int[] evenArr = new int[evenCount];
int[] oddArr = new int[oddCount];
int eI = 0, oI = 0;
for (int i = 0; i < s; i++) {
if (arr[i] % 2 == 0) {
evenArr[eI++] = arr[i];
} else {
oddArr[oI++] = arr[i];} 
}
System.out.println("Even numbers (" + evenCount + "):");
for (int i = 0; i < evenCount; i++) {
System.out.print(evenArr[i] + " ");}
System.out.println();
System.out.println("Odd numbers (" + oddCount + "):");
for (int i = 0; i < oddCount; i++) {
System.out.print(oddArr[i] + " ");
}
System.out.print("\nAADITIYA CHAUHAN 24CSU362");
}}
