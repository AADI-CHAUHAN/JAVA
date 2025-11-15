public class ExceptionDemo {
public static void main(String[] args) {
System.out.println("Program started.");
try {
System.out.println("Inside the try block");
throw new Exception("This is exception message.");
} catch (Exception e) {
System.out.println("Caught exception message: " + e);
} finally {
System.out.println("Inside the finally block");
}
System.out.println("Program finished.");
System.out.println("AADITIYA CHAUHAN 24CSU362");
}
}