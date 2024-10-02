In C++, an abstract class is a class that cannot be instantiated on its own. It is designed to be a base class that other classes can inherit from. An abstract class contains at least one pure virtual function, which is a function that has no implementation in the base class and must be overridden by derived classes.

### Key Features of Abstract Classes:

1. **Pure Virtual Functions**:
   - A pure virtual function is declared by assigning `0` to the function declaration. For example, `virtual void myFunction() = 0;`.
   - A class with at least one pure virtual function is considered an abstract class.

2. **Cannot Be Instantiated**:
   - You cannot create an object of an abstract class directly.
   - Abstract classes are meant to be inherited by other classes, which provide implementations for the pure virtual functions.

3. **Interface Definition**:
   - Abstract classes are often used to define interfaces or abstract data types. They specify what methods a derived class must implement.

### Example:

Here's an example of an abstract class in C++:

```cpp
#include <iostream>
using namespace std;

// Abstract class
class Shape {
public:
    // Pure virtual function
    virtual void draw() = 0;

    // Non-pure virtual function
    virtual void display() {
        cout << "Displaying shape" << endl;
    }
};

// Derived class
class Circle : public Shape {
public:
    // Implementation of the pure virtual function
    void draw() override {
        cout << "Drawing Circle" << endl;
    }
};

// Derived class
class Rectangle : public Shape {
public:
    // Implementation of the pure virtual function
    void draw() override {
        cout << "Drawing Rectangle" << endl;
    }
};

int main() {
    // Shape shape; // Error: cannot declare variable 'shape' to be of abstract type 'Shape'

    Circle circle;
    circle.draw();
    circle.display();

    Rectangle rectangle;
    rectangle.draw();
    rectangle.display();

    return 0;
}
```

### Explanation:

1. **Abstract Class `Shape`**:
   - The `Shape` class is an abstract class because it contains the pure virtual function `void draw() = 0;`.
   - The `Shape` class also has a non-pure virtual function `void display()`, which provides a default implementation.

2. **Derived Classes `Circle` and `Rectangle`**:
   - The `Circle` and `Rectangle` classes inherit from the `Shape` class.
   - Both derived classes provide implementations for the pure virtual function `draw`.

3. **Main Function**:
   - You cannot create an object of the `Shape` class directly because it is abstract.
   - You can create objects of the derived classes `Circle` and `Rectangle` and call their methods.

### Summary:

- **Abstract Class**: A class that cannot be instantiated and contains at least one pure virtual function.
- **Pure Virtual Function**: A function declared with `= 0` in the base class, which must be overridden by derived classes.
- **Interface Definition**: Abstract classes are used to define interfaces or abstract data types, specifying what methods derived classes must implement.

Abstract classes are a powerful feature in C++ that enable the creation of flexible and extensible class hierarchies, promoting code reuse and polymorphism.
