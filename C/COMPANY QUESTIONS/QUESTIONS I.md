[10/14, 4:52 PM] Ruthika: Storage classes
Static keyword
Macros
Memory management
Dynamic allocation in C
[10/14, 4:53 PM] Ruthika: Storage Classes in C
Volatile Keyword
Const Keyword
Usage of Volatile and Const Keywords in real life.(Ex: Reading Data from Pen drives)
C Program Compilation Stages
Struct vs Union
Pass By Value and Pass By Reference for Pointers
Calculate the Size of the struct without using the inbuilt function. (use pointer arithmetic)
[10/14, 4:55 PM] Ruthika: You have a header file which contains a static variable. You wrote a C program and included that header file in both programs. Now explain what will happen to static variable value?
[10/14, 4:56 PM] Ruthika: Static keyword in C and its scope.
[10/14, 5:00 PM] Ruthika: Tell Compilation process of C program.
https://www.geeksforgeeks.org/compiling-a-c-program-behind-the-scenes/
Print Hello World without semicolon in C.
https://www.geeksforgeeks.org/print-hello-world-without-semicolon-in-ccpp/
Then he asked what all data structures I know.
He asked to write code: Given an integer number, check if that number is a power of 2 or not. I wrote the code using bitwise operator.
https://www.geeksforgeeks.org/program-to-find-whether-a-no-is-power-of-two/
Given a Binary Search Tree, Write a C code to insert a new node in it.
https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
[10/14, 5:01 PM] Ruthika: Difference between getch and getche in C?
             Difference between abs and fabs in C  ?
[10/14, 5:03 PM] Ruthika: Structure padding and packing. Who do this padding and packing( compiler, cpu etc.)?
[10/14, 5:04 PM] Ruthika: 17.What is static function?
    https://www.geeksforgeeks.org/what-are-static-functions-in-c/
18.What is Dangling pointer?
https://www.geeksforgeeks.org/dangling-void-null-wild-pointers/
19.What is memory leak? Give example by code. In what scenario   
memory leak is critical and problematic?
[10/19, 4:58 PM] Ruthika: C Question
What happens when we try to access a null pointer in C?

Problem approach
The standard says that accessing a NULL ptr is “undefined behavior”. Undefined behavior can be anything, including:
Nothing at all - continue running the program as if nothing happened
Crashing the application
Corrupting application data
[10/19, 4:58 PM] Ruthika: What are the phases of a compiler?

Problem approach
Phase 1: Lexical Analysis
Lexical Analysis is the first phase when compiler scans the source code. This process can be left to right, character by character, and group these characters into tokens.
Here, the character stream from the source program is grouped in meaningful sequences by identifying the tokens. It makes the entry of the corresponding tickets into the symbol table and passes that token to next phase.

Phase 2: Syntax Analysis
Syntax analysis is all about discovering structure in code. It determines whether or not a text follows the expected format. The main aim of this phase is to make sure that the source code was written by the programmer is correct or not. Syntax analysis is based on the rules based on the specific programing language by constructing the parse tree with the help of tokens. It also determines the structure of source language and grammar or syntax of the language.

Phase 3: Semantic Analysis
Semantic analysis checks the semantic consistency of the code. It uses the syntax tree of the previous phase along with the symbol table to verify that the given source code is semantically consistent. It also checks whether the code is conveying an appropriate meaning. Semantic Analyzer will check for Type mismatches, incompatible operands, a function called with improper arguments, an undeclared variable, etc.

Phase 4: Intermediate Code Generation
Once the semantic analysis phase is over the compiler, generates intermediate code for the target machine. It represents a program for some abstract machine. Intermediate code is between the high-level and machine level language. This intermediate code needs to be generated in such a manner that makes it easy to translate it into the target machine code.

Phase 5: Code Optimization
The next phase of is code optimization or Intermediate code. This phase removes unnecessary code line and arranges the sequence of statements to speed up the execution of the program without wasting resources. The main goal of this phase is to improve on the intermediate code to generate a code that runs faster and occupies less space.

Phase 6: Code Generation
Code generation is the last and final phase of a compiler. It gets inputs from code optimization phases and produces the page code or object code as a result. The objective of this phase is to allocate storage and generate relocatable machine code. It also allocates memory locations for the variable. The instructions in the intermediate code are converted into machine instructions. This phase coverts the optimize or intermediate code into the target language.
[10/19, 4:59 PM] Ruthika: What is a system stack?

Problem approach
The system stack (a.k.a. call stack or just "the stack") is a place in memory for things that the heap doesn't cover. The system stack is more organized than the heap since it uses the stack data structure, where order matters. Also, the address of the next allocation is known at all times because of this organization. Allocated items are pushed on to the stack in a particular order and popped off when needed. Most importantly, the system stack is used to store information about subroutine calls (where it gets the name "call stack"). The stack stores parameters for the function and a return address where the program should pick up when the function is finished. It also reserves a space for a return value to be popped by the system on return. The piece of stack used by a subprogram is called a stack frame.
[10/19, 5:04 PM] Ruthika: Difference between C and C++

Problem approach
1. The C programming language is a procedural language type while C++ is an object-oriented programming language type.
2. C programming follows a top to down programming approach that focuses on the steps rather than the data. C++ follows a bottom-to-top approach that focuses on data rather than the overall procedure.
3. Since C is a structured programming language the program is divided into separate blocks known as functions. Since C++ is an object-oriented programming language, the code is divided into Objects and Classes.
[10/22, 7:10 AM] Ruthika: difference in static, global variable. Whats the use of dynamic memory allocation over static.
[10/22, 7:34 AM] Ruthika: What language you like the most and why?
What is the difference between a thread and a process?
C doesn’t have overriding functions. But, how is that you can add as many args as you want in the function parameters? How does that happen backstage
