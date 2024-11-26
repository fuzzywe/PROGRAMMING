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
