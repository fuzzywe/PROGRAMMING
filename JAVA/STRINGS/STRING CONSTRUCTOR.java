Total constructor string class have?
String class has 13 constructors

You're correct! The String class in Java has 13 constructors in total, as per the official Java documentation. I initially mentioned only some of the key constructors. Let's list all 13 constructors available in the String class.

Complete List of String Constructors:
String()

Creates an empty string.
java
Copy code
String s = new String();  // Empty string
String(byte[] bytes)

Constructs a new string by decoding the byte array using the platform's default charset.
java
Copy code
byte[] bytes = {72, 101, 108, 108, 111};
String s = new String(bytes);  // "Hello"
String(byte[] bytes, int offset, int length)

Constructs a new string from a subset of the byte array, starting at the specified offset.
java
Copy code
byte[] bytes = {72, 101, 108, 108, 111};
String s = new String(bytes, 1, 3);  // "ell"
String(byte[] bytes, String charsetName)

Constructs a new string by decoding the byte array using the specified charset.
java
Copy code
byte[] bytes = {72, 101, 108, 108, 111};
String s = new String(bytes, "UTF-8");  // "Hello"
String(byte[] bytes, int offset, int length, String charsetName)

Constructs a new string from a subset of the byte array, using the specified charset.
java
Copy code
byte[] bytes = {72, 101, 108, 108, 111};
String s = new String(bytes, 1, 3, "UTF-8");  // "ell"
String(char[] value)

Constructs a new string from a character array.
java
Copy code
char[] chars = {'H', 'e', 'l', 'l', 'o'};
String s = new String(chars);  // "Hello"
String(char[] value, int offset, int count)

Constructs a new string from a subset of a character array.
java
Copy code
char[] chars = {'H', 'e', 'l', 'l', 'o'};
String s = new String(chars, 1, 3);  // "ell"
String(int[] codePoints, int offset, int count)

Constructs a new string from a subset of Unicode code points in the array.
java
Copy code
int[] codePoints = {72, 101, 108, 108, 111};
String s = new String(codePoints, 1, 3);  // "ell"
String(String original)

Constructs a new string that is a copy of the original string.
java
Copy code
String s = new String("Hello");  // "Hello"
String(StringBuffer buffer)

Constructs a new string that contains the sequence of characters from a StringBuffer.
java
Copy code
StringBuffer sb = new StringBuffer("Hello");
String s = new String(sb);  // "Hello"
String(StringBuilder builder)

Constructs a new string that contains the sequence of characters from a StringBuilder.
java
Copy code
StringBuilder sb = new StringBuilder("Hello");
String s = new String(sb);  // "Hello"
String(byte[] ascii, int hibyte) (Deprecated)

Constructs a new string from an array of ASCII values, with each byte converted to a character by adding the hibyte.
java
Copy code
byte[] ascii = {72, 101, 108, 108, 111};
String s = new String(ascii, 0);  // "Hello"
String(byte[] ascii, int hibyte, int offset, int count) (Deprecated)

Constructs a new string from a subset of ASCII values, with each byte converted to a character by adding the hibyte.
java
Copy code
byte[] ascii = {72, 101, 108, 108, 111};
String s = new String(ascii, 0, 1, 3);  // "ell"
Key Points:
The String class has 13 constructors, allowing strings to be created from various data types (such as byte arrays, character arrays, StringBuilder, etc.).
Some constructors are now deprecated but are part of the original Java API.
