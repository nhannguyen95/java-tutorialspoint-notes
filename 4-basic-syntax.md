**Objects** have states and behaviors. An object is an instance of a class:
*  An object's state is created by the values assigned to these **instance variables**.
* Behaviors are **methods**.

**Class** is a template/blueprint that describes the behaviors/state that the object of its type support (from which individual objects are created.).

---

To compile: `javac x.java`

To run: `java x`

---

2 categories of modifiers:

**Access Modifiers**: default, public, protected, private.

**Non-access Modifiers**: final, abstract, strictfp...

---

3 types of variables:
* Local variables: variables defined inside methods, constructors or blocks.
* Class variables (Static variables): variables within a class but outside any method.
* Instance variables (Non-static variables): variables declared within a class, outside any method, with the `static` keyword.

---

Enums restrict a variable to have one of only a few predefined values. The values in this enumerated list are called enums.

```
enum FreshJuiceSize { SMALL, MEDIUM, LARGE }
```

---

**Subclass**  is derived from **superclass**.
