The correct answer is:

**c) Using Templates**

**Explanation:**
- **Compile-time polymorphism** in C++ is achieved using **function overloading**, **operator overloading**, and **templates**. It allows the compiler to resolve function calls during compilation, rather than at runtime.
- **Templates** provide a way to write generic functions or classes that can operate on different data types without changing the code. This enables polymorphism at compile time by generating specific versions of the function or class based on the provided types.

### Example:
```cpp
template <typename T>
T add(T a, T b) {
    return a + b;
}

int main() {
    cout << add(2, 3) << endl;     // Calls add<int>
    cout << add(2.5, 3.5) << endl; // Calls add<double>
    return 0;
}
```

Here, the compiler generates different versions of the `add` function based on the types used (`int`, `double`, etc.), which is a form of compile-time polymorphism.

---

### **Potential Interview Questions and Answers**

#### **Q1. What is compile-time polymorphism in C++?**
**Answer:**
- Compile-time polymorphism, also known as static polymorphism, occurs when function calls are resolved at compile time. It is typically achieved through function overloading, operator overloading, and templates.
  
#### **Q2. How is compile-time polymorphism different from run-time polymorphism?**
**Answer:**
- Compile-time polymorphism is resolved during compilation, whereas run-time polymorphism is resolved during program execution.
- Compile-time polymorphism is achieved using templates, function overloading, and operator overloading. Run-time polymorphism is achieved using inheritance and virtual functions.

#### **Q3. What are templates, and how do they support compile-time polymorphism?**
**Answer:**
- Templates allow you to write generic code that can work with any data type. The compiler generates the specific type implementation based on the provided template arguments. This supports polymorphism at compile time because the actual function or class is created for the specific types when the program is compiled.

#### **Q4. What is function overloading, and how does it relate to compile-time polymorphism?**
**Answer:**
- Function overloading is when multiple functions with the same name but different parameter types or counts are defined. The compiler decides which function to call based on the function signature at compile time. This is a key aspect of compile-time polymorphism.

#### **Q5. Can operator overloading be considered compile-time polymorphism?**
**Answer:**
- Yes, operator overloading allows custom definitions of operators for user-defined types. The specific overloaded operator is chosen at compile time, making it a form of compile-time polymorphism.

#### **Q6. What are the advantages of using templates for compile-time polymorphism?**
**Answer:**
- **Code reusability:** Templates allow the same function or class to work with different data types without duplicating code.
- **Type safety:** The compiler ensures that only valid operations for the specific type are performed.
- **Efficiency:** Since the decisions are made at compile time, templates result in faster execution compared to run-time polymorphism.

#### **Q7. What is the difference between function templates and class templates?**
**Answer:**
- **Function templates** allow creating functions that work with any data type.
- **Class templates** allow defining classes that can operate on generic data types. The difference is in how the template syntax is applied to functions versus classes, but both enable compile-time polymorphism.

#### **Q8. Can templates be used with inheritance in C++?**
**Answer:**
- Yes, templates and inheritance can be combined in C++. For example, you can have a base class template and derive other classes from it, or you can derive template classes from regular or other template classes.

#### **Q9. Can function overloading and templates be used together?**
**Answer:**
- Yes, you can overload a template function with a regular function or another template function with a different set of parameters. The compiler selects the most appropriate function to call at compile time.

#### **Q10. What are the limitations of using templates in C++?**
**Answer:**
- **Code bloat:** Since templates generate a separate function/class for each type used, it can lead to larger binary sizes.
- **Complex error messages:** Template errors can produce long and difficult-to-understand compiler messages.
- **Compatibility issues:** Templates can have issues with certain language features like dynamic linking or when combined with certain types of polymorphic behavior.

These questions and answers will help you understand and explain how compile-time polymorphism works in C++ during interviews.
