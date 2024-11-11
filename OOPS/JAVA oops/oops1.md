
![OOP 1 _ Introduction   Concepts - Classes, Objects, Constructors, Keywords 7-16 screenshot](https://github.com/user-attachments/assets/f93a8a10-bb9c-46af-806f-1f5b72f1b32b)

now every single element should contain this three things(roll no,name, marks) here is where class comes to play a role

role no , name and marks properties are combined into a single entity callled class.

you can create your own datatype callled  classes. 

student[] students = new student[5]

![OOP 1 _ Introduction   Concepts - Classes, Objects, Constructors, Keywords 7-16 screenshot](https://github.com/user-attachments/assets/7d631eaa-70f6-4fc7-a680-479dbd3f19ff)

![10 11 2024_19 52 04_REC](https://github.com/user-attachments/assets/f9a49969-569d-4e24-aea9-bd2149227282)

Student janani 

janani is a reference variable for Student
with the help of janani i can access the roll no,marks,and name

take human as example human have 2 arms , 2 legs so just consider human as template based on this we try to create an robots nkot only ai mimic the human braini but also physical features

or take example as car car is template and we can create an petrol,diesel and electric engine.

class is a template and obj is an instance of a class. instance means phyical existence.



![OOP-1_page-0002](https://github.com/user-attachments/assets/5ef9722c-9e73-4dc8-b122-919622e8a48d)


![OOP-1_page-0003](https://github.com/user-attachments/assets/2b55ce6b-ef4c-4051-b6b5-7e008020d6e7)

class is logic construct

object is a physical construct , **occupies space in memory**

**objects are stored in the heap memory**


**new keyword** used to create an object

class is a user defined data type

 **what is instance variable**?

 the variables inside the object is called instance variable example rollno,name and marks.

![OOP-1_page-0004](https://github.com/user-attachments/assets/550a5233-5c84-4ac7-9743-92045e25d08b)

**dot operator or separator**  used to link the object reference variable like rollno,name,marks with the instance variable called students

example : students.rollno;

A class is a template for an object, and an object is an instance of a class.
A class creates a new data type that can be used to create objects.

When you declare an object of a class, you are creating an instance of that class.
Thus, a class is a logical construct. An object has physical reality. (That is, an object occupies space in memory.)

Objects are characterized by three essential properties: state, identity, and behavior.
The state of an object is a value from its data type. The identity of an object distinguishes one object from another.
It is useful to think of an object’s identity as the place where its value is stored in memory.
The behavior of an object is the effect of data-type operations.

The dot operator links the name of the object with the name of an instance variable.
Although commonly referred to as the dot operator, the formal specification for Java categorizes the . as a separator.
The 'new' keyword dynamically allocates(that is, allocates at run time)memory for an object & returns a reference to it.
This reference is, more or less, the address in memory of the object allocated by new.
This reference is then stored in the variable.
Thus, in Java, all class objects must be dynamically allocated.



This passage provides a foundational understanding of **classes** and **objects** in object-oriented programming, particularly in Java.

### Key Concepts Explained:

1. **Class as a Template**:
   - A **class** defines a new data type, serving as a blueprint or template for creating **objects**. Classes contain **attributes** (data) and **methods** (functions) that define an object's properties and behavior.

2. **Object as an Instance**:
   - An **object** is an instance of a class. When you declare an object of a class, memory is allocated to store its data (attributes), which is why an object has "physical reality" in memory, while a class is a logical concept.

3. **Essential Properties of Objects**:
   - **State**: Represents the data (or value) an object holds, often in the form of instance variables.
   - **Identity**: Distinguishes each object uniquely, often represented by its memory location.
   - **Behavior**: The actions an object can perform, defined by the methods in its class.

4. **Dot (.) Operator**:
   - The **dot operator** links an object with its instance variables or methods, allowing access to an object's properties or actions.
   - Although commonly called the dot operator, it’s technically known as a separator in Java’s specification.

5. **`new` Keyword**:
   - The **`new` keyword** dynamically allocates memory at runtime to create an object.
   - It returns a **reference** to the newly created object, essentially pointing to the memory address where the object is stored. This reference is then assigned to a variable, allowing you to interact with the object.

6. **Dynamic Memory Allocation**:
   - In Java, all objects are dynamically allocated using `new`. Unlike primitive data types, class instances (objects) must be allocated at runtime, ensuring efficient memory use and flexibility.

   

### Example

Here's a simple example illustrating these concepts in Java:

```java
// Define a class as a template for objects
class Car {
    // Attributes (state)
    String color;
    String model;

    // Method (behavior)
    void displayInfo() {
        System.out.println("Car Model: " + model + ", Color: " + color);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an object using the new keyword
        Car myCar = new Car();
        
        // Set the state
        myCar.color = "Red";
        myCar.model = "Tesla Model S";
        
        // Use dot operator to call a method (behavior)
        myCar.displayInfo();  // Output: Car Model: Tesla Model S, Color: Red
    }
}
```

In this example:
- **`Car`** is a class (template).
- **`myCar`** is an object (instance) of the `Car` class, with its own state (color and model).
- The **dot operator** is used to set attributes (`myCar.color`) and call methods (`myCar.displayInfo()`).
- The **`new` keyword** allocates memory for `myCar` and returns a reference, which is stored in the variable `myCar`.

  In Java, memory allocation for objects is primarily handled with the `new` keyword. However, there are other mechanisms and keywords associated with object memory allocation and management:



### Summary Table

| Method                  | Description                                      | Use Case                                    |
|-------------------------|--------------------------------------------------|---------------------------------------------|
| `new`                   | Standard way to allocate memory                  | Creating most objects                       |
| `newInstance`           | Allocates via reflection                         | Dynamic instantiation without `new`         |
| `clone`                 | Creates a copy of an existing object             | Duplicating objects with the same state     |
| **Deserialization**     | Restores from a serialized stream                | Object persistence and retrieval            |
| **Anonymous Classes**   | Allocates for single-use class instances         | Implementing single-use interfaces or classes |

Each method has unique advantages and is suited for specific use cases. Let me know if you want further details on any of these methods!

![10 11 2024_20 33 16_REC](https://github.com/user-attachments/assets/b84d7033-d02e-4738-8585-a470abf04e17)


![OOP-1_page-0009](https://github.com/user-attachments/assets/1d3ed43b-7eb6-47c7-9405-b439fdcbb219)








![OOP-1_page-0005](https://github.com/user-attachments/assets/7dee2e46-cb69-466e-9602-7382425f9285)

![OOP-1_page-0006](https://github.com/user-attachments/assets/485793d3-335a-4709-96ba-6ecc1b5d9f14)

![OOP-1_page-0008](https://github.com/user-attachments/assets/43d0db55-0d7f-4f38-8bb9-a69bab2847de)

![OOP-1_page-0007](https://github.com/user-attachments/assets/85757f53-c95b-40fe-96f9-21d1a77c3e1c)

![OOP-1_page-0009](https://github.com/user-attachments/assets/832d7592-bc4f-4748-a50b-2dae1b309397)

![OOP-1_page-0010](https://github.com/user-attachments/assets/e7a32134-62d9-4d69-8a2b-8a04f4cafa57)


Box mybox; // declare reference to object
     mybox = new Box(); // allocate a Box object
The first line declares mybox as a reference to an object of type Box. At this point, mybox does not yet refer to an
actual object. The next line allocates an object and assigns a reference to it to mybox. After the second line executes,
you can use mybox as if it were a Box object. But in reality, mybox simply holds, in essence, the memory address of the
actual Box object.
The key to Java’s safety is that you cannot manipulate references as you can actual pointers.
Thus, you cannot cause an object reference to point to an arbitrary memory location or manipulate it like an integer.

A Closer Look at new:
classname class-var = new classname ( );
Here, class-var is a variable of the class type being created. The classname is the name of the class that is being
instantiated. The class name followed by parentheses specifies the constructor for the class. A constructor defines
what occurs when an object of a class is created.

You might be wondering why you do not need to use new for such things as integers or characters.
The answer is that Java’s primitive types are not implemented as objects.
Rather, they are implemented as “normal” variables.
This is done in the interest of efficiency.

It is important to understand that new allocates memory for an object during run time.

Box b1 = new Box();
Box b2 = b1;
b1 and b2 will both refer to the same object. The assignment of b1 to b2 did not allocate any memory or copy any part
of the original object. It simply makes b2 refer to the same object as does b1. Thus, any changes made to the object
through b2 will affect the object to which b1 is referring, since they are the same object.
When you assign one object reference variable to another object reference variable, you are not creating a copy of the
object, you are only making a copy of the reference.

int square(int i){
    return i * i;
}
A parameter is a variable defined by a method that receives a value when the method is called. For example,
in square( int i), i is a parameter. An argument is a value that is passed to a method when it is invoked.
For example, square(100) passes 100 as an argument. Inside square( ), the parameter i receives that value.

NOTE:
Bus bus = new Bus();
lhs(reference i.e. bus) is looked by compiler & rhs (object i.e. new Bus()) is looked by jvm
