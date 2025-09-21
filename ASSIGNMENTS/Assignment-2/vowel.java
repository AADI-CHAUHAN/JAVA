import java.util.Scanner;

class vowels{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter a string");
String str = scan.next();
if(str.length() > 1 || !Character.isLetter(str.charAt(0))){
System.out.println("Please enter a single alphabet letter");
}
else{
char input = Character.toLowerCase(str.charAt(0));
if(input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u'){
System.out.println("it is a vowel");
}
else{
System.out.println("it is a consonant");
}
}

System.out.println("AADITIYA CHAUHAN 24CSU362");

}}
