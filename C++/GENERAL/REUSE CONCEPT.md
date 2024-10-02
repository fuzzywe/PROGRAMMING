In C++, several concepts allow you to reuse written code, making your programs more modular, maintainable, and efficient. Here are some key concepts that facilitate code reuse:

### 1. **Functions and Function Templates**
- **Functions**: Encapsulate a block of code that performs a specific task. Functions can be called multiple times from different parts of the program, promoting code reuse.
  ```cpp
  void printMessage(const std::string& message) {
      std::cout << message << std::endl;
  }

  int main() {
      printMessage("Hello, World!");
      printMessage("Reusing code with functions");
      return 0;
  }
  ```
- **Function Templates**: Allow you to write generic functions that can operate on different data types.
  ```cpp
  template <typename T>
  void printValue(const T& value) {
      std::cout << value << std::endl;
  }

  int main() {
      printValue(10);
      printValue("Hello, World!");
      return 0;
  }
  ```

### 2. **Classes and Objects**
- **Classes**: Define a blueprint for creating objects. Classes encapsulate data and behavior, allowing you to reuse the same structure and functionality across different objects.
  ```cpp
  class Person {
  public:
      std::string name;
      int age;

      void introduce() {
          std::cout << "Hello, I am " << name << " and I am " << age << " years old." << std::endl;
      }
  };

  int main() {
      Person person1;
      person1.name = "Alice";
      person1.age = 30;
      person1.introduce();

      Person person2;
      person2.name = "Bob";
      person2.age = 25;
      person2.introduce();

      return 0;
  }
  ```

### 3. **Inheritance**
- **Inheritance**: Allows a new class (derived class) to inherit the properties and behaviors of an existing class (base class). This promotes code reuse by allowing the derived class to use and extend the functionality of the base class.
  ```cpp
  class Animal {
  public:
      void speak() {
          std::cout << "Animal speaks" << std::endl;
      }
  };

  class Dog : public Animal {
  public:
      void speak() {
          std::cout << "Dog barks" << std::endl;
      }
  };

  int main() {
      Dog dog;
      dog.speak(); // Reuses and overrides the speak method
      return 0;
  }
  ```

### 4. **Templates**
- **Templates**: Allow you to write generic code that can be used with different data types. Templates can be used for functions, classes, and even member functions.
  ```cpp
  template <typename T>
  class Stack {
  private:
      std::vector<T> elements;
  public:
      void push(const T& value) {
          elements.push_back(value);
      }

      void pop() {
          if (!elements.empty()) {
              elements.pop_back();
          }
      }

      T top() const {
          if (!elements.empty()) {
              return elements.back();
          }
          throw std::out_of_range("Stack is empty");
      }
  };

  int main() {
      Stack<int> intStack;
      intStack.push(10);
      intStack.push(20);
      std::cout << intStack.top() << std::endl; // Output: 20

      Stack<std::string> strStack;
      strStack.push("Hello");
      strStack.push("World");
      std::cout << strStack.top() << std::endl; // Output: World

      return 0;
  }
  ```

### 5. **Libraries**
- **Libraries**: Collections of pre-written code that can be reused in multiple projects. Libraries can be standard (like the C++ Standard Library) or third-party libraries.
  ```cpp
  #include <iostream>
  #include <vector>
  #include <algorithm>

  int main() {
      std::vector<int> vec = {1, 2, 3, 4, 5};
      std::sort(vec.begin(), vec.end()); // Reusing the sort function from the Standard Library

      for (int val : vec) {
          std::cout << val << " ";
      }
      std::cout << std::endl; // Output: 1 2 3 4 5

      return 0;
  }
  ```

### Summary:

- **Functions and Function Templates**: Encapsulate reusable code blocks and allow for generic programming.
- **Classes and Objects**: Define reusable structures and behaviors.
- **Inheritance**: Allows derived classes to reuse and extend the functionality of base classes.
- **Templates**: Enable the creation of generic code that can be used with different data types.
- **Libraries**: Provide collections of pre-written code that can be reused across multiple projects.

These concepts are fundamental to writing modular, maintainable, and efficient C++ code. By leveraging these features, you can significantly reduce code duplication and improve the overall quality of your software.
