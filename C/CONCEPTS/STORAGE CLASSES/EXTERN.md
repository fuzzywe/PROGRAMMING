Use of Extern Storage Class
We can construct the self-customized header file “external.h” for using extern variables, and there we have stored int a and int b.
The syntax for importing “external.h” into our main “prepinsta.c” code is as follows: #include “external.h”.
The variables declared in the external.h file can then be used after being initialised once more in the prepinsta.c file.
Here sum = a + b will show the following output
While loop in C
Related Pages
Tokens in C

Bitwise Operators in C

Conditional statement Program in C

Switch case program in C

function pointer in C

Example 1

```c
File name: external.h
int a = 100;
int b = 200;
```
File name: prepinsta.c
```c
#include<stdio.h> 
#include<external.h>
int main()
{
  extern int a,b;
  int sum = a + b;
  printf("%d + %d = %d ", a, b, sum);
  return 0;
}
```
---
Output
100 + 200 = 300
Use of Extern Storage Class in C file
We can use the extern keyword variable in our main program that is named  as “placement.c”.

We can declare the extern variables before starting main function.

But we also need to give them some value at this stage also.

We can change the values of extern variables in the main function as shown in this program.

File name: placement.c
Run
```c
#include<stdio.h> 
extern int a=10;
extern int b=20;
int main()
{
  a = 100;
  b = 200;
  int sum = a + b;
  printf("%d + %d = %d ", a, b, sum);
  return 0;
}
```


Output
100 + 200 = 300
Prime Course Trailer
---


While loop in C
