In C++, the function used to read a single character from the console is `cin.get(ch)`.

### Explanation:

- **`cin.get(ch)`**: This function reads a single character from the standard input (console) and stores it in the variable `ch`. It is a member function of the `istream` class, which `cin` is an instance of.

### Example:

```cpp
#include <iostream>

int main() {
    char ch;
    std::cout << "Enter a character: ";
    std::cin.get(ch); // Reads a single character from the console
    std::cout << "You entered: " << ch << std::endl;
    return 0;
}
```

### Other Options:

- **`getline(ch)`**: This is not a valid function for reading a single character. `getline` is used to read a line of text into a string.
- **`read(ch)`**: This is not a valid function for reading a single character. `read` is a member function of the `istream` class, but it is used to read a block of data into a buffer.
- **`scanf(ch)`**: This is a C function used for formatted input. It is not typically used in C++ for reading a single character. The equivalent in C would be `scanf("%c", &ch);`.

### Summary:

- The correct function to read a single character from the console in C++ is `cin.get(ch)`.

This function is part of the C++ Standard Library and is commonly used for reading individual characters from the input stream.
