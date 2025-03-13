1. malloc(): It is used to dynamically allocate a single large block of memory with a specified size.

2. calloc(): It is used to allocate a certain amount of memory and then reset it to zero.

Subscribe Now: C Newsletter | Important Subjects Newsletters
3. realloc(): It is used to resize a memory block that was previously allocated by malloc or calloc.

4. free(): It is used to de-allocate the memory.


- 💡 **Concept**: Pool of Free Memory in C
  - **Explanation**: Memory management in C involves malloc() and free() maintaining a pool of available memory for dynamic allocation.
  - **Real-World Example**: When a program requests memory via malloc(), it tries to allocate from this pool. After use, memory is freed back to the pool with free().
  - **Application**: Ensures efficient memory usage and prevents memory leaks.

- 🎯 **Interview Question**: How does a pool of free memory work in C?
  - **Answer**: In C, malloc() allocates memory from a pool maintained by the system. If memory is insufficient, malloc() requests more from the OS. Always check for NULL to avoid dereferencing issues.

- 🌍 **Real-World Relevance**: 
  - **Scenario**: A software application dynamically allocates memory for processing large datasets.
  - **Impact**: Efficient memory management ensures optimal performance and prevents crashes due to memory exhaustion.
Summarized by https://chrome.google.com/webstore/detail/cbgecfllfhmmnknmamkejadjmnmpfjmp
