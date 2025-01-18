package main;

class Base {
	public void Print()
	{
		System.out.println("Base");
	}
}

class Derived extends Base {
	public void Print()
	{
		System.out.println("Derived");
	}
}

class Main {
	public static void DoPrint(Base o)
	{
		o.Print();
	}
	public static void main(String[] args)
	{
		Base x = new Base();
		Base y = new Derived();
		Derived z = new Derived();
		DoPrint(x);
		DoPrint(y);
		DoPrint(z);
	}
}



Let me explain the C++ version step-by-step in a simple way, connecting it to what you are familiar with in Java:

### **Understanding the Java Code**
In your original Java code, you have:
1. A **base class** `Base` with a method `Print()`.
2. A **derived class** `Derived` that extends `Base` and overrides the `Print()` method.
3. A `DoPrint()` method that accepts a `Base` reference and calls `Print()` on it.  
   This method works with both `Base` and `Derived` objects because of **polymorphism**.
4. In `main()`, objects `x`, `y`, and `z` demonstrate how polymorphism allows using a `Base` reference to call the appropriate method.

Now, let's explain how these concepts translate into C++.

---

### **Step-by-Step Explanation of C++ Code**
```cpp
#include <iostream>  // Include library for input/output
using namespace std;  // Use the standard namespace to avoid typing std::cout
```

#### **Defining the Base Class**
```cpp
class Base {
public:
    virtual void Print() {
        cout << "Base" << endl;  // Equivalent to System.out.println("Base")
    }
};
```
- **virtual**: In C++, `virtual` indicates that this method can be overridden by derived classes. Without it, polymorphism wouldn’t work, and the base class method would always be called.
- `cout` and `endl`: `cout` is similar to `System.out.print`, and `endl` works like `\n` for a new line.

#### **Defining the Derived Class**
```cpp
class Derived : public Base {
public:
    void Print() override {
        cout << "Derived" << endl;
    }
};
```
- `: public Base` means `Derived` inherits from `Base`.
- `override` (optional in C++) indicates `Print()` is overriding the base class method.

#### **The DoPrint Function**
```cpp
void DoPrint(Base& o) {
    o.Print();
}
```
- `Base& o`: A **reference** is used instead of copying the object. It ensures the correct overridden method is called when using polymorphism.  
  In Java, object references are passed by default. In C++, this `&` is explicitly needed.

#### **Main Function**
```cpp
int main() {
    Base x;       // Base object
    Derived y;    // Derived object
    Derived z;    // Another Derived object
    
    DoPrint(x);   // Calls Base::Print
    DoPrint(y);   // Calls Derived::Print
    DoPrint(z);   // Calls Derived::Print
    
    return 0;
}
```
- `DoPrint(x)` prints `"Base"`.
- `DoPrint(y)` prints `"Derived"` because `y` is a `Derived` object.  
  This works because of **polymorphism** enabled by `virtual` in C++.

---

### **Why Use Polymorphism?**
- Without `virtual`, C++ wouldn’t call the correct `Print()` for `Derived`.
- Java handles this with dynamic method dispatch automatically, but C++ needs `virtual`.

### **Comparison Summary**
| Feature           | Java Syntax                      | C++ Syntax                                   |
|-------------------|----------------------------------|----------------------------------------------|
| Base class        | `class Base`                     | `class Base`                                 |
| Method overriding | `public void Print()`            | `virtual void Print()` and `override`        |
| Derived class     | `class Derived extends Base`     | `class Derived : public Base`                |
| Calling method    | `o.Print()`                      | `o.Print()`                                  |
| Printing output   | `System.out.println("Base")`     | `cout << "Base" << endl`                     |

