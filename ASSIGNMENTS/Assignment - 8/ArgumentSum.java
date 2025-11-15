class CheckArgumentException extends Exception {
public CheckArgumentException(String message) {
super(message);
}
}

public class ArgumentSum {
public static void main(String[] args) {
try {
if (args.length < 5) {
throw new CheckArgumentException("Error: Number of arguments is less than 5. Please provide exactly 5 integer arguments.");
}

int sum = 0;
for (int i = 0; i < 5; i++) {
try {
sum += Integer.parseInt(args[i]);
} catch (NumberFormatException e) {
System.out.println("Error: Argument '" + args[i] + "' is not a valid integer. Exiting.");
return;
}
}
System.out.println("The sum of the five numbers is: " + sum);
} catch (CheckArgumentException e) {
System.out.println(e);
}

System.out.println("AADITIYA CHAUHAN 24CSU362");
}
}