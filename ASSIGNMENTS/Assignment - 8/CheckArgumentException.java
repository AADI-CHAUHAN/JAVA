import java.util.Scanner;
class CheckArgumentException extends Exception {
public CheckArgumentException(String msg) {
super(msg);
}
} 
public class SumFive {
public static void main(String[] args) throws CheckArgumentException {
Scanner sc=new Scanner(System.in);
System.out.print("How many integer arguments do you want to enter? ");
int n=sc.nextInt();
int[] nums=new int[n];
for(int i=0;i<n;i++){
System.out.print("Enter argument #"+(i+1)+": ");
nums[i]=sc.nextInt();
}
if(n<5){
throw new CheckArgumentException("Expected 5 arguments, but only "+n+" supplied.");
}
int sum=0;
for(int v:nums)sum+=v;
System.out.println("Sum of the five numbers = "+sum);
}
}