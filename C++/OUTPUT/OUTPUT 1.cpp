1.What will be the output of the following C++ code?

#include <iostream> 
#include <string>
using namespace std; 
int main(int argc, char const *argv[])
{
	char s1[6] = "Hello";
	char s2[6] = "World";
	char s3[12] = s1 + " " + s2;
	cout<<s3;
	return 0;
}

Explanation:
C-style strings (char[]) do not support the + operator for concatenation. In C++, concatenation of char[] requires the use of functions such as strcat from the C Standard Library (<cstring>) or conversion to std::string (which does support +).
char s3[12] = s1 + " " + s2; is attempting to add together char[] arrays and a string literal (" "), which is invalid.
Correct Approach:
To fix the issue, you can either use the strcat function or convert the C-style strings to std::string for concatenation.

Fixed Code Using std::string:
cpp
Copy code
#include <iostream>
#include <string>
using namespace std;

int main(int argc, char const *argv[])
{
    string s1 = "Hello";
    string s2 = "World";
    string s3 = s1 + " " + s2;  // Concatenating using std::string
    cout << s3;
    return 0;
}
Output:
Copy code
Hello World
Fixed Code Using strcat:
If you need to use char[], you can use strcat:

cpp
Copy code
#include <iostream>
#include <cstring>  // For strcat
using namespace std;

int main(int argc, char const *argv[])
{
    char s1[6] = "Hello";
    char s2[6] = "World";
    char s3[12] = "";  // Make sure s3 is large enough to hold the concatenated result
    strcat(s3, s1);    // First copy s1 into s3
    strcat(s3, " ");   // Then concatenate a space
    strcat(s3, s2);    // Finally, concatenate s2
    cout << s3;
    return 0;
}
Output:
Copy code
Hello World
In this version, we use strcat to concatenate the C-style strings.


2.#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
	cout<<"Hello World";
	return 0;
}
========================================
================code 2=================
#include <iostream>
int main(int argc, char const *argv[])
{
	std::cout<<"Hello World";
	return 0;
}

3.What will be the output of the following C++ code?

    #include <iostream>
    #include <string>
    #include <algorithm>
    using namespace std;
    int main() 
    {
        string s = "spaces in text";
        s.erase(remove(s.begin(), s.end(), ' ' ), s.end() ) ;
        cout << s << endl;
    }
a) spacesintext
b) spaces in text
c) spaces
d) spaces in
View Answer

Answer: a
Explanation: In this program, We formed a algorithm to remove spaces in the string.

Before remove():
s = "spaces in text"

After remove():
s = "spacesintextxt" (logically, it's "spacesintext", but extra characters still exist at the end)

After erase():
s = "spacesintext" (extra characters are now deleted)

Without erase():
If you only use remove() without erase(), the string will still have extra characters beyond the logical end.
