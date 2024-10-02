https://www.interviewbit.com/java-mcq/


1.Find the output of the following program.

public class Solution{
       public static void main(String[] args){
                     short x = 10;
                     x =  x * 5;
                     System.out.print(x);
       }
}




ChatGPT said:
ChatGPT
The given Java program will result in a compile-time error. Let's break it down to understand why:

Code Analysis:
java
Copy code
public class Solution {
    public static void main(String[] args) {
        short x = 10;     // Declaring and initializing a short variable with value 10
        x = x * 5;        // Multiplying 'x' by 5
        System.out.print(x);  // Printing the value of 'x'
    }
}
Issue:
Multiplication (x * 5):
In Java, when you perform arithmetic operations (like multiplication) on primitive data types, the result is automatically promoted to an int unless explicitly cast back to a smaller type (like short).
In this case, x * 5 results in an int, even though x is a short. Therefore, you cannot directly assign an int result to a short variable without an explicit cast.
How to Fix It:
To resolve the issue, you need to cast the result back to short before assigning it to x. The corrected version would be:

java
Copy code
x = (short) (x * 5);  // Explicit cast to 'short'
Final Correct Code:
java
Copy code
public class Solution {
    public static void main(String[] args) {
        short x = 10;  
        x = (short) (x * 5);  // Casting the result back to 'short'
        System.out.print(x);
    }
}
Output:
Once the casting is added, the program will compile successfully and the output will be:

Copy code
50
Without the cast:
If you run the original program without casting, the error message would be something like this:

vbnet
Copy code
error: incompatible types: possible lossy conversion from int to short


2.
  
Find the output of the following program.

public class Solution{
       public static void main(String[] args){
                     byte x = 127;
                     x++;
                     x++;
                     System.out.print(x);
       }
}


Range of byte data in java is -128 to 127. But the byte data type in java is cyclic in nature.

  
public class Solution {
    public static void main(String[] args) {
        byte x = 127;    // Initializing x with the maximum value of byte
        x++;             // Incrementing x by 1
        x++;             // Incrementing x by 1 again
        System.out.print(x);  // Printing the value of x
    }
}
Key Points:
byte Data Type:

The byte data type in Java is an 8-bit signed integer, with a range of -128 to 127.
So, the maximum value x can hold is 127.
Incrementing beyond 127:

When x++ is performed on x holding the value 127, it exceeds the maximum value for a byte.
In Java, when an integer type exceeds its limit, it overflows and wraps around to the minimum value of the data type.
After x++ from 127, x wraps around to -128 (the minimum value for a byte).
Second Increment:

After the first overflow, x is now -128.
Incrementing x again (x++) makes x equal to -127.
Step-by-Step Execution:
byte x = 127;

x is initialized with the maximum value for a byte, which is 127.
x++;

x becomes 127 + 1 = -128 (due to overflow).
x++;

x becomes -128 + 1 = -127.
System.out.print(x);

The value of x (-127) is printed.
Output:
diff
Copy code
-127
Conclusion:
The program will print -127 due to overflow behavior of the byte data type in Java.


  C and C++: The signed char behaves the same as Java's byte, where the value overflows and wraps around, leading to the output -127.
Python: Python handles integers dynamically, so there is no overflow. The output would simply be 129 after two increments from 127.


3. 
Find the output of the following program.

public class Solution{
       public static void main(String[] args){
               int[]  x = {120, 200, 016};
               for(int i = 0; i < x.length; i++){
                        System.out.print(x[i] + “ “);
               }                   
       }
}




120 200 14
016 is an octal number, its equivalent decimal number is 14. Hence answer is B.

4. 
Find the value of A[1] after execution of the following program.

int[] A = {0,2,4,1,3};
for(int i = 0; i < A.length; i++){
A[i] = A[(A[i] + 3) % A.length];
}




Hide
Wrong Answer
a.length = 5
             A[0] = a[(0 + 3) % 5] = a[3] = 1
             So, a[0] =  a[3] = 1
             A[1] = a[(2 + 3) % 5] = a[0] = 1
             Therefore, a[1] = 1;
