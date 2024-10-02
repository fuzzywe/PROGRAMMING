>>>> is Zero fill right shift.

Negative Numbers: When using >>> with a negative number, the sign bit is treated as a regular bit, and zeros are inserted from the left. This can lead to large positive numbers if you shift a negative number.

Positive Numbers: If the number is positive, both >> and >>> will behave the same because they both insert zeros on the left.

Example:
java
Copy code
public class Main {
    public static void main(String[] args) {
        int x = -16;   // Binary: 11111111 11111111 11111111 11110000
        System.out.println(x >> 2);   // Signed right shift, Output: -4 (11111111 11111111 11111111 11111100)
        System.out.println(x >>> 2);  // Unsigned right shift, Output: 1073741820 (00111111 11111111 11111111 11111100)
    }
}
x >> 2: The sign bit is preserved, resulting in -4.
x >>> 2: The sign bit is not preserved, and zeros are inserted, resulting in a large positive number 1073741820.
In summary, the >>> operator is used for unsigned right shifts, where the leftmost bits are filled with zeros regardless of the sign of the number.
