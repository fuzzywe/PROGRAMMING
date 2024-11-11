
![WhatsApp Image 2024-11-11 at 21 39 05_5f7fa249](https://github.com/user-attachments/assets/e2fb2003-ba34-450b-8098-d327849b7b75)



Non-primitive data type – These data types are composed of primitive data types.

These are also referred to as user-defined data types as they are not pre-defined by the C++ compiler. 


For example arrays, structures, unions, class, linked lists, enumeration, etc.


In C++, non-primitive data types, also known as derived data types, are created from primitive data types. They are more complex and allow you to store and manipulate collections of data. Here are a few common examples:
1. Arrays:
Used to store a collection of elements of the same data type.
Declared using square brackets [].
Example: int numbers[5];
2. Strings:
Represent a sequence of characters.
C++ provides the string class in the <string> header file.
Example: string name = "John";
3. Pointers: Store the memory address of another variable, Declared using the asterisk * operator, and Example: int *ptr.
4. Structures (struct):
User-defined data types that group together variables of different data types under a single name.
Example:
C++

struct Student {
    int id;
    string name;
    float gpa;
};
5. Classes (class):
Building blocks of object-oriented programming (OOP).
Similar to structures, but with additional features like member functions and access specifiers.
Example:
C++

class Rectangle {
private:
    int width;
    int height;
public:
    int area() {
        return width * height;
    }
};
6. Unions:
Allow you to store different data types in the same memory location.
Only one member of the union can hold a value at a time.
Example:
C++

union Data {
    int i;
    float f;
};
7. Enumerations (enum):
User-defined data types that consist of a set of named integer constants.
Example:
C++

enum Color { RED, GREEN, BLUE };
