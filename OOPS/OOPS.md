https://www.naukri.com/code360/library/oops-interview-questions

https://www.interviewbit.com/oops-mcq/


In C++, operator overloading allows you to define custom behaviors for most operators when they’re used with user-defined types (like classes). Here are the operators that **can** be overloaded in C++:

### Operators that Can Be Overloaded

1. **Arithmetic Operators**  
   - `+`, `-`, `*`, `/`, `%`  
   - Used to perform arithmetic on objects of a class.

2. **Relational (Comparison) Operators**  
   - `==`, `!=`, `<`, `>`, `<=`, `>=`  
   - Useful for comparing objects of a class.

3. **Logical Operators**  
   - `&&`, `||`, `!`  
   - Allows custom definitions of logical operations for objects.

4. **Bitwise Operators**  
   - `&`, `|`, `^`, `~`, `<<`, `>>`  
   - Enables bitwise manipulation of objects.

5. **Compound Assignment Operators**  
   - `+=`, `-=`, `*=`, `/=`, `%=`, `&=`, `|=`, `^=`, `<<=`, `>>=`  
   - Allows compound assignments that modify and assign at the same time.

6. **Increment and Decrement Operators**  
   - `++`, `--`  
   - Supports prefix and postfix increment and decrement for class objects.

7. **Subscript Operator**  
   - `[]`  
   - Enables indexing on objects, often for container or array-like classes.

8. **Function Call Operator**  
   - `()`  
   - Makes an object callable like a function, useful for functor objects.

9. **Pointer Dereference Operator**  
   - `*`  
   - Overloading this allows custom behavior when dereferencing an object as a pointer.

10. **Pointer-to-Member Operator**  
    - `->`  
    - Allows objects to act like pointers to members.

11. **New and Delete Operators**  
    - `new`, `delete`  
    - Enables custom memory allocation and deallocation for class instances.

12. **Address-of Operator**  
    - `&`  
    - Provides a custom implementation when taking the address of an object.

13. **Comma Operator**  
    - `,`  
    - Overloading allows for customized behavior when chaining expressions.

14. **Type-Cast Operators**  
    - `operator Type()`  
    - Defines conversions between class types and basic data types.

### Examples of Overloaded Operators
Here’s an example of overloading the `+` operator for a custom `Complex` class:
```cpp
class Complex {
public:
    int real, imag;

    Complex(int r = 0, int i = 0) : real(r), imag(i) {}

    // Overload the + operator
    Complex operator+(const Complex& other) {
        return Complex(real + other.real, imag + other.imag);
    }
};
```

### Important Notes
- **Overloading Restrictions**: Certain rules apply to operator overloading:
  - At least one operand must be a user-defined type.
  - Overloaded operators cannot change the number of operands they take.
  - Overloaded operators should ideally follow the intuitive behavior of the original operator to avoid confusion.
  - 
![FireShot Capture 014 - Top 30 OOPs Interview Questions and Answers (2024) - Naukri Code 360_ - www naukri com](https://github.com/user-attachments/assets/2dcef601-02db-4b25-ae87-69705cc9948a)


![FireShot Capture 022 - OOPs MCQ (Multiple Choice Questions) With Answers - www interviewbit com](https://github.com/user-attachments/assets/58d23934-9030-451f-b437-648fd11f5fe0)

