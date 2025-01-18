The scope of variables in Java is a crucial topic, often discussed in interviews to test a candidate’s understanding of how variable visibility and lifespan work within different parts of a program. Here's a concise explanation from an interview perspective:

### **Variable Scope in Java**

The scope of a variable refers to the section of a program where the variable can be accessed. In Java, variables follow static (lexical) scoping, meaning their scope is determined at compile time. The key types of variable scope are:

---

1. **Instance Variables (Class Level Scope)**  
   - Declared outside methods but inside a class.  
   - Accessible by all methods of the class.  
   - Use access modifiers like `private`, `public`, and `protected` to control visibility outside the class.  

   **Example:**  
   ```java
   class Test {
       int a;  // Instance variable
   }
   ```

---

2. **Static Variables (Class Level Scope)**  
   - Shared among all instances of a class.  
   - Declared using the `static` keyword.  

   **Example:**  
   ```java
   class Test {
       static int count = 0;
   }
   ```

---

3. **Local Variables (Method Level Scope)**  
   - Declared within a method or constructor.  
   - Exist only during method execution.  

   **Example:**  
   ```java
   void method() {
       int x = 5;  // Local variable
   }
   ```

---

4. **Parameter Scope**  
   - Variables passed as parameters to methods.  
   - Exist only within the method where they are declared.  

   **Example:**  
   ```java
   void setValue(int x) {
       this.x = x;
   }
   ```

---

5. **Block Scope**  
   - Variables declared within curly braces `{ }`.  
   - Accessible only within the block.  

   **Example:**  
   ```java
   if (true) {
       int y = 10;  // Block scope
   }
   ```

---

### **Common Mistakes and Important Points**

1. **Variable Shadowing**:  
   If a local variable shares the same name as a class variable, the `this` keyword differentiates them.  
   ```java
   this.x = x;
   ```

2. **Loop Variables**:  
   In Java, loop variables have block scope. The following would result in an error:
   ```java
   for (int i = 0; i < 5; i++) { }
   int i = 10;  // This is valid because loop `i` is out of scope.
   ```
   Java doesn’t allow the same variable name for inner and outer scopes directly within overlapping code.

3. **Declaring Variables Outside a Loop**:  
   To retain a loop variable after the loop ends, declare it before the loop:
   ```java
   int i;
   for (i = 0; i < 5; i++) { }
   System.out.println(i);  // No error.
   ```

### **Example Program Discussion**
```java
class Test {
    public static void main(String args[]) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        int i = 20;  // Allowed since the previous loop variable is out of scope.
        System.out.print(i + " ");
    }
}
```
**Output:**  
`1 2 3 4 5 6 7 8 9 10 20`  
This program runs without errors because the loop variable `i` is destroyed before the new `i` is declared.
