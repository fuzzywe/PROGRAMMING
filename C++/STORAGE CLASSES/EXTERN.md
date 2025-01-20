First File: main.cpp

```cpp

#include <iostream>
int count ;
extern void write_extern();
 
main() {
   count = 5;
   write_extern();
}

```
Second File: support.cpp
```cpp
#include <iostream>

extern int count;

void write_extern(void) {
   std::cout << "Count is " << count << std::endl;
}

```
Here, extern keyword is being used to declare count in another file. Now compile these two files as follows −

$./write
5
