/* 09/05/2014

On the airplane to China where I dually embark
a) on a long journey to my best friend's wedding and
b) on an even longer journey of Java review

Sublime commands:
- Cmd+shift+p set build settings to Java

Preferred syntax:
- Variable/methods lowercase and camel case
- Class names uppercase

Objects, classes and methods:
- Every object belongs to a class; classes define allowed methods for objects
- You get errors if you call a method on an object from the wrong class because that class doesn't have that method, e.g. System.out.length() instead of word.length()
- The public interface (methods) tells you what you can do with class objects
- The private implementation (hidden) describes how the methods are carried out

Object:
- System.out
Class:
- PrintStream
Methods:
- println(), print()

String class methods:
- length(), toUpperCase(), replace()

Methods and parameters:
- Parameters are inputs to method calls
- E.g. System.out.println("Hello, World");
- The implicit parameter is the object on which the method is invoked and appears before the method with dot syntax, e.g. System.out.
- The explicit parameter is inside the parentheses ("Hello, World")
- The return value is a value the method returns and can be assigned to a variable, e.g. length = greetings.length(), also note print has no return value
*/

public class HelloPrinter {
	public static void main(String[] args) {

		// Display a greeting in the console window
		System.out.println("Hello, World!");

		// Declare an int value and initialize it with a String method call
		String greeting = "Ni hao ma, shi jie!";
		int length;
		length = greeting.length();
		System.out.println("'" + greeting + "' has " + length + " characters");

		String newGreeting = greeting.replace("Ni hao ma", "Hola");
		System.out.println(newGreeting);

	}
}