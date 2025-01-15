In Java, there are several ways to create objects of a class. Here are the common techniques:

### 1. **Using the `new` Keyword (Most Common)**
The `new` keyword allocates memory for a new object and returns its reference.

#### Example:
```java
ClassName obj = new ClassName();  // Creates an object of ClassName
```
```java
Person person1 = new Person();  // Assuming Person is a class
```

### 2. **Using `newInstance()` Method (Reflection API)**
The `newInstance()` method of `Class` or `Constructor` class creates a new instance. This method is rarely used due to potential security issues and the need to handle exceptions.

#### Example:
```java
Person person = (Person) Class.forName("Person").newInstance();
```
> Note: `newInstance()` is deprecated as of Java 9. Prefer `Constructor`'s `newInstance()` method.

### 3. **Using `clone()` Method**
The `clone()` method creates a copy of an existing object. The class must implement the `Cloneable` interface.

#### Example:
```java
Person person1 = new Person();
Person person2 = (Person) person1.clone();
```

### 4. **Using a Factory Method**
A factory method is a static method that returns an instance of a class.

#### Example:
```java
class Person {
    private Person() {}  // Private constructor

    public static Person createPerson() {
        return new Person();
    }
}

Person person = Person.createPerson();  // Factory method usage
```

### 5. **Using `deserialization`**
Objects can be created by deserializing from a stream. This requires implementing the `Serializable` interface.

#### Example:
```java
ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.dat"));
Person person = (Person) ois.readObject();
```

### 6. **Using `Builder Pattern` (Custom Approach)**
A builder class is used to create complex objects.

#### Example:
```java
Person person = new Person.Builder().setName("Alice").setAge(25).build();
```

### Summary
- **Common Method**: `new` keyword
- **Less Common**: Reflection, `clone()`, deserialization
- **Design Patterns**: Factory method, Builder pattern

Each method has its specific use case and trade-offs.
In Java, **instance variables** are unique to each object created from a class. This means that when you create multiple objects from the same class, each object gets its own independent copy of the instance variables. As a result, modifying the instance variables of one object does not affect the values of the same instance variables in another object.

### Why This Happens:
- When you create an object using the `new` keyword, Java allocates separate memory for that object's instance variables.
- Each object maintains its own state, which is represented by the values stored in its instance variables.

### Example for Better Understanding
```java
public class Person {
    // Instance variable
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Method to change name
    public void setName(String name) {
        this.name = name;
    }

    // Method to display name
    public void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");

        person1.display();  // Output: Name: Alice
        person2.display();  // Output: Name: Bob

        // Change the name of person1
        person1.setName("Charlie");
        person1.display();  // Output: Name: Charlie
        person2.display();  // Output: Name: Bob
    }
}
```

In this example:
- `person1` and `person2` are separate objects of the `Person` class.
- They have separate copies of the `name` instance variable.
- Changing `person1`'s `name` to `"Charlie"` does not affect `person2`'s `name`, which remains `"Bob"`. This demonstrates that each object maintains its own copy of instance variables.

- In Java, an **instance variable** is a variable defined in a class for which each instantiated object of the class has its own copy. These variables represent the state or properties of the object and are declared within the class but outside any method, constructor, or block. Each object of the class maintains a separate copy of instance variables, so changes to one object’s instance variables do not affect others.

### Key Characteristics of Instance Variables:
1. **Declared within a class but outside methods or blocks**.
2. **Belong to individual objects** of the class (each object has its own copy).
3. **Access Modifiers** can be used (public, private, etc.).
4. **Default Values**: They are initialized with default values if not explicitly initialized (0 for numbers, `null` for objects, etc.).
5. **Lifecycle**: Exist as long as the object exists.

### Example
```java
public class Car {
    // Instance variables
    private String color;
    private int speed;

    // Constructor
    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    // Method
    public void displayInfo() {
        System.out.println("Color: " + color + ", Speed: " + speed);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Red", 100);
        Car car2 = new Car("Blue", 120);

        car1.displayInfo();  // Output: Color: Red, Speed: 100
        car2.displayInfo();  // Output: Color: Blue, Speed: 120
    }
}
```
In this example, `color` and `speed` are instance variables. Each `Car` object (`car1` and `car2`) has its own copies of `color` and `speed`.
