In **Java**, the keyword `final` is used to define entities whose values or behaviors cannot be modified once set. Here's how it applies in different contexts:

### 1. **Final Variables**
   - A `final` variable can only be initialized once, and its value cannot be changed afterward.
   - Example:
     ```java
     final int MAX_SPEED = 120;
     MAX_SPEED = 150; // Compilation error: cannot assign a value to final variable
     ```

### 2. **Final Methods**
   - A `final` method cannot be overridden by subclasses. This is useful when you want to ensure the behavior of a method remains consistent in all derived classes.
   - Example:
     ```java
     class Parent {
         final void display() {
             System.out.println("This is a final method.");
         }
     }

     class Child extends Parent {
         void display() { // Compilation error
             System.out.println("Cannot override a final method.");
         }
     }
     ```

### 3. **Final Classes**
   - A `final` class cannot be extended. This is used to prevent inheritance and ensure the class's behavior remains unchanged.
   - Example:
     ```java
     final class ImmutableClass {
         // Class definition
     }

     class AnotherClass extends ImmutableClass { // Compilation error
         // Cannot inherit from final class
     }
     ```

### 4. **Final Parameters**
   - Parameters of a method can be declared `final`, meaning they cannot be reassigned within the method.
   - Example:
     ```java
     void method(final int param) {
         param = 10; // Compilation error: cannot assign a value to final parameter
     }
     ```

### 5. **Final and Initialization**
   - A `final` variable must be initialized either when it is declared or in the constructor (if it's an instance variable). 
   - Example:
     ```java
     class Example {
         final int value;

         Example(int value) {
             this.value = value; // Initialized in constructor
         }
     }
     ```

### Summary
The `final` keyword in Java enforces immutability or unchangeability depending on the context, ensuring stability and predictable behavior in your code.
