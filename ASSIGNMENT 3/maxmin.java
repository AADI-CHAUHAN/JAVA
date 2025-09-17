import java.util.Scanner;

class maxmin{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in); 
int a;
System.out.println("enter the length of the array");
a = scan.nextInt();
int arr[] = new int[a];
for(int i=0;i<a;i++){ 
System.out.println("enter the no");
arr[i] = scan.nextInt();
}
System.out.println("the array is");
for(int i=0;i<a;i++){ 
System.out.println(arr[i] + "\t");
}


int max = arr[0];
int min = arr[0];
for(int i =0;i<a;i++){
if (arr[i]>max){
max = arr[i];
}}
System.out.println("max no is " + max);

for(int i =0;i<a;i++){
if (arr[i]<min){
min = arr[i];
}}
System.out.println("min no is " + min);
System.out.println("AADITIYA CHAUHAN 24CSU362");
}}
