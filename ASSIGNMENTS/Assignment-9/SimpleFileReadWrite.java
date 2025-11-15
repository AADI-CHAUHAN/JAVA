import java.io.*;
import java.io.IOException;

class SimpleFileReadWrite{
public static void main(String[] args){
try{
FileWriter writer=new FileWriter("example.txt");
writer.write("Hello, this is a simple file write and read example.\n");
writer.write("This is sooo fun");
writer.close();
System.out.println("Data written to file successfully.");

FileReader reader=new FileReader("example.txt");
int ch;
System.out.println("Reading data from file:");
while((ch=reader.read())!=-1){
System.out.print((char)ch);
}
reader.close();
}catch(IOException e){
System.out.println("An error occurred: "+e.getMessage());
}
System.out.println("\n AADITIYA CHUHAN 24CSU362");
}
}
