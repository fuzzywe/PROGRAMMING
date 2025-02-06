Java **does not support multiple inheritance** with classes but supports it with **interfaces**. Here's why:  

### 🚫 Why Java Doesn't Support Multiple Inheritance with Classes  
Java **avoids ambiguity** caused by the **diamond problem**, which arises when multiple parent classes have the same method and the compiler doesn't know which one to use.  

#### Example of the Diamond Problem:  
```cpp
// C++ allows multiple inheritance, but this causes ambiguity
class A {
public:
    void show() { cout << "A"; }
};

class B : public A {
public:
    void show() { cout << "B"; }
};

class C : public A {
public:
    void show() { cout << "C"; }
};

class D : public B, public C {  // D inherits from both B and C
};

int main() {
    D obj;
    obj.show();  // ❌ Ambiguity: show() exists in both B and C
}
```
Java avoids this problem by **not allowing multiple inheritance with classes**.

---

### ✅ Java Supports Multiple Inheritance with Interfaces  
Java allows a class to **implement multiple interfaces** because interfaces only contain method **declarations**, and implementing classes must define the methods, avoiding ambiguity.

#### Example:  
```java
interface A {
    void show();
}

interface B {
    void display();
}

class C implements A, B {
    public void show() {
        System.out.println("Show from A");
    }

    public void display() {
        System.out.println("Display from B");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();    // Output: Show from A
        obj.display(); // Output: Display from B
    }
}
```

---

### 🚀 Key Takeaways  
✅ **Multiple inheritance with interfaces is supported.**  
🚫 **Multiple inheritance with classes is not supported** (to avoid the diamond problem).  
✅ **Java provides alternatives like composition and interfaces to achieve similar functionality.**  

Would you like an example of how Java handles this with **default methods in interfaces (Java 8+)?**
