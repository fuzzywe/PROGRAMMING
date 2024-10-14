The correct answer is:

**d) Using Inheritance and Virtual functions**

**Explanation:**
- **Run-time polymorphism** in C++ is achieved through **inheritance** and **virtual functions**. This allows a base class pointer or reference to call the appropriate function of a derived class at runtime.
- **Inheritance** establishes the relationship between base and derived classes, and **virtual functions** ensure that the function call is resolved at runtime rather than compile time.

### How it works:
1. **Inheritance:** A derived class inherits from a base class.
2. **Virtual function:** The base class declares a function as `virtual`, allowing it to be overridden by the derived class.
3. **Pointer or reference:** A pointer or reference to the base class can invoke the derived class's version of the function during runtime.

### Example:
```cpp
class Base {
public:
    virtual void display() {  // Virtual function
        cout << "Base display" << endl;
    }
};

class Derived : public Base {
public:
    void display() override {  // Overridden in derived class
        cout << "Derived display" << endl;
    }
};

int main() {
    Base* b = new Derived();  // Base class pointer to derived class object
    b->display();  // Runtime polymorphism - calls Derived's display
    return 0;
}
```

Here, the base class pointer `b` calls the `display` function, and at runtime, it invokes the `Derived` class version due to the virtual function mechanism.
