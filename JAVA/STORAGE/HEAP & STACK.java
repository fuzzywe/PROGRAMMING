In programming, the **stack** and **heap** are two distinct areas of memory used for different purposes. Here's a breakdown of what each of these memory areas stores:

### Stack Memory

1. **Storage Type**:
   - **Local Variables**: Variables defined within a function or a method are stored on the stack. These variables are automatically allocated when the function is called and deallocated when the function exits.
   - **Function Parameters**: Parameters passed to functions/methods are also stored on the stack.
   - **Return Addresses**: The address of the next instruction to execute after a function call is stored in the stack, allowing the program to return to the correct location after the function execution.

2. **Memory Management**:
   - **Automatic**: Memory allocation and deallocation for stack variables are handled automatically by the system as functions are called and return.
   - **Last In, First Out (LIFO)**: The stack follows a LIFO structure, meaning the last item added is the first one to be removed.

3. **Lifetime**: The lifetime of stack variables is tied to the function's execution. Once the function exits, the memory is freed.

4. **Size Limit**: Stack size is usually limited and can lead to stack overflow errors if too much memory is used (e.g., due to deep recursion).

### Heap Memory

1. **Storage Type**:
   - **Dynamic Variables**: Memory for variables allocated at runtime using commands like `new` (C++/Java), `malloc()` (C), or `alloc()` (Python) is stored on the heap.
   - **Objects**: In object-oriented languages, objects created dynamically are stored in the heap.

2. **Memory Management**:
   - **Manual**: Memory allocation and deallocation in the heap need to be managed manually by the programmer. In languages with garbage collection (like Java or Python), the runtime environment will reclaim memory no longer in use.
   - **Flexible Size**: The heap can grow and shrink dynamically, allowing for larger memory allocations compared to the stack.

3. **Lifetime**: The lifetime of heap variables is not tied to function execution. They persist until they are explicitly deallocated (or collected by a garbage collector).

4. **Fragmentation**: Over time, as memory is allocated and freed, the heap can become fragmented, leading to inefficient memory usage.

### Summary Table

| Feature                | Stack                           | Heap                          |
|------------------------|----------------------------------|-------------------------------|
| **Storage**            | Local variables, parameters, return addresses | Dynamic variables, objects      |
| **Memory Management**  | Automatic, LIFO                  | Manual, dynamic size           |
| **Lifetime**           | Tied to function execution       | Persistent until deallocated   |
| **Size Limit**         | Limited, can cause stack overflow| Larger, can lead to fragmentation |
| **Access Speed**       | Faster due to contiguous memory  | Slower due to fragmentation    |

### Example Illustration

- **Stack Example (C/C++/Java)**:
  ```java
  void exampleFunction() {
      int a = 10;  // Stored in stack
      int b = 20;  // Stored in stack
      int sum = a + b;  // sum stored in stack
  }
  ```

- **Heap Example (C/C++/Java)**:
  ```java
  void exampleFunction() {
      int* ptr = new int; // Allocated in heap
      *ptr = 10; // Using heap memory
      delete ptr; // Deallocated memory
  }
  ```

Understanding the differences between stack and heap memory is crucial for efficient memory management and avoiding common programming issues such as memory leaks and stack overflows.
Understanding the differences between stack and heap memory is crucial for efficient memory management and avoiding common programming issues such as memory leaks and stack overflows.

    Static and heap memory allocation are two different memory management techniques used in programming. Here's an overview of both, with a focus on their allocation timing, characteristics, and examples.

### Static Memory Allocation

**Definition**: Static memory allocation refers to allocating memory at compile time. The size and type of the data must be known beforehand, and the memory remains allocated for the entire duration of the program.

**Characteristics**:
- **Fixed Size**: The size of statically allocated memory must be known and fixed at compile time.
- **Lifetime**: Memory allocated statically exists for the duration of the program, meaning it is allocated when the program starts and deallocated when the program ends.
- **Scope**: Statically allocated variables can be global (accessible throughout the program) or local (accessible only within the function).
- **Efficiency**: Generally faster to access compared to heap memory due to their fixed location in memory.

**Examples**:
- **Global Variables**:
  ```c
  int globalVar; // Allocated in static memory
  ```
- **Static Variables**:
  ```c
  void function() {
      static int count = 0; // Allocated in static memory
      count++;
  }
  ```
- **Array Declaration**:
  ```c
  int array[10]; // Allocated in static memory
  ```

### Heap Memory Allocation

**Definition**: Heap memory allocation refers to allocating memory at runtime. This allows for dynamic memory allocation, meaning the size can be determined during the execution of the program.

**Characteristics**:
- **Dynamic Size**: Memory size can be determined and allocated at runtime based on the program's needs.
- **Lifetime**: Memory allocated on the heap persists until it is explicitly deallocated by the programmer or automatically managed by a garbage collector.
- **Flexibility**: Allows for more complex data structures like linked lists, trees, etc., which can grow and shrink dynamically.
- **Fragmentation**: Over time, heap memory can become fragmented, leading to inefficient memory usage.

**Examples**:
- **Dynamic Memory Allocation in C**:
  ```c
  int *ptr = (int*) malloc(sizeof(int)); // Allocated in heap
  *ptr = 10; // Using heap memory
  free(ptr); // Deallocating memory
  ```
- **Dynamic Memory Allocation in C++**:
  ```cpp
  int *ptr = new int; // Allocated in heap
  *ptr = 20; // Using heap memory
  delete ptr; // Deallocating memory
  ```
- **Dynamic Memory Allocation in Java**:
  ```java
  Integer[] arr = new Integer[10]; // Allocated in heap
  ```

### Summary Table

| Feature                       | Static Memory Allocation                  | Heap Memory Allocation              |
|-------------------------------|------------------------------------------|-------------------------------------|
| **Allocation Time**           | Compile time                             | Runtime                             |
| **Size**                      | Fixed size                               | Dynamic size                        |
| **Lifetime**                  | Entire program duration                  | Until explicitly deallocated        |
| **Scope**                     | Global or local                         | Accessible via pointers/references  |
| **Efficiency**                | Generally faster due to fixed location   | Slower due to dynamic allocation    |
| **Fragmentation**             | No fragmentation                         | Can lead to fragmentation           |

### Conclusion

Both static and heap memory allocation have their own advantages and use cases. Static memory is simpler and faster for fixed-size data, while heap memory offers flexibility for dynamic data structures. Understanding how each type works is crucial for effective memory management in programming.
