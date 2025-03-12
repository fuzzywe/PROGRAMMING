The correct answer is:

**b) When former is used, standard directory is searched and when latter is used, current directory is searched**

---

### **Explanation:**

In C, the `#include` directive is used to include header files, and the search behavior depends on whether you use angle brackets (`< >`) or double quotes (`" "`):

1. **`#include <somelibrary.h>`**:
   - The preprocessor searches for the file `somelibrary.h` in **standard system directories** (e.g., `/usr/include` on Unix-like systems or the compiler's default include paths).
   - This is typically used for including standard library headers like `<stdio.h>`, `<stdlib.h>`, etc.

2. **`#include "somelibrary.h"`**:
   - The preprocessor first searches for the file `somelibrary.h` in the **current directory** (the directory where the source file is located).
   - If the file is not found in the current directory, it falls back to searching the **standard system directories**.
   - This is typically used for including user-defined or local header files.

---

### **Key Points:**
- **`#include <somelibrary.h>`**: Searches **standard system directories**.
- **`#include "somelibrary.h"`**: Searches the **current directory first**, then falls back to standard system directories.

---

### **Why Not the Other Options?**
- **a)** Incorrect because it swaps the behavior of `< >` and `" "`.
- **c)** Incorrect because the behavior of `< >` is well-defined (searches standard directories), not implementation-defined.
- **d)** Incorrect because the search behavior for `< >` and `" "` is explicitly defined by the C standard, not implementation-defined.

---

### **Example:**
```c
#include <stdio.h>       // Searches standard system directories for stdio.h
#include "myheader.h"    // Searches the current directory first, then standard directories
```

---

### **Summary:**
- Use `#include <...>` for standard library headers.
- Use `#include "..."` for user-defined or local headers. 

This distinction ensures that the correct header files are included based on their location.
