class Level3Exception extends Exception {
public Level3Exception(String message) {
super(message);
}
}
class Level2Exception extends Level3Exception {
public Level2Exception(String message) {
super(message);
}
}
class Level1Exception extends Level2Exception {
public Level1Exception(String message) {
super(message);
}
}
class A {
public void performAction() throws Level3Exception {
throw new Level3Exception("Exception from Level 3 (Class A)");
}
}
class B extends A {
public void performAction() throws Level2Exception {
throw new Level2Exception("Exception from Level 2 (Class B)");
}
}
class C extends B {
public void performAction() throws Level1Exception {
throw new Level1Exception("Exception from Level 1 (Class C)");
}
}
public class ExceptionHierarchyDemo {
public static void main(String[] args) {
A Object = new C();

try {
Object.performAction();
} catch (Level1Exception e) {
System.out.println("Caught Level 1 Exception: " + " " + e);
} catch (Level2Exception e) {
System.out.println("Caught Level 2 Exception: " + " " + e);
} catch (Level3Exception e) {
System.out.println("Caught Level 3 Exception: " + " " + e);
} catch (Exception e) {
System.out.println("Caught a generic Exception: " + e);
} finally {
System.out.println("Finally block executed.");
System.out.println("AADITIYA CHAUHAN 24CSU362");

}
}
}