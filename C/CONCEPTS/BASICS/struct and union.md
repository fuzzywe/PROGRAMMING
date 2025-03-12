In C, both `struct` and `union` are user-defined data types that allow you to group multiple variables of different types together. However, they have **key differences** in how they allocate memory and how their members are accessed. Here's a detailed comparison:

---

### **1. Memory Allocation**
- **`struct`**:
  - Each member of a `struct` has its own separate memory location.
  - The total size of a `struct` is the sum of the sizes of all its members (plus possible padding for alignment).
  - Example:
    ```c
    struct Example {
        int a;    // 4 bytes
        char b;   // 1 byte
        double c; // 8 bytes
    };
    ```
    Size of `struct Example` = 4 + 1 + 8 = **13 bytes** (plus padding, likely 16 bytes for alignment).

- **`union`**:
  - All members of a `union` share the same memory location.
  - The size of a `union` is the size of its largest member.
  - Example:
    ```c
    union Example {
        int a;    // 4 bytes
        char b;   // 1 byte
        double c; // 8 bytes
    };
    ```
    Size of `union Example` = size of the largest member = **8 bytes**.

---

### **2. Member Access**
- **`struct`**:
  - All members can be accessed independently at the same time.
  - Example:
    ```c
    struct Example s;
    s.a = 10;  // Access member 'a'
    s.b = 'x'; // Access member 'b'
    s.c = 3.14; // Access member 'c'
    ```

- **`union`**:
  - Only one member can be accessed at a time, as all members share the same memory location.
  - Modifying one member will overwrite the others.
  - Example:
    ```c
    union Example u;
    u.a = 10;  // Access member 'a'
    printf("%d\n", u.a); // Output: 10
    u.c = 3.14; // Overwrites the memory shared by 'a' and 'b'
    printf("%f\n", u.c); // Output: 3.14
    printf("%d\n", u.a); // Undefined behavior (garbage value)
    ```

---

### **3. Use Cases**
- **`struct`**:
  - Used when you need to group related data together, and all members need to be accessed independently.
  - Example: Representing a person with multiple attributes (name, age, height, etc.).
    ```c
    struct Person {
        char name[50];
        int age;
        float height;
    };
    ```

- **`union`**:
  - Used when you need to store different types of data in the same memory location, but only one type at a time.
  - Example: Representing a value that can be either an integer, a float, or a string.
    ```c
    union Data {
        int i;
        float f;
        char str[20];
    };
    ```

---

### **4. Memory Efficiency**
- **`struct`**:
  - Less memory-efficient because it allocates space for all members, even if not all are used at the same time.

- **`union`**:
  - More memory-efficient because it allocates space only for the largest member, saving memory when only one member is needed at a time.

---

### **5. Example Code**
```c
#include <stdio.h>

// Struct example
struct StructExample {
    int a;
    char b;
    double c;
};

// Union example
union UnionExample {
    int a;
    char b;
    double c;
};

int main() {
    // Struct usage
    struct StructExample s;
    s.a = 10;
    s.b = 'x';
    s.c = 3.14;
    printf("Struct: a = %d, b = %c, c = %f\n", s.a, s.b, s.c); // All members accessible

    // Union usage
    union UnionExample u;
    u.a = 10;
    printf("Union: a = %d\n", u.a); // Access member 'a'
    u.c = 3.14;
    printf("Union: c = %f\n", u.c); // Access member 'c' (overwrites 'a')
    printf("Union: a = %d\n", u.a); // Undefined behavior (garbage value)

    return 0;
}
```

---

### **Summary of Differences**

| Feature               | `struct`                              | `union`                              |
|-----------------------|---------------------------------------|--------------------------------------|
| **Memory Allocation** | Allocates memory for all members.     | Allocates memory for the largest member. |
| **Member Access**     | All members can be accessed at once.  | Only one member can be accessed at a time. |
| **Memory Efficiency** | Less memory-efficient.                | More memory-efficient.               |
| **Use Case**          | Grouping related data.                | Storing one of multiple data types.  |
| **Size**              | Sum of sizes of all members (+ padding). | Size of the largest member.          |

---

### **When to Use Which?**
- Use a **`struct`** when you need to store and access multiple pieces of data simultaneously.
- Use a **`union`** when you need to store different types of data in the same memory location, but only one type at a time.
