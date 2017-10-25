**Create array**

```
double[] myList = new double[10];
```

The above statement does 3 things:
* Declares array variable:

```
double[] myList;  // preferred way.

double myList[];  // from C/C++, works but not preferred.
```

* Creates an array using `new double[10]`.

* Assigns the reference of the newly created array to the variable `myList`.

---

**Parsing arrays to methods**

```
public static void printArray(int[] array);

printArray(new int[]{1, 2, 3});
```

---



---
