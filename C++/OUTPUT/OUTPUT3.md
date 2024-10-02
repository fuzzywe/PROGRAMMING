The code you've shared demonstrates the use of a lambda function in C++ with a capture clause. Let's break down the code step by step:

```cpp
#include<iostream>
using namespace std;

int main()
{
    int a = 5;  // Step 1: Initialize an integer variable 'a' with value 5
    auto check = [=]()  // Step 2: Define a lambda function that captures 'a' by value
    {
        a = 10;  // Step 3: Attempt to modify the captured variable 'a'
    };
    check();  // Step 4: Call the lambda function
    cout << "Value of a: " << a << endl;  // Step 5: Print the value of 'a'
    return 0;  // Step 6: Return 0 to indicate successful completion
}
```

### Explanation of Key Parts:

1. **Initialization**:
   - `int a = 5;`: This initializes an integer variable `a` with the value `5`.

2. **Lambda Function**:
   - `auto check = [=]()`: This defines a lambda function named `check`. The `[=]` part captures all variables from the surrounding scope (in this case, `a`) by value. This means that the lambda has its own copy of `a`, and any modifications to `a` inside the lambda will not affect the original `a` outside of it.

3. **Modification Attempt**:
   - Inside the lambda, `a = 10;` attempts to change the value of `a`. However, since `a` is captured by value, this modifies only the local copy of `a` within the lambda and does not affect the `a` defined in `main()`.

4. **Calling the Lambda**:
   - `check();`: This invokes the lambda function, executing its body. Since `a` is captured by value, the change to `a` here does not persist outside the lambda.

5. **Output**:
   - `cout << "Value of a: " << a << endl;`: This prints the value of `a` in the main function, which remains `5`, since the lambda did not modify the original `a`.

### Output of the Program:

When you run this code, the output will be:
```
Value of a: 5
```

### Summary:

- Since `a` is captured by value in the lambda, changes made to it inside the lambda do not affect the original variable in the `main()` function. To modify the original variable, you would need to capture it by reference using `[&]` instead of `[=]`. Here’s how you could do that:

```cpp
auto check = [&]() 
{
    a = 10;  // This would now modify the original 'a'
};
```

With this change, the output would be:
```
Value of a: 10
```
