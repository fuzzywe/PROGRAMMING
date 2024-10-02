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
The correct answer is:

**a) `cout.put(ch)`**

### Explanation:
- **`cout.put(ch)`**: This function is used in C++ to write a single character to the console. It is a member function of the `ostream` class and is commonly used for outputting individual characters.
  
The other options are incorrect because:
- **`cout.putline(ch)`**: There is no such function as `putline` in C++.
- **`write(ch)`**: This is not a valid function for writing a single character to the console in C++.
- **`printf(ch)`**: This is a C-style function for formatted output, but it does not directly take a single character as input without a format specifier like `%c`.

  In C++, the function used to write a single character to the console is `cout.put(ch)`.

### Explanation:

- **`cout.put(ch)`**: This function writes a single character to the standard output (console). It is a member function of the `ostream` class, which `cout` is an instance of.

### Example:

```cpp
#include <iostream>

int main() {
    char ch = 'A';
    std::cout.put(ch); // Writes a single character to the console
    std::cout << std::endl; // Outputs a newline character
    return 0;
}
```

### Other Options:

- **`cout.putline(ch)`**: This is not a valid function. There is no `putline` function in the C++ Standard Library.
- **`write(ch)`**: This is not a valid function for writing a single character. `write` is a member function of the `ostream` class, but it is used to write a block of data to the output stream.
- **`printf(ch)`**: This is a C function used for formatted output. It is not typically used in C++ for writing a single character. The equivalent in C would be `printf("%c", ch);`.

### Summary:

- The correct function to write a single character to the console in C++ is `cout.put(ch)`.

This function is part of the C++ Standard Library and is commonly used for writing individual characters to the output stream.

You are correct! The answer is:

**a) `cin.get(ch)`**

### Explanation:
- **`cin.get(ch)`**: This function is specifically designed to read a single character from the console. It reads the next character from the input stream and stores it in the variable `ch`. If you want to read a character without skipping whitespace, `cin.get()` is the appropriate choice.

### Why the other options are incorrect:
- **`getline(ch)`**: This function is used to read a line of text (including spaces) from the input into a string. It does not read a single character.
  
- **`read(ch)`**: This is not a standard C++ function for reading input. The term `read` can be associated with file streams or lower-level operations, but it's not used for console input.

- **`scanf(ch)`**: This is a C-style function that requires a format specifier. It is used for formatted input, so it can't directly read a single character without a format specifier (like `%c`).

### Summary:
- **Correct Function**: `cin.get(ch)` is the right choice for reading a single character from the console in C++.
