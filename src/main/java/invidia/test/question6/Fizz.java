package invidia.test.question6;

// Question: What is the difference between given class attributes accessibility

// Choices:
// woof will be accessible only within the class Fizz, while buzz will be accessible from any class that inherits Fizz
// buzz will be accessible only within the class Fizz, while woof will be accessible in any class that inherits Fizz
// buzz will be accessible in any other class that inherits Fizz and is declared in the same package as Fizz, while woof will also be accessible from inheriting classes in other packages. Selected this !!
// woof will be accessible in any other class that inherits from Fizz and is declared in the same package as Fizz, while buzz will also be accessible in  inheriting classes from different packages.

public class Fizz {
    String buzz;
    protected String woof;
}
