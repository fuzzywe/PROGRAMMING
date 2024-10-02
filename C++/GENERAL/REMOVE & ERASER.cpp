#include <iostream>
#include <vector>
#include <algorithm>

int main() {
    std::vector<int> vec = {1, 2, 3, 2, 4, 2, 5};

    // Use std::remove to move all occurrences of 2 to the end
    auto new_end = std::remove(vec.begin(), vec.end(), 2);

    // Print the vector to see the reordered elements
    for (int val : vec) {
        std::cout << val << " ";
    }
    std::cout << std::endl; // Output: 1 3 4 5 2 2 2

    // Now, actually remove the elements from the vector
    vec.erase(new_end, vec.end());

    // Print the vector again to see the final result
    for (int val : vec) {
        std::cout << val << " ";
    }
    std::cout << std::endl; // Output: 1 3 4 5

    return 0;
}
erase
Purpose:

erase is a member function of containers like std::vector, std::list, std::map, etc.
It actually removes elements from the container.
How It Works:

erase can remove elements by value, by iterator, or by a range of iterators.
When you call erase, the specified elements are removed from the container immediately
