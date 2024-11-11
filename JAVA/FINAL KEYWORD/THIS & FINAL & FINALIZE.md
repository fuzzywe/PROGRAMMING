**The this Keyword:**
Sometimes a method will need to refer to the object that invoked it. To allow this, Java defines the this keyword.
this can be used inside any method to refer to the current object. That is, this is always a reference to the object on
which the method was invoked.

**final Keyword:**
A field can be declared as final. Doing so prevents its contents from being modified, making it, essentially, a constant.
This means that you must initialize a final field when it is declared.

It is a common coding convention to choose all uppercase identifiers for final fields:
     final int FILE_OPEN = 2;

Unfortunately, final guarantees immutability only when instance variables are primitive types, not reference types.
If an instance variable of a reference type has the final modifier, the value of that instance variable (the reference
to an object) will never change—it will always refer to the same object—but the value of the object itself can change.

**The finalize( ) Method:**

Sometimes an object will need to perform some action when it is destroyed.

To handle such situations, Java provides a mechanism called finalization. By using finalization,
you can define specific actions that will occur when an object is just about to be reclaimed by the garbage collector.
To add a finalizer to a class, you simply define the finalize( ) method. The Java run time calls that method whenever
it is about to recycle an object of that class. Right before an asset is freed, the Java run time calls the finalize( )
method on the object.
```java
protected void finalize( ) {
    // finalization code here
}
```

**Constructors:**

**Once defined, the constructor is automatically called when the object is created, before the new operator completes.**

Constructors look a little strange because they have no return type, not even void.

This is because the implicit return type of a class’ constructor is the class type itself.

In the line

```java
Box mybox1 = new Box();
new Box( ) is calling the Box( ) constructor.
```

Inheritance and constructors in Java:

In Java, constructor of base class with no argument gets automatically called in derived class constructor.
For example, output of following program given below is:

Base Class Constructor Called
Derived Class Constructor Called

 ```java
 // filename: Main.java
class Base {
  Base() {
    System.out.println("Base Class Constructor Called ");
  }
}

class Derived extends Base {
  Derived() {
    System.out.println("Derived Class Constructor Called ");
  }
}

public class Main {
  public static void main(String[] args) {
    Derived d = new Derived();
  }
}
```
Any class will have a default constructor, does not matter if we declare it in the class or not. If we inherit a class,
then the derived class must call its super class constructor. It is done by default in derived class.
If it does not have a default constructor in the derived class, the JVM will invoke its default constructor and call
the super class constructor by default. If we have a parameterised constructor in the derived class still it calls the
default super class constructor by default. In this case, if the super class does not have a default constructor,
instead it has a parameterised constructor, then the derived class constructor should call explicitly call the
parameterised super class constructor.



// 1. The 'this' keyword

```java
class Person {
    private String name;
    
    public void setName(String name) {
        // 'this' refers to the current object's name field
        this.name = name;  // Without 'this', name would refer to the parameter
    }
}

// 2. The 'final' keyword
class Configuration {
    // Final primitive - value cannot be changed
    final int MAX_CONNECTIONS = 100;
    
    // Final reference - reference cannot change but object state can
    final List<String> VALID_STATES = new ArrayList<>();
    
    public void demo() {
        // This is allowed - modifying object state
        VALID_STATES.add("Active");
        
        // This would cause error - trying to change reference
        // VALID_STATES = new ArrayList<>();  // Compilation error
    }
}
```
---
// 3. The finalize() method

```java
class Resource {
    protected void finalize() {
        try {
            // Cleanup code here
            System.out.println("Resource cleanup in finalize()");
        } finally {
            super.finalize();
        }
    }
}

// 4. Constructors and Inheritance
class Vehicle {
    protected String brand;
    
    // Default constructor
    public Vehicle() {
        System.out.println("Vehicle default constructor");
    }
    
    // Parameterized constructor
    public Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle parameterized constructor");
    }
}

class Car extends Vehicle {
    private String model;
    
    // Calls Vehicle's default constructor automatically
    public Car() {
        System.out.println("Car default constructor");
    }
    
    // Explicitly calls Vehicle's parameterized constructor
    public Car(String brand, String model) {
        super(brand);  // Must be first statement
        this.model = model;
        System.out.println("Car parameterized constructor");
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        // Constructor inheritance example
        Car car1 = new Car();  // Calls both default constructors
        Car car2 = new Car("Toyota", "Camry");  // Calls parameterized constructors
    }
}
```
Let me help summarize and explain these important Java concepts.



```java
// 1. The 'this' keyword
class Person {
    private String name;
    
    public void setName(String name) {
        // 'this' refers to the current object's name field
        this.name = name;  // Without 'this', name would refer to the parameter
    }
}

// 2. The 'final' keyword
class Configuration {
    // Final primitive - value cannot be changed
    final int MAX_CONNECTIONS = 100;
    
    // Final reference - reference cannot change but object state can
    final List<String> VALID_STATES = new ArrayList<>();
    
    public void demo() {
        // This is allowed - modifying object state
        VALID_STATES.add("Active");
        
        // This would cause error - trying to change reference
        // VALID_STATES = new ArrayList<>();  // Compilation error
    }
}

// 3. The finalize() method
class Resource {
    protected void finalize() {
        try {
            // Cleanup code here
            System.out.println("Resource cleanup in finalize()");
        } finally {
            super.finalize();
        }
    }
}

// 4. Constructors and Inheritance
class Vehicle {
    protected String brand;
    
    // Default constructor
    public Vehicle() {
        System.out.println("Vehicle default constructor");
    }
    
    // Parameterized constructor
    public Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle parameterized constructor");
    }
}

class Car extends Vehicle {
    private String model;
    
    // Calls Vehicle's default constructor automatically
    public Car() {
        System.out.println("Car default constructor");
    }
    
    // Explicitly calls Vehicle's parameterized constructor
    public Car(String brand, String model) {
        super(brand);  // Must be first statement
        this.model = model;
        System.out.println("Car parameterized constructor");
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        // Constructor inheritance example
        Car car1 = new Car();  // Calls both default constructors
        Car car2 = new Car("Toyota", "Camry");  // Calls parameterized constructors
    }
}

```

Let me explain the key points from each concept:

1. `this` keyword:
   - Used to refer to the current object
   - Especially useful when parameter names match field names
   - Helps avoid naming conflicts and makes code clearer

2. `final` keyword:
   - For primitives: Makes the value immutable
   - For references: Makes the reference immutable, but not the object state
   - Convention is to use UPPERCASE for final constants

3. `finalize()` method:
   - Called by garbage collector before object destruction
   - Not guaranteed to be called, so shouldn't be relied upon for critical cleanup
   - Modern Java prefers try-with-resources or explicit cleanup methods

4. Constructors and Inheritance:
   - Default constructor is provided if no constructor is defined
   - In inheritance, parent's default constructor is called automatically
   - `super()` must be the first statement in child constructor if explicitly called
   - Parameterized parent constructors must be explicitly called using `super(params)`

Would you like me to elaborate on any of these concepts or provide more specific examples?
