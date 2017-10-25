```
modifier returnType methodName(Parameter list) {
  // method body
}
```

---

[MUST READ - Is Java “pass-by-reference” or “pass-by-value”?](https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value)

---

Consider this case:

```
public void changeValue(Integer i) {
  i = 1;
}

Integer i = new Integer(0);
changeValue(i);  // i = 1
```

Didn't we just pass the copy of the pointer to Integer object to `changeValue` method? Why `i = 1` doesn't change the actual `i` variable?

The answer here is `autoboxing`: converting primitive data types to Wrapper object:

`i = 1`

is equivalent to:

`i = new Integer(1)`

hence doesn't change the actual `i`.

---

Call one type of constructor (parametrized constructor or default) from other in a class. It is known as **explicit constructor invocation**.

```
class Student {
   int age
   Student() {
      this(20);
   }

   Student(int age) {
      this.age = age;
   }
}
```

---

**Variable Arguments(var-args)**

```
public static void printMax(double... numbers);

printMax(1, 2, 3);
printMax(new double[]{1, 2, 3});
```

---

It is possible to define a method that will be called just before an object's final destruction by the garbage collector. This method is called `finalize`( ), and it can be used to ensure that an object terminates cleanly.

The `finalize`( ) method has this general form:

```
protected void finalize( ) {
   // finalization code here
}
```
