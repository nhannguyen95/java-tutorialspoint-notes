Local variables are implemented at stack level internally.

There is no default value for local variables, so local variables should be declared and an initial value should be assigned before the first use.

---

When a space is allocated for an object in the heap, a slot for each instance variable value is created.

Instance variables have default values. For numbers, the default value is 0, for Booleans it is false, and for object references it is null. Values can be assigned during the declaration or within the constructor.

---

Static variables are stored in the static memory.

Static variables are rarely used other than being declared as constants. Constants are variables that are declared as public/private, final, and static.

Most static variables are declared public since they must be available for users of the class.

Values can be assigned during the declaration or within the constructor. Additionally, values can be assigned in special static initializer blocks.

---
