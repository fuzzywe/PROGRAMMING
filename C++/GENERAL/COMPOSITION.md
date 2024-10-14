**Composition** refers to the concept where one class contains an object of another class as a member. It represents a "has-a" relationship, meaning that the containing class (also known as the composite class) *has* objects of another class.

### Example:
If you have a class `Car` that contains objects of class `Engine`, `Wheels`, and `Seats`, the `Car` is composed of these parts. The `Car` "has-an" `Engine`, "has-a" `Wheels`, and "has-a" `Seats`.

```cpp
class Engine {
    // Engine class members
};

class Car {
    Engine engine; // Composition - Car "has-an" Engine
};
```

### Benefits:
- **Flexibility:** You can compose objects dynamically at runtime, giving more control over how objects interact.
- **Reusability:** You can reuse components (like `Engine` in this example) in other classes.

In contrast, **Inheritance** represents an "is-a" relationship, but it does not involve including objects of one class inside another.

### Summary:
- **Composition** allows using objects of other classes to form complex systems.
- It's ideal when the "has-a" relationship is appropriate for class design.
