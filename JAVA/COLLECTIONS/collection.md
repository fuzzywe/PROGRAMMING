In Java, which collection class is synchronized?
2.7K answered
ArrayList
HashSet
Vector
LinkedList
Explanation
Vector is like the responsible older sibling of the collection classes. It's synchronized, which means it's safe to use when multiple parts of a program are working with it at the same time. Think of it as a special box that only lets one person reach in at a time, keeping everything inside organized and preventing mix-ups. This makes Vector slower than ArrayList, but it's great when you need to be extra careful about data safety in multi-threaded programs.
