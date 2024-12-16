The provided Java code attempts to access an element of an array that is out of bounds. Let's analyze the code step by step to determine the output:

```java
public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]); // This line will throw an ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception caught!");
        } catch (Exception e) {
            System.out.println("General Exception caught!");
        }
    }
}
```

### Explanation:

1. **Array Initialization**:
   ```java
   int[] arr = new int[5];
   ```
   This line initializes an array `arr` with a size of 5, meaning it has indices from 0 to 4.

2. **Accessing Out-of-Bounds Index**:
   ```java
   System.out.println(arr[10]);
   ```
   This line attempts to access the element at index 10, which is out of bounds for the array `arr`. This will throw an `ArrayIndexOutOfBoundsException`.

3. **Catch Blocks**:
   - The first `catch` block catches `ArithmeticException`, but since the exception thrown is `ArrayIndexOutOfBoundsException`, this block will not execute.
   - The second `catch` block catches `ArrayIndexOutOfBoundsException`. Since this is the specific exception thrown, this block will execute.
   - The third `catch` block catches `Exception`, which is a general catch-all for any exceptions not caught by the previous blocks. Since the specific exception is already caught by the second block, this block will not execute.

### Output:

The output of the program will be:
```
Array Index Out of Bounds Exception caught!
```

### Detailed Flow:

1. The `try` block executes and throws an `ArrayIndexOutOfBoundsException` when trying to access `arr[10]`.
2. The `catch` block for `ArithmeticException` is skipped because the exception does not match.
3. The `catch` block for `ArrayIndexOutOfBoundsException` catches the exception and prints the message.
4. The `catch` block for `Exception` is skipped because the exception has already been caught by a more specific catch block.

This demonstrates the use of multiple catch blocks to handle different types of exceptions in Java.
