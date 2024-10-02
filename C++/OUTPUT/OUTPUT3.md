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
    cout << "Value of a: " << a << endl;  // Step 5: error
    return 0;  
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

#include<iostream>
using namespace std;
int main()
{
	int a = 5;
	auto check = [=]() 
        {
		a = 10;
	};
	check();
	cout<<"Value of a: "<<a<<endl;
	return 0;
}
a) Segmentation fault
b) Value of a: 5
c) Value of a: 10
d) Error
View Answer

Answer: d
Explanation: As this lambda expression is capturing the extrenal variable by value therefore the value of a cannot be changes inside the lambda expression hence the program gives error.
