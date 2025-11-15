import java.io.*;
class StudentFileReadWrite{
public static void main(String[] args){
try{
BufferedWriter bw=new BufferedWriter(new FileWriter("student.txt"));
bw.write("Serial No: 1");
bw.newLine();
bw.write("First Name: Aaditiya Chauhan");
bw.newLine();
bw.write("CGPA: 8.9");
bw.newLine();
bw.write("Grade: A");
bw.newLine();
bw.close();
System.out.println("Data written successfully.\n");

BufferedReader br=new BufferedReader(new FileReader("student.txt"));
String line;
System.out.println("Reading data from file:");
while((line=br.readLine())!=null){
System.out.println(line);
}
br.close();
System.out.println("AADITIYA CHUHAN 24CSU362");
}catch(IOException e){
System.out.println("Error: "+e.getMessage());
}
}
}
