•	Answer: Java does not include pointers. Java's JVM automatically handles memory allocation, and the garbage collector manages memory deallocation. This eliminates the need for pointers, which are used in languages like C for manual memory management. Java's approach ensures safer and more efficient memory handling.
Does Java include pointers? If not, why?

Answer: Java does not include pointers. Java's JVM automatically handles memory allocation, and the garbage collector manages memory deallocation. This eliminates the need for pointers, which are used in languages like C for manual memory management. Java's approach ensures safer and more efficient memory handling.

---

Can you list some Java 8 date and time APIs?

Answer: The core Java 8 date and time APIs include LocalDate, LocalTime, and LocalDateTime. These APIs provide a more comprehensive and intuitive way to handle date and time operations compared to the older Date and Calendar classes.
---

What is a default method in Java, and when is it used?

Answer: A default method in Java is a method with an implementation in an interface. It allows adding new functionalities to an interface while maintaining backward compatibility with classes that have already implemented the interface. This is useful for evolving APIs without breaking existing code.

---

What are the main classes implementing the List interface in Java?

Answer: The main classes implementing the List interface in Java are ArrayList, LinkedList, Vector, and Stack. ArrayList and Vector are indexed, while LinkedList is a sequence of nodes. Stack follows the Last In, First Out (LIFO) methodology.

---

Can you explain what an array is and provide a real-world example?

Answer: An array is a collection of items stored in contiguous memory locations, all of the same data type. For example, an array of integers can store a list of student scores, making it easy to sort, search, and manipulate the data. Arrays help in organizing related data efficiently.
---
What is a linked list, and how is it different from an array?



Answer: A linked list is a linear data structure where elements are not stored in contiguous memory locations. Each element (node) points to the next node, forming a chain-like structure. Unlike arrays, linked lists do not require a fixed size and are more flexible for insertions and deletions. For example, a playlist of songs can be represented as a linked list, where each song points to the next song in the list.

1.	JDK (Java Development Kit): The JDK is a software development environment used for developing Java applications and applets. It includes the JVM, an interpreter/loader (java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc), and other tools needed for Java development.
2.	JVM (Java Virtual Machine): The JVM is a crucial part of the JDK that executes Java bytecode. It is responsible for memory management, including allocating and deallocating memory for Java objects. The JVM uses a garbage collector to automatically manage memory, freeing up space occupied by objects that are no longer in use.
3.	Memory Allocation in Java: When a Java program is executed, the JVM allocates memory for objects on the heap. The heap is a runtime data area from which memory for all class instances and arrays is allocated. The JVM's garbage collector periodically reclaims memory by destroying objects that are no longer referenced by the program.

---

Whether java finally block will always run?
Yes, the finally block in Java will always run, regardless of whether an exception is thrown or not. The finally block is used to execute important code such as releasing resources (e.g., closing files or database connections) that must be run irrespective of the outcome of the try-catch blocks.
Detailed Explanation:
1.	Try Block: Contains code that might throw an exception.
2.	Catch Block: Contains code that handles the exception thrown by the try block.
3.	Finally Block: Contains code that will always execute, whether an exception is thrown or not.
4.	How you will write code to access parent class variables using super keyword

--

```cpp

class Parent
{
int x == 10;
}
class Child extends Parent {
DRAKSHAYANI
int x = 20;
void display() {
System.out.println("Child x: "T + x) ; // Refers to child class variable
System.out.println("Parent x: " + super.x); // Refers to parent class
variable
}
public class Test {
public static void main(String[] args) {
Child obj = new Child();
obj.display();
}
```
---

How you will write code to access parent class methods using super keyword
```java
class Parent {
void display() {
System.out.println("Parent class method");
}
class Child extends Parent {
void display() {
System.out.println("Child class method");
void show() {
super.display(); // Calls the parent class method
}
public class Test {
public static void main(String[] args) {
Child obj new Child();
obj.show() ;

```
---

calling class using super keyword

```java

class Parent {
void display() {
System.out.println("Parent class method");
}
}
class Child extends Parent {
void display() {
System.out.printlă("Child class method");
}
void show() {
super.display(); // Calls the parent class method
}
public class Test {
public static void main(String[] args) {
Child obj new Child();
obj.show();

```
