We have three categories of Exceptions. You need to understand them to know how exception handling works in Java:
* **Checked exceptions**: A checked exception is an exception that occurs at the compile time, these are also called as compile time exceptions. These exceptions cannot simply be ignored at the time of compilation, the programmer should take care of (handle) these exceptions. E.x file not found.

* **Unchecked exceptions**: An unchecked exception is an exception that occurs at the time of execution. These are also called as Runtime Exceptions. These include programming bugs, such as logic errors or improper use of an API. Runtime exceptions are ignored at the time of compilation. E.x index out of bounds.

* **Errors**: These are not exceptions at all, but problems that arise beyond the control of the user or the programmer. Errors are typically ignored in your code because you can rarely do anything about an error. For example, if a stack overflow occurs, an error will arise. They are also ignored at the time of compilation.

[Read for more examples](https://www.tutorialspoint.com/java/java_builtin_exceptions.htm)

---

**Exception Hierarchy**

<img src="https://www.tutorialspoint.com/java/images/exceptions1.jpg" />

---

Catching Multiple Type of Exceptions:

```
catch(ExceptionType1 | ExceptionType2) {}
```

---

`throws` is used to postpone the handling of a checked exception.

`throw` is used to invoke an exception explicitly.

---

**try-with-resources**, also referred as **automatic resource management**, is a new exception handling mechanism that was introduced in Java 7, which automatically closes the resources used within the try catch block.

```
try(FileReader fr = new FileReader("file path")) {
   // use the resource
   } catch() {
      // body of catch
   }
}
```

* To use a class with try-with-resources statement it should implement `AutoCloseable` interface and the `close()` method of it gets invoked automatically at runtime.

* You can declare more than one class in try-with-resources statement.

* While you declare multiple classes in the try block of try-with-resources statement these classes are closed in reverse order.

* Except the declaration of resources within the parenthesis everything is the same as normal try/catch block of a try block.

* The resource declared in try gets instantiated just before the start of the try-block.

* The resource declared at the try block is implicitly declared as final.

---

**User-defined Exceptions**

You can create your own exceptions in Java. Keep the following points in mind when writing your own exception classes:

* All exceptions must be a child of `Throwable`.

* If you want to write a checked exception that is automatically enforced by the Handle or Declare Rule, you need to extend the `Exception` class.

* If you want to write a runtime exception, you need to extend the `RuntimeException` class.
