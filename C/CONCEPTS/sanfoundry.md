https://youtu.be/IY79fWYkiPQ?si=9baM6pq9gMVL2w_x

https://youtu.be/cEphEIMaqms?si=jEPR9TuzC8UfQyHx

This explanation outlines a key distinction between **pointer declaration** and **pointer assignment** in C programming. Let’s break it down further for clarity:

---

### **1. Understanding the Role of `*` in Pointer Declaration**

When you write:

```c
int *p = &i;
```

- **Declaration:**
  - `int *p` means that `p` is a pointer to an `int`. The `*` here tells the compiler, "This variable (`p`) will store the address of an integer."
- **Assignment:**
  - `p = &i` assigns the **address** of the integer variable `i` to the pointer `p`.

At this stage, `*` is not an **indirection operator** but part of the syntax to declare a pointer.

---

### **2. Why No `*` in the Second Statement**

The second statement:

```c
p = &i;
```

- Here, `p` is already declared as a pointer to an integer (`int *p`).
- Since we’re simply assigning the address of `i` to `p`, there is **no need** to precede `p` with a `*`. Adding `*` would change the meaning entirely.

---

### **3. Why is `*p = &i` Wrong?**

If you write:

```c
*p = &i;
```

- The `*` here acts as an **indirection operator**, meaning, "access the value at the memory location that `p` points to."
- If `p` already points to some memory (e.g., a valid integer), `*p = &i` means:
  - "Store the address of `i` (an `int *`) in the memory location where `p` points."
- This is invalid because the memory location expects an `int` (not an address).

For example:

```c
int i = 10;
int *p;
p = &i;     // This is valid; `p` now points to `i`.

*p = &i;    // Error! `*p` (the value stored at the address `p`) is of type `int`,
            // but you're assigning an `int *` (address).
```

---

### **Summary of Rules**

1. **Declaration with `*`:**
   - Declaring `int *p` means `p` is a pointer to an `int`.

2. **Assignment Without `*`:**
   - Assigning `p = &i` stores the address of `i` in `p`.

3. **Indirection with `*`:**
   - Using `*p` accesses the value at the address `p` points to.
   - Assigning a value to `*p` means modifying the value at that address, not assigning an address itself.

---

### **Key Points to Remember**

- At the time of **declaration**, `*` indicates that the variable is a pointer.
- During **assignment**, you don’t use `*` when assigning an address to a pointer.
- Using `*p = &i` is a type mismatch because you're attempting to store an address (`int *`) in a location meant for an integer (`int`).
- The provided code attempts to modify a **read-only (const)** value, which is not allowed in C or C++. Let’s analyze the code step by step and explain the error:

---

### **Code Walkthrough**

```c
#include <stdio.h>

void fun(const int *p) {
    *p = 0;  // ERROR: Attempt to modify a read-only location
}

int main() {
    const int i = 10;  // `i` is a constant integer
    fun(&i);           // Pass the address of `i` to `fun`
    return 0;
}
```

---

### **Key Points**

1. **What Does `const int *p` Mean?**
   - This declares a pointer `p` to a constant integer. 
   - `p` can point to different integers, but the value at the address it points to **cannot be modified** through `p`.

2. **Why Does `*p = 0` Cause an Error?**
   - Inside the function `fun`, the statement `*p = 0;` attempts to modify the value of the integer pointed to by `p`.
   - However, since `p` is a pointer to a constant integer (`const int *p`), the compiler prevents any modification of the value it points to.
   - This results in a compilation error: **"assignment of read-only location `*p`."**

3. **Why Is `i` Declared as `const`?**
   - In the `main` function, `i` is declared as `const int i = 10;`. This ensures that `i` is a constant and its value cannot be changed after initialization.
   - Passing the address of `i` to `fun` doesn’t change this const-ness because `fun` explicitly declares the parameter as `const int *p`, reinforcing the immutability of the value being pointed to.

4. **Error Message Explanation:**
   - The error occurs because the program violates the contract of immutability imposed by the `const` qualifier.

---

### **Fixed Version**

If you want to allow the modification of the value in the function, you must **remove the `const` qualifier**:

```c
#include <stdio.h>

void fun(int *p) {
    *p = 0;  // Now this is valid because `p` is not pointing to a constant
}

int main() {
    int i = 10;   // `i` is not a constant anymore
    fun(&i);      // Pass the address of `i`
    printf("%d\n", i);  // Output: 0
    return 0;
}
```

---

### **Output of the Original Code**

The original code does not compile. The compilation error will be:

```
error: assignment of read-only location '*p'
```

---

### **Conclusion**

The error occurs because you are attempting to modify a value (`*p`) through a pointer (`const int *p`) that is declared as pointing to a constant. This is prohibited in both C and C++.
