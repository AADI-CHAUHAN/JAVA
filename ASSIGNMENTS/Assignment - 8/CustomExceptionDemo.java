class MyCustomException extends Exception {
private String message;
public MyCustomException(String message) {
this.message = message;
}
public void printMessage() {
System.out.println("Stored message: " + this.message);
}
}
public class CustomExceptionDemo {
public static void main(String[] args) {
try {
System.out.println("Entering the try block.");
boolean errorCondition = true;
if (errorCondition) {
throw new MyCustomException("Something went wrong!");
}
System.out.println("This line will not be executed.");
} catch (MyCustomException e) {
System.out.println("Caught the custom exception.");
e.printMessage();
}
System.out.println("Program continues after the catch block.");
}
}