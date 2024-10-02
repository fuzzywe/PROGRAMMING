In C++, parameters are used to pass data to functions. There are two types of parameters: actual parameters (also known as arguments) and formal parameters.

### Formal Parameters:

- **Definition**: Formal parameters are the variables declared in the function definition. They act as placeholders for the actual values that will be passed to the function when it is called.
- **Usage**: Formal parameters are used within the function body to access the values passed to the function.
- **Example**:
  ```cpp
  void printMessage(int count, const std::string& message) {
      for (int i = 0; i < count; ++i) {
          std::cout << message << std::endl;
      }
  }
  ```
  In this example, `count` and `message` are formal parameters.

### Actual Parameters:

- **Definition**: Actual parameters (or arguments) are the values or variables that are passed to the function when it is called. They provide the actual data that the function will operate on.
- **Usage**: Actual parameters are specified in the function call and are used to initialize the formal parameters.
- **Example**:
  ```cpp
  int main() {
      printMessage(3, "Hello, World!");
      return 0;
  }
  ```
  In this example, `3` and `"Hello, World!"` are actual parameters.

### Example to Illustrate Both:

Here's a complete example that illustrates the use of both formal and actual parameters:

```cpp
#include <iostream>
#include <string>

// Function definition with formal parameters
void printMessage(int count, const std::string& message) {
    for (int i = 0; i < count; ++i) {
        std::cout << message << std::endl;
    }
}

int main() {
    // Function call with actual parameters
    printMessage(3, "Hello, World!");
    return 0;
}
```

### Explanation:

1. **Function Definition**:
   - `void printMessage(int count, const std::string& message)`: This function takes two formal parameters, `count` and `message`.
   - Inside the function, `count` and `message` are used to control the loop and print the message.

2. **Function Call**:
   - `printMessage(3, "Hello, World!");`: This function call passes two actual parameters, `3` and `"Hello, World!"`, to the `printMessage` function.
   - The actual parameters `3` and `"Hello, World!"` are used to initialize the formal parameters `count` and `message`, respectively.

### Summary:

- **Formal Parameters**: Variables declared in the function definition that act as placeholders for the actual values passed to the function.
- **Actual Parameters**: Values or variables passed to the function when it is called, providing the actual data that the function will operate on.

Understanding the distinction between formal and actual parameters is crucial for writing and using functions effectively in C++. Formal parameters define what data the function expects, while actual parameters provide the specific data that the function will use.
