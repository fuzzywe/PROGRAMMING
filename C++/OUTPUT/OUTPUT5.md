Let's analyze the given code step by step to understand what it does and what the output will be.

### Code:

```cpp
#include <iostream>
using namespace std;

int main() {
    int n = 5;
    void *p = &n;
    int *pi = static_cast<int*>(p);
    cout << *pi << endl;
    return 0;
}
```

### Explanation:

1. **Include Directive**:
   - `#include <iostream>`: Includes the Input-Output Stream library for standard input and output operations.

2. **Namespace**:
   - `using namespace std;`: Allows the use of standard library components without prefixing them with `std::`.

3. **Main Function**:
   - `int n = 5;`: Initializes an integer variable `n` with the value `5`.
   - `void *p = &n;`: Declares a void pointer `p` and assigns it the address of the integer variable `n`. A void pointer can hold the address of any data type but cannot be dereferenced directly.
   - `int *pi = static_cast<int*>(p);`: Uses `static_cast` to cast the void pointer `p` to an integer pointer `pi`. This allows `pi` to be dereferenced to access the value of `n`.
   - `cout << *pi << endl;`: Dereferences the integer pointer `pi` to access the value of `n` and prints it to the standard output.

### Detailed Execution:

1. **Initial State**:
   - `n` is initialized to `5`.

2. **Pointer Assignment**:
   - `void *p = &n;`: The address of `n` is assigned to the void pointer `p`.

3. **Pointer Casting**:
   - `int *pi = static_cast<int*>(p);`: The void pointer `p` is cast to an integer pointer `pi` using `static_cast`.

4. **Dereferencing and Output**:
   - `cout << *pi << endl;`: The integer pointer `pi` is dereferenced to access the value of `n`, which is `5`. This value is then printed to the console.

### Final Output:

```cpp
5
```

### Summary:

- The code initializes an integer variable `n` with the value `5`.
- It then assigns the address of `n` to a void pointer `p`.
- The void pointer `p` is cast to an integer pointer `pi` using `static_cast`.
- Finally, the integer pointer `pi` is dereferenced to access the value of `n`, which is printed to the console.

This code demonstrates the use of void pointers and `static_cast` to safely cast between different pointer types in C++. Void pointers are useful for storing the address of any data type, but they must be cast to the appropriate type before being dereferenced.

Let's analyze the given code step by step to understand what it does and what the output will be.

### Code:

```cpp
#include <iostream>
#include <string>
using namespace std;

int main() {
    std::string str("Sanfoundry.");
    str.back() = '!';
    std::cout << str << endl;
    return 0;
}
```

### Explanation:

1. **Include Directives**:
   - `#include <iostream>`: Includes the Input-Output Stream library for standard input and output operations.
   - `#include <string>`: Includes the String library for using the `std::string` class.

2. **Namespace**:
   - `using namespace std;`: Allows the use of standard library components without prefixing them with `std::`.

3. **Main Function**:
   - `std::string str("Sanfoundry.");`: Initializes a `std::string` object `str` with the value `"Sanfoundry."`.
   - `str.back() = '!';`: The `back()` member function of `std::string` returns a reference to the last character of the string. This line changes the last character of `str` from `'.'` to `'!'`.
   - `std::cout << str << endl;`: Prints the modified string to the standard output.

### Detailed Execution:

1. **Initial State**:
   - `str` is initialized to `"Sanfoundry."`.

2. **Modification**:
   - `str.back() = '!';`: Changes the last character of `str` from `'.'` to `'!'`.
   - After this modification, `str` becomes `"Sanfoundry!"`.

3. **Output**:
   - `std::cout << str << endl;`: Prints the modified string `"Sanfoundry!"` to the console.

### Final Output:

```cpp
Sanfoundry!
```

### Summary:

- The code initializes a `std::string` object with the value `"Sanfoundry."`.
- It then modifies the last character of the string from `'.'` to `'!'` using the `back()` member function.
- Finally, it prints the modified string `"Sanfoundry!"` to the console.

This code demonstrates the use of the `std::string` class and its `back()` member function to access and modify the last character of a string in C++.
