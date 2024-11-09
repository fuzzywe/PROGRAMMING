Here’s the difference between a module and a package in Python:

- **Module**: A module is a single file containing Python code, which can define functions,

- classes, and variables, and include runnable code. It helps in organizing code into manageable parts.

- Example: `math.py` or `os.py`.

- **Package**: A package is a collection of related modules grouped together in a directory.

  It contains a special `__init__.py` file, and can include sub-packages.

   A package allows for hierarchical organization of modules. Example: `numpy` (which contains multiple modules like `numpy.linalg`, `numpy.random`, etc.).

**
 how you write a program using module**
 
 import math_utils  # Importing the entire module
result = math_utils.add(5, 10)
