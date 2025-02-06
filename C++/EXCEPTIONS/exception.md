### **Exception Handling in C++ – Interview Questions & Answers** 🚀  

---

### **51. What is exception handling in C++?**  
🔹 **Exception handling** is a mechanism in C++ that allows **handling runtime errors gracefully** without crashing the program.  
🔹 It provides a way to **detect and handle errors** using a structured approach.  
🔹 The key components of exception handling in C++ are **`try`, `catch`, and `throw`**.  

📌 **Example Usage**:  
```cpp
#include <iostream>

int main() {
    try {
        throw "An error occurred!";
    } catch (const char* msg) {
        std::cout << "Caught exception: " << msg << std::endl;
    }
}
```
🔹 Output: `Caught exception: An error occurred!`  

---

### **52. Explain the use of `try`, `catch`, and `throw` keywords.**  
✅ **`try`** – Defines a block of code where an exception might occur.  
✅ **`throw`** – Generates an exception.  
✅ **`catch`** – Handles the thrown exception.  

📌 **Example Usage**:  
```cpp
#include <iostream>

void divide(int a, int b) {
    if (b == 0)
        throw std::runtime_error("Division by zero!");
    std::cout << "Result: " << a / b << std::endl;
}

int main() {
    try {
        divide(10, 0);
    } catch (const std::runtime_error& e) {
        std::cout << "Caught exception: " << e.what() << std::endl;
    }
}
```
🔹 Output: `Caught exception: Division by zero!`  

---

### **53. What is the purpose of the `noexcept` specifier?**  
🔹 `noexcept` specifies that a function **will not throw exceptions**.  
🔹 Helps the compiler optimize code and improves performance.  

📌 **Example Usage**:  
```cpp
void safeFunction() noexcept {
    std::cout << "This function does not throw exceptions.\n";
}
```
🔹 If a function marked `noexcept` throws an exception, the program will **terminate**.  

---

### **54. How does C++ handle multiple exceptions?**  
🔹 C++ allows multiple `catch` blocks for handling **different types of exceptions**.  
🔹 **Order matters** – More specific exceptions should be caught first.  

📌 **Example Usage**:  
```cpp
#include <iostream>

int main() {
    try {
        throw 42;
    } catch (const char* msg) {
        std::cout << "Caught string: " << msg << std::endl;
    } catch (int num) {
        std::cout << "Caught integer: " << num << std::endl;
    }
}
```
🔹 Output: `Caught integer: 42`  

---

### **55. What is the difference between `throw` and `throw();`?**  
✅ **`throw`** – Throws an exception with a value.  
✅ **`throw;`** – Rethrows the current exception.  

📌 **Example Usage**:  
```cpp
#include <iostream>

void handleException() {
    try {
        throw "Error occurred!";
    } catch (...) {  // Catch all exceptions
        std::cout << "Handling exception, rethrowing...\n";
        throw;  // Rethrow the same exception
    }
}

int main() {
    try {
        handleException();
    } catch (const char* msg) {
        std::cout << "Caught exception in main: " << msg << std::endl;
    }
}
```
🔹 Output:  
```
Handling exception, rethrowing...
Caught exception in main: Error occurred!
```

---

### **56. Explain the concept of exception safety.**  
🔹 **Exception safety** ensures a program remains **consistent and predictable** even if exceptions occur.  
🔹 **Levels of Exception Safety:**  
  - **No-throw guarantee:** No exceptions occur.  
  - **Strong guarantee:** Operations either complete successfully or rollback.  
  - **Basic guarantee:** The program remains in a valid state.  
  - **No guarantee:** No safety at all.  

📌 **Example (Strong Guarantee Using RAII):**  
```cpp
#include <iostream>
#include <vector>

void safeOperation(std::vector<int>& v) {
    std::vector<int> temp = v;  // Copy for rollback
    v.push_back(100);
}

int main() {
    std::vector<int> numbers = {1, 2, 3};
    try {
        safeOperation(numbers);
    } catch (...) {
        std::cout << "Operation failed, but state is safe." << std::endl;
    }
}
```
🔹 If an exception occurs, `numbers` remains unchanged.

---

### **57. What is stack unwinding in C++?**  
🔹 **Stack unwinding** is the process of **calling destructors** of local objects when an exception is thrown.  
🔹 Ensures **proper cleanup** of resources.  

📌 **Example Usage**:  
```cpp
#include <iostream>

class Test {
public:
    ~Test() { std::cout << "Destructor called\n"; }
};

void func() {
    Test t;
    throw std::runtime_error("Error occurred!");
}

int main() {
    try {
        func();
    } catch (...) {
        std::cout << "Caught exception\n";
    }
}
```
🔹 Output:  
```
Destructor called
Caught exception
```
✅ **The destructor is called before the exception is caught!**

---

### **58. How can you create custom exception classes in C++?**  
🔹 Inherit from `std::exception` and override `what()`.  

📌 **Example Usage**:  
```cpp
#include <iostream>
#include <exception>

class MyException : public std::exception {
public:
    const char* what() const noexcept override {
        return "Custom exception occurred!";
    }
};

int main() {
    try {
        throw MyException();
    } catch (const std::exception& e) {
        std::cout << e.what() << std::endl;
    }
}
```
🔹 Output: `Custom exception occurred!`

---

### **59. What is the purpose of the `std::exception` class?**  
🔹 **Base class for all standard exceptions** in C++.  
🔹 Provides a virtual `what()` method that returns an error message.  

📌 **Example Usage**:  
```cpp
#include <iostream>
#include <exception>

void testFunction() {
    throw std::runtime_error("Runtime error!");
}

int main() {
    try {
        testFunction();
    } catch (const std::exception& e) {
        std::cout << "Exception: " << e.what() << std::endl;
    }
}
```
🔹 Output: `Exception: Runtime error!`

---

### **60. Explain the concept of exception specifications.**  
🔹 **Exception specifications** define what exceptions a function can throw.  
🔹 In C++11, `throw(type)` is **deprecated** in favor of `noexcept`.  

📌 **Example Usage**:  
```cpp
void safeFunction() noexcept {  // Will not throw exceptions
    std::cout << "Safe function\n";
}
```
🔹 If a `noexcept` function throws an exception, `std::terminate()` is called.  

---

🔥 **Want more detailed examples or explanations? Let me know!** 🚀
