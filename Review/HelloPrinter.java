//
//  HelloPrinter.java
//
//  Created by Nina Baculinao on 9/5/14.
//

// Import Abstract Windowing Toolkit package, which contains Rectangle class
// System and String classes are in java.lang package, which is auto imported
// Syntax: import packageName.className;
import java.awt.Rectangle;

public class HelloPrinter {
	public static void main(String[] args) {

		// Display a greeting in the console window
		System.out.println("Hello, World!");

		// Declare an int value and initialize it with a String method call
		// Syntax: typeName variableName = value;
		String greeting = "Ni hao ma, shi jie!";
		int length = greeting.length();
		System.out.println("'" + greeting + "' has " + length + " characters");

		// Call String method with one implicit parameter, two explicit parameters, and a return value
		String newGreeting = greeting.replace("Ni hao ma", "Hola");
		System.out.println(newGreeting);

		// Construct new object, a rectangle with x, y, width and height values
		// Syntax: new ClassName(parameters);
		Rectangle box = new Rectangle(5, 10, 20, 30);

		// Print information about the new rectangle with accessor get methods
		System.out.println("New rectangle with x: " + box.getX() + ", y: " + box.getY() + ", width: " + box.getWidth() + " and height: " + box.getHeight());

		// Move the triangle with mutator method translate
		// No assignment because return type is void but implicit param changes
		box.translate(15, 25);

		// Print information about the moved rectangle
		// Good way to test is to create tester class with main method, display results of method calls and display expected values
		System.out.println("Moved x: " + box.getX());
		System.out.println("Expected: 20");

		System.out.println("Moved y: " + box.getY());
		System.out.println("Expected: 35");

	}
}

/* ---------------------------------------------------------

COMMENTS:

On the airplane to China where I dually embark
a) on a long journey to my best friend's wedding and
b) on an even longer journey of Java review

By the way, I learned that CMD+SHIFT+P is a quick way to change build settings to Java

------------------------------------------------------------

NOTES on BIG JAVA CHAPTER 2:

Preferred syntax:
  - Variable/methods lowercase and camel case
  - Class names uppercase

Calling a method:
  - A method is called by specifying an object, the method name and parameters
  - E.g. System.out.println("Hello, world") has out object in System class, println method and its parameters

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
  - length(), toUpperCase(), replace

Methods and parameters:
  - Parameters are inputs to method calls
  - E.g. System.out.println("Hello, World");
  - The implicit parameter is the object on which the method is invoked and appears before the method with dot syntax, e.g. System.out.
  - The explicit parameter is inside the parentheses ("Hello, World")
  - The return value is a value the method returns and can be assigned to a variable, e.g. length = greetings.length(), also note print has no return value
  - Methods are defined in their own classes
  - Methods are overloaded when a class has >1 method with the same name but different parameter types, e.g. println - and this is okay

Examples of String class method definitions:
  - public int length()
  - public String replace(String target, String replacement)
  - public void println(String output)
  - public void println(int output)

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
For fun... and comparison:

Replace method definition in Objective-C:
-(NSString*) replace:(NSString*)target withReplacement:(NSString*)replacement {
	target = replacement;
	return target;
}

Replace method definition in JavaScript:
function(target, replace){
	var target = replace;
	return target;
}
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Numbers:
- Numbers are not objects and number types are not classes, they're primitive types
- Number types have no methods, but numbers can be combined with operators

Object Construction:
  - To construct a new object, initialize it with construcruction parameters and return reference to the constructed object
  - Important: Constructors are not methods, so don't use them with the dot syntax, they can only be used with new operator
  - box.Rectangle() is WRONG, correct way is box = new Rectangle()
  - Accessor methods don't change state of implicit parameter; mutator methods do

API Documentation:
  - Package is a collection of classes with a related purpose
  - All classes in standard Java library are contained in packages and listed in API documentation
  - API = application programming interface
  - Users are application programmers, writers are system programmers
  - Download documentation so you can access it offline: http://java.sun.com/javase/downloads/index.html

Object References:
  - Object reference describes memory location of an object
  - Number variables store numbers, object variables store references
  - Multiple object variables can reference the same object, so if parameters of the object gets changed both references will change; different for numbers
  - Not "the object box" but "the object reference stored in box"

------------------------------------------------------------ */