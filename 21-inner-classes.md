The class written within is called the **nested class**, and the class that holds the inner class is called the **outer class**.

```
class Outer_Demo {
  class Nested_Demo {
  }
}
```

Nested classes are divided into 2 types:

* **Non-static nested classes (Inner classes)**.

* **Static nested classes**.

<img src="https://www.tutorialspoint.com/java/images/inner_classes.jpg" />

---

Inner classes are a security mechanism in Java. We know a class cannot be associated with the access modifier `private`, but if we have the class as a member of other class, then the inner class can be made private. And this is also used to access the private members of a class.

Inner classes are of three types depending on how and where you define them:
* Inner Class
* Method-local Inner Class
* Anonymous Inner Class

---

**Inner Class**

An inner class can be private and once you declare an inner class private, it cannot be accessed from an object outside the class.

```
class Outer {
  private int num;

  private class Inner {
    public void show();

    public in getNum() {
      return num;
    }
  }

  void showInner() {
    Inner inner = new Inner();
    inner.show();
  }
}

Outer outer = new Outer();
outer.showInner();

Inner inner = outer.new Inner();
inner.getNum();
```

---

**Method-local Inner Class**

In Java, we can write a class within a method and this will be a local type. Like local variables, the scope of the inner class is restricted within the method:

```
public class Outer {
  void myMethod() {
    int num = 0;

    class MethodInner {
      public void show() {
        // print num
      }
    }

    MethodInner inner = new MethodInner();
    inner.show();
  }
}
```

---

**Anonymous Inner Class**

An inner class declared without a class name is known as an **anonymous inner class**. In case of anonymous inner classes, we declare and instantiate them at the same time. Generally, they are used whenever you need to override the method of a class or an interface

```
abstract class AnonymousInner {
  public abstract void myMethod();
}

public class Outer {
  public static void main(String args[]) {
    AnonymousInner inner = new AnonymousInner() {
      public void myMethod() {
        // implement
      }
    }

    inner.myMethod();
  }
}
```

Generally, if a method accepts an object of an interface, an abstract class, or a concrete class, then we can implement the interface, extend the abstract class, and pass the object to the method. If it is a class, then we can directly pass it to the method.

But in all the three cases, you can pass an anonymous inner class to the method. Here is the syntax of passing an anonymous inner class as a method argument:

```
object.myMethod(new MyClass() {
  public void doSomething() {
    // ...
  }
});
```

---

**Static Nested Class**

```
public class Outer {
  static class Nested {
    public void myMethod() {}
  }
}

Outer.Nested nested = new Outer.Nester();
nested.myMethod();
```
