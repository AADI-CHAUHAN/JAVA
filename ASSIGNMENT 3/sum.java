import java.util.Scanner;

class sum{ 

public static void main(String args[]){
Scanner scan = new Scanner(System.in);
System.out.println("enter the  length of the array");
int r = scan.nextInt();
int arr1[] = new int[r];

System.out.println("enter the elements of 1st array");
for( int i = 0;i<r;i++){
arr1[i] = scan.nextInt();}

for(int i=0;i<r;i++)
{ System.out.print(arr1[i]+" "); }
System.out.print("\n");

System.out.println("MENU:");
System.out.println("1. Find sum of all elements");
System.out.println("2. Find sum of even alternate elements");
System.out.println("Enter your choice:");
int choice = scan.nextInt();

if(choice == 1){
int sum =0;
for(int i=0;i<r;i++){
sum+=arr1[i];}
System.out.println("the sum is " + sum); }
else if(choice == 2){
int sum2 = 0;
for(int i = 0;i<r;i+=2){
sum2+=arr1[i];}
System.out.println("the sum of even alternate elements " + sum2);
}
else{
System.out.println("Invalid choice");}
System.out.println("AADITIYA CHAUHAN 24CSU362");
}}

