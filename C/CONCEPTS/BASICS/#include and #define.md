In C, both `#include` and `#define` are **preprocessor directives**, but they serve very different purposes. Here's a detailed comparison:

---

### **1. `#include`**
- **Purpose**: Used to include the contents of another file (typically a header file) into the current source file.
- **How it works**: The preprocessor replaces the `#include` directive with the actual contents of the specified file.
- **Syntax**:
  ```c
  #include <header_file.h>  // For standard library headers
  #include "header_file.h"  // For user-defined headers
  ```
- **Example**:
  ```c
  #include <stdio.h>  // Includes the standard input/output library
  #include "my_header.h"  // Includes a user-defined header file
  ```
- **Use Case**: 
  - To reuse code from libraries or other source files.
  - To declare functions, macros, and variables defined elsewhere.

---

### **2. `#define`**
- **Purpose**: Used to define **macros** or **constants**. It performs text substitution before compilation.
- **How it works**: The preprocessor replaces every occurrence of the defined macro or constant with its corresponding value or expression.
- **Syntax**:
  ```c
  #define MACRO_NAME value
  ```
- **Example**:
  ```c
  #define PI 3.14159  // Defines a constant
  #define SQUARE(x) (x) * (x)  // Defines a macro
  ```
- **Use Case**:
  - To define constants (e.g., `#define MAX_SIZE 100`).
  - To create function-like macros (e.g., `#define MIN(a, b) ((a) < (b) ? (a) : (b)`).
  - To simplify code by replacing repetitive patterns.

---

### **Key Differences**

| Feature                | `#include`                              | `#define`                              |
|------------------------|-----------------------------------------|----------------------------------------|
| **Purpose**            | Includes external files into the code.  | Defines macros or constants.           |
| **Syntax**             | `#include <file>` or `#include "file"`  | `#define MACRO_NAME value`             |
| **Replacement**        | Replaces the directive with file contents. | Replaces the macro with its definition. |
| **Use Case**           | Used for libraries, headers, and modular code. | Used for constants, macros, and code simplification. |
| **Scope**              | Affects the entire file after inclusion. | Affects only the occurrences of the macro. |
| **Example**            | `#include <stdio.h>`                    | `#define PI 3.14159`                   |

---

### **Example Code**
```c
#include <stdio.h>  // Includes the standard I/O library
#define PI 3.14159  // Defines a constant
#define SQUARE(x) (x) * (x)  // Defines a macro

int main() {
    printf("Value of PI: %f\n", PI);  // Uses the defined constant
    printf("Square of 5: %d\n", SQUARE(5));  // Uses the defined macro
    return 0;
}
```

---

### **When to Use Which?**
- Use `#include` when you need to include external files (e.g., libraries, headers).
- Use `#define` when you need to define constants or create macros for code reuse or simplification.

By understanding these differences, you can use `#include` and `#define` effectively in your C programs!
