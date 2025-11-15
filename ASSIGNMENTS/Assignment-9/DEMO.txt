import java.io.File;
import java.util.Scanner;

public class CheckFileOrDirectory{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.print("Enter the path: ");
String path=scanner.nextLine();
scanner.close();
File file=new File(path);
if(file.exists()){
if(file.isFile()){
System.out.println("The path refers to a file.");
}else if(file.isDirectory()){
System.out.println("The path refers to a directory.");
}
}else{
System.out.println("The specified path does not exist.");
}
System.out.println("AADITIYA CHAUHAN 24CSU362");
}
}
